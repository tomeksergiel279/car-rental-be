package pl.tomek.jdbccar.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.tomek.jdbccar.dao.WypozyczenieDao;
import pl.tomek.jdbccar.model.Wypozyczenie;

import java.util.List;
import java.util.Map;

@RestController
public class WypozyczenieApi {

    private WypozyczenieDao wypozyczenieDao;

    @Autowired
    public WypozyczenieApi(WypozyczenieDao wypozyczenieDao) {
        this.wypozyczenieDao = wypozyczenieDao;
    }

    //wypisanie wszystkich wypozyczen
    @GetMapping("/rent/getRents")
    public List<Map<String, Object>> GetWypozyczenia(){
        return wypozyczenieDao.showAllRents();
    }

    @PostMapping("/rent/addRent")
    public void addWypozyczenie(@RequestBody Wypozyczenie wypozyczenie){
        wypozyczenieDao.saveWypozyczenie(wypozyczenie);

    }


}
