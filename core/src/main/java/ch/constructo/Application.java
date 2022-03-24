package ch.constructo;

import ch.constructo.entity.User;
import ch.constructo.initProject.Benutzer;
import ch.constructo.initProject.BenutzerRepository;
import ch.constructo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Bean
  CommandLineRunner init(UserRepository userRepository){
    return args -> {

      Stream.of("John", "Jenny", "Jennifer", "Helene", "Rachel").forEach(name -> {
        User user = new User();
        user.setFirstName(name);
        user.setLastName(name + name);
        user.setEmail(name + "domain.ch");
        user.setUsername(name);
        user.setPassword("admin");
        userRepository.save(user);
        userRepository.findAll().forEach(System.out::println);
      });
    };
  }

}
