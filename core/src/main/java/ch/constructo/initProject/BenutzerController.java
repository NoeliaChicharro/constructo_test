package ch.constructo.initProject;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BenutzerController {

  private final BenutzerRepository benutzerRepository;

  public BenutzerController(BenutzerRepository benutzerRepository) {
    this.benutzerRepository = benutzerRepository;
  }

  @GetMapping("/benutzers")
  public List<Benutzer> getGenutzer(){
    return (List<Benutzer>) benutzerRepository.findAll();
  }

  @PostMapping("/benutzers")
  void addBenutzer(@RequestBody Benutzer benutzer){
    benutzerRepository.save(benutzer);
  }
}
