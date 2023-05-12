package ejercicioEndpoints.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ejercicioEndpoints.model.Project;

@RestController
@RequestMapping("/project")
public class ProjectController {

	@GetMapping("/getProjectById")
    public ResponseEntity<Project> getProjectById(@PathVariable Integer id) {
        Project Project = new Project();
        Project.setId(id);
        return ResponseEntity.ok(Project);
    }
    
    @PostMapping("/createProject")
    public ResponseEntity<Project> createProject(@RequestBody Project Project) {
        return ResponseEntity.ok(Project);
    }
    
    @PutMapping("/updateProject")
    public ResponseEntity<Project> updateProject(@PathVariable Integer id, @RequestBody Project Project) {
    	Project.setId(id);
        return ResponseEntity.ok(Project);
    }
    
    @DeleteMapping("/deleteProject")
    public ResponseEntity<Void> deleteProject(@RequestBody Project Project) {
        Project.setDescription(null);
        Project.setDetail(null);
        Project.setId(null);
        Project.setLanguage(null);
        Project.setOpen(null);
        return ResponseEntity.noContent().build();
    }
}
