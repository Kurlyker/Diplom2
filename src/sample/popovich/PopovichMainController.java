package sample.popovich;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.animations.Shake;
import sample.animations.Shake2;


import java.io.IOException;
import java.io.InterruptedIOException;


public class PopovichMainController {

    @FXML
    private Node uuu;

    int i=0;
    public void RotKlick(ActionEvent actionEvent) {
    if (i==0) {

        Shake Anim = new Shake(uuu);
        Anim.playAnim();
        i=i+1;
    }
    else { ;
        Shake2 Anim = new Shake2(uuu);
        Anim.playAnim2();
        i=i-1;
    }
    }
    public void ToLifePopovich(ActionEvent actionEvent) throws IOException, InterruptedException {
        Parent blah = FXMLLoader.load(getClass().getResource("LifePopovich/LifePopovich.fxml"));
        Scene scene = new Scene(blah);
        Stage appStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        appStage.setScene(scene);
        appStage.show();

    }
    public void ToHome(ActionEvent actionEvent) throws IOException, InterruptedIOException {
        Parent blah = FXMLLoader.load(getClass().getResource("../Humans.fxml"));
        Scene scene = new Scene(blah);
        Stage appStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        appStage.setScene(scene);
        appStage.show();
    }
    public void ToMemoriesOfPopovich(ActionEvent actionEvent) throws  IOException, InterruptedIOException{
       // Parent blah = FXMLLoader.load(getClass().getResource("MemoriesOfPopovich/MemoriesOfPopovich.fxml"));
       // Scene scene = new Scene(blah);
       // Stage appStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
      //  appStage.setScene(scene);
     //   appStage.show();
    }

}
