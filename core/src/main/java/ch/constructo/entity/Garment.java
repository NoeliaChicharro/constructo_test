package ch.constructo.entity;

import ch.constructo.enums.GarmentType;
import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class Garment extends AbstractEntity implements Cloneable{

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;

  @Enumerated(EnumType.STRING)
  private GarmentType garmentType;

  @NotNull
  private String name;

  @NotNull
  private Boolean completed;

  @Column(length = 20000000)
  private byte[] flatImage;

  public Garment() {
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public GarmentType getPatternType() {
    return garmentType;
  }

  public void setPatternType(GarmentType garmentType) {
    this.garmentType = garmentType;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Boolean getCompleted() {
    return completed;
  }

  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }

  public byte[] getFlatImage() {
    return flatImage;
  }

  public void setFlatImage(byte[] flatImage) {
    this.flatImage = flatImage;
  }
}
