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
    
    ArrayList<Integer> numeros = new ArrayList();
    
    private String path= "C:/Users/emily/Documents/NetBeansProjects/ProyectoPOO-Grupo3/src/main/resources/images/deck/";//10.png";
    private String pathbean = "C:/Users/emily/Documents/NetBeansProjects/ProyectoPOO-Grupo3/src/main/resources/images/frejol.png";

   
    @FXML
    private void initialize() {
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
            
            try {
                
                FileInputStream imageStream = new FileInputStream(path+aleatorio+".png");
                Image img = new Image(imageStream);
                ImageView imgv = new ImageView();
                imgv.setImage(img);
                sp.getChildren().add(imgv);          
                gridTablero.add(sp,columna,fila);
                imgv.setFitHeight(199);
                imgv.setFitWidth(100);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } 

               
            sp.setOnMouseClicked(e->{
                FileInputStream imageStream;
                try {
                    imageStream = new FileInputStream(pathbean);
                    Image imgbean = new Image(imageStream);
                    ImageView imgvbean = new ImageView();
                    imgvbean.setImage(imgbean);
                     //Label lbx = new Label(pathbean);
                    sp.getChildren().add(imgvbean);
                    imgvbean.setFitHeight(40);
                    imgvbean.setFitWidth(52);
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
            });    
        }
    }

     
    }
