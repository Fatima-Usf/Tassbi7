/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tassbi7;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author fatima
 */
public class Tassbi7 extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
     
        
        Parent root;
        root = FXMLLoader.load(getClass().getResource("FXML.fxml"));
        
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("Tassbi7");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setResizable(false);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
