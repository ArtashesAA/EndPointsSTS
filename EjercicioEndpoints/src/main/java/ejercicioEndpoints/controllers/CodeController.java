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

import ejercicioEndpoints.model.Code;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/code")
public class CodeController {

	List<Code> codes = new ArrayList<Code>();

	@PostMapping("/createCode")
	@Operation(summary = "Create Code")
	public ResponseEntity<Code> setCode(Integer id, Integer paquete) {
		Code code = new Code();
		code.setId(id);
		code.setPaquete(paquete);

		codes.add(code);

		return new ResponseEntity<>(code, HttpStatus.CREATED);
	}

	@GetMapping("/getCodeById")
	@Operation(summary = "Get Code")
	public ResponseEntity<Code> getCodeById(Integer id) {
		for (Code code : codes) {
			if (code.getId().equals(id)) {
				return new ResponseEntity<>(code, HttpStatus.OK);
			}
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@PutMapping("/updateCode")
	@Operation(summary = "Update Code")
	public ResponseEntity<Code> updateCodeById(Integer id_code, Integer new_id, Integer paquete) {
		for (Code code : codes) {
			if (code.getId().equals(id_code)) {
				code.setId(new_id);
				code.setPaquete(paquete);
				return new ResponseEntity<>(code, HttpStatus.OK);
			}
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/deleteCode")
	@Operation(summary = "Delete Code")
	public ResponseEntity<Void> deleteCodeById(Integer id) {
		for (Code code : codes) {
			if (code.getId().equals(id)) {
				codes.remove(code);
				return new ResponseEntity<>(HttpStatus.OK);
			}
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
}
