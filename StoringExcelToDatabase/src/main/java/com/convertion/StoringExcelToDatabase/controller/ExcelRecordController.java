package com.convertion.StoringExcelToDatabase.controller;

import com.convertion.StoringExcelToDatabase.entity.ExcelRecords;
import com.convertion.StoringExcelToDatabase.repository.ExcelRepository;
import com.convertion.StoringExcelToDatabase.service.ExcelRecorsService;
import com.convertion.StoringExcelToDatabase.utility.ExcelFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.List;


@RestController
@RequestMapping("/api/excel")
public class ExcelRecordController {

    @Autowired
    private ExcelRecorsService excelRecorsService;
    @Autowired
    private ExcelFile excelFile;


    @PostMapping("/upload")
    public ResponseEntity<String> uploadExcelFile(@RequestParam("file") MultipartFile file) throws IOException {
        List<ExcelRecords> records = excelFile.processExcelFile(file.getInputStream());
        excelRecorsService.saveRecords(records);
        return ResponseEntity.ok("File has been uploaded successfully");
    }

    @GetMapping("/records")
    public ResponseEntity<List<ExcelRecords>> getAllRecords() {
        return ResponseEntity.ok(excelRecorsService.getAllRecords());
    }
}
