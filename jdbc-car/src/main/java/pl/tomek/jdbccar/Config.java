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

//    @EventListener(ApplicationReadyEvent.class)
//    public void dbInit(){
//        String sqlCar = "Create TABLE Samochod(id INT NOT NULL UNIQUE , marka varchar(255) NOT NULL, model varchar(255) NOT NULL, kolor varchar(255) NOT NULL, rocznik int(255) NOT NULL);";
//        String sqlRent = "Create TABLE Wypozyczenie(id INT NOT NULL UNIQUE , data_rozpoczecia varchar(255) NOT NULL  ,data_zakonczenia varchar(255) NOT NULL, koszt_wypozyczenia int(20) NOT NULL);";
//        String sqlWorker = "Create TABLE Pracownik(id INT NOT NULL UNIQUE , specjalizacja VARCHAR(255) NOT NULL, opinia varchar(255) NOT NULL, wynagrodzenie varchar(255) NOT NULL, premia varchar(255)) ;";
//        String sqlDepartment = "Create TABLE Placowka(id INT NOT NULL UNIQUE , miasto varchar(255) NOT NULL, kod_pocztowy varchar(255) NOT NULL, adres varchar(255) NOT NULL);";
//        String sqlClient = "Create TABLE Klient(id INT NOT NULL UNIQUE , pesel int(20) NOT NULL, kod_pocztowy varchar(255) NOT NULL, adres varchar(255) NOT NULL);";
//        String sqlUser = "Create TABLE Uzytkownik(id INT NOT NULL UNIQUE ,  email varchar(255) NOT NULL, imie varchar(255) NOT NULL, nazwisko varchar(255) NOT NULL, haslo varchar(255) NOT NULL, telefon INT(20) NOT NULL);";
//        String sqlPayment = "Create TABLE Platnosc(id INT NOT NULL UNIQUE , status varchar(255) NOT NULL);";
//
//        getJdbcTemplate().update(sqlCar);
//        getJdbcTemplate().update(sqlRent);
//        getJdbcTemplate().update(sqlWorker);
//        getJdbcTemplate().update(sqlDepartment);
//        getJdbcTemplate().update(sqlClient);
//        getJdbcTemplate().update(sqlUser);
//          getJdbcTemplate().update(sqlPayment);
//
//    }

}
