package pl.tomek.jdbccar.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.tomek.jdbccar.dao.CarDao;
import pl.tomek.jdbccar.model.Car;

import java.util.List;
import java.util.Map;

@RestController
public class CarApi {


    private CarDao carDao;

    @Autowired
    public CarApi(CarDao carDao) {
        this.carDao = carDao;
    }

    //wypisanie wszystkich samochodów
    @GetMapping("/car/getCars")
    public List<Map<String, Object>> GetCars(){
        return carDao.showAllCars();
    }

    //wypisanie samochodu po marce
    @GetMapping("/car/showCarByMark")
    public List<Map<String, Object>> showCarByMark(String marka){
        return carDao.showCarByMark(marka);
    }

    //dodanie samochodu do bazy
    @PostMapping("/car/addCar")
    public void addSamochod(@RequestBody Car car){
        carDao.saveCar(car);
    }

    //usunięcie samochodu o danym id
    @DeleteMapping("/car/deleteCarById")
    public void DeleteCarById(long id){
        carDao.deleteCarById(id);
    }


}
