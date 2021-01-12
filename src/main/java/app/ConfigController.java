package app;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.CheckBox;
public class ConfigController {
    
    @FXML CheckBox checkVisible;
    @FXML ComboBox<String> comboOpcion;
    @FXML Button botonReporte;
    
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    public void initialize() throws IOException{
        comboOpcion.getItems().addAll("1 Oponente","2 Oponentes");
        botonReporte.setOnMouseClicked(ev ->{
            
            App.setRoot("primary");
        });
    }
}
