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

        //         String sqlCar = "Create TABLE Car(id INT NOT NULL UNIQUE ,img varchar(255) NOT NULL, mark varchar(255) NOT NULL, model varchar(255) NOT NULL, color varchar(255) NOT NULL, productionYear int(255) NOT NULL, fuelType varchar(255) NOT NULL, pricePerDay INT NOT NULL, gearBox varchar(255) NOT NULL, airConditioning varchar(255) NOT NULL);";
//        String sqlRental = "Create TABLE Rental(id INT NOT NULL UNIQUE , carId INT, paymentId INT, startDate varchar(255) NOT NULL  ,endDate varchar(255) NOT NULL, cost int(20) NOT NULL, pickupLocation varchar(255) NOT NULL, returnLocation varchar(255) NOT NULL );";
//        String sqlEmployee = "Create TABLE Employee(id INT NOT NULL UNIQUE , specialization VARCHAR(255) NOT NULL, opinion varchar(255) NOT NULL, salary varchar(255) NOT NULL, premium varchar(255)) ;";
//        String sqlDepartment = "Create TABLE Department(id INT NOT NULL UNIQUE , city varchar(255) NOT NULL, postal_code varchar(255) NOT NULL, address varchar(255) NOT NULL);";
//        String sqlClient = "Create TABLE Client(id INT NOT NULL UNIQUE ,login varchar(255) NOT NULL , password varchar(255) NOT NULL,  id_rental INT, pesel int(20) NOT NULL, postal_code varchar(255) NOT NULL, address varchar(255) NOT NULL);";
//        String sqlUser = "Create TABLE User(id INT NOT NULL UNIQUE , id_rental INT,  email varchar(255) NOT NULL, name varchar(255) NOT NULL, surname varchar(255) NOT NULL, password varchar(255) NOT NULL, phone_number INT(20) NOT NULL);";
//        String sqlPayment = "Create TABLE Payment(id INT NOT NULL UNIQUE , status varchar(255) NOT NULL, email varchar(255) NOT NULL , city varchar(255) NOT NULL, country varchar(255) NOT NULL, address varchar(255) NOT NULL, name varchar(255) NOT NULL, type varchar(255) NOT NULL, clientIP varchar(255) NOT NULL);";
//
//          getJdbcTemplate().update(sqlCar);
//       getJdbcTemplate().update(sqlRental);
//        getJdbcTemplate().update(sqlEmployee);
//        getJdbcTemplate().update(sqlDepartment);
//        getJdbcTemplate().update(sqlClient);
//        getJdbcTemplate().update(sqlUser);
//        getJdbcTemplate().update(sqlPayment);
//
    }

}