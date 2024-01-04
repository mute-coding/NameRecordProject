package com.example.demo.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
	@GetMapping("/record")
	public List<nameRecords> getNameRecords() {
		return nameRecordSrevice.getNameRecords();
	}
}
