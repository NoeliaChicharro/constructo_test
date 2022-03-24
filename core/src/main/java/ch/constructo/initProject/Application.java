package ch.constructo.initProject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

//@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Bean
  CommandLineRunner init(BenutzerRepository benutzerRepository){
    return args -> {
      Stream.of("John", "Jenny", "Jennifer", "Helene", "Rachel").forEach(name -> {
        Benutzer benutzer = new Benutzer(2L, name, name.toLowerCase() + "@domain.ch");
        benutzer.setPassword("admin");
        benutzerRepository.save(benutzer);
        benutzerRepository.findAll().forEach(System.out::println);
      });
    };
  }

}
