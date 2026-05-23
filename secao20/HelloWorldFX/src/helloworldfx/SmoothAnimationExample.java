package helloworldfx;

import javafx.animation.Timeline;
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.*;
import javafx.util.Duration;
import javafx.animation.*;


public class SmoothAnimationExample extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{

        Circle circle = new Circle(50, Color.BLUE);

        circle.setTranslateX(-200);

        Timeline timeline = new Timeline();

        KeyFrame keyFrame = new KeyFrame(
            Duration.seconds(2),
            new KeyValue(circle.translateXProperty(), 200)
        );

        timeline.getKeyFrames().add(keyFrame);

        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.setAutoReverse(true);

        timeline.play();

        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(circle);

        // configuração do Stage
        Scene scene = new Scene(stackPane, 500, 500);

        primaryStage.setTitle("Exemplo GridPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}    


