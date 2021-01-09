package app;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

public class ConfigController {
    
    @FXML ComboBox opcionVisible;
    @FXML ComboBox cantidadOpcion;
    @FXML Button botonReporte;
    
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    


    
    
}
