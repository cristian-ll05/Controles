package controles.picker;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.time.LocalDate;

public class DateColorPickerApp extends Application {

    @Override
    public void start(@SuppressWarnings("exports") Stage primaryStage) {
        // Crear etiquetas
        Label dateLabel = new Label("Selecciona una fecha:");
        Label colorLabel = new Label("Selecciona un color:");
        
        // Crear DatePicker
        DatePicker datePicker = new DatePicker();
        
        // Crear ColorPicker
        ColorPicker colorPicker = new ColorPicker();
        
        // Crear botón
        Button submitButton = new Button("Confirmar selección");
        
        // Añadir acción al botón
        submitButton.setOnAction(e -> {
            LocalDate selectedDate = datePicker.getValue();
            Color selectedColor = colorPicker.getValue();
            System.out.println("Fecha seleccionada: " + selectedDate);
            System.out.println("Color seleccionado: " + selectedColor);
        });
        
        // Crear VBox y añadir todos los elementos
        VBox vbox = new VBox(10, dateLabel, datePicker, colorLabel, colorPicker, submitButton);
        
        // Crear escena
        Scene scene = new Scene(vbox, 300, 200);
        
        // Configurar escenario (ventana)
        primaryStage.setTitle("Date and Color Picker");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
