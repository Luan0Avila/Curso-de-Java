package helloworldfx;
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class CSSStyleExample extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{
        
        Label label = new Label("Label estilizada");

        label.getStyleClass().add("label-custom");

        Button button = new Button("Botão estilizado");

        button.getStyleClass().add("button-custom");

        VBox vBox = new VBox(10);

        vBox.getChildren().addAll(label, button);

        Scene scene = new Scene(vBox, 500, 500);

        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

        // configuração do Stage
        primaryStage.setTitle("Exemplo GridPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void updateCheckBoxLabel(CheckBox cb1, CheckBox cb2, Label label) {

        String selected = "CheckBox selecionados: ";
        if (cb1.isSelected()) selected += cb1.getText() + " ";
        if (cb1.isSelected()) selected += cb2.getText();
        
        label.setText(selected);
    }


    public static void main(String[] args) {
        launch(args);
    }
}    


