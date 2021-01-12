package app;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;

public class ReporteController {
   
    @FXML
    VBox vBoxReporte;  //Vbox de los reportes
    
    //Metodo para el boton de Menú Principal
    @FXML
    public void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    
    public void initialize() throws IOException{
        
        int numReporte = 1; //Contador para el numero de linea
        //Se intenta leer el archivo txt con los reportes y se añade cada linea al vBox como una Label
        try(BufferedReader file = new BufferedReader(new FileReader("data\\reporte.txt"))){
            String linea = file.readLine();
            while(linea != null){
            String lineaReporte = numReporte + ")  "+ linea;
            Label labelReporte = new Label(lineaReporte); //Se crea la label para la linea
            vBoxReporte.getChildren().add(labelReporte);
            linea = file.readLine();
            }
        }catch(IOException e){//Si no se encuentra el archivo, se crea uno vacio
            System.out.println("No se encontro archivo o directorio...creando archivo");
            FileWriter nuevoReporte = new FileWriter("data\\reporte.txt");
        }
    }
    
}