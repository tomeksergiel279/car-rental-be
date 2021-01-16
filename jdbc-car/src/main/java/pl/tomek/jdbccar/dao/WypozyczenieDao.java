package pl.tomek.jdbccar.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pl.tomek.jdbccar.model.Wypozyczenie;

import java.util.List;
import java.util.Map;

@Repository
public class WypozyczenieDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public WypozyczenieDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void saveWypozyczenie(Wypozyczenie wypozyczenie){                  //dodanie wypozyczenia do bazy

        String sql = "INSERT INTO Wypozyczenie VALUES(?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{
                wypozyczenie.getId(),
                wypozyczenie.getDataRozpoczecia(),
                wypozyczenie.getDataZakonczenia(),
                wypozyczenie.getKosztWypozyczenia()
        });
    }

    public List<Map<String, Object>> showAllRents(){      //pokazuje wszystkie wypozyczenia
        String sql = "SELECT * FROM Wypozyczenie";
        return jdbcTemplate.queryForList(sql);

    }






}
