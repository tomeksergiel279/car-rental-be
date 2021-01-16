package pl.tomek.jdbccar.model;


public class Car {

  private long id;
  private String img;
  private String mark;
  private String model;
  private String color;
  private long productionYear;
  private String fuelType;
  private long pricePerDay;
  private String gearBox;
  private String airConditioning;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getImg() {
    return img;
  }

  public void setImg(String img) {
    this.img = img;
  }


  public String getMark() {
    return mark;
  }

  public void setMark(String mark) {
    this.mark = mark;
  }


  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }


  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }


  public long getProductionYear() {
    return productionYear;
  }

  public void setProductionYear(long productionYear) {
    this.productionYear = productionYear;
  }


  public String getFuelType() {
    return fuelType;
  }

  public void setFuelType(String fuelType) {
    this.fuelType = fuelType;
  }


  public long getPricePerDay() {
    return pricePerDay;
  }

  public void setPricePerDay(long pricePerDay) {
    this.pricePerDay = pricePerDay;
  }


  public String getGearBox() {
    return gearBox;
  }

  public void setGearBox(String gearBox) {
    this.gearBox = gearBox;
  }


  public String getAirConditioning() {
    return airConditioning;
  }

  public void setAirConditioning(String airConditioning) {
    this.airConditioning = airConditioning;
  }

}
