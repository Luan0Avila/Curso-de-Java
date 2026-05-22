package helloworldfx;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class ImageViewExample extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{

        Image image = new Image("file:/mnt/jogos/Projetos/Curso-de-Java/secao20/HelloWorldFX/7b89fda2-4af3-4ae0-98bc-ad2b65854909.webp");

        ImageView imageView = new ImageView(image);

        imageView.setFitWidth(200);
        imageView.setFitHeight(300);
        imageView.setPreserveRatio(true);


        VBox vBox = new VBox(10);

        vBox.getChildren().addAll(imageView);

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


