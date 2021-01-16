package pl.tomek.jdbccar.model;


public class Rental {

  private long id;
  private long carId;
  private long paymentId;
  private String startDate;
  private String endDate;
  private long cost;
  private String pickupLocation;
  private String returnLocation;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getCarId() {
    return carId;
  }

  public void setCarId(long carId) {
    this.carId = carId;
  }


  public long getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(long paymentId) {
    this.paymentId = paymentId;
  }


  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public long getCost() {
    return cost;
  }

  public void setCost(long cost) {
    this.cost = cost;
  }


  public String getPickupLocation() {
    return pickupLocation;
  }

  public void setPickupLocation(String pickupLocation) {
    this.pickupLocation = pickupLocation;
  }


  public String getReturnLocation() {
    return returnLocation;
  }

  public void setReturnLocation(String returnLocation) {
    this.returnLocation = returnLocation;
  }

  public Rental(long id, long carId, long paymentId, String startDate, String endDate, long cost, String pickupLocation, String returnLocation) {
    this.id = id;
    this.carId = carId;
    this.paymentId = paymentId;
    this.startDate = startDate;
    this.endDate = endDate;
    this.cost = cost;
    this.pickupLocation = pickupLocation;
    this.returnLocation = returnLocation;
  }

  public Rental() {
  }
}
