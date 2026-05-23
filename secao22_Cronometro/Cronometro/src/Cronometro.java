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

        // Layout dos botões
        HBox hBox = new HBox();
        hBox.setSpacing(10);

        Button startButton = new Button("Inciar");
        startButton.setMinSize(100, 50);
        startButton.setId("startButton");

        Button pauseButton = new Button("Pausar");
        pauseButton.setMinSize(100, 50);
        pauseButton.setId("pauseButton");

        Button resetButton = new Button("Reiniciar");
        resetButton.setMinSize(100, 50);
        resetButton.setId("resetButton");

        hBox.getChildren().addAll(startButton, pauseButton, resetButton);

        root.getChildren().addAll(hBox);


        // Configurar a cena
        Scene scene = new Scene(root, 400, 200);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}    


