package sample;

import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import sample.animations.ScheneTransform;
import sample.animations.ScheneTransform2;
import sample.animations.Shake3;
import sample.animations.Shake4;

import java.io.IOException;
import java.time.Duration;


public class HumansController {
    public Node HumansAnchoePane;
    public Node Pidor;

    public void ToPopovichClick(ActionEvent actionEvent) throws IOException {
        Parent blah = FXMLLoader.load(getClass().getResource("popovich/PopovichMain.fxml"));
        Scene scene = new Scene(blah);
        Stage appStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        appStage.setScene(scene);
        appStage.show();



    }
    public void Teaching(){
        ScheneTransform Anim =new ScheneTransform(HumansAnchoePane);
        Anim.playAnimSchene();
        Shake3 Pipitor = new Shake3(Pidor);
        Pipitor.playAnim3();
        HumansAnchoePane.setDisable(true);
    }

    public void Teaching2(){
        ScheneTransform2 Anim2 =new ScheneTransform2(HumansAnchoePane);
        Anim2.playAnimSchene2();
        Shake4 Pipitor2 = new Shake4(Pidor);
        Pipitor2.playAnim4();
        HumansAnchoePane.setDisable(false);
    }

}
