/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tassbi7;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author fatima
 */
public class FXMLController implements Initializable {

    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
 

    @FXML
    private JFXTextField t1;

    @FXML
    private JFXButton b1;

    @FXML
    private JFXButton b2;

    @FXML
    private JFXButton b3;

    @FXML
    private JFXButton b4;

    @FXML
    private JFXButton b5;
   
    int val=0;
    
    @FXML
    void calculate(ActionEvent event) {
        val++;
        t1.setText(" "+val);
     }
    
    @FXML
    void danb(ActionEvent event) {
        if(val>0){
        --val;
        t1.setText(" "+val);

    } 
    }
    

}

