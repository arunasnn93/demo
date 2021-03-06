package com.example.demo.user;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

	@Autowired
	private UserDaoService userService;
	
	@GetMapping(path="/users")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@GetMapping(path="/users/{id}")
	public User getUser(@PathVariable int id) {
		User user = userService.getUser(id);
		if(user == null) {
			throw new UserNotFoundException("id - "+id);
		}
		
		return user;
	}
	
	@PostMapping(path="/createuser")
	public ResponseEntity<Object> createUser(@RequestBody User user) throws URISyntaxException {
		User saved = userService.save(user);
		return ResponseEntity.created(new URI("adssad")).build();
	}
	
}
