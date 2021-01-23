package app;

import modelo.*;
import java.util.ArrayList;  

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;


public class ReporteController {
    public ArrayList<Juego> juegosAnteriores;
    @FXML
    VBox vBoxReporte;  //Vbox de los reportes
    
    //Metodo para el boton de Menú Principal
    @FXML
    public void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    
    public void leerReporte(){   
        try{
            ObjectInputStream obj = new ObjectInputStream(new FileInputStream("data/reporte.ser"));
            juegosAnteriores = (ArrayList<Juego>)obj.readObject();
            obj.close();
        }catch(IOException e){
            System.out.println("No se encontro archivo,generando vacio");
            try(FileWriter f= new FileWriter("data/reporte.ser")){
                
            }catch(IOException IOe){           
            }
        }catch(ClassNotFoundException eC ){
            System.out.println("No se encontro clase Juego");
        } 
    }
    
    public void generarReporte(Juego j){
        leerReporte();
        juegosAnteriores.add(j);
        try{
            ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("data/reporte.ser"));
            obj.writeObject(juegosAnteriores);
        }catch(Exception e){
            System.out.println("Error");
        }
    }
    
    public void initialize(){  
            juegosAnteriores = new ArrayList<>();
            vBoxReporte.getChildren().clear();
            leerReporte();
            int indice = 1;
            if(juegosAnteriores != null){
                for(Juego j: juegosAnteriores){
                vBoxReporte.getChildren().add(new Label(indice+")\t"+j.toString()));
                }
                
            }else{
                vBoxReporte.getChildren().add(new Label("No hay registro de juegos anteriores"));
            }
 
    }
}