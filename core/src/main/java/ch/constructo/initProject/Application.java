package ch.constructo.initProject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.atomic.AtomicReference;
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
        User user = new User(1L, name, name.toLowerCase() + "@domain.ch");
        userRepository.save(user);
        userRepository.findAll().forEach(System.out::println);
      });
    };
  }

}
