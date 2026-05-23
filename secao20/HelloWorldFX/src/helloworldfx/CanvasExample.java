package helloworldfx;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.canvas.*;
import javafx.stage.*;


public class CanvasExample extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{

        Canvas canvas = new Canvas(400, 400);

        GraphicsContext gc = canvas.getGraphicsContext2D();

        // desenhar o canvas
        dawshapes(gc);


        VBox vBox = new VBox(10);

        vBox.getChildren().addAll(canvas);

        // configuração do Stage
        Scene scene = new Scene(vBox, 500, 500);

        primaryStage.setTitle("Exemplo GridPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void dawshapes(GraphicsContext gc) {

        gc.setStroke(Color.BLUE);
        gc.setLineWidth(2);

        gc.strokeLine(50, 150, 350, 50);

        gc.setFill(Color.LIGHTBLUE);
        gc.fillRect(100, 100, 250, 150);

        gc.setStroke(Color.RED);
        gc.strokeOval(150, 150, 100, 100);
    }


    public static void main(String[] args) {
        launch(args);
    }
}    


