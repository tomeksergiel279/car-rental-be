package pl.tomek.jdbccar;


import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class Config{

    @Bean
    public DataSource getDataSource(){
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:mysql://localhost:3306/baza?serverTimezone=UTC");
        dataSourceBuilder.username("root");
        dataSourceBuilder.password("");
        dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");
        return dataSourceBuilder.build();
    }

    @Bean
    public JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate(getDataSource());
    }

    @EventListener(ApplicationReadyEvent.class)
    public void dbInit(){

//        String sqlCar = "Create TABLE Car(id INT NOT NULL UNIQUE ,img varchar(255) NOT NULL, mark varchar(255) NOT NULL, model varchar(255) NOT NULL, color varchar(255) NOT NULL, productionYear int(255) NOT NULL, fuelType varchar(255) NOT NULL,fuelUsagePer100km FLOAT NOT NULL, pricePerDay INT NOT NULL, gearBox varchar(255) NOT NULL, airConditioning varchar(255) NOT NULL);";
//        String sqlRental = "Create TABLE Rental(id INT NOT NULL UNIQUE , carId INT, paymentId INT, startDate varchar(255) NOT NULL  ,endDate varchar(255) NOT NULL, cost int(20) NOT NULL, pickupLocation varchar(255) NOT NULL, returnLocation varchar(255) NOT NULL );";
//        String sqlEmployee = "Create TABLE Employee(id INT NOT NULL UNIQUE , specialization VARCHAR(255) NOT NULL, opinion varchar(255) NOT NULL, salary varchar(255) NOT NULL, premium varchar(255)) ;";
//        String sqlDepartment = "Create TABLE Department(id INT NOT NULL UNIQUE , city varchar(255) NOT NULL, postal_code varchar(255) NOT NULL, address varchar(255) NOT NULL);";
//        String sqlClient = "Create TABLE Client(id INT NOT NULL UNIQUE ,login varchar(255) NOT NULL , password varchar(255) NOT NULL,  id_rental INT, pesel int(20) NOT NULL, postal_code varchar(255) NOT NULL, address varchar(255) NOT NULL);";
//        String sqlUser = "Create TABLE User(id INT NOT NULL UNIQUE , id_rental INT,  email varchar(255) NOT NULL, name varchar(255) NOT NULL, surname varchar(255) NOT NULL, password varchar(255) NOT NULL, phone_number INT(20) NOT NULL);";
//        String sqlPayment = "Create TABLE Payment(id INT NOT NULL UNIQUE , status varchar(255) NOT NULL, email varchar(255) NOT NULL , city varchar(255) NOT NULL, country varchar(255) NOT NULL, address varchar(255) NOT NULL, name varchar(255) NOT NULL, type varchar(255) NOT NULL, clientIP varchar(255) NOT NULL);";
//
//        getJdbcTemplate().update(sqlCar);
//        getJdbcTemplate().update(sqlRental);
//        getJdbcTemplate().update(sqlEmployee);
//        getJdbcTemplate().update(sqlDepartment);
//        getJdbcTemplate().update(sqlClient);
//        getJdbcTemplate().update(sqlUser);
//        getJdbcTemplate().update(sqlPayment);
//
//        String car1 = "INSERT INTO `car`(`id`, `img`, `mark`, `model`, `color`, `productionYear`, `fuelType`, `fuelUsagePer100km`, `pricePerDay`, `gearBox`, `airConditioning`) VALUES (1,'koleos','Renault','Koleos','silver',2015,'Benzyna',9.0,89,'automat','true');";
//        String car2 = "INSERT INTO `car`(`id`, `img`, `mark`, `model`, `color`, `productionYear`, `fuelType`, `fuelUsagePer100km`, `pricePerDay`, `gearBox`, `airConditioning`) VALUES (2,'BMW518d','BMW','518d','silver',2015,'Benzyna',9.0,150,'automat','true');";
//        String car3 = "INSERT INTO `car`(`id`, `img`, `mark`, `model`, `color`, `productionYear`, `fuelType`, `fuelUsagePer100km`, `pricePerDay`, `gearBox`, `airConditioning`) VALUES (3,'BMWM5','BMW','M5','silver',2018,'Benzyna',9.0,350,'automat','true');";
//        String car4 = "INSERT INTO `car`(`id`, `img`, `mark`, `model`, `color`, `productionYear`, `fuelType`, `fuelUsagePer100km`, `pricePerDay`, `gearBox`, `airConditioning`) VALUES (4,'BMWX6','BMW','X6','silver',2018,'Benzyna',9.0,140,'automat','true');";
//        String car5 = "INSERT INTO `car`(`id`, `img`, `mark`, `model`, `color`, `productionYear`, `fuelType`, `fuelUsagePer100km`, `pricePerDay`, `gearBox`, `airConditioning`) VALUES (5,'fordFiesta','Ford','Fiesta','silver',2013,'Benzyna',5.8,40,'manual','true');";
//        String car6 = "INSERT INTO `car`(`id`, `img`, `mark`, `model`, `color`, `productionYear`, `fuelType`, `fuelUsagePer100km`, `pricePerDay`, `gearBox`, `airConditioning`) VALUES (6,'I20','Hyundai','I20','silver',2014,'Benzyna',4.8,35,'manual','true');";
//        String car7 = "INSERT INTO `car`(`id`, `img`, `mark`, `model`, `color`, `productionYear`, `fuelType`, `fuelUsagePer100km`, `pricePerDay`, `gearBox`, `airConditioning`) VALUES (7,'YARIS','Toyota','Yaris','silver',2014,'Benzyna',4.5,39,'manual','true');";
//        String car8 = "INSERT INTO `car`(`id`, `img`, `mark`, `model`, `color`, `productionYear`, `fuelType`, `fuelUsagePer100km`, `pricePerDay`, `gearBox`, `airConditioning`) VALUES (8,'LEON','Seat','Leon','silver',2014,'Benzyna',5.2,40,'manual','true');";
//        String car9 = "INSERT INTO `car`(`id`, `img`, `mark`, `model`, `color`, `productionYear`, `fuelType`, `fuelUsagePer100km`, `pricePerDay`, `gearBox`, `airConditioning`) VALUES (9,'I30','Hyundai','I30','silver',2014,'Benzyna',4.8,45,'manual','true');";
//        String car10 = "INSERT INTO `car`(`id`, `img`, `mark`, `model`, `color`, `productionYear`, `fuelType`, `fuelUsagePer100km`, `pricePerDay`, `gearBox`, `airConditioning`) VALUES (10,'I30COMBI','Hyundai','I30COMBI','silver',2017,'Benzyna',6.2,65,'automat','true');";
//        String car11 = "INSERT INTO `car`(`id`, `img`, `mark`, `model`, `color`, `productionYear`, `fuelType`, `fuelUsagePer100km`, `pricePerDay`, `gearBox`, `airConditioning`) VALUES (11,'https://ibb.co/NKR4QKB','Audi','A6','silver',2015,'Benzyna',10.0,250,'automat','true');";
//        String car12 = "INSERT INTO `car`(`id`, `img`, `mark`, `model`, `color`, `productionYear`, `fuelType`, `fuelUsagePer100km`, `pricePerDay`, `gearBox`, `airConditioning`) VALUES (12,'audiRS6','Audi','RS6','silver',2015,'Benzyna',13.0,300,'automat','true');";
//
//        getJdbcTemplate().update(car1);
//        getJdbcTemplate().update(car2);
//        getJdbcTemplate().update(car3);
//        getJdbcTemplate().update(car4);
//        getJdbcTemplate().update(car5);
//        getJdbcTemplate().update(car6);
//        getJdbcTemplate().update(car7);
//        getJdbcTemplate().update(car8);
//        getJdbcTemplate().update(car9);
//        getJdbcTemplate().update(car10);
//        getJdbcTemplate().update(car11);
//        getJdbcTemplate().update(car12);

    }

}
