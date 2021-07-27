package show.botones;

import front.IteradorMatematico;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

/**
 *
 * @author neury
 */
public class Calculadora extends IteradorMatematico {
    //Paneles ------------------------------------------------------------------
    private static final Pane PERSONAL = new Pane();
    private static final Pane FINANZA = new Pane();
    private static final Pane GENERAL = new Pane();
    private static final Pane ESTADISTICA = new Pane();
    private static final Pane CALCULADORA = new Pane();
    private static final Pane INNER_PERSONAL = new Pane();
    private static final Pane INNER_FINANZA = new Pane();
    private static final Pane INNER_GENERAL = new Pane();
    private static final Pane INNER_ESTADISTICA = new Pane();
    private static final Pane INNER_CALCULADORA = new Pane();
    //Botones ------------------------------------------------------------------
    private static Button demoObjectStatic = new Button();
    
    public StackPane calculadoraEvento() {
        PERSONAL.toBack();
        FINANZA.toBack();
        GENERAL.toBack();
        ESTADISTICA.toBack();
        CALCULADORA.toFront();
        CALCULADORA.setVisible(true);

        INNER_PERSONAL.toBack();
        INNER_FINANZA.toBack();
        INNER_GENERAL.toBack();
        INNER_ESTADISTICA.toBack();
        //CALCULADORA.setStyle("-fx-background-color: transparent;");
        GridPane generalGridPaneObject = new GridPane();
        generalGridPaneObject.setHgap(10);
        generalGridPaneObject.setVgap(10);
        generalGridPaneObject.setPadding(new Insets(150, 0, 0, 0));
        //generalGridPaneObject.setGridLinesVisible(true);
        ScrollPane generalScrollPaneObject = new ScrollPane();
        generalScrollPaneObject.setPrefSize(1000, 460);
        generalScrollPaneObject.setContent(generalGridPaneObject);
        generalScrollPaneObject.setHbarPolicy (ScrollPane.ScrollBarPolicy.AS_NEEDED);
        generalScrollPaneObject.setVbarPolicy (ScrollPane.ScrollBarPolicy.AS_NEEDED);
        generalScrollPaneObject.setId("n-general-scroll-pane");
        //Button demoObjectStatic = new Button("Calculadora");
        demoObjectStatic.setText("Calculadora");
        demoObjectStatic.setPrefSize(320, 40);
        demoObjectStatic.setId("n-botones-calculos");
        GridPane.setConstraints(demoObjectStatic, 0, 0, 1, 1, HPos.LEFT, VPos.BASELINE);
        demoObjectStatic.setOnAction(new EventHandler<ActionEvent>(){
            @Override public void handle(ActionEvent t) {
                INNER_CALCULADORA.toFront();
                INNER_CALCULADORA.setVisible(true);
                INNER_CALCULADORA.setStyle("-fx-background-color: white;");
                
                GridPane gridPane = new GridPane();
                gridPane.setHgap(10);
                gridPane.setVgap(10);
                gridPane.setPadding(new Insets(10, 10, 10, 10));
                gridPane.setGridLinesVisible(true);//xxxxxxxxxxxxxxxxxxxxxxxxxxxx
                TextField textField = new TextField();
                textField.setPromptText("Write here 5");
                GridPane.setRowIndex(textField, 0);
                GridPane.setColumnIndex(textField, 1);
                Label label = new Label();
                label.setText("Se esta calculando");
                GridPane.setConstraints(label, 2, 0); // column=2 row=0
                Button button = new Button("Calcular");
                GridPane.setConstraints(button, 1, 1); // column=1 row=0

                Label labelResultado = new Label();
                labelResultado.setText("Resultado");
                GridPane.setConstraints(labelResultado, 2, 1);  // column=2 row=0

                Button atrasObject = new Button("Atras");
                GridPane.setConstraints(atrasObject, 1, 2);

                button.setOnAction(new EventHandler<ActionEvent> () {
                    @Override public void handle(ActionEvent event) {
                        int tempFahr = (int)((Double.parseDouble(textField.getText()))
                                * 1.8 + 32);
                        labelResultado.setText(tempFahr + " Resultadoooooooooooooooooooo");
                    }
                });
                atrasObject.setOnAction(new EventHandler<ActionEvent> () {
                    @Override public void handle(ActionEvent event) {
                        INNER_CALCULADORA.toBack();
                        INNER_CALCULADORA.setVisible(false);
                    }
                });

                gridPane.getChildren().addAll(
                        textField,
                        label,
                        button,
                        labelResultado,
                        atrasObject
                );
                INNER_CALCULADORA.getChildren().add(
                        gridPane
                );
                centerObject.getChildren().add(
                    INNER_CALCULADORA
                );
            }
        });

        generalGridPaneObject.getChildren().addAll(
            demoObjectStatic
        );

        CALCULADORA.getChildren().addAll(
            generalGridPaneObject, generalScrollPaneObject
        );
        centerObject.getChildren().add(
            CALCULADORA
        );

        return centerObject;
    }
}
