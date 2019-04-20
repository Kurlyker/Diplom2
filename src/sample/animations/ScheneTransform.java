package sample.animations;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.transform.Translate;
import javafx.util.Duration;

import java.util.zip.CheckedInputStream;

public class ScheneTransform {
    private TranslateTransition transS;
    public ScheneTransform(Node node) {


        transS = new TranslateTransition(Duration.millis(70), node);



        GaussianBlur blur = new GaussianBlur(0.0);
        node.setEffect(blur);
        Timeline timeline = new Timeline();
        KeyValue kv = new KeyValue(blur.radiusProperty(), 10.0);
        KeyFrame kf = new KeyFrame(Duration.millis(500), kv);
        timeline.getKeyFrames().add(kf);
        timeline.play();

        transS.setAutoReverse(true);


    }
    public void playAnimSchene(){

        transS.playFromStart();

    }
}
