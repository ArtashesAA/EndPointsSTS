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

import ejercicioEndpoints.model.Project;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/project")
public class ProjectController {

	List<Project> projects = new ArrayList<Project>();

	@PostMapping("/createProject")
	@Operation(summary = "Create Project")
	public ResponseEntity<Project> setProject(Integer id, String description) {
		Project project = new Project();
		project.setId(id);
		project.setDescription(description);

		projects.add(project);

		return new ResponseEntity<>(project, HttpStatus.CREATED);
	}

	@GetMapping("/getProjectById")
	@Operation(summary = "Get Project")
	public ResponseEntity<Project> getProjectById(Integer id) {
		for (Project project : projects) {
			if (project.getId().equals(id)) {
				return new ResponseEntity<>(project, HttpStatus.OK);
			}
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@PutMapping("/updateProject")
	@Operation(summary = "Update Project")
	public ResponseEntity<Project> updateProjectById(Integer id_project, Integer new_id, String description, String language, Boolean open) {
		for (Project project : projects) {
			if (project.getId().equals(id_project)) {
				project.setId(new_id);
				project.setDescription(description);
				project.setLanguage(language);
				project.setOpen(open);
				return new ResponseEntity<>(project, HttpStatus.OK);
			}
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/deleteProject")
	@Operation(summary = "Delete Project")
	public ResponseEntity<Void> deleteProjectById(Integer id) {
		for (Project project : projects) {
			if (project.getId().equals(id)) {
				projects.remove(project);
				return new ResponseEntity<>(HttpStatus.OK);
			}
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
}
