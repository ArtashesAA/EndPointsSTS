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

import ejercicioEndpoints.model.User;

@RestController
@RequestMapping("/user")
public class UserController {

	@GetMapping("/getUserById")
    public ResponseEntity<User> getUserById(@PathVariable String id) {
        User User = new User();
        User.setId(id);
        return ResponseEntity.ok(User);
    }
    
    @PostMapping("/createUser")
    public ResponseEntity<User> createUser(@RequestBody User User) {
        return ResponseEntity.ok(User);
    }
    
    @PutMapping("/updateUser")
    public ResponseEntity<User> updateUser(@PathVariable String id, @RequestBody User User) {
    	User.setId(id);
        return ResponseEntity.ok(User);
    }
    
    @DeleteMapping("/deleteUser")
    public ResponseEntity<Void> deleteUser(@RequestBody User User) {
        User.setId(null);
        User.setName(null);
        User.setNick(null);
        User.setPhone(null);
        return ResponseEntity.noContent().build();
    }
}
