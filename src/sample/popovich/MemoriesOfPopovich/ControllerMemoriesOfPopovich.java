package sample.popovich.MemoriesOfPopovich;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerMemoriesOfPopovich {
    public void ToHomePopovich(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent blah = FXMLLoader.load(getClass().getResource("../PopovichMain.fxml"));
        Scene scene = new Scene(blah);
        Stage appStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        appStage.setScene(scene);
        appStage.show();
    }
}
