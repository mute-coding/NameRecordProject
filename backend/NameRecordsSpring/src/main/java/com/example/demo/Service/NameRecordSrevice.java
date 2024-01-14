package com.example.demo.Service;


import java.util.Optional;



import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.nameRecords;
import com.example.demo.Repository.NameRecordRepository;


@Service
public class NameRecordSrevice {
	@Autowired
	//新增功能
	private NameRecordRepository nameRecordRepository;
	public nameRecords createNameRecord(String firstname, String lastname) {
        nameRecords newRecords = new nameRecords();
        newRecords.setFirstname(firstname);
        newRecords.setLastname(lastname);
        return nameRecordRepository.save(newRecords);
    }
	//查詢總資料功能
//	public List<nameRecords> getNameRecords(){
//		return nameRecordRepository.findAll();
//	}
	//分頁功能
	public Page<nameRecords> getPages(Pageable pageable){
		return nameRecordRepository.findAll(pageable);
	}
	//刪除功能
	public void deleteName(Integer id) {
	    Optional<nameRecords> deleteOptional = nameRecordRepository.findById(id);
	    if (deleteOptional.isPresent()) {
	        nameRecordRepository.deleteById(id);
	    } else {
	        throw new RuntimeException("找不到此id: " + id);
	    }
	}
	//選擇單一資訊
    public nameRecords getNameRecordById(Integer id) {
        Optional<nameRecords> getOptional = nameRecordRepository.findById(id);
        return getOptional.orElse(null);
    }
	//修改功能
	 public nameRecords updateNameRecord(Integer id, String newFirstName, String newLastName) {
	        Optional<nameRecords> existingRecord = nameRecordRepository.findById(id);
	        if (existingRecord.isPresent()) {
	            nameRecords recordToUpdate = existingRecord.get();
	            recordToUpdate.setFirstname(newFirstName);
	            recordToUpdate.setLastname(newLastName);
	            return nameRecordRepository.save(recordToUpdate);
	        } else {
	            throw new RuntimeException("找不到此id: " + id);
	        }
	    }


}
