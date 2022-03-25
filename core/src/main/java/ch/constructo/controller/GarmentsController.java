package ch.constructo.controller;

import ch.constructo.entity.Garment;
import ch.constructo.repository.GarmentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class GarmentsController {

  private GarmentRepository garmentRepository;

  public GarmentsController(GarmentRepository garmentRepository) {
    this.garmentRepository = garmentRepository;
  }

  @GetMapping("/garments")
  public List<Garment> getGarments(){
    return garmentRepository.findAll();
  }

  @PostMapping("/garments")
  void addGarment(@RequestBody Garment garment){
    garmentRepository.save(garment);
  }
}
