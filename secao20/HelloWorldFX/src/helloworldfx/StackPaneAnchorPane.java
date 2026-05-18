package helloworldfx;
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class StackPaneAnchorPane extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{

        // criar alguns botões vbox
        Button btn1 = new Button("Botão1");
        Button btn2 = new Button("Botão2");
        Button btn3 = new Button("Botão3");


        // criar o stackpane
        StackPane stackPane = new StackPane();

        stackPane.getChildren().addAll(btn1, btn2);

        Scene stackScene = new Scene(stackPane, 400, 400);
        
        // criar o anhorpane
        AnchorPane anchorPane = new AnchorPane();

        AnchorPane.setTopAnchor(btn3, 10.0);
        AnchorPane.setRightAnchor(btn3, 10.0);

        anchorPane.getChildren().add(btn3);

        Scene anchorScene = new Scene(anchorPane, 400, 400);






        // configuração do Stage
        primaryStage.setTitle("Exemplo StacjPane e AnchorPane");
        primaryStage.setScene(stackScene);
        primaryStage.show();
        
        // mudar a cena apos 2sec
        new Thread(() -> {
            try {
                Thread.sleep(2000);
                
                Platform.runLater(() -> primaryStage.setScene(anchorScene));
            } catch (Exception e) {
                
            }
        }).start();
        
    }
        public static void main(String[] args) {
            launch(args);
        }
}    
