package pl.tomek.jdbccar.api;

import org.atmosphere.config.service.Get;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.tomek.jdbccar.dao.ClientDao;
import pl.tomek.jdbccar.model.Client;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
public class ClientApi {

    private ClientDao clientDao;


    @Autowired
    public ClientApi(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    @GetMapping("/client/getClients")
    public List<Map<String, Object>> GetClients() {
        return clientDao.showAllClients();
    }


    @PostMapping("/client/addClient")
    public void addClient(@RequestBody Client client) {
        clientDao.saveClient(client);
    }


    @GetMapping("/client/getUserOrder")
    public List<Map<String, Object>> getUserOrder(int id) {
        return clientDao.getUserOrder(id);
    }


    @PostMapping("client/loginRequest")
    public List<Map<String, Object>> login(@RequestBody Client client){
        List<Map<String, Object>> returnedClient =  clientDao.loadClientByLoginAndPassword(client.getLogin(), client.getPassword());
        return returnedClient;
    }
}