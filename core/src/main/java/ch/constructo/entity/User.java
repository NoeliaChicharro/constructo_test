package ch.constructo.entity;

import com.sun.istack.NotNull;

import javax.persistence.Entity;

@Entity
public class User extends AbstractEntity implements Cloneable{

  @NotNull
  private String firstName = "";

  private String lastName = "";

  @NotNull
  private String username = "";

  @NotNull
  private String email = "";

  @NotNull
  private String password = "";

  public User() {
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
