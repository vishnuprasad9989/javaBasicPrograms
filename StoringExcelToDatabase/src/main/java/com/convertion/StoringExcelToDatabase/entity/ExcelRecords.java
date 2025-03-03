package com.convertion.StoringExcelToDatabase.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@Table(name = "excel_records")
public class ExcelRecords {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email; // Make sure this field exists

    public ExcelRecords(String johnDoe, String mail) {
    }

    public ExcelRecords() {

    }
}
