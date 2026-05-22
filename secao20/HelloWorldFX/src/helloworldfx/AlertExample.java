package helloworldfx;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.*;
import javafx.stage.*;

public class AlertExample extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{

        Button buttonInfo = new Button("Alerta de info");

        buttonInfo.setOnAction(event -> showAlert(AlertType.INFORMATION, "Informação", "Alerta de info"));

        Button buttonError = new Button("Alerta de erro");

        buttonError.setOnAction(event -> showAlert(AlertType.ERROR, "Erro", "Alerta de erro"));

        Button buttonWarning = new Button("Alerta de aviso");

        buttonWarning.setOnAction(event -> showAlert(AlertType.WARNING, "Avsio", "Alerta de aviso"));

    Button buttonConf = new Button("Alerta de Confirmação");

        buttonConf.setOnAction(event -> showAlert(AlertType.CONFIRMATION, "Confirmação", "Alerta de Confirmação"));


        VBox vBox = new VBox(10);

        vBox.getChildren().addAll(buttonInfo, buttonError, buttonWarning, buttonConf);

        // configuração do Stage
        Scene scene = new Scene(vBox, 500, 500);

        primaryStage.setTitle("Exemplo GridPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showAlert(AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);

        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);

        alert.showAndWait();
    }


    public static void main(String[] args) {
        launch(args);
    }
}    


