package sl314.beans;

import java.io.Serializable;

public class CustomerBean implements Serializable {

  private String name;
  private String email;
  private String phone;

  public CustomerBean() {
    this.name = "";
    this.email = "";
    this.phone = "";
  }

  public void setName(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  public String getEmail() {
    return email;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
  public String getPhone() {
    return phone;
  }

} // END of CustomerBean class
