package com.journal.journalApp.service;

import com.journal.journalApp.entity.User;
import com.journal.journalApp.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class UserServiceTests {

    @Autowired
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    public void testAdd(){
        assertEquals(4,2+2);
       // assertNotNull(userRepository.findByUserName("happy"));
        assertTrue(5 > 3);
    }

    @Test
    public void multiplication(){
        assertSame(5, 3+2);
        int num = 5;
        assertTrue(num > 3);
        System.out.println("Test is passed");
    }

    
  /*  @Test
    public void checkJournalEntries(){
        User user = userRepository.findByUserName("sad");
        assertTrue(!user.getJournalEntries().isEmpty());
    }*/
}
