package app;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

/**
 *
 * @author Jose
 */
public class JuegoController {
    
    @FXML
    private GridPane gridTablero;

    @FXML
    private Label nomCarta;

    @FXML
    private Label tiempoCarta;

    @FXML
    private Button botonLoteria;

    
  
    void initialize() {
        assert gridTablero != null : "fx:id=\"gridTablero\" was not injected: check your FXML file 'juego.fxml'.";
        assert nomCarta != null : "fx:id=\"nomCarta\" was not injected: check your FXML file 'juego.fxml'.";
        assert tiempoCarta != null : "fx:id=\"tiempoCarta\" was not injected: check your FXML file 'juego.fxml'.";
        assert botonLoteria != null : "fx:id=\"botonLoteria\" was not injected: check your FXML file 'juego.fxml'.";

    }
}

