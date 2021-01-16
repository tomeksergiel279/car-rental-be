package pl.tomek.jdbccar.model;


import java.sql.Date;

public class Wypozyczenie {

  private long id;
  private String dataRozpoczecia;
  private String dataZakonczenia;
  private long kosztWypozyczenia;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getDataRozpoczecia() {
    return dataRozpoczecia;
  }

  public void setDataRozpoczecia(String dataRozpoczecia) {
    this.dataRozpoczecia = dataRozpoczecia;
  }


  public String getDataZakonczenia() {
    return dataZakonczenia;
  }

  public void setDataZakonczenia(String dataZakonczenia) {
    this.dataZakonczenia = dataZakonczenia;
  }


  public long getKosztWypozyczenia() {
    return kosztWypozyczenia;
  }

  public void setKosztWypozyczenia(long kosztWypozyczenia) {
    this.kosztWypozyczenia = kosztWypozyczenia;
  }

  public Wypozyczenie(long id, String dataRozpoczecia, String dataZakonczenia, long kosztWypozyczenia) {
    this.id = id;
    this.dataRozpoczecia = dataRozpoczecia;
    this.dataZakonczenia = dataZakonczenia;
    this.kosztWypozyczenia = kosztWypozyczenia;
  }

  public Wypozyczenie() {
  }
}
