package helloworldfx;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class VboxHboxExample extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception{

        // criar alguns botões vbox
        Button btn1 = new Button("Botão1");
        Button btn2 = new Button("Botão2");
        Button btn3 = new Button("Botão3");

        VBox vBox = new VBox(15);
        vBox.getChildren().addAll(btn1,btn2,btn3);

        VBox root = new VBox(20);
        
        // criar alguns botões hbox
        Button btn4 = new Button("Botão4");
        Button btn5 = new Button("Botão5");
        Button btn6 = new Button("Botão6");
        
        HBox hBox = new HBox(25);
        hBox.getChildren().addAll(btn4,btn5,btn6);

        root.getChildren().addAll(vBox, hBox);

        // Criando uma cena com o layout
        Scene scene = new Scene(root, 500, 500);

        // configuração do Stage
        primaryStage.setTitle("Exemplo Stage e Scene");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}    

