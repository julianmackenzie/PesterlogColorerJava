package com.jug;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.control.Button;
import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    private BorderPane menuBP;
    private VBox menuVB;
    private Text titleText;
    private VBox menuButtonVB;
    

    @Override
    public void start(Stage stage) throws IOException {

        

        menuBP = new BorderPane();


        titleText = new Text("Jug's Pesterlog Colorer");
        titleText.setFont(Font.font ("Dubai Light", 28));
        menuBP.setTop(titleText);
        menuBP.setAlignment(titleText, Pos.TOP_CENTER);


        Button menuStartButton = new Button();
        Button menuGuideButton = new Button();

        menuStartButton.setText("Start Formatting");
        menuGuideButton.setText("Formatting Guide");


        menuButtonVB = new VBox(menuStartButton, menuGuideButton);
        menuBP.setCenter(menuButtonVB);


        menuVB = new VBox(menuBP);
        
        
    
        stage.setTitle("Pesterlog Colorer");
        scene = new Scene(menuVB, 640, 480);
        stage.setScene(scene);
        stage.show();
    }



    public static void main(String[] args) {
        launch();
    }

}