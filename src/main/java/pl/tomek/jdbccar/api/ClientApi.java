package pl.tomek.jdbccar.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.tomek.jdbccar.dao.ClientDao;
import pl.tomek.jdbccar.model.Client;

import java.util.List;
import java.util.Map;

@RestController
public class ClientApi {

    private ClientDao clientDao;


    @Autowired
    public ClientApi(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    @GetMapping("/client/getClients")
    public List<Map<String, Object>> GetClients(){
        return clientDao.showAllClients();
    }


    @PostMapping("/client/addClient")
    public void addSamoschod(@RequestBody Client client){
        clientDao.saveClient(client);
    }

    @GetMapping("/client/loginRequest")
    public List<Map<String, Object>> loginRequest(String l, String p){
        return clientDao.loginRequest(l, p);
    }

    @GetMapping("/client/getUserOrder")
    public List<Map<String, Object>> getUserOrder(int id){
        return clientDao.getUserOrder(id);
    }


}
