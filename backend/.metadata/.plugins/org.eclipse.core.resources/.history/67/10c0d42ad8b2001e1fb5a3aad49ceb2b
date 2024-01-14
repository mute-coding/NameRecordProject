package com.example.demo.Controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.nameRecords;
import com.example.demo.Service.NameRecordSrevice;

@RestController
@RequestMapping("/namerecords")
public class NameRecordController {
	@Autowired
	private NameRecordSrevice nameRecordSrevice;
	
	@PostMapping("/create")
	public nameRecords createNameRecord(@RequestBody Map<String, String> request) {
		String firstname = request.get("firstname");
		String lastname = request.get("lastname");
		return nameRecordSrevice.createNameRecord(firstname, lastname);
	} 
//	@GetMapping("/record")
//	public List<nameRecords> getNameRecords() {
//		return nameRecordSrevice.getNameRecords();
//	}
	@GetMapping("/pages")
	public ResponseEntity<Page<nameRecords>> getPages(
			@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "10") int size
			){
		Pageable pageable = PageRequest.of(page, size);
		Page<nameRecords> nameRecords = nameRecordSrevice.getPages(pageable);
		return ResponseEntity.ok(nameRecords);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteName(@PathVariable Integer id) {
		nameRecordSrevice.deleteName(id);
	}
	  @PutMapping("/update/{id}")
	    public ResponseEntity<nameRecords> updateNameRecord(
	            @PathVariable Integer id,
	            @RequestBody Map<String, String> request) {
	        String newFirstName = request.get("firstname");
	        String newLastName = request.get("lastname");
	        nameRecords updatedRecord = nameRecordSrevice.updateNameRecord(id, newFirstName, newLastName);
	        return ResponseEntity.ok(updatedRecord);
	    }
}
