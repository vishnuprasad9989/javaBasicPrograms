package com.convertion.StoringExcelToDatabase.controllerTest;

import com.convertion.StoringExcelToDatabase.controller.ExcelRecordController;
import com.convertion.StoringExcelToDatabase.entity.ExcelRecords;
import com.convertion.StoringExcelToDatabase.service.ExcelRecorsService;
import com.convertion.StoringExcelToDatabase.utility.ExcelFile;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ExcelRecordControllerTest {

    @Mock
    private ExcelRecorsService excelRecorsService;
    @Mock
    private ExcelFile excelFile;
    @InjectMocks
    private ExcelRecordController excelRecordController;

    @Test
    void testUploadExcelFile() throws IOException {
        MockMultipartFile file = new MockMultipartFile(
                "file",
                "test.xlsx",
                MediaType.MULTIPART_FORM_DATA_VALUE,
                new byte[]{1, 2, 3, 4}
        );

        List<ExcelRecords> records = Arrays.asList(
                new ExcelRecords("John Doe", "john@example.com"),
                new ExcelRecords("Jane Doe", "jane@example.com")
        );

        when(excelFile.processExcelFile(any())).thenReturn(records);
        doNothing().when(excelRecorsService).saveRecords(records);

        ResponseEntity<String> response = excelRecordController.uploadExcelFile(file);

        assertEquals(200, response.getStatusCodeValue());
        assertEquals("File has been uploaded successfully", response.getBody());

        verify(excelFile, times(1)).processExcelFile(any());
        verify(excelRecorsService, times(1)).saveRecords(records);
    }

    @Test
    void testGetAllRecords() {
        List<ExcelRecords> records = Arrays.asList(
                new ExcelRecords("John Doe", "john@example.com"),
                new ExcelRecords("Jane Doe", "jane@example.com")
        );

        when(excelRecorsService.getAllRecords()).thenReturn(records);

        ResponseEntity<List<ExcelRecords>> response = excelRecordController.getAllRecords();

        assertEquals(200, response.getStatusCodeValue());
        assertEquals(2, response.getBody().size());

        verify(excelRecorsService, times(1)).getAllRecords();
    }
}
