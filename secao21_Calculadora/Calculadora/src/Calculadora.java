import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.input.*;
import javafx.geometry.Insets;


public class Calculadora extends Application{

    private Label diplay = new Label("");
    private String currentInput = "";
    private String operator = "";
    private double previousValue = 0;
    
    
    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Calculadora simples");

        // Layout principal
        VBox root = new VBox();
        root.setPadding(new Insets(20));
        root.setSpacing(10);

        // Configurar a cena
        Scene scene = new Scene(root, 300, 400);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}    


