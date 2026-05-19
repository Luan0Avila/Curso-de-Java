package helloworldfx;
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class CheckBoxRadioButtonExample extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{
        
        // Criando checkboxes
        CheckBox checkBox1 = new CheckBox("Opção 1");
        CheckBox checkBox2 = new CheckBox("Opção 2");

        Label checkBoxLabel = new Label("CheckBox selecionados: ");

        checkBox1.setOnAction(event -> updateCheckBoxLabel(checkBox1, checkBox2, checkBoxLabel));
        checkBox2.setOnAction(event -> updateCheckBoxLabel(checkBox1, checkBox2, checkBoxLabel));

        // Radiobutton
        RadioButton radioButton1 = new RadioButton("Opção A");
        RadioButton radioButton2 = new RadioButton("Opção B");

        ToggleGroup toggleGroup = new ToggleGroup();

        Label radioLabel = new Label("Radio button selecionado: ");

        toggleGroup.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                RadioButton selecteRadioButton = (RadioButton) toggleGroup.getSelectedToggle();

                radioLabel.setText("Radio button selecionado: " + selecteRadioButton.getText());
            }
        });

        radioButton1.setToggleGroup(toggleGroup);
        radioButton2.setToggleGroup(toggleGroup);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(checkBox1, checkBox2, checkBoxLabel, radioButton1, radioButton2, radioLabel);


        Scene scene = new Scene(vBox, 500, 500);

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
