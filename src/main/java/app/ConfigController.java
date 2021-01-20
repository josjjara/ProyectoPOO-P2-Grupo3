package app;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.CheckBox;

public class ConfigController {
    //Todos los controladores requeridos
    @FXML 
    CheckBox checkVisible;
    @FXML 
    ComboBox<String> comboOpcion;
    @FXML 
    Button botonAceptar;    

    public void initialize() throws IOException{
        comboOpcion.getItems().addAll("1 Oponente","2 Oponentes");
        //Intenta buscar un archivo de config primero
        try(BufferedReader file = new BufferedReader(new FileReader("data\\configuracion.txt"))){
            //Si encuentra archivo, lee las opciones y las llena en los controladores
            String[] stringConfig = file.readLine().split(",");
            comboOpcion.setValue(stringConfig[1]);
            checkVisible.setSelected(Boolean.valueOf(stringConfig[0]));
        }catch(IOException e){
            //En este caso no se crea un archivo nuevo si no se encuentra inicialmente
            System.out.println("No se encontro archivo"); 
        }
        //Configuracion del boton de Aceptar
        botonAceptar.setOnMouseClicked(ev ->{
            //Crea o sobreescribe el archivo de configuracion cuando se hace click
            try(BufferedWriter configtxt = new BufferedWriter(new FileWriter("data\\configuracion.txt"))){
                //Obtiene todos los valores de los controladores y escribe en el archivo
                String linea = String.valueOf(checkVisible.isSelected())+","+comboOpcion.getValue();
                configtxt.write(linea); 
            }catch(IOException e){
                System.out.println("No se encontro directorio");
            }
            //Cambio al menu principal al aceptar las opciones
            //App.setRoot("primary");
        });
    }
    
}
