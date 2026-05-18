package helloworldfx;
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class GridPaneExample extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{

        // criar alguns botões vbox
        Button btn1 = new Button("Botão1");
        Button btn2 = new Button("Botão2");
        Button btn3 = new Button("Botão3");
        Button btn4 = new Button("Botão4");
        Button btn5 = new Button("Botão5");

        // criar o gridpane
        GridPane gridPane = new GridPane();

        gridPane.add(btn1, 2, 3);
        gridPane.add(btn2, 0, 0);
        gridPane.add(btn3, 1, 1);
        gridPane.add(btn4, 2, 1);
        gridPane.add(btn5, 2, 2);

        gridPane.setHgap(10);
        gridPane.setVgap(10);
        // Criando uma cena com o layout
        Scene scene = new Scene(gridPane, 500, 500);

        // configuração do Stage
        primaryStage.setTitle("Exemplo GridPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}    
