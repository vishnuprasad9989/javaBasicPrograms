package com.journal.journalApp.controller;

import com.journal.journalApp.entity.JournalEntry;
import com.journal.journalApp.entity.User;
import com.journal.journalApp.service.JournalEntryService;
import com.journal.journalApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    @Autowired
    private JournalEntryService journalEntryService;

    @Autowired
    private UserService userService;

    @GetMapping("{userName}")
    public ResponseEntity<?> getAllJournalEntriesOfUser(@PathVariable String userName){
        User user = userService.findByUserName(userName);
        List<JournalEntry> all = user.getJournalEntries();
        if(all != null && !all.isEmpty()){
            return new ResponseEntity<>(all, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/{userName}")
    public ResponseEntity<JournalEntry> createEntry(@RequestBody JournalEntry entry, @PathVariable String userName){
        try {
            journalEntryService.createEntry(entry, userName);
            return new ResponseEntity<>(entry , HttpStatus.CREATED);
        }catch(Exception e){
            return new ResponseEntity<>(entry , HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping("id/{myId}")
    public ResponseEntity<JournalEntry> getJournalEntryById(@PathVariable String myId){
        Optional<JournalEntry> journalEntry = journalEntryService.getSingleId(myId);
        if(journalEntry.isPresent()){
            return new ResponseEntity<>(journalEntry.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("id/{userName}/{myId}")
    public ResponseEntity<JournalEntry> deleteJournalEntryById(@PathVariable String myId, @PathVariable String userName){
         journalEntryService.deleteById(myId, userName);
         return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("id/{userName}/{myId}")
    public ResponseEntity<JournalEntry> updateJournalEntryById(@PathVariable String myId,
                            @RequestBody JournalEntry newEntry, @PathVariable String userName){
        JournalEntry old = journalEntryService.getSingleId(myId).orElse(null);
        if(old != null){
            old.setTitle(newEntry.getTitle() != null && !newEntry.getTitle().equals("") ? newEntry.getTitle() : old.getTitle());
            old.setContent(newEntry.getContent() != null && !newEntry.getContent().equals("") ? newEntry.getContent() : old.getContent());
            journalEntryService.createEntry(old);
            return new ResponseEntity<>(old, HttpStatus.OK);
        }
         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}


