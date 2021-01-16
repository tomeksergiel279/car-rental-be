package pl.tomek.jdbccar.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.tomek.jdbccar.dao.RentalDao;
import pl.tomek.jdbccar.model.Rental;

import java.util.List;
import java.util.Map;

@RestController
public class RentalApi {

    private RentalDao rentalDao;

    @Autowired
    public RentalApi(RentalDao rentalDao) {
        this.rentalDao = rentalDao;
    }

    //wypisanie wszystkich wypozyczen
    @GetMapping("/rental/getRentals")
    public List<Map<String, Object>> GetRental(){
        return rentalDao.showAllRentals();
    }

    //dodanie wypozyczenia do bazy
    @PostMapping("/rental/addRental")
    public void addRental(@RequestBody Rental rental){
        rentalDao.saveRental(rental);
    }

    //wypisanie wypozyczenia o danym id
    @GetMapping("/rental/getRentalById")
    public List<Map<String, Object>> GetRentalById(long id){
        return rentalDao.showRentalById(id);
    }

    //usunięcie wypozyczenia o danym id
    @DeleteMapping("/rental/deleteRentalById")
    public void DeleteRentalById(long id){
        rentalDao.deleteRentalById(id);
    }



}
