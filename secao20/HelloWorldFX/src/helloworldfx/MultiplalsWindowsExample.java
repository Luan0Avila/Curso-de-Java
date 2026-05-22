package helloworldfx;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class MultiplalsWindowsExample extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{

        Button button = new Button("Abrir Janel Secundaria");

        button.setOnAction(event -> openSecondaryWindow());

        StackPane primaryLayout = new StackPane();

        primaryLayout.getChildren().add(button);
        
        Scene primaryScene = new Scene(primaryLayout, 300, 300);

        // configuração do Stage
        primaryStage.setTitle("Exemplo GridPane");
        primaryStage.setScene(primaryScene);
        primaryStage.show();
    }

    public void updateCheckBoxLabel(CheckBox cb1, CheckBox cb2, Label label) {

        String selected = "CheckBox selecionados: ";
        if (cb1.isSelected()) selected += cb1.getText() + " ";
        if (cb1.isSelected()) selected += cb2.getText();
        
        label.setText(selected);
    }

    public void openSecondaryWindow() {

        Stage secondaryStage = new Stage();

        Label label = new Label("Janela secundária");

        StackPane secondaryLayout = new StackPane();

        Scene secondaryScene =  new Scene(secondaryLayout, 400, 400);

        secondaryLayout.getChildren().add(label);
        secondaryStage.setTitle("Janela Secundária");
        secondaryStage.setScene(secondaryScene);
        secondaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}    


