package com.convertion.StoringExcelToDatabase.utility;

import com.convertion.StoringExcelToDatabase.entity.ExcelRecords;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Component
public class ExcelFile {

    public List<ExcelRecords> processExcelFile(InputStream inputStream) throws IOException {
        List<ExcelRecords> records = new ArrayList<>();

        // it creates a xssworkbook object from excel file using apache poi
        // ex: file vishnu in excel it directly create object for fileName(vishnu);
          try (Workbook workbook = new XSSFWorkbook(inputStream)) {
            Sheet sheet = workbook.getSheetAt(0);

          for (Row row : sheet) {
              // it skips the header part if its available in xl sheet
              if (row.getRowNum() == 0) continue;

              ExcelRecords record = new ExcelRecords();
              record.setName(getCellValue(row.getCell(0)));
              record.setEmail(getCellValue(row.getCell(1)));

              records.add(record);
            }
        }
        return records;
    }

    // method for checking different cells
    private String getCellValue(Cell cell) {
        if (cell == null) return ""; // Return empty string if cell is null

        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                return String.valueOf((long) cell.getNumericCellValue()); // Convert to long to avoid decimal points
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case FORMULA:
                return cell.getCellFormula();
            default:
                return "";
        }
    }
}


