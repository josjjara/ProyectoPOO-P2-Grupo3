package app;

import java.io.IOException;
import javafx.fxml.FXML;

public class ReporteController {
    @FXML
    public void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}