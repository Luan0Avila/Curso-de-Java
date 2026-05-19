package helloworldfx;
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class TextFieldTextAreaExample extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{
        
        TextField textField = new TextField();
        textField.setPromptText("Digite seu nome...");
        TextField textField2 = new TextField();
        textField2.setPromptText("Digite sua idade...");

        // limitar os caracteres
        textField2.textProperty().addListener((observable, olçdVlue, newValue) -> {
            if (newValue.length() > 3) {
                textField2.setText(olçdVlue);
            }
        });

        // textarea
        TextArea textArea = new TextArea();
        textArea.setPromptText("Escreva como foi o seu dia");
        textArea.setPrefRowCount(5);

        Label label = new Label("Texto do textArea");

        textArea.textProperty().addListener((observable, olçdVlue, newValue) -> {
            label.setText("Texto do textArea: " + newValue);
        });

        VBox vBox = new VBox();
        vBox.getChildren().addAll(textField, textField2, textArea, label);


        Scene scene = new Scene(vBox, 500, 500);

        // configuração do Stage
        primaryStage.setTitle("Exemplo GridPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}    
