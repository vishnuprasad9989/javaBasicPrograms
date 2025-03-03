package com.convertion.StoringExcelToDatabase.repository;

import com.convertion.StoringExcelToDatabase.entity.ExcelRecords;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExcelRepository extends JpaRepository<ExcelRecords, Integer> {
}
