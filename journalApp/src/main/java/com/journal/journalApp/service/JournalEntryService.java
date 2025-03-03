package com.journal.journalApp.service;

import com.journal.journalApp.entity.JournalEntry;
import com.journal.journalApp.entity.User;
import com.journal.journalApp.repository.JournalEntryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Component
public class JournalEntryService {

    @Autowired
    private JournalEntryRepo journalEntryRepo;

    @Autowired
    private UserService userService;

    @Transactional
    public void createEntry(JournalEntry journalEntry, String userName) {
        try {
            User user = userService.findByUserName(userName);
            journalEntry.setDate(LocalDateTime.now());
            JournalEntry saved = journalEntryRepo.save(journalEntry);
            user.getJournalEntries().add(saved);
            //user.setUserName(null);
            userService.createEntry(user);
        } catch (Exception e){
            System.out.println(e);
            throw new RuntimeException("An error occured while saving an entry !", e);
        }
    }
    public void createEntry(JournalEntry journalEntry){
        journalEntryRepo.save(journalEntry);
    }

    @Query("{}")
    public List<JournalEntry> getAllEntries(){
        return journalEntryRepo.findAll();
    }

    public Optional<JournalEntry> getSingleId(String id){
        return journalEntryRepo.findById(id);
    }

    public void deleteById(String id, String userName){
        User user = userService.findByUserName(userName);
        user.getJournalEntries().removeIf(e-> e.getId().equals(id));
        userService.createEntry(user);
         journalEntryRepo.deleteById(id);
    }


}
