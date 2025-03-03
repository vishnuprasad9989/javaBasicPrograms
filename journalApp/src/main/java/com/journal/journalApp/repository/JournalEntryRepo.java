package com.journal.journalApp.repository;

import com.journal.journalApp.entity.JournalEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepo extends MongoRepository<JournalEntry, String> {
}
