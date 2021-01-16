package pl.tomek.jdbccar.model;


public class Client {

  private long id;
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

  public Client(long id, long idRental, long pesel, String postalCode, String address) {
    this.id = id;
    this.idRental = idRental;
    this.pesel = pesel;
    this.postalCode = postalCode;
    this.address = address;
  }

  public Client() {
  }

}
