package helloworldfx;
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class KeyboardMouseEventsExample extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{
        
        Label label = new Label("Interaja com o seu teclado");

        StackPane root = new StackPane();

        root.getChildren().add(label);

        // capturar eventos de teclado
        root.setOnKeyPressed(event -> {
            String key = event.getCode().toString();

            label.setText("Tecla pressionada " + key);
        });

        // evento de mouse
        root.setOnMouseClicked(event -> {
            double x = event.getSceneX();
            double y = event.getSceneY();

            label. setText("Mouse clicado em x: " + x + " y: " + y);
        });


        Scene scene = new Scene(root, 500, 500);

        // habilitar os eventos de tecla
        scene.setOnKeyPressed(root.getOnKeyPressed());  

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


