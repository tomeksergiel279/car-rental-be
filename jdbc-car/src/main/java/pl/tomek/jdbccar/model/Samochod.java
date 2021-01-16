package pl.tomek.jdbccar.model;


public class Samochod {

  private long id;
  private String marka;
  private String model;
  private String kolor;
  private long rocznik;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getMarka() {
    return marka;
  }

  public void setMarka(String marka) {
    this.marka = marka;
  }


  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }


  public String getKolor() {
    return kolor;
  }

  public void setKolor(String kolor) {
    this.kolor = kolor;
  }


  public long getRocznik() {
    return rocznik;
  }

  public void setRocznik(long rocznik) {
    this.rocznik = rocznik;
  }

  public Samochod(long id, String marka, String model, String kolor, long rocznik) {
    this.id = id;
    this.marka = marka;
    this.model = model;
    this.kolor = kolor;
    this.rocznik = rocznik;
  }

  public Samochod() {
  }
}
