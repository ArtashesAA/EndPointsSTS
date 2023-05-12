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

import ejercicioEndpoints.model.Phone;
import ejercicioEndpoints.model.User;

@RestController
@RequestMapping("/phone")
public class PhoneController {

	@GetMapping("/getPhoneById")
    public ResponseEntity<Phone> getPhoneById(@PathVariable User user) {
        Phone Phone = new Phone();
        Phone.setUser(user);
        return ResponseEntity.ok(Phone);
    }
    
    @PostMapping("/createPhone")
    public ResponseEntity<Phone> createPhone(@RequestBody Phone Phone) {
        return ResponseEntity.ok(Phone);
    }
    
    @PutMapping("/updatePhone")
    public ResponseEntity<Phone> updatePhone(@PathVariable User user, @RequestBody Phone Phone) {
    	Phone.setUser(user);
        return ResponseEntity.ok(Phone);
    }
    
    @DeleteMapping("/deletePhone")
    public ResponseEntity<Void> deletePhone(@RequestBody Phone Phone) {
        Phone.setType(null);
        Phone.setUser(null);
        Phone.setValue(null);
        return ResponseEntity.noContent().build();
    }
}
