package pl.tomek.jdbccar.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.tomek.jdbccar.dao.SamochodDao;
import pl.tomek.jdbccar.model.Samochod;

import java.util.List;
import java.util.Map;

@RestController
public class SamochodApi {


    private SamochodDao samochodDao;

    @Autowired
    public SamochodApi(SamochodDao samochodDao) {
        this.samochodDao = samochodDao;
    }

    //wypisanie wszystkich samochodów
    @GetMapping("/car/getCars")
    public List<Map<String, Object>> GetSamochody(){
        return samochodDao.showAllCars();
    }

    //wypisanie samochodu po marce
    @GetMapping("/car/showByMark")
    public List<Map<String, Object>> showByMark(String marka){
        return samochodDao.showByMark(marka);
    }

    //dodanie samochodu do bazy
    @PostMapping("/car/addCar")
    public void addSamochod(@RequestBody Samochod samochod){
      samochodDao.saveSamochod(samochod);
    }


}
