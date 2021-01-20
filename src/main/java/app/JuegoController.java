package app;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import modelo.*;
import java.io.IOException;
import java.net.URL;
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
    
    
    private int nRows = 4;
    private int nColm = 4;
    private static final double ELEMENT_SIZE = 100;
    private static final double GAP = ELEMENT_SIZE/10;


    /*
    public static void mostrarCarta(){
        Tablero tab1 = new Tablero
        for (Carta c:cartas){
            GridPane gridTabler = new GridPane();
            ImageView img = new ImageView();
            try{
                input = new FileInputStream(App.pathImg + c.getRutaImagen());
                
                Image img = new Image
            }
        }
               

    public void initialize() throws FileNotFoundException {
            GridPane gpane = new GridPane(); 
            FileInputStream imageStream = new FileInputStream("images/loteriamx.jpg");
            Image image = new Image(imageStream); 
            gpane.getChildren().add(new ImageView(image));
            gpane.add(new ImageView(image), 0, 0);
    }*/
    @FXML
    private void initialize() throws FileNotFoundException{
        for (int i=0;i<16;i++){
            GridPane gp = new GridPane();
            int fila = i/4;
            int columna = i%4;

            Label lb = new Label("ejem");
            String workingDir = System.getProperty("user.dir");
            var url = workingDir + "\\src\\main\\resources\\images\\deck\\10.png";
            FileInputStream f;
            try {
                f = new FileInputStream(new File(url));
                Image img = new Image(f);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println("URL= "+url);
            //FileInputStream imageStream = new FileInputStream("images/loteriamx.jpg");*/           
            gp.getChildren().add(new ImageView(url));
            gridTablero.add(new ImageView(url), columna, fila);
            gp.getChildren().add(lb);
            gridTablero.add(gp,columna,fila); 
            lb.setOnMouseClicked(e->{
              Label lbx = new Label("X");
              gp.getChildren().add(lbx);
            });    
        }
    }

     
    }
