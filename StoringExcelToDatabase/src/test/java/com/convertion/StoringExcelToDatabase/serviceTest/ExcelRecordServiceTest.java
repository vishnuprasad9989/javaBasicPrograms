package com.convertion.StoringExcelToDatabase.serviceTest;

import com.convertion.StoringExcelToDatabase.entity.ExcelRecords;
import com.convertion.StoringExcelToDatabase.repository.ExcelRepository;
import com.convertion.StoringExcelToDatabase.service.ExcelRecorsService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ExcelRecordServiceTest {

    @Mock
    private ExcelRepository excelRepository;

    @InjectMocks
    private ExcelRecorsService excelRecorsService;
    private ExcelRecords record1, record2;

    // dummy objects for mock test
    @BeforeEach
    void setUp() {
        record1 = new ExcelRecords();
        record1.setName("John Doe");
        record1.setEmail("john@example.com");

        record2 = new ExcelRecords();
        record2.setName("Jane Doe");
        record2.setEmail("jane@example.com");
    }

    // writing junit test cases
    @Test
   public void testSaveRecords() {
        List<ExcelRecords> records = Arrays.asList(record1, record2);
        when(excelRepository.saveAll(records)).thenReturn(records);
        excelRecorsService.saveRecords(records);
        verify(excelRepository, times(1)).saveAll(records);
    }

    @Test
    void testGetAllRecords() {
        List<ExcelRecords> records = Arrays.asList(record1, record2);
        when(excelRepository.findAll()).thenReturn(records);
        List<ExcelRecords> retrievedRecords = excelRecorsService.getAllRecords();

        assertEquals(2, retrievedRecords.size());
        assertEquals("John Doe", retrievedRecords.get(0).getName());
        assertEquals("jane@example.com", retrievedRecords.get(1).getEmail());

        verify(excelRepository, times(1)).findAll();
    }
}
