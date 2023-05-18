package ejercicioEndpoints.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ejercicioEndpoints.model.Phone;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/phone")
public class PhoneController {

	List<Phone> phones = new ArrayList<Phone>();

	@PostMapping("/createPhone")
	@Operation(summary = "Create Phone")
	public ResponseEntity<Phone> setPhone(Integer value, String type) {
		Phone phone = new Phone();
		phone.setValue(value);
		phone.setType(type);

		phones.add(phone);

		return new ResponseEntity<>(phone, HttpStatus.CREATED);
	}

	@GetMapping("/getPhoneById")
	@Operation(summary = "Get Phone")
	public ResponseEntity<Phone> getPhoneByValue(Integer value, String type) {
		for (Phone phone : phones) {
			if ((phone.getValue().equals(value)) && (phone.getType().equals(type))) {
				return new ResponseEntity<>(phone, HttpStatus.OK);
			}
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@PutMapping("/updatePhone")
	@Operation(summary = "Update Phone")
	public ResponseEntity<Phone> updatePhoneByValue(Integer Phone_value, String Phone_type, Integer newValue, String newType) {
		for (Phone phone : phones) {
			if ((phone.getValue().equals(Phone_value)) && (phone.getType().equals(Phone_type))) {
				phone.setValue(newValue);
				phone.setType(newType);
				return new ResponseEntity<>(phone, HttpStatus.OK);
			}
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/deletePhone")
	@Operation(summary = "Delete Phone")
	public ResponseEntity<Void> deletePhoneById(Integer value, String type) {
		for (Phone phone : phones) {
			if ((phone.getValue().equals(value)) && (phone.getType().equals(type))) {
				phones.remove(phone);
				return new ResponseEntity<>(HttpStatus.OK);
			}
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
}
