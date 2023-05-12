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

import ejercicioEndpoints.model.Tag;

@RestController
@RequestMapping("/tag")
public class TagController {

	@GetMapping("/getTagById")
    public ResponseEntity<Tag> getTagById(@PathVariable Integer id) {
        Tag Tag = new Tag();
        Tag.setId(id);
        return ResponseEntity.ok(Tag);
    }
    
    @PostMapping("/createTag")
    public ResponseEntity<Tag> createTag(@RequestBody Tag Tag) {
        return ResponseEntity.ok(Tag);
    }
    
    @PutMapping("/updateTag")
    public ResponseEntity<Tag> updateTag(@PathVariable Integer id, @RequestBody Tag Tag) {
    	Tag.setId(id);
        return ResponseEntity.ok(Tag);
    }
    
    @DeleteMapping("/deleteTag")
    public ResponseEntity<Void> deleteTag(@RequestBody Tag Tag) {
        Tag.setDate(null);
        Tag.setId(null);
        Tag.setLabel(null);
        return ResponseEntity.noContent().build();
    }
}
