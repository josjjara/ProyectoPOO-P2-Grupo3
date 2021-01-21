package app;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import modelo.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

/**
 *
 * @author Jose
 */
public class JuegoController {

    private static FileInputStream input;
    
    @FXML
    private GridPane gridTablero;

    @FXML
    private Label nomCarta;

    @FXML
    private Label tiempoCarta;

    @FXML
    private Button botonLoteria;
    @FXML
    private ImageView imvCartaActual;
    
    
    public class CartaEnJuego extends Thread{
        Mazo mazoCartas;
        Carta cartaActual;
        
        @Override
        public void run() {
            mazoCartas = new Mazo();
            mazoCartas.obtenerCarta();
            mazoCartas.barajar();
            setDaemon(true);
            ArrayList<Integer> numerosA = new ArrayList();
            while(true){
                Random r = new Random();
                int aleatorio = r.nextInt(54);
                while (numerosA.contains(aleatorio)){
                    aleatorio = r.nextInt(54);
                    }
                numerosA.add(aleatorio);
                cartaActual = mazoCartas.getMazo().get(aleatorio);
                imvCartaActual.setImage(new Image("images/deck/"+cartaActual.getNumero()+".png"));
                for(int i=0;i<4;i++){
                    tiempoCarta.setText(String.valueOf(i));
                    try{
                        sleep(1000);
                    }catch(InterruptedException e){
                        
                    }
                }
            
           }
        }
    }
    @FXML
    private void initialize(){
        CartaEnJuego cartaJuego = new CartaEnJuego();
        cartaJuego.start();
        ArrayList<Integer> numeros = new ArrayList();
        for (int i=0;i<16;i++){
            int fila = i/4;
            int columna = i%4;
            
            Random r = new Random(); 
            int aleatorio = r.nextInt(54)+1;
            while (numeros.contains(aleatorio)){
              aleatorio = r.nextInt(54)+1;
                }
            numeros.add(aleatorio);

            StackPane sp = new StackPane();
            ImageView imgv = new ImageView(new Image("images/deck/"+aleatorio+".png"));
            sp.getChildren().add(imgv);          
            gridTablero.add(sp,columna,fila);
            imgv.setFitHeight(150);
            imgv.setFitWidth(100);

            sp.setOnMouseClicked(e->{

            ImageView imgvbean = new ImageView(new Image("images/frejol.png"));

                     //Label lbx = new Label(pathbean);
                    sp.getChildren().add(imgvbean);
                    imgvbean.setFitHeight(40);
                    imgvbean.setFitWidth(52);
            });    
        }
    }

     
    }
