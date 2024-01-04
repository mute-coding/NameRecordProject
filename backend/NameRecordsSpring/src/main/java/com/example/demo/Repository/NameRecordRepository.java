package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.nameRecords;

public interface NameRecordRepository extends JpaRepository<nameRecords, Integer> {

}
