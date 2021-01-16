package pl.tomek.jdbccar.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pl.tomek.jdbccar.model.Rental;

import java.util.List;
import java.util.Map;

@Repository
public class RentalDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public RentalDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;

    }




    public void saveRental(Rental rental){

        String sql = "INSERT INTO Rental VALUES(?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{
                rental.getId(),
                rental.getCarId(),
                rental.getPaymentId(),
                rental.getStartDate(),
                rental.getEndDate(),
                rental.getCost(),
                rental.getPickupLocation(),
                rental.getReturnLocation()
        });
    }

    //pokazuje wszystkie wypozyczenia
    public List<Map<String, Object>> showAllRentals(){
        String sql = "SELECT * FROM Rental";
        return jdbcTemplate.queryForList(sql);
    }

    //pokazuje wypozyczenie po id
    public List<Map<String, Object>> showRentalById(long id){
        String sql = "SELECT * FROM Rental WHERE id LIKE ?";
        return jdbcTemplate.queryForList(sql, new Object[]{id});
    }

    //usuwa wypożyczenie po id
    public void deleteRentalById(long id){

        String sql = "DELETE FROM Rental WHERE id LIKE ?";
        Object[] rental = new Object[]{id};
        jdbcTemplate.update(sql, rental);
    }


}
