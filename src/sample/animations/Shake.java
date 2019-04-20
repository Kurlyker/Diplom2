package sample.animations;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.effect.Glow;
import javafx.scene.transform.Translate;
import javafx.util.Duration;

public class Shake {
    private TranslateTransition tt;
    public Shake(Node node) {


        tt = new TranslateTransition(Duration.millis(400), node);
        tt.setFromX(-350f);
        tt.setFromY(0f);
        tt.setByX(350f);
        tt.setByY(0f);
        tt.setCycleCount(1);
        tt.setAutoReverse(true);

    }
    public void playAnim(){
        tt.playFromStart();
    }


}
