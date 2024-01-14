package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.nameRecords;
import com.example.demo.Repository.NameRecordRepository;


@Service
public class NameRecordSrevice {
	@Autowired
	private NameRecordRepository nameRecordRepository;
	public nameRecords createNameRecord(String firstname, String lastname) {
        nameRecords newRecords = new nameRecords();
        newRecords.setFirstname(firstname);
        newRecords.setLastname(lastname);
        return nameRecordRepository.save(newRecords);
    }
//	public List<nameRecords> getNameRecords(){
//		return nameRecordRepository.findAll();
//	}
	public Page<nameRecords> getPages(Pageable pageable){
		return nameRecordRepository.findAll(pageable);
	}
	public void deleteName(Integer id) {
	    Optional<nameRecords> deleteOptional = nameRecordRepository.findById(id);
	    if (deleteOptional.isPresent()) {
	        nameRecordRepository.deleteById(id);
	    } else {
	        throw new RuntimeException("找不到此id: " + id);
	    }
	}

}
