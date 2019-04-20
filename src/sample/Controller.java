package sample;

import javafx.animation.ScaleTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.animations.ScheneTransform;
import sample.animations.Shake;

import java.io.IOException;
import java.time.Duration;
import java.util.TimerTask;
import java.util.concurrent.Executors;


import static java.time.Duration.ofMillis;


public class Controller {
    public Node ohh;




    public void Click(ActionEvent actionEvent) throws IOException, InterruptedException {

        Parent blah = FXMLLoader.load(getClass().getResource("Humans.fxml"));
        Scene scene = new Scene(blah);
        Stage appStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        appStage.setScene(scene);
        appStage.show();


    }
}
