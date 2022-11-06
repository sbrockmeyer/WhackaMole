package com.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SecondaryController {

    private boolean isBopped = false;

    @FXML
    private ImageView image11;
    @FXML
    private ImageView image12;
    @FXML
    private ImageView image13;
    @FXML
    private ImageView image21;
    @FXML
    private ImageView image22;
    @FXML
    private ImageView image23;
    @FXML
    private ImageView image31;
    @FXML
    private ImageView image32;
    @FXML
    private ImageView image33;

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    @FXML
    private void onBopped() throws FileNotFoundException{
        System.out.println("boop");
        InputStream imageStream = null;
        try{
            if(!isBopped){
                imageStream = new FileInputStream("src\\main\\resources\\com\\example\\Baguette_man_2.png");
            }else{
                imageStream = new FileInputStream("src\\main\\resources\\com\\example\\mt.png");
            }
        }catch (Exception e){

        }

        Image bop = new Image(imageStream);
        image11.setImage(bop);
        isBopped = !isBopped;
    }
}