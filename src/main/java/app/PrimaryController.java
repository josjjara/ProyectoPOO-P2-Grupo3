package app;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PrimaryController {
    
    @FXML Button botonJuego;
    @FXML Button botonConfig;
    @FXML Button botonReporte;
    
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    @FXML
    private void switchToConfig() throws IOException{
        App.setRoot("configuracion");
    }   
}
