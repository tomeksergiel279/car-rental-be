package pl.tomek.jdbccar.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pl.tomek.jdbccar.model.Samochod;

import java.util.List;
import java.util.Map;


@Repository
public class SamochodDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public SamochodDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void saveSamochod(Samochod samochod){                                    //dodanie samochodu do bazy

        String sql = "INSERT INTO Samochod VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{
                samochod.getId(),
                samochod.getMarka(),
                samochod.getModel(),
                samochod.getKolor(),
                samochod.getRocznik()
        });

    }

    public List<Map<String, Object>> showByMark(String marka){               //pokazuje auta wpisanej marki
        String sql = "SELECT * FROM Samochod WHERE marka LIKE ?";
        return jdbcTemplate.queryForList(sql, new Object[]{marka});
    }


    public List<Map<String, Object>> showAllCars(){                          //pokazuje wszystkie auta
        String sql = "SELECT * FROM Samochod";
        return jdbcTemplate.queryForList(sql);
    }

}
