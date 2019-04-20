package sample.animations;

import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.util.Duration;

public class Shake4 {
    private TranslateTransition ttt;
    public Shake4(Node node) {


        ttt = new TranslateTransition(Duration.millis(400), node);
        ttt.setFromX(-750f);
        ttt.setFromY(0f);

        ttt.setByX(750f);
        ttt.setByY(0f);
        ttt.setCycleCount(1);
        ttt.setAutoReverse(true);

    }
    public void playAnim4(){
        ttt.playFromStart();
    }
}
