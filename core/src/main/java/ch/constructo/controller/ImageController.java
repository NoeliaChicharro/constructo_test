package ch.constructo.controller;

import ch.constructo.entity.Garment;
import ch.constructo.entity.Image;
import ch.constructo.repository.GarmentRepository;
import ch.constructo.repository.ImageRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ImageController {

  private ImageRepository imageRepository;

  public ImageController(ImageRepository imageRepository) {
    this.imageRepository = imageRepository;
  }

  @GetMapping("/images")
  public List<Image> getGarments(){
    return imageRepository.findAll();
  }

  @PostMapping("/images")
  void addImage(@RequestBody Image image){
    imageRepository.save(image);
  }

}
