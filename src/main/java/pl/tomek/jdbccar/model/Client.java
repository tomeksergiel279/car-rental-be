package pl.tomek.jdbccar.model;

public class Client {

  private long id;
  private String login;
  private String password;
  private long idRental;
  private long pesel;
  private String postalCode;
  private String address;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public long getIdRental() {
    return idRental;
  }

  public void setIdRental(long idRental) {
    this.idRental = idRental;
  }


  public long getPesel() {
    return pesel;
  }

  public void setPesel(long pesel) {
    this.pesel = pesel;
  }


  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Client(long id, String login, String password, long idRental, long pesel, String postalCode, String address) {
    this.id = id;
    this.login = login;
    this.password = password;
    this.idRental = idRental;
    this.pesel = pesel;
    this.postalCode = postalCode;
    this.address = address;
  }

  public Client() {
  }
}
