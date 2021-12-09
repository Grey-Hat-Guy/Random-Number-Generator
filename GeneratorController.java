package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class GeneratorController {

    @FXML
    private Button clickbutton;

    @FXML
    private TextField getnum;

    @FXML
    void generatenumbers(ActionEvent event) {
        
    	long max = 9999999999L;
    	long min = 1000000000L;
    	
    	long res = (long) (Math.random()*(max-min+1) + min);
    	String string = String.valueOf(res);
    	getnum.setText(string);
    }

}