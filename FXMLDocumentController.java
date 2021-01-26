/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mulch.calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author John R. McKahan II
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TextField lengthField;
    @FXML
    private TextField widthField;

    @FXML
    private Button calculateButton;
    @FXML
    private TextField cubicFeetField;
    @FXML
    private TextField bagField;
    @FXML
    private TextField cubicYardField;
    
    @FXML
    public void calculateMulch(){
    int sqft = 0;
    int cuft = 0;
    int cuyard = 0;
    int cuftbags = 0;
    sqft = (Integer.valueOf(lengthField.getText()))*(Integer.valueOf(widthField.getText()));
    System.out.println(sqft);
    cuft = sqft/4;
    cuyard = cuft/27;
    cuftbags = cuft/2;
    cubicFeetField.setText(cuft + " " + "Cubic Feet");
    cubicYardField.setText(cuyard + " " + "Cubic Yards");
    bagField.setText(cuftbags + " " + "2CuFt Bags");
    
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        
    }    
    
}
