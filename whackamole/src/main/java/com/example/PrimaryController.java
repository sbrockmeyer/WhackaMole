package com.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class PrimaryController {

    private boolean isBopped = false;

    @FXML
    private ImageView image11;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void onBopped() throws FileNotFoundException{
        System.out.println("boop");
        InputStream imageStream = null;
        try{
            if(!isBopped){
                imageStream = new FileInputStream("whackamole\\src\\main\\resources\\com\\example\\300px-Crying_Cat_screaming.jpg");
            }else{
                imageStream = new FileInputStream("whackamole\\src\\main\\resources\\com\\example\\mt.png");
            }
        }catch (Exception e){

        }

        Image bop = new Image(imageStream);
        image11.setImage(bop);
        isBopped = !isBopped;
    }
}
