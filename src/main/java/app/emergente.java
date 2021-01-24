/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;


public class emergente {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

        @FXML
    public void switchToPrimary() throws IOException {
        App.setRoot("primary");
}
    
    @FXML
    void initialize() {

    }

    
}
