package app;

import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class PrimaryController {
    
    @FXML Button botonJuego;
    @FXML Button botonConfig;
    @FXML Button botonReporte;
    @FXML ImageView imgFondo;
    
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
