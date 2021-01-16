package pl.tomek.jdbccar.gui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import pl.tomek.jdbccar.dao.SamochodDao;
import pl.tomek.jdbccar.model.Samochod;

import java.util.List;
import java.util.Map;


@Route
public class SamochodGui extends VerticalLayout {

    private TextField textFieldId;
    private TextField textFieldMarka;
    private TextField textFieldModel;
    private TextField textFieldKolor;
    private TextField textFieldRocznik;
    private Button button;
    private Button button2;
    private Button button3;
    private SamochodDao samochodDao;

    private TextField textField;
    private TextArea textArea;
    private TextArea textAreaSamochody;



    @Autowired
    public SamochodGui(SamochodDao samochodDao) {
        this.textFieldId = new TextField("Id: ");
        this.textFieldMarka = new TextField("Marka: ");
        this.textFieldModel = new TextField("Model: ");
        this.textFieldKolor = new TextField("Kolor: ");
        this.textFieldRocznik = new TextField("Rocznik: ");
        this.button = new Button("Dodaj");

        this.textField = new TextField("Marka: ");
        this.textArea = new TextArea();
        this.textAreaSamochody = new TextArea();

        this.button2 = new Button("Pokaż");
        this.button3 = new Button("Pokaż wszystkie samochody");

        this.samochodDao = samochodDao;



        button.addClickListener(clickEvent -> {
           Samochod samochod = new Samochod(
                   Long.parseLong(textFieldId.getValue()),
                   textFieldMarka.getValue(),
                   textFieldModel.getValue(),
                   textFieldKolor.getValue(),
                   Long.parseLong(textFieldRocznik.getValue()));

           samochodDao.saveSamochod(samochod);
        });

        button2.addClickListener(x -> {
            List<Map<String, Object>> maps = samochodDao.showByMark(textField.getValue());
            textArea.setValue(maps.toString());
        });

        button3.addClickListener(x -> {
            List<Map<String, Object>> maps = samochodDao.showAllCars();
            textAreaSamochody.setValue(maps.toString());
        });


        add(textFieldId, textFieldMarka, textFieldModel, textFieldKolor, textFieldRocznik, button, textField, textArea, button2, textAreaSamochody, button3);



    }


}
