package pl.tomek.jdbccar.gui;


import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import pl.tomek.jdbccar.dao.WypozyczenieDao;
import pl.tomek.jdbccar.model.Wypozyczenie;


@Route
public class WypozyczenieGui extends VerticalLayout {

    private TextField textFieldId;
    private TextField textFieldDataR;
    private TextField textFieldDataZ;
    private TextField textFieldKoszt;
    private Button button;

    private WypozyczenieDao wypozyczenieDao;


    @Autowired
    public WypozyczenieGui(WypozyczenieDao wypozyczenieDao) {
        this.textFieldId = new TextField("Id: ");
        this.textFieldDataR = new TextField("Data Rozpoczecia: ");
        this.textFieldDataZ = new TextField("Data Zakonczenia: ");
        this.textFieldKoszt = new TextField("Koszt: ");
        this.button = new Button("Dodaj");

        this.wypozyczenieDao = wypozyczenieDao;

        button.addClickListener(clickEvent -> {
            Wypozyczenie wypozyczenie = new Wypozyczenie(
                    Long.parseLong(textFieldId.getValue()),
                    textFieldDataR.getValue(),
                    textFieldDataZ.getValue(),
                    Long.parseLong(textFieldKoszt.getValue()));

                    wypozyczenieDao.saveWypozyczenie(wypozyczenie);
        });

        add(textFieldId, textFieldDataR, textFieldDataZ, textFieldKoszt, button);
    }
}
