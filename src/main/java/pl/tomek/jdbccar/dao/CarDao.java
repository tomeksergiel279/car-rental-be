package pl.tomek.jdbccar.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pl.tomek.jdbccar.model.Car;

import java.util.List;
import java.util.Map;


@Repository
public class CarDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public CarDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void saveCar(Car car){                                    //dodanie samochodu do bazy

        String sql = "INSERT INTO Car VALUES(?,?,?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{
                car.getId(),
                car.getImg(),
                car.getMark(),
                car.getModel(),
                car.getColor(),
                car.getProductionYear(),
                car.getFuelType(),
                car.getPricePerDay(),
                car.getGearBox(),
                car.getAirConditioning()
        });

    }

    public List<Map<String, Object>> showCarByMark(String mark){               //pokazuje auta wpisanej marki
        String sql = "SELECT * FROM Car WHERE mark LIKE ?";
        return jdbcTemplate.queryForList(sql, new Object[]{mark});
    }


    public List<Map<String, Object>> showAllCars(){                          //pokazuje wszystkie auta
        String sql = "SELECT * FROM Car";
        return jdbcTemplate.queryForList(sql);
    }

    //usuwa samochód po id
    public void deleteCarById(long id){

        String sql = "DELETE FROM Car WHERE id LIKE ?";
        Object[] car = new Object[]{id};
        jdbcTemplate.update(sql, car);
    }

}
