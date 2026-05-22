package helloworldfx;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.*;


public class ShapeDrawingExample extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{

        // retangulo
        Rectangle rectangle = new Rectangle(200, 100);

        rectangle.setFill(Color.CHOCOLATE);
        rectangle.setStroke(Color.AQUA);
        rectangle.setStrokeWidth(4);

        // circulo
        Circle circle = new Circle(50);

        circle.setFill(Color.DARKSALMON);
        circle.setStroke(Color.GOLD);
        circle.setStrokeWidth(20);

        
        Ellipse ellipse = new Ellipse(50, 100);

        ellipse.setFill(Color.RED);



        VBox vBox = new VBox(10);

        vBox.getChildren().addAll(rectangle, circle, ellipse);

        // configuração do Stage
        Scene scene = new Scene(vBox, 500, 500);

        primaryStage.setTitle("Exemplo GridPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    


    public static void main(String[] args) {
        launch(args);
    }
}    


