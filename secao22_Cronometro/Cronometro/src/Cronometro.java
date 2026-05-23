import javafx.animation.*;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.input.*;
import javafx.geometry.Insets;


public class Cronometro extends Application{

    private Label timeLabel = new Label("00:00:00");
    private int secondElapsed = 0;
    private Timeline timeline;

    
    
    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Cronômetro");

        // Layout principal
        VBox root = new VBox();
        root.setPadding(new Insets(20));
        root.setSpacing(10);

        // Display do tempo
        timeLabel.setId("timeLabel");
        root.getChildren().add(timeLabel);
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


