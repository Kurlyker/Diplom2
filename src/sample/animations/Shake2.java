package sample.animations;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.GaussianBlur;
import javafx.util.Duration;

public class Shake2 {
    private TranslateTransition ttt;
    public Shake2(Node node) {


        ttt = new TranslateTransition(Duration.millis(400), node);
        ttt.setFromX(0f);
        ttt.setFromY(0f);

        ttt.setByX(-350f);
        ttt.setByY(0f);
        ttt.setCycleCount(1);
        ttt.setAutoReverse(true);

    }
    public void playAnim2(){
        ttt.playFromStart();
    }
}
