package com.convertion.StoringExcelToDatabase.service;

import com.convertion.StoringExcelToDatabase.entity.ExcelRecords;
import com.convertion.StoringExcelToDatabase.repository.ExcelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExcelRecorsService {

    @Autowired
    private ExcelRepository excelRepository;

    // method for saving all excel records
    public void saveRecords(List<ExcelRecords> records) {
        List<ExcelRecords> list = excelRepository.saveAll(records);
    }

    // method for getting all records
    public List<ExcelRecords> getAllRecords() {
        return excelRepository.findAll();
    }
}

