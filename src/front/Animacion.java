package front;

import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.util.Duration;

public class Animacion {
    public static FadeTransition 
    borderPane(Node nodeObject) {
        FadeTransition fadeTransitionObject = new FadeTransition(Duration.millis(7000), nodeObject);
        fadeTransitionObject.setFromValue(0);
        fadeTransitionObject.setToValue(1.0);
        fadeTransitionObject.setCycleCount(1);
        fadeTransitionObject.play();
        return fadeTransitionObject;
    }
    public static ParallelTransition 
    entradaLateral(Node nodeObject) {
        FadeTransition fadeTransitionObject = new FadeTransition(Duration.millis(2000), nodeObject);
        fadeTransitionObject.setFromValue(0);
        fadeTransitionObject.setToValue(1.0);
        fadeTransitionObject.setCycleCount(1);
        
        ScaleTransition scaleTransitionObject = new ScaleTransition(Duration.millis(1000), nodeObject);
        scaleTransitionObject.setFromX(0f);
        scaleTransitionObject.setFromY(0f);
        scaleTransitionObject.setToX(1f);
        scaleTransitionObject.setToY(1f);
        scaleTransitionObject.setCycleCount(1);
 
        ParallelTransition parallelTransitionObject = new ParallelTransition(
           nodeObject, fadeTransitionObject, scaleTransitionObject
        );
        
        parallelTransitionObject.play();
        
        return parallelTransitionObject;
    }
    public static TranslateTransition
    abrirLeft(Node nodeObject) {
        TranslateTransition translateTransitionObject = new TranslateTransition(Duration.millis(1600), nodeObject);
        translateTransitionObject.setFromX(-300f);
        translateTransitionObject.setByX(300f);
        translateTransitionObject.setCycleCount(1);
        translateTransitionObject.play();
        return translateTransitionObject;
    }
    public static TranslateTransition 
    cancelarLeft(Node nodeObject) {
        TranslateTransition translateTransitionObject = new TranslateTransition(Duration.millis(1600), nodeObject);
        translateTransitionObject.setFromX(300f);
        translateTransitionObject.setByX(-300f);
        translateTransitionObject.setCycleCount(1);
        translateTransitionObject.play();
        return translateTransitionObject;
    }
    public static TranslateTransition
    abrirRight(Node nodeObject) {
        TranslateTransition translateTransitionObject = new TranslateTransition(Duration.millis(1600), nodeObject);
        translateTransitionObject.setFromX(300f);
        translateTransitionObject.setByX(-300f);
        translateTransitionObject.setCycleCount(1);
        translateTransitionObject.play();
        return translateTransitionObject;
    }
    public static TranslateTransition 
    cancelarRight(Node nodeObject) {
        TranslateTransition translateTransitionObject = new TranslateTransition(Duration.millis(1600), nodeObject);
        translateTransitionObject.setFromX(-300f);
        translateTransitionObject.setByX(300f);
        translateTransitionObject.setCycleCount(1);
        translateTransitionObject.play();
        return translateTransitionObject;
    }  
}
