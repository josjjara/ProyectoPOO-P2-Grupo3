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
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
/**
 *
 * @author Jose
 */
public class JuegoController {
    Carta cartaActual;
    Tablero tableroJuego;
    @FXML
    private GridPane gridTablero;

    @FXML
    private Label nomCarta;

    @FXML
    private Text tiempoCarta;

    @FXML
    private Button botonLoteria;
    @FXML
    private ImageView imvCartaActual;
    
    
    public class CartaEnJuego implements Runnable{
        private ArrayList<Carta> mazoCartas;
        private int count = 0;

        private void incrementCount() {
            count++;
            tiempoCarta.setText(Integer.toString(count));
        }
        @Override
        public void run(){
            Tablero tableroTemp = new Tablero();
            tableroTemp.obtenerMazo();tableroTemp.barajarMazo();
            mazoCartas = tableroTemp.getMazo();
            
            ArrayList<Integer> numerosA = new ArrayList();
            while(true){
                Random r = new Random(); 
                int aleatorio = r.nextInt(54);
                while (numerosA.contains(aleatorio)){
                    aleatorio = r.nextInt(54);
                 }
                count = 0;
                tiempoCarta.setText(Integer.toString(count));
                cartaActual = mazoCartas.get(aleatorio);
              
                Platform.runLater(()->{
                   try{
                       imvCartaActual.setImage(new Image(cartaActual.getRuta()));
                   }catch(Exception e){
                      System.out.println(cartaActual.getRuta());
                      System.out.println("No encontrado");
                   } 
                });

                for(int i=0;i<3;i++){
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e){

                    }
                    Platform.runLater(()->{
                            incrementCount();          
                     });                
                }
                numerosA.add(aleatorio);
           }
        }
    } 
    public class ErrorMarcar implements Runnable{
        StackPane sp;
        
        public ErrorMarcar(StackPane sp){
            this.sp = sp;
        }
        @Override
        public void run(){
            ImageView cross = new ImageView(new Image("images/redCross.png"));
            cross.setFitHeight(75);
            cross.setFitWidth(75);
            Platform.runLater(()->{
                sp.getChildren().add(cross);
                });
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){

            }
            Platform.runLater(()->{
                sp.getChildren().remove(cross);
            });
            
        }
        
    }
    @FXML
    private void initialize(){
        Thread cambiarCarta = new Thread(new CartaEnJuego());
        cambiarCarta.setDaemon(true);
        cambiarCarta.start();
        
        tableroJuego= new Tablero();
        tableroJuego.obtenerMazo(); tableroJuego.barajarMazo();
        cartaActual = tableroJuego.getMazo().get(1);
        imvCartaActual.setImage(new Image(cartaActual.getRuta()));
        
        
        ArrayList<Integer> numeros = new ArrayList();
        for (int i=0;i<16;i++){
            int fila = i/4;
            int columna = i%4;
            tableroJuego.getTablero().add(tableroJuego.getMazo().get(i));
            Carta nuevaCarta =  tableroJuego.getTablero().get(i);
            nuevaCarta.setIndice(i);
            StackPane sp = new StackPane();
            ImageView imgv = new ImageView(new Image(nuevaCarta.getRuta()));
            sp.getChildren().add(imgv);          
            gridTablero.add(sp,columna,fila);
            imgv.setFitHeight(150);
            imgv.setFitWidth(100);
            imgv.setId(nuevaCarta.getNombre());
            
            sp.setOnMouseClicked(e->{
                ImageView imgvbean = new ImageView(new Image("images/frejol.png"));

                     //Label lbx = new Label(pathbean);
                    if(sp.getChildren().get(0).getId().equals(cartaActual.getNombre())){
                        sp.getChildren().add(imgvbean);
                        imgvbean.setFitHeight(40);
                        imgvbean.setFitWidth(52);
                        nuevaCarta.marcarCarta();
                    }else{
                        Thread error = new Thread (new ErrorMarcar(sp));
                        error.setDaemon(true);
                        error.start();          
                    }         
                }); 
            
            botonLoteria.setOnMouseClicked(e->{
                
            gridTablero.getChildren().toArray();
            });
            
        }
    }

     
    }
