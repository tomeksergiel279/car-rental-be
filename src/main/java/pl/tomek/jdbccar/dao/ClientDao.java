package pl.tomek.jdbccar.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pl.tomek.jdbccar.model.Client;

import java.util.List;
import java.util.Map;

@Repository
public class ClientDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public ClientDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void saveClient(Client client) {

        String sql = "INSERT INTO Client VALUES(?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{
                client.getId(),
                client.getLogin(),
                client.getPassword(),
                client.getIdRental(),
                client.getPesel(),
                client.getPostalCode(),
                client.getAddress()
        });
    }

    public List<Map<String, Object>> showAllClients() {
        String sql = "SELECT * FROM Client";
        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> loginRequest(String l, String p) {
        String sql = "SELECT id, id_rental, pesel, postal_code, address FROM Client WHERE login = ? AND password = ?";
        return jdbcTemplate.queryForList(sql, new Object[]{
                l, p
        });
    }

    public List<Map<String, Object>> getUserOrder(int id){
        String sql = "SELECT id_rental FROM Client WHERE id = ?";
        return jdbcTemplate.queryForList(sql, new Object[]{
                id
        });
    }
}
