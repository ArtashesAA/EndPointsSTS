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

import ejercicioEndpoints.model.Detail;
import io.swagger.v3.oas.annotations.Operation;


@RestController
@RequestMapping("/detail")
public class DetailController {

	List<Detail> details = new ArrayList<Detail>();

	@PostMapping("/createDetail")
	@Operation(summary = "Create Detail")
	public ResponseEntity<Detail> setDetail(Double budget, Integer anyo, String content, String type) {
		Detail detail = new Detail();
		detail.setAnyo(anyo);
		detail.setBudget(budget);
		detail.setContent(content);
		detail.setType(type);

		details.add(detail);

		return new ResponseEntity<>(detail, HttpStatus.CREATED);
	}

	@GetMapping("/getDetailById")
	@Operation(summary = "Get Detail")
	public ResponseEntity<Detail> getDetailById(Double budget) {
		for (Detail detail : details) {
			if (detail.getBudget().equals(budget)) {
				return new ResponseEntity<>(detail, HttpStatus.OK);
			}
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	@PutMapping("/updateDetail")
	@Operation(summary = "Update Detail")
	public ResponseEntity<Detail> updateDetailByBudget(Double budget, Double new_budget, Integer anyo, String content, String type) {
		for (Detail detail : details) {
			if (detail.getBudget().equals(budget)) {
				detail.setAnyo(anyo);
				detail.setBudget(new_budget);
				detail.setContent(content);
				detail.setType(type);
				return new ResponseEntity<>(detail, HttpStatus.OK);
			}
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/deleteDetail")
	@Operation(summary = "Delete Detail")
	public ResponseEntity<Void> deleteDetailByBudget(Double budget) {
		for (Detail detail : details) {
			if (detail.getBudget().equals(budget)) {
				details.remove(detail);
				return new ResponseEntity<>(HttpStatus.OK);
			}
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
}
