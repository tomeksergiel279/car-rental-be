package pl.tomek.jdbccar.model;


public class Payment {

  private long id;
  private String status;
  private String email;
  private String city;
  private String country;
  private String address;
  private String name;
  private String type;
  private String clientIp;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public String getClientIp() {
    return clientIp;
  }

  public void setClientIp(String clientIp) {
    this.clientIp = clientIp;
  }

  public Payment(long id, String status, String email, String city, String country, String address, String name, String type, String clientIp) {
    this.id = id;
    this.status = status;
    this.email = email;
    this.city = city;
    this.country = country;
    this.address = address;
    this.name = name;
    this.type = type;
    this.clientIp = clientIp;
  }

  public Payment() {
  }
}
