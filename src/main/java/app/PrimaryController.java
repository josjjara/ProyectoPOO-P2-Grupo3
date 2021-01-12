package app;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PrimaryController {
    
    @FXML Button botonJuego;
    @FXML Button botonConfig;
    @FXML Button botonReporte;
    
    @FXML
    private void switchToReporte() throws IOException {
        App.setRoot("reporte");
    }
    @FXML
    private void switchToConfig() throws IOException{
        App.setRoot("configuracion");
    }   
    
    @FXML
    private void switchToJuego() throws IOException{
        App.setRoot("juego");
    }
}
