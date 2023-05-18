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

import ejercicioEndpoints.model.User;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/user")
public class UserController {

	List<User> users = new ArrayList<User>();

	@PostMapping("/createUser")
	@Operation(summary = "Create User")
	public ResponseEntity<User> setUser(Integer id, String nick, String name) {
		User user = new User();
		user.setId(id);
		user.setNick(nick);
		user.setName(name);

		users.add(user);

		return new ResponseEntity<>(user, HttpStatus.CREATED);
	}

	@GetMapping("/getUserById")
	@Operation(summary = "Get User")
	public ResponseEntity<User> getUserById(Integer id) {
		for (User user : users) {
			if (user.getId().equals(id)) {
				return new ResponseEntity<>(user, HttpStatus.OK);
			}
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@PutMapping("/updateUser")
	@Operation(summary = "Update User")
	public ResponseEntity<User> updateUserById(Integer id_user, Integer new_id, String nick, String name) {
		for (User user : users) {
			if (user.getId().equals(id_user)) {
				user.setId(new_id);
				user.setNick(nick);
				user.setName(name);
				return new ResponseEntity<>(user, HttpStatus.OK);
			}
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/deleteUser")
	@Operation(summary = "Delete User")
	public ResponseEntity<Void> deleteUserById(Integer id) {
		for (User user : users) {
			if (user.getId().equals(id)) {
				users.remove(user);
				return new ResponseEntity<>(HttpStatus.OK);
			}
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
}
