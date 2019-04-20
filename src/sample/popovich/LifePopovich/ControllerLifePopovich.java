package sample.popovich.LifePopovich;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.io.InterruptedIOException;

public class ControllerLifePopovich {


        public void ToHomePopovich(javafx.event.ActionEvent actionEvent) throws IOException {
            Parent blah = FXMLLoader.load(getClass().getResource("../PopovichMain.fxml"));
            Scene scene = new Scene(blah);
            Stage appStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            appStage.setScene(scene);
            appStage.show();
        }




}









