package ch.constructo.controller;

import ch.constructo.entity.User;
import ch.constructo.initProject.Benutzer;
import ch.constructo.initProject.BenutzerRepository;
import ch.constructo.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

  private final UserRepository userRepository;


  public UserController(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @GetMapping("/users")
  public List<User> getUsers(){
    return (List<User>) userRepository.findAll();
  }

  @PostMapping("/users")
  void addUser(@RequestBody User user){
    userRepository.save(user);
  }
}
