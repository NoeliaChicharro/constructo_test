package ch.constructo.entity;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Image extends AbstractEntity implements Cloneable {

  @NotNull
  private String name;

  @ManyToOne
  @JoinColumn(name = "garment_id")
  private Garment garment;

  @NotNull
  private byte[] image;

  public Image() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Garment getGarment() {
    return garment;
  }

  public void setGarment(Garment garment) {
    this.garment = garment;
  }

  public byte[] getImage() {
    return image;
  }

  public void setImage(byte[] image) {
    this.image = image;
  }
}
