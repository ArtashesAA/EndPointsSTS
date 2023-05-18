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

import ejercicioEndpoints.model.Tag;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/tag")
public class TagController {

	List<Tag> tags = new ArrayList<Tag>();

	@PostMapping("/createTag")
	@Operation(summary = "Create Tag")
	public ResponseEntity<Tag> setTag(Integer id, String label, Integer anyo) {
		Tag tag = new Tag();
		tag.setId(id);
		tag.setLabel(label);
		tag.setAnyo(anyo);

		tags.add(tag);

		return new ResponseEntity<>(tag, HttpStatus.CREATED);
	}

	@GetMapping("/getTagById")
	@Operation(summary = "Get Tag")
	public ResponseEntity<Tag> getTagById(Integer id) {
		for (Tag tag : tags) {
			if (tag.getId().equals(id)) {
				return new ResponseEntity<>(tag, HttpStatus.OK);
			}
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@PutMapping("/updateTag")
	@Operation(summary = "Update Tag")
	public ResponseEntity<Tag> updateTagById(Integer id_tag, Integer new_id, Integer id, String label, Integer anyo) {
		for (Tag tag : tags) {
			if (tag.getId().equals(id_tag)) {
				tag.setId(new_id);
				tag.setLabel(label);
				tag.setAnyo(anyo);
				return new ResponseEntity<>(tag, HttpStatus.OK);
			}
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/deleteTag")
	@Operation(summary = "Delete Tag")
	public ResponseEntity<Void> deleteTagById(Integer id) {
		for (Tag tag : tags) {
			if (tag.getId().equals(id)) {
				tags.remove(tag);
				return new ResponseEntity<>(HttpStatus.OK);
			}
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
}
