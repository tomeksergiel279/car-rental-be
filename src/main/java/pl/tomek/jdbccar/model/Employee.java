package pl.tomek.jdbccar.model;


public class Employee {

  private long id;
  private String specialization;
  private String opinion;
  private String salary;
  private String premium;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getSpecialization() {
    return specialization;
  }

  public void setSpecialization(String specialization) {
    this.specialization = specialization;
  }


  public String getOpinion() {
    return opinion;
  }

  public void setOpinion(String opinion) {
    this.opinion = opinion;
  }


  public String getSalary() {
    return salary;
  }

  public void setSalary(String salary) {
    this.salary = salary;
  }


  public String getPremium() {
    return premium;
  }

  public void setPremium(String premium) {
    this.premium = premium;
  }

}
