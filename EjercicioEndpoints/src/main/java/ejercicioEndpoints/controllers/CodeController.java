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

import ejercicioEndpoints.model.Code;

@RestController
@RequestMapping("/code")
public class CodeController {

	@GetMapping("/getCodeById")
    public ResponseEntity<Code> getCodeById(@PathVariable Integer id) {
        Code Code = new Code();
        Code.setId(id);
        return ResponseEntity.ok(Code);
    }
    
    @PostMapping("/createCode")
    public ResponseEntity<Code> createCode(@RequestBody Code Code) {
        return ResponseEntity.ok(Code);
    }
    
    @PutMapping("/updateCode")
    public ResponseEntity<Code> updateCode(@PathVariable Integer id, @RequestBody Code Code) {
    	Code.setId(id);
        return ResponseEntity.ok(Code);
    }
    
    @DeleteMapping("/deleteCode")
    public ResponseEntity<Void> deleteCode(@RequestBody Code Code) {
        Code.setId(null);
        Code.setFile(null);
        Code.setPackagee(null);
        Code.setProject(null);
        return ResponseEntity.noContent().build();
    }
}
