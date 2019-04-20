package sample.animations;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.scene.effect.GaussianBlur;
import javafx.util.Duration;

public class ScheneTransform2 {
    private TranslateTransition transS;
    public ScheneTransform2(Node node) {


        transS = new TranslateTransition(Duration.millis(70), node);



        GaussianBlur blur = new GaussianBlur(0.0);
        node.setEffect(blur);
        Timeline timeline = new Timeline();
        KeyValue kv = new KeyValue(blur.radiusProperty(), 0.0);
        KeyFrame kf = new KeyFrame(Duration.millis(1000), kv);
        timeline.getKeyFrames().add(kf);
        timeline.play();

        transS.setAutoReverse(true);


    }
    public void playAnimSchene2(){

        transS.playFromStart();

    }
}
