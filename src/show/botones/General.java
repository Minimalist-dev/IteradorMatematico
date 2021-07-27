package show.botones;

import front.Expresion;
import front.IteradorMatematico;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Side;
import javafx.geometry.VPos;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javax.swing.event.ChangeListener;

public class General extends IteradorMatematico {
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
    // Botones -----------------------------------------------------------------
    public static Button celsiusFahrenheitObjectStatic = new Button();
    private static Button fahrenheitCelsiusObjectStatic = new Button();
    private static Button fahrenheitKelvinObjectStatic = new Button("Fahrenheit a Kelvin");
    private static Button kelvinFahrenheitObjectStatic = new Button("Kelvin a Fahrenheit");
    private static Button fahrenheitRankineObjectStatic = new Button("Fahrenheit a Rankine");
    private static Button rankineFahrenheitObjectStatic = new Button("Rankine a Fahrenheit");
    private static Button fahrenheitReaumurObjectStatic = new Button("Fahrenheit a Réaumur");
    private static Button reaumurFahrenheitObjectStatic = new Button("Réaumur a Fahrenheit");
    //Contenido de Paneles Internos --------------------------------------------
    private static final Label label1ObjectStatic = new Label();
    private static final Label label2ObjectStatic = new Label();
    private static final Label label3ObjectStatic = new Label();
    private static final Label label4ObjectStatic = new Label();
    private static final Label label5ObjectStatic = new Label();
    private static final Label label6ObjectStatic = new Label();
    private static final Label label7ObjectStatic = new Label();
    private static final Label label8ObjectStatic = new Label();
    private static final Label label9ObjectStatic = new Label();
    public static final TextField textField1ObjectStatic = new TextField();
    private static final TextField textField2ObjectStatic = new TextField();
    private static final TextField textField3ObjectStatic = new TextField();
    private static final TextField textField4ObjectStatic = new TextField();
    private static final TextField textField5ObjectStatic = new TextField();
    private static final TextField textField6ObjectStatic = new TextField();
    private static final TextField textField7ObjectStatic = new TextField();
    private static final TextField textField8ObjectStatic = new TextField();
    private static final TextField textField9ObjectStatic = new TextField();
    public static final Button calcularObjectStatic = new Button();
    public static Text  datosDeCalculoObjectStatic = new Text();
    private static final Text usoObjectStatic = new Text();
    private static final Button atrasObjectStatic = new Button("< Atras");
    //PieChart --------------------------------------------------------------------------------------------
    private static final PieChart pieChartObjectStatic = new PieChart(FXCollections.observableArrayList());
    private static final PieChart.Data congelacionObjectStatic = new PieChart.Data(null, 0);
    private static final PieChart.Data ebullicionObjectStatic = new PieChart.Data(null, 0);
    
    public StackPane 
    generalEvento() { 
        PERSONAL.toBack();
        FINANZA.toBack();
        GENERAL.toFront();
        GENERAL.setVisible(true);
        ESTADISTICA.toBack();
        CALCULADORA.toBack();

        INNER_PERSONAL.toBack();
        INNER_FINANZA.toBack();
        INNER_ESTADISTICA.toBack();
        INNER_CALCULADORA.toBack();
//        GENERAL.setStyle("-fx-background-color: transparent;");
        INNER_GENERAL.setStyle("-fx-effect: innershadow(three-pass-box, rgba(0, 0, 0, 0.7), 16, 0.0, 8, 8);");
        INNER_GENERAL.setId("n-inner-pane");
        GridPane generalGridPaneObject = new GridPane();
        generalGridPaneObject.setHgap(10);
        generalGridPaneObject.setVgap(10);
        generalGridPaneObject.setPadding(new Insets(50, 0, 0, 0));
        //gridPaneObject.setGridLinesVisible(true);
        ScrollPane generalScrollPaneObject = new ScrollPane();
        generalScrollPaneObject.setPrefSize(1000, 460);
        generalScrollPaneObject.setContent(generalGridPaneObject);
        generalScrollPaneObject.setHbarPolicy (ScrollBarPolicy.AS_NEEDED);
        generalScrollPaneObject.setVbarPolicy (ScrollBarPolicy.AS_NEEDED);
//        generalScrollPaneObject.setId("n-general-scroll-pane");
        //Button celsiusFahrenheitObject = new Button("Celsius a Fahrenheit");
        celsiusFahrenheitObjectStatic.setText("Celsius a Fahrenheit");
        celsiusFahrenheitObjectStatic.setPrefSize(980, 40);
        celsiusFahrenheitObjectStatic.setId("n-botones-calculos");
        GridPane.setConstraints(celsiusFahrenheitObjectStatic, 0, 0, 1, 1, HPos.CENTER, VPos.TOP);
        celsiusFahrenheitObjectStatic.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent eventObject) {
                INNER_GENERAL.toFront();
                INNER_GENERAL.setVisible(true);

                GridPane gridPaneObject = new GridPane();
                gridPaneObject.setHgap(10);
                gridPaneObject.setVgap(10);
                gridPaneObject.setPadding(new Insets(50, 0, 0, 30));
                gridPaneObject.setStyle("-fx-margin: 20px; -fx-padding: 20px;");
                //gridPaneObject.setGridLinesVisible(true);
                //Label label1ObjectStatic = new Label();
                label1ObjectStatic.setText("Celsius");
                label1ObjectStatic.setId("n-label-center");
                GridPane.setConstraints(label1ObjectStatic, 0, 1);
                //TextField textField1ObjectStatic = new TextField();
                textField1ObjectStatic.setPromptText("Ingresar los Celsius");
                textField1ObjectStatic.setId("n-field-center");
                GridPane.setConstraints(textField1ObjectStatic, 0, 2, 1, 1);
                //Button calcularObjectStatic = new Button("Convertir");
                calcularObjectStatic.setText("Convertir");
                calcularObjectStatic.setId("n-carcular-center");
                GridPane.setConstraints(calcularObjectStatic, 1, 2); // column=1 row=0
                calcularObjectStatic.setOnAction(new EventHandler<ActionEvent> () {
                    @Override public void handle(ActionEvent eventObject) {
                        pieChartObjectStatic.getData().clear();
                        double fahrenheit;
                        if(Expresion.numeros(textField1ObjectStatic.getText())) {
                            if(textField1ObjectStatic.getText().equals("")) {
                                usoObjectStatic.setText("Tienes que ingresar una cantidad numerica en Celsius");
                            } else {
                                usoObjectStatic.setText("Uso\n"
                                    + "Se utiliza por la población para usos no científicos \ny en determinadas industrias muy "
                                    + "rígidas, como la del \npetróleo. Además, se utiliza esta escala en los \ninformes "
                                    + "meteorológicos y en gastronomía. "
                                );
                            }

                            fahrenheit = (double)((Double.parseDouble(textField1ObjectStatic.getText())) * 1.8 + 32);

                            if(fahrenheit >= 213) {
                                PieChart.Data ebullicionObject = new PieChart.Data("Has superado el limite de 212 de ebullicion °F agua totalmente", 212);
                                pieChartObjectStatic.getData().add(ebullicionObject);
                            } else if(fahrenheit == 32) {
                                double ebullicion = 212 - fahrenheit;
                                PieChart.Data pieChartObject = new PieChart.Data("Estas en congelacion °F " + fahrenheit, fahrenheit);
                                pieChartObjectStatic.getData().add(pieChartObject);
                                PieChart.Data ebullicionObject = new PieChart.Data("A " + ebullicion + " de ebullicion °F", ebullicion);
                                pieChartObjectStatic.getData().add(ebullicionObject);
                            } else if(fahrenheit >= 33 && fahrenheit <= 212){
                                double ebullicion = 212 - fahrenheit;
                                PieChart.Data pieChartObject = new PieChart.Data("A " + fahrenheit + " de congelacion °F ", fahrenheit);
                                pieChartObjectStatic.getData().add(pieChartObject);
                                PieChart.Data ebullicionObject = new PieChart.Data("A " + ebullicion + " de ebullicion °F", ebullicion);
                                pieChartObjectStatic.getData().add(ebullicionObject);
                            }
                        } else { usoObjectStatic.setText("Solo se permiten cantidades numericas");}
                        datosDeCalculoObjectStatic.setText("Celsius a Fahrenheit");
                    } 
                });
                //Text usoObjectStatic = new Text();
                usoObjectStatic.setText("Uso\n"
                    + "Se utiliza por la población para usos no científicos \ny en determinadas industrias muy "
                    + "rígidas, como la del \npetróleo. Además, se utiliza esta escala en los \ninformes "
                    + "meteorológicos y en gastronomía. "
                );
                usoObjectStatic.setFont(Font.font("Courier New", FontWeight.LIGHT, 12));
                usoObjectStatic.setFill(Color.web("#818181"));
                GridPane.setConstraints(usoObjectStatic, 0, 3, 2, 1, HPos.LEFT, VPos.CENTER);
                //PieChart pieChartObjectStatic = new PieChart(FXCollections.observableArrayList());
                pieChartObjectStatic.getData().clear();
//                pieChartObjectStatic.setStartAngle(35);
                pieChartObjectStatic.setLabelsVisible(false);
                //pieChartObjectStatic.setPrefSize(470, 360);
//                pieChartObjectStatic.setClockwise(false);
//                pieChartObjectStatic.setLabelLineLength(100);
//                pieChartObjectStatic.setPrefSize(200, 200);
//                pieChartObjectStatic.setLegendVisible(false);  
                pieChartObjectStatic.setTitle("Celsius a Fahrenheit");
                pieChartObjectStatic.setTitleSide(Side.TOP);
                pieChartObjectStatic.setLegendSide(Side.BOTTOM);
                //PieChart.Data congelacionObjectStatic = new PieChart.Data("Estado de congelacion", 32);
                congelacionObjectStatic.setName("Limite del Estado de congelacion °F 32 (congelado)");
                congelacionObjectStatic.setPieValue(32);
                pieChartObjectStatic.getData().add(congelacionObjectStatic);
                //PieChart.Data ebullicionObjectStatic = new PieChart.Data("", 0);
                ebullicionObjectStatic.setName("Limite del Estado de ebullicion °F 212 (descongelado)");
                ebullicionObjectStatic.setPieValue(180);
                pieChartObjectStatic.getData().add(ebullicionObjectStatic);
          
                GridPane.setConstraints(pieChartObjectStatic, 2, 0, 1, 4, HPos.CENTER, VPos.CENTER);
                
                AnchorPane anchorPaneObject = new AnchorPane();
                //Button atrasObjectStatic = new Button("< Atras");
                atrasObjectStatic.setId("n-atras-center");
                AnchorPane.setLeftAnchor(atrasObjectStatic, 880.0);
                AnchorPane.setTopAnchor(atrasObjectStatic, 10.0);               
                atrasObjectStatic.setOnAction(new EventHandler<ActionEvent> () {
                    @Override public void handle(ActionEvent eventObject) {
                        INNER_GENERAL.toBack();
                        INNER_GENERAL.setVisible(false);
                        pieChartObjectStatic.getData().clear();
                    } 
                });            
                
                anchorPaneObject.getChildren().add(
                    atrasObjectStatic
                );
                gridPaneObject.getChildren().addAll(
                    textField1ObjectStatic, label1ObjectStatic, calcularObjectStatic, usoObjectStatic, pieChartObjectStatic
                );
                INNER_GENERAL.getChildren().addAll(
                    anchorPaneObject, gridPaneObject//addAnchorPane(addGridPane())
                );
                centerObject.getChildren().add(
                    INNER_GENERAL
                );
            }
        });
        //Button fahrenheitCelsiusObjectStatic = new Button("Fahrenheit a Celsius");
        fahrenheitCelsiusObjectStatic.setText("Fahrenheit a Celsuis");
        fahrenheitCelsiusObjectStatic.setPrefSize(980, 40);
        fahrenheitCelsiusObjectStatic.setId("n-botones-calculos");
        GridPane.setConstraints(fahrenheitCelsiusObjectStatic, 0, 1, 1, 1, HPos.LEFT, VPos.BASELINE);
        fahrenheitCelsiusObjectStatic.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent eventObject) {
                INNER_GENERAL.toFront();
                INNER_GENERAL.setVisible(true);
                label1ObjectStatic.setText("");
                
                GridPane gridPaneObject = new GridPane();
                gridPaneObject.setHgap(10);
                gridPaneObject.setVgap(10);
                gridPaneObject.setPadding(new Insets(50, 0, 0, 30));
                gridPaneObject.setStyle("-fx-margin: 20px; -fx-padding: 20px;");
                //gridPaneObject.setGridLinesVisible(true);
                //Label label1ObjectStatic = new Label();
                label1ObjectStatic.setText("Fahrenheit");
                label1ObjectStatic.setId("n-label-center");
                GridPane.setConstraints(label1ObjectStatic, 0, 1);
                //TextField textField1ObjectStatic = new TextField();
                textField1ObjectStatic.setPromptText("Ingresar los Fahrenheit");
                textField1ObjectStatic.setId("n-field-center");
                GridPane.setConstraints(textField1ObjectStatic, 0, 2, 1, 1);
                //Button calcularObjectStatic = new Button("Convertir");
                calcularObjectStatic.setText("Convertir");
                calcularObjectStatic.setId("n-carcular-center");
                GridPane.setConstraints(calcularObjectStatic, 1, 2); // column=1 row=0
                calcularObjectStatic.setOnAction(new EventHandler<ActionEvent> () {
                    @Override public void handle(ActionEvent eventObject) {
                        pieChartObjectStatic.getData().clear();
                        double celsius;
                     
                        if(Expresion.numeros(textField1ObjectStatic.getText())) {
                            if(textField1ObjectStatic.getText().equals("")) {
                                usoObjectStatic.setText("Tienes que ingresar una cantidad numerica en Fahrenheit");
                            } else {
                                usoObjectStatic.setText("Uso\n"
                                    + "Es muy utilizada para expresar las temperaturas de\nuso cotidiano, desde la temperatura "
                                    + "del aire a la\nde un sinfín de dispositivos domésticos (hornos,\nfreidoras, agua caliente,"
                                    + " refrigeración, etc.).\nTambién se emplea en trabajos científicos y tecnológicos,\n"
                                    + "aunque en muchos casos resulta obligado el uso de la\nescala de Kelvin."
                                );
                            }

                            celsius = (double)((Double.parseDouble(textField1ObjectStatic.getText()) - 32) / 1.8);

                            if(celsius > 100) {
                                PieChart.Data ebullicionObject = new PieChart.Data("Has superado el limite de 100 de ebullicion °C agua totalmente", 100);
                                pieChartObjectStatic.getData().add(ebullicionObject);
                            } else if(celsius == 0) {
                                double ebullicion = 100 - celsius;
                                PieChart.Data pieChartObject = new PieChart.Data("Estas en congelacion °C " + celsius, ebullicion);
                                pieChartObjectStatic.getData().add(pieChartObject);
                                PieChart.Data ebullicionObject = new PieChart.Data("A " + ebullicion + " de ebullicion °C", celsius);
                                pieChartObjectStatic.getData().add(ebullicionObject);
                            } else if(celsius <= -1) {
                                PieChart.Data pieChartObject = new PieChart.Data("Has superado el limite de 0 de congelacion °C hielo totalmente", 0);
                                pieChartObjectStatic.getData().add(pieChartObject);
                            } else if(celsius > 0 && celsius <= 100){
                                double ebullicion = 100 - celsius;
                                PieChart.Data pieChartObject = new PieChart.Data("A " + celsius + " de congelacion °C ", celsius);
                                pieChartObjectStatic.getData().add(pieChartObject);
                                PieChart.Data ebullicionObject = new PieChart.Data("A " + ebullicion + " de ebullicion °C", ebullicion);
                                pieChartObjectStatic.getData().add(ebullicionObject);
                            }
                        } else { usoObjectStatic.setText("Solo se permiten cantidades numericas"); }
                        datosDeCalculoObjectStatic.setText("Fahrenheit a Celsius");
                    }
                });
                //Text usoObjectStatic = new Text();
                usoObjectStatic.setText("Uso\n"
                    + "Es muy utilizada para expresar las temperaturas de\nuso cotidiano, desde la temperatura "
                    + "del aire a la\nde un sinfín de dispositivos domésticos (hornos,\nfreidoras, agua caliente,"
                    + " refrigeración, etc.).\nTambién se emplea en trabajos científicos y tecnológicos,\n"
                    + "aunque en muchos casos resulta obligado el uso de la\nescala de Kelvin."
                );
                usoObjectStatic.setFont(Font.font("Courier New", FontWeight.LIGHT, 12));
                usoObjectStatic.setFill(Color.web("#818181"));
                GridPane.setConstraints(usoObjectStatic, 0, 3, 2, 1, HPos.LEFT, VPos.CENTER);
                //PieChart pieChartObjectStatic = new PieChart(FXCollections.observableArrayList());
                pieChartObjectStatic.getData().clear();
//                pieChartObjectStatic.setStartAngle(90);
                pieChartObjectStatic.setLabelsVisible(false);
                //pieChartObjectStatic.setPrefSize(470, 360);
//                pieChartObjectStatic.setClockwise(false);
//                pieChartObjectStatic.setLabelLineLength(100);
//                pieChartObjectStatic.setPrefSize(200, 200);
//                pieChartObjectStatic.setLegendVisible(false);  
                pieChartObjectStatic.setTitle("Fahrenheit a Celsius");
                pieChartObjectStatic.setTitleSide(Side.TOP);
                pieChartObjectStatic.setLegendSide(Side.BOTTOM);
                //PieChart.Data congelacionObjectStatic = new PieChart.Data("Estado de congelacion", 32);
                congelacionObjectStatic.setName("Limite del Estado de congelacion °C 0 (congelado)");
                congelacionObjectStatic.setPieValue(0);
                pieChartObjectStatic.getData().add(congelacionObjectStatic);
                //PieChart.Data ebullicionObjectStatic = new PieChart.Data("", 0);
                ebullicionObjectStatic.setName("Limite del Estado de ebullicion °c 100 (descongelado)");
                ebullicionObjectStatic.setPieValue(100);
                pieChartObjectStatic.getData().add(ebullicionObjectStatic);

                GridPane.setConstraints(pieChartObjectStatic, 2, 0, 1, 4, HPos.CENTER, VPos.CENTER);
                
                AnchorPane anchorPaneObject = new AnchorPane();
                //Button atrasObjectStatic = new Button("< Atras");
                //atrasObjectStatic.setFont(Font.font("Courier New", FontWeight.LIGHT, 12));
                atrasObjectStatic.setId("n-atras-center");
                AnchorPane.setLeftAnchor(atrasObjectStatic, 880.0);
                AnchorPane.setTopAnchor(atrasObjectStatic, 10.0);               
                atrasObjectStatic.setOnAction(new EventHandler<ActionEvent> () {
                    @Override public void handle(ActionEvent eventObject) {
                        INNER_GENERAL.toBack();
                        INNER_GENERAL.setVisible(false);
                        pieChartObjectStatic.getData().clear();
                    } 
                });            
                
                anchorPaneObject.getChildren().add(
                    atrasObjectStatic
                );
                gridPaneObject.getChildren().addAll(
                    textField1ObjectStatic, label1ObjectStatic, calcularObjectStatic, usoObjectStatic, pieChartObjectStatic
                );
                INNER_GENERAL.getChildren().addAll(
                        anchorPaneObject, gridPaneObject
                );
                centerObject.getChildren().add(
                    INNER_GENERAL
                );
            }
        });
        //Button fahrenheitKelvinObjectStatic = new Button("Fahrenheit a Kelvin");
        fahrenheitKelvinObjectStatic.setPrefSize(980, 40);
        fahrenheitKelvinObjectStatic.setId("n-botones-calculos");
        fahrenheitKelvinObjectStatic.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent eventObject) {
                INNER_GENERAL.toFront();
                INNER_GENERAL.setVisible(true);
                label1ObjectStatic.setText("");
                
                GridPane gridPaneObject = new GridPane();
                gridPaneObject.setHgap(10);
                gridPaneObject.setVgap(10);
                gridPaneObject.setPadding(new Insets(50, 0, 0, 30));
                gridPaneObject.setStyle("-fx-margin: 20px; -fx-padding: 20px;");
                //gridPaneObject.setGridLinesVisible(true);
                //Label label1ObjectStatic = new Label();
                label1ObjectStatic.setText("Fahrenheit");
                label1ObjectStatic.setId("n-label-center");
                GridPane.setConstraints(label1ObjectStatic, 0, 1);
                //TextField textField1ObjectStatic = new TextField();
                textField1ObjectStatic.setPromptText("Ingresar los Fahrenheit");
                textField1ObjectStatic.setId("n-field-center");
                GridPane.setConstraints(textField1ObjectStatic, 0, 2, 1, 1);
                //Button calcularObjectStatic = new Button("Convertir");
                calcularObjectStatic.setText("Convertir");
                calcularObjectStatic.setId("n-carcular-center");
                GridPane.setConstraints(calcularObjectStatic, 1, 2); // column=1 row=0
                calcularObjectStatic.setOnAction(new EventHandler<ActionEvent> () {
                    @Override public void handle(ActionEvent eventObject) {
                        pieChartObjectStatic.getData().clear();
                        double kelvin;
                     
                        if(Expresion.numeros(textField1ObjectStatic.getText())) {
                            if(textField1ObjectStatic.getText().equals("")) {
                                usoObjectStatic.setText("Tienes que ingresar una cantidad numerica en Fahrenheit");
                            } else {
                                usoObjectStatic.setText("Uso\n"
                                + "Es la escala de temperaturas que se usa en ciencia, \nespecialmente en trabajos de "
                                + "física o química.\n"+"\n" +"También en iluminación de fotografía, vídeo y cine \nse "
                                + "utilizan los kelvin como referencia de la \ntemperatura de color.");
                            }
                        //kelvin = (double)((Double.parseDouble(textField1ObjectStatic.getText()) + 459.67) / 1.8);
                        kelvin = (double)((Double.parseDouble(textField1ObjectStatic.getText()) - 32) / 1.8 + 273.15);

                        if(kelvin > 373.15) {
                            PieChart.Data ebullicionObject = new PieChart.Data("Has superado el limite de 373.15 de ebullicion K agua totalmente", 373.15);
                            pieChartObjectStatic.getData().add(ebullicionObject);
                        } else if(kelvin == -273.15) {
                            double ebullicion = 373.15 - kelvin;
                            PieChart.Data pieChartObject = new PieChart.Data("Estas en congelacion K " + kelvin, ebullicion);
                            pieChartObjectStatic.getData().add(pieChartObject);
                            PieChart.Data ebullicionObject = new PieChart.Data("A " + ebullicion + " de ebullicion K", kelvin);
                            pieChartObjectStatic.getData().add(ebullicionObject);
                        } else if(kelvin <= -273.14) {
                            PieChart.Data pieChartObject = new PieChart.Data("Has superado el limite de -273.15 de congelacion K hielo totalmente", -273.15);
                            pieChartObjectStatic.getData().add(pieChartObject);
                        } else if(kelvin > -273.15 && kelvin <= 373.15){
                            double ebullicion = 373.15 - kelvin;
                            PieChart.Data pieChartObject = new PieChart.Data("A " + kelvin + " de congelacion K ", kelvin);
                            pieChartObjectStatic.getData().add(pieChartObject);
                            PieChart.Data ebullicionObject = new PieChart.Data("A " + ebullicion + " de ebullicion K", ebullicion);
                            pieChartObjectStatic.getData().add(ebullicionObject);
                        }
                    } else { usoObjectStatic.setText("Solo se permiten cantidades numericas"); }
                    }
                });
                //Text usoObjectStatic = new Text();
                usoObjectStatic.setText("Uso\n"
                    + "Es la escala de temperaturas que se usa en ciencia, \nespecialmente en trabajos de "
                    + "física o química.\n"+"\n" +"También en iluminación de fotografía, vídeo y cine \nse "
                    + "utilizan los kelvin como referencia de la \ntemperatura de color.");
                usoObjectStatic.setFont(Font.font("Courier New", FontWeight.LIGHT, 12));
                usoObjectStatic.setFill(Color.web("#818181"));
                GridPane.setConstraints(usoObjectStatic, 0, 3, 2, 1, HPos.LEFT, VPos.CENTER);
                //PieChart pieChartObjectStatic = new PieChart(FXCollections.observableArrayList());
                pieChartObjectStatic.getData().clear();
//                pieChartObjectStatic.setStartAngle(90);
                pieChartObjectStatic.setLabelsVisible(false);
                //pieChartObjectStatic.setPrefSize(470, 360);
//                pieChartObjectStatic.setClockwise(false);
//                pieChartObjectStatic.setLabelLineLength(100);
//                pieChartObjectStatic.setPrefSize(200, 200);
//                pieChartObjectStatic.setLegendVisible(false);  
                pieChartObjectStatic.setTitle("Fahrenheit a Kelvin");
                pieChartObjectStatic.setTitleSide(Side.TOP);
                pieChartObjectStatic.setLegendSide(Side.BOTTOM);
                //PieChart.Data congelacionObjectStatic = new PieChart.Data("Estado de congelacion", 32);
                congelacionObjectStatic.setName("Limite del Estado de congelacion K -273.15 (congelado)");
                congelacionObjectStatic.setPieValue(0);
                pieChartObjectStatic.getData().add(congelacionObjectStatic);
                //PieChart.Data ebullicionObjectStatic = new PieChart.Data("", 0);
                ebullicionObjectStatic.setName("Limite del Estado de ebullicion K 373.15 (descongelado)");
                ebullicionObjectStatic.setPieValue(100);
                pieChartObjectStatic.getData().add(ebullicionObjectStatic);

                GridPane.setConstraints(pieChartObjectStatic, 2, 0, 1, 4, HPos.CENTER, VPos.CENTER);
                
                AnchorPane anchorPaneObject = new AnchorPane();
                //Button atrasObjectStatic = new Button("< Atras");
                //atrasObjectStatic.setFont(Font.font("Courier New", FontWeight.LIGHT, 12));
                atrasObjectStatic.setId("n-atras-center");
                AnchorPane.setLeftAnchor(atrasObjectStatic, 880.0);
                AnchorPane.setTopAnchor(atrasObjectStatic, 10.0);               
                atrasObjectStatic.setOnAction(new EventHandler<ActionEvent> () {
                    @Override public void handle(ActionEvent eventObject) {
                        INNER_GENERAL.toBack();
                        INNER_GENERAL.setVisible(false);
                        pieChartObjectStatic.getData().clear();
                    } 
                });            
                
                anchorPaneObject.getChildren().add(
                    atrasObjectStatic
                );
                gridPaneObject.getChildren().addAll(
                    textField1ObjectStatic, label1ObjectStatic, calcularObjectStatic, usoObjectStatic, pieChartObjectStatic
                );
                INNER_GENERAL.getChildren().addAll(
                        anchorPaneObject, gridPaneObject
                );
                centerObject.getChildren().add(
                    INNER_GENERAL
                );
            }
        });
        GridPane.setConstraints(fahrenheitKelvinObjectStatic, 0, 2, 1, 1, HPos.LEFT, VPos.BASELINE);
        //Button kelvinFahrenheitObjectStatic = new Button("Kelvin a Fahrenheit");
        kelvinFahrenheitObjectStatic.setPrefSize(980, 40);
        kelvinFahrenheitObjectStatic.setId("n-botones-calculos");
        kelvinFahrenheitObjectStatic.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent eventObject) {
                INNER_GENERAL.toFront();
                INNER_GENERAL.setVisible(true);
                label1ObjectStatic.setText("");
                
                GridPane gridPaneObject = new GridPane();
                gridPaneObject.setHgap(10);
                gridPaneObject.setVgap(10);
                gridPaneObject.setPadding(new Insets(50, 0, 0, 30));
                gridPaneObject.setStyle("-fx-margin: 20px; -fx-padding: 20px;");
                //gridPaneObject.setGridLinesVisible(true);
                //Label label1ObjectStatic = new Label();
                label1ObjectStatic.setText("Kelvin");
                label1ObjectStatic.setId("n-label-center");
                GridPane.setConstraints(label1ObjectStatic, 0, 1);
                //TextField textField1ObjectStatic = new TextField();
                textField1ObjectStatic.setPromptText("Ingresar los Kelvin");
                textField1ObjectStatic.setId("n-field-center");
                GridPane.setConstraints(textField1ObjectStatic, 0, 2, 1, 1);
                //Button calcularObjectStatic = new Button("Convertir");
                calcularObjectStatic.setText("Convertir");
                calcularObjectStatic.setId("n-carcular-center");
                GridPane.setConstraints(calcularObjectStatic, 1, 2); // column=1 row=0
                calcularObjectStatic.setOnAction(new EventHandler<ActionEvent> () {
                    @Override public void handle(ActionEvent eventObject) {
                        pieChartObjectStatic.getData().clear();
                        double fahrenheit;
                        if(Expresion.numeros(textField1ObjectStatic.getText())) {
                            if(textField1ObjectStatic.getText().equals("")) {
                                usoObjectStatic.setText("Tienes que ingresar una cantidad numerica en kelvin");
                            } else {
                                usoObjectStatic.setText("Uso\n"
                                    + "Se utiliza por la población para usos no científicos \ny en determinadas industrias muy "
                                    + "rígidas, como la del \npetróleo. Además, se utiliza esta escala en los \ninformes "
                                    + "meteorológicos y en gastronomía. "
                                );
                            }

                            fahrenheit = (double)(1.8 * (Double.parseDouble(textField1ObjectStatic.getText()) - 273.15) + 32);

                            if(fahrenheit >= 213) {
                                PieChart.Data ebullicionObject = new PieChart.Data("Has superado el limite de 212 de ebullicion °F agua totalmente", 212);
                                pieChartObjectStatic.getData().add(ebullicionObject);
                            } else if(fahrenheit == 32) {
                                double ebullicion = 212 - fahrenheit;
                                PieChart.Data pieChartObject = new PieChart.Data("Estas en congelacion °F " + fahrenheit, fahrenheit);
                                pieChartObjectStatic.getData().add(pieChartObject);
                                PieChart.Data ebullicionObject = new PieChart.Data("A " + ebullicion + " de ebullicion °F", ebullicion);
                                pieChartObjectStatic.getData().add(ebullicionObject);
                            } else if(fahrenheit >= 33 && fahrenheit <= 212){
                                double ebullicion = 212 - fahrenheit;
                                PieChart.Data pieChartObject = new PieChart.Data("A " + fahrenheit + " de congelacion °F ", fahrenheit);
                                pieChartObjectStatic.getData().add(pieChartObject);
                                PieChart.Data ebullicionObject = new PieChart.Data("A " + ebullicion + " de ebullicion °F", ebullicion);
                                pieChartObjectStatic.getData().add(ebullicionObject);
                            }
                        } else { usoObjectStatic.setText("Solo se permiten cantidades numericas");}
                    }
                });
                //Text usoObjectStatic = new Text();
                usoObjectStatic.setText("Uso\n"
                    + "Se utiliza por la población para usos no científicos \ny en determinadas industrias muy "
                    + "rígidas, como la del \npetróleo. Además, se utiliza esta escala en los \ninformes "
                    + "meteorológicos y en gastronomía. ");
                usoObjectStatic.setFont(Font.font("Courier New", FontWeight.LIGHT, 12));
                usoObjectStatic.setFill(Color.web("#818181"));
                GridPane.setConstraints(usoObjectStatic, 0, 3, 2, 1, HPos.LEFT, VPos.CENTER);
                //PieChart pieChartObjectStatic = new PieChart(FXCollections.observableArrayList());
                pieChartObjectStatic.getData().clear();
//                pieChartObjectStatic.setStartAngle(90);
                pieChartObjectStatic.setLabelsVisible(false);
                //pieChartObjectStatic.setPrefSize(470, 360);
//                pieChartObjectStatic.setClockwise(false);
//                pieChartObjectStatic.setLabelLineLength(100);
//                pieChartObjectStatic.setPrefSize(200, 200);
//                pieChartObjectStatic.setLegendVisible(false);  
                pieChartObjectStatic.setTitle("Kelvin a Fahrenheit");
                pieChartObjectStatic.setTitleSide(Side.TOP);
                pieChartObjectStatic.setLegendSide(Side.BOTTOM);
                //PieChart.Data congelacionObjectStatic = new PieChart.Data("Estado de congelacion", 32);
                congelacionObjectStatic.setName("Limite del Estado de congelacion °F 32 (congelado)");
                congelacionObjectStatic.setPieValue(0);
                pieChartObjectStatic.getData().add(congelacionObjectStatic);
                //PieChart.Data ebullicionObjectStatic = new PieChart.Data("", 0);
                ebullicionObjectStatic.setName("Limite del Estado de ebullicion °F 212 (descongelado)");
                ebullicionObjectStatic.setPieValue(100);
                pieChartObjectStatic.getData().add(ebullicionObjectStatic);

                GridPane.setConstraints(pieChartObjectStatic, 2, 0, 1, 4, HPos.CENTER, VPos.CENTER);
                
                AnchorPane anchorPaneObject = new AnchorPane();
                //Button atrasObjectStatic = new Button("< Atras");
                //atrasObjectStatic.setFont(Font.font("Courier New", FontWeight.LIGHT, 12));
                atrasObjectStatic.setId("n-atras-center");
                AnchorPane.setLeftAnchor(atrasObjectStatic, 880.0);
                AnchorPane.setTopAnchor(atrasObjectStatic, 10.0);               
                atrasObjectStatic.setOnAction(new EventHandler<ActionEvent> () {
                    @Override public void handle(ActionEvent eventObject) {
                        INNER_GENERAL.toBack();
                        INNER_GENERAL.setVisible(false);
                        pieChartObjectStatic.getData().clear();
                    } 
                });            
                
                anchorPaneObject.getChildren().add(
                    atrasObjectStatic
                );
                gridPaneObject.getChildren().addAll(
                    textField1ObjectStatic, label1ObjectStatic, calcularObjectStatic, usoObjectStatic, pieChartObjectStatic
                );
                INNER_GENERAL.getChildren().addAll(
                        anchorPaneObject, gridPaneObject
                );
                centerObject.getChildren().add(
                    INNER_GENERAL
                );
            }
        });
        GridPane.setConstraints(kelvinFahrenheitObjectStatic, 0, 3, 1, 1, HPos.LEFT, VPos.BASELINE);
        //Button fahrenheitRankineObjectStatic = new Button("Fahrenheit a Rankine");
        fahrenheitRankineObjectStatic.setPrefSize(980, 40);
        fahrenheitRankineObjectStatic.setId("n-botones-calculos");
        fahrenheitRankineObjectStatic.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent eventObject) {
                INNER_GENERAL.toFront();
                INNER_GENERAL.setVisible(true);
                label1ObjectStatic.setText("");
                
                GridPane gridPaneObject = new GridPane();
                gridPaneObject.setHgap(10);
                gridPaneObject.setVgap(10);
                gridPaneObject.setPadding(new Insets(50, 0, 0, 30));
                gridPaneObject.setStyle("-fx-margin: 20px; -fx-padding: 20px;");
                //gridPaneObject.setGridLinesVisible(true);
                //Label label1ObjectStatic = new Label();
                label1ObjectStatic.setText("Fahrenheit");
                label1ObjectStatic.setId("n-label-center");
                GridPane.setConstraints(label1ObjectStatic, 0, 1);
                //TextField textField1ObjectStatic = new TextField();
                textField1ObjectStatic.setPromptText("Ingresar los Fahrenheit");
                textField1ObjectStatic.setId("n-field-center");
                GridPane.setConstraints(textField1ObjectStatic, 0, 2, 1, 1);
                //Button calcularObjectStatic = new Button("Convertir");
                calcularObjectStatic.setText("Convertir");
                calcularObjectStatic.setId("n-carcular-center");
                GridPane.setConstraints(calcularObjectStatic, 1, 2); // column=1 row=0
                calcularObjectStatic.setOnAction(new EventHandler<ActionEvent> () {
                    @Override public void handle(ActionEvent eventObject) {
                        pieChartObjectStatic.getData().clear();
                        double rankine;
                     
                        if(Expresion.numeros(textField1ObjectStatic.getText())) {
                            if(textField1ObjectStatic.getText().equals("")) {
                                usoObjectStatic.setText("Tienes que ingresar una cantidad numerica en Fahrenheit");
                            } else {
                                usoObjectStatic.setText("Es usado comúnmente en EE.UU como medida\nde temperatura termodinámica.");
                            }

                        rankine = (double)(Double.parseDouble(textField1ObjectStatic.getText()) + 459.67);

                        if(rankine > 671.67) {
                            PieChart.Data ebullicionObject = new PieChart.Data("Has superado el limite de 671.67 de ebullicion R agua totalmente", 671.67);
                            pieChartObjectStatic.getData().add(ebullicionObject);
                        } else if(rankine == -491.67) {
                            double ebullicion = 671.67 - rankine;
                            PieChart.Data pieChartObject = new PieChart.Data("Estas en congelacion R " + rankine, ebullicion);
                            pieChartObjectStatic.getData().add(pieChartObject);
                            PieChart.Data ebullicionObject = new PieChart.Data("A " + ebullicion + " de ebullicion R", rankine);
                            pieChartObjectStatic.getData().add(ebullicionObject);
                        } else if(rankine <= -491.66) {
                            PieChart.Data pieChartObject = new PieChart.Data("Has superado el limite de -491.67 de congelacion R hielo totalmente", -491.67);
                            pieChartObjectStatic.getData().add(pieChartObject);
                        } else if(rankine > -491.67 && rankine <= 671.67){
                            double ebullicion = 671.67 - rankine;
                            PieChart.Data pieChartObject = new PieChart.Data("A " + rankine + " de congelacion R ", rankine);
                            pieChartObjectStatic.getData().add(pieChartObject);
                            PieChart.Data ebullicionObject = new PieChart.Data("A " + ebullicion + " de ebullicion R", ebullicion);
                            pieChartObjectStatic.getData().add(ebullicionObject);
                        }
                    } else { usoObjectStatic.setText("Solo se permiten cantidades numericas"); }
                    }
                });
                //Text usoObjectStatic = new Text();
                usoObjectStatic.setText("Es usado comúnmente en EE.UU como medida\nde temperatura termodinámica. ");
                usoObjectStatic.setFont(Font.font("Courier New", FontWeight.LIGHT, 12));
                usoObjectStatic.setFill(Color.web("#818181"));
                GridPane.setConstraints(usoObjectStatic, 0, 3, 2, 1, HPos.LEFT, VPos.CENTER);
                //PieChart pieChartObjectStatic = new PieChart(FXCollections.observableArrayList());
                pieChartObjectStatic.getData().clear();
//                pieChartObjectStatic.setStartAngle(90);
                pieChartObjectStatic.setLabelsVisible(false);
                //pieChartObjectStatic.setPrefSize(470, 360);
//                pieChartObjectStatic.setClockwise(false);
//                pieChartObjectStatic.setLabelLineLength(100);
//                pieChartObjectStatic.setPrefSize(200, 200);
//                pieChartObjectStatic.setLegendVisible(false);  
                pieChartObjectStatic.setTitle("Fahrenheit a Rankine");
                pieChartObjectStatic.setTitleSide(Side.TOP);
                pieChartObjectStatic.setLegendSide(Side.BOTTOM);
                //PieChart.Data congelacionObjectStatic = new PieChart.Data("Estado de congelacion", 32);
                congelacionObjectStatic.setName("Limite del Estado de congelacion R -491.67 (congelado)");
                congelacionObjectStatic.setPieValue(0);
                pieChartObjectStatic.getData().add(congelacionObjectStatic);
                //PieChart.Data ebullicionObjectStatic = new PieChart.Data("", 0);
                ebullicionObjectStatic.setName("Limite del Estado de ebullicion R 671.67 (descongelado)");
                ebullicionObjectStatic.setPieValue(100);
                pieChartObjectStatic.getData().add(ebullicionObjectStatic);

                GridPane.setConstraints(pieChartObjectStatic, 2, 0, 1, 4, HPos.CENTER, VPos.CENTER);
                
                AnchorPane anchorPaneObject = new AnchorPane();
                //Button atrasObjectStatic = new Button("< Atras");
                //atrasObjectStatic.setFont(Font.font("Courier New", FontWeight.LIGHT, 12));
                atrasObjectStatic.setId("n-atras-center");
                AnchorPane.setLeftAnchor(atrasObjectStatic, 880.0);
                AnchorPane.setTopAnchor(atrasObjectStatic, 10.0);               
                atrasObjectStatic.setOnAction(new EventHandler<ActionEvent> () {
                    @Override public void handle(ActionEvent eventObject) {
                        INNER_GENERAL.toBack();
                        INNER_GENERAL.setVisible(false);
                        pieChartObjectStatic.getData().clear();
                    } 
                });            
                
                anchorPaneObject.getChildren().add(
                    atrasObjectStatic
                );
                gridPaneObject.getChildren().addAll(
                    textField1ObjectStatic, label1ObjectStatic, calcularObjectStatic, usoObjectStatic, pieChartObjectStatic
                );
                INNER_GENERAL.getChildren().addAll(
                        anchorPaneObject, gridPaneObject
                );
                centerObject.getChildren().add(
                    INNER_GENERAL
                );
            }
        });
        GridPane.setConstraints(fahrenheitRankineObjectStatic, 0, 4, 1, 1, HPos.LEFT, VPos.BASELINE);
        //Button rankineFahrenheitObjectStatic = new Button("Rankine a Fahrenheit");
        rankineFahrenheitObjectStatic.setPrefSize(980, 40);
        rankineFahrenheitObjectStatic.setId("n-botones-calculos");
        rankineFahrenheitObjectStatic.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent eventObject) {
                INNER_GENERAL.toFront();
                INNER_GENERAL.setVisible(true);
                label1ObjectStatic.setText("");
                
                GridPane gridPaneObject = new GridPane();
                gridPaneObject.setHgap(10);
                gridPaneObject.setVgap(10);
                gridPaneObject.setPadding(new Insets(50, 0, 0, 30));
                gridPaneObject.setStyle("-fx-margin: 20px; -fx-padding: 20px;");
                //gridPaneObject.setGridLinesVisible(true);
                //Label label1ObjectStatic = new Label();
                label1ObjectStatic.setText("Rankine");
                label1ObjectStatic.setId("n-label-center");
                GridPane.setConstraints(label1ObjectStatic, 0, 1);
                //TextField textField1ObjectStatic = new TextField();
                textField1ObjectStatic.setPromptText("Ingresar los Fahrenheit");
                textField1ObjectStatic.setId("n-field-center");
                GridPane.setConstraints(textField1ObjectStatic, 0, 2, 1, 1);
                //Button calcularObjectStatic = new Button("Convertir");
                calcularObjectStatic.setText("Convertir");
                calcularObjectStatic.setId("n-carcular-center");
                GridPane.setConstraints(calcularObjectStatic, 1, 2); // column=1 row=0
                calcularObjectStatic.setOnAction(new EventHandler<ActionEvent> () {
                    @Override public void handle(ActionEvent eventObject) {
                        pieChartObjectStatic.getData().clear();
                        double fahrenheit;
                     
                        if(Expresion.numeros(textField1ObjectStatic.getText())) {
                            if(textField1ObjectStatic.getText().equals("")) {
                                usoObjectStatic.setText("Tienes que ingresar una cantidad numerica en Rankine");
                            } else {
                                usoObjectStatic.setText("Uso\n"
                                    + "Se utiliza por la población para usos no científicos \ny en determinadas industrias muy "
                                    + "rígidas, como la del \npetróleo. Además, se utiliza esta escala en los \ninformes "
                                    + "meteorológicos y en gastronomía. "
                                );
                            }

                        fahrenheit = (double)(Double.parseDouble(textField1ObjectStatic.getText()) - 459.67);

                        if(fahrenheit > 212) {
                            PieChart.Data ebullicionObject = new PieChart.Data("Has superado el limite de 212 de ebullicion °F agua totalmente", 212);
                            pieChartObjectStatic.getData().add(ebullicionObject);
                        } else if(fahrenheit == 32) {
                            double ebullicion = 212 - fahrenheit;
                            PieChart.Data pieChartObject = new PieChart.Data("Estas en congelacion °F " + fahrenheit, ebullicion);
                            pieChartObjectStatic.getData().add(pieChartObject);
                            PieChart.Data ebullicionObject = new PieChart.Data("A " + ebullicion + " de ebullicion °F", fahrenheit);
                            pieChartObjectStatic.getData().add(ebullicionObject);
                        } else if(fahrenheit <= -31) {
                            PieChart.Data pieChartObject = new PieChart.Data("Has superado el limite de 0 de congelacion °F hielo totalmente", 32);
                            pieChartObjectStatic.getData().add(pieChartObject);
                        } else if(fahrenheit > 32 && fahrenheit <= 212){
                            double ebullicion = 212 - fahrenheit;
                            PieChart.Data pieChartObject = new PieChart.Data("A " + fahrenheit + " de congelacion °F ", fahrenheit);
                            pieChartObjectStatic.getData().add(pieChartObject);
                            PieChart.Data ebullicionObject = new PieChart.Data("A " + ebullicion + " de ebullicion °F", ebullicion);
                            pieChartObjectStatic.getData().add(ebullicionObject);
                        }
                    } else { usoObjectStatic.setText("Solo se permiten cantidades numericas"); }
                    }
                });
                //Text usoObjectStatic = new Text();
                usoObjectStatic.setText("Uso\n"
                    + "Se utiliza por la población para usos no científicos \ny en determinadas industrias muy "
                    + "rígidas, como la del \npetróleo. Además, se utiliza esta escala en los \ninformes "
                    + "meteorológicos y en gastronomía. "
                );
                usoObjectStatic.setFont(Font.font("Courier New", FontWeight.LIGHT, 12));
                usoObjectStatic.setFill(Color.web("#818181"));
                GridPane.setConstraints(usoObjectStatic, 0, 3, 2, 1, HPos.LEFT, VPos.CENTER);
                //PieChart pieChartObjectStatic = new PieChart(FXCollections.observableArrayList());
                pieChartObjectStatic.getData().clear();
//                pieChartObjectStatic.setStartAngle(90);
                pieChartObjectStatic.setLabelsVisible(false);
                //pieChartObjectStatic.setPrefSize(470, 360);
//                pieChartObjectStatic.setClockwise(false);
//                pieChartObjectStatic.setLabelLineLength(100);
//                pieChartObjectStatic.setPrefSize(200, 200);
//                pieChartObjectStatic.setLegendVisible(false);  
                pieChartObjectStatic.setTitle("Rankine a Fahrenheit");
                pieChartObjectStatic.setTitleSide(Side.TOP);
                pieChartObjectStatic.setLegendSide(Side.BOTTOM);
                //PieChart.Data congelacionObjectStatic = new PieChart.Data("Estado de congelacion", 32);
                congelacionObjectStatic.setName("Limite del Estado de congelacion °F 32 (congelado)");
                congelacionObjectStatic.setPieValue(0);
                pieChartObjectStatic.getData().add(congelacionObjectStatic);
                //PieChart.Data ebullicionObjectStatic = new PieChart.Data("", 0);
                ebullicionObjectStatic.setName("Limite del Estado de ebullicion °F 212 (descongelado)");
                ebullicionObjectStatic.setPieValue(100);
                pieChartObjectStatic.getData().add(ebullicionObjectStatic);

                GridPane.setConstraints(pieChartObjectStatic, 2, 0, 1, 4, HPos.CENTER, VPos.CENTER);
                
                AnchorPane anchorPaneObject = new AnchorPane();
                //Button atrasObjectStatic = new Button("< Atras");
                //atrasObjectStatic.setFont(Font.font("Courier New", FontWeight.LIGHT, 12));
                atrasObjectStatic.setId("n-atras-center");
                AnchorPane.setLeftAnchor(atrasObjectStatic, 880.0);
                AnchorPane.setTopAnchor(atrasObjectStatic, 10.0);               
                atrasObjectStatic.setOnAction(new EventHandler<ActionEvent> () {
                    @Override public void handle(ActionEvent eventObject) {
                        INNER_GENERAL.toBack();
                        INNER_GENERAL.setVisible(false);
                        pieChartObjectStatic.getData().clear();
                    } 
                });            
                
                anchorPaneObject.getChildren().add(
                    atrasObjectStatic
                );
                gridPaneObject.getChildren().addAll(
                    textField1ObjectStatic, label1ObjectStatic, calcularObjectStatic, usoObjectStatic, pieChartObjectStatic
                );
                INNER_GENERAL.getChildren().addAll(
                        anchorPaneObject, gridPaneObject
                );
                centerObject.getChildren().add(
                    INNER_GENERAL
                );
            }
        });
        GridPane.setConstraints(rankineFahrenheitObjectStatic, 0, 5, 1, 1, HPos.LEFT, VPos.BASELINE);
        //Button fahrenheitReaumurObjectStatic = new Button("Fahrenheit a Réaumur");
        fahrenheitReaumurObjectStatic.setPrefSize(980, 40);
        fahrenheitReaumurObjectStatic.setId("n-botones-calculos");
        fahrenheitReaumurObjectStatic.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent eventObject) {
                INNER_GENERAL.toFront();
                INNER_GENERAL.setVisible(true);
                label1ObjectStatic.setText("");
                
                GridPane gridPaneObject = new GridPane();
                gridPaneObject.setHgap(10);
                gridPaneObject.setVgap(10);
                gridPaneObject.setPadding(new Insets(50, 0, 0, 30));
                gridPaneObject.setStyle("-fx-margin: 20px; -fx-padding: 20px;");
                //gridPaneObject.setGridLinesVisible(true);
                //Label label1ObjectStatic = new Label();
                label1ObjectStatic.setText("Fahrenheit");
                label1ObjectStatic.setId("n-label-center");
                GridPane.setConstraints(label1ObjectStatic, 0, 1);
                //TextField textField1ObjectStatic = new TextField();
                textField1ObjectStatic.setPromptText("Ingresar los Fahrenheit");
                textField1ObjectStatic.setId("n-field-center");
                GridPane.setConstraints(textField1ObjectStatic, 0, 2, 1, 1);
                //Button calcularObjectStatic = new Button("Convertir");
                calcularObjectStatic.setText("Convertir");
                calcularObjectStatic.setId("n-carcular-center");
                GridPane.setConstraints(calcularObjectStatic, 1, 2); // column=1 row=0
                calcularObjectStatic.setOnAction(new EventHandler<ActionEvent> () {
                    @Override public void handle(ActionEvent eventObject) {
                        pieChartObjectStatic.getData().clear();
                        double Reaumur;
                     
                        if(Expresion.numeros(textField1ObjectStatic.getText())) {
                            if(textField1ObjectStatic.getText().equals("")) {
                                usoObjectStatic.setText("Tienes que ingresar una cantidad numerica en Fahrenheit");
                            } else {
                                usoObjectStatic.setText("Uso\n"
                                    + "Este sistema de temperatura se utiliza en ocasiones \npara medir la temperatura de "
                                    + "los almíbares y los \ncaramelos. "
                                );
                            }

                        Reaumur = (double)((Double.parseDouble(textField1ObjectStatic.getText()) - 32) / 2.25);

                        if(Reaumur > 80) {
                            PieChart.Data ebullicionObject = new PieChart.Data("Has superado el limite de 80 de ebullicion °Re agua totalmente", 80);
                            pieChartObjectStatic.getData().add(ebullicionObject);
                        } else if(Reaumur == 0) {
                            double ebullicion = 80 - Reaumur;
                            PieChart.Data pieChartObject = new PieChart.Data("Estas en congelacion °Re " + Reaumur, ebullicion);
                            pieChartObjectStatic.getData().add(pieChartObject);
                            PieChart.Data ebullicionObject = new PieChart.Data("A " + ebullicion + " de ebullicion °C", Reaumur);
                            pieChartObjectStatic.getData().add(ebullicionObject);
                        } else if(Reaumur <= -1) {
                            PieChart.Data pieChartObject = new PieChart.Data("Has superado el limite de 0 de congelacion °Re hielo totalmente", 0);
                            pieChartObjectStatic.getData().add(pieChartObject);
                        } else if(Reaumur > 0 && Reaumur <= 80){
                            double ebullicion = 80 - Reaumur;
                            PieChart.Data pieChartObject = new PieChart.Data("A " + Reaumur + " de congelacion °Re ", Reaumur);
                            pieChartObjectStatic.getData().add(pieChartObject);
                            PieChart.Data ebullicionObject = new PieChart.Data("A " + ebullicion + " de ebullicion °Re", ebullicion);
                            pieChartObjectStatic.getData().add(ebullicionObject);
                        }
                    } else { usoObjectStatic.setText("Solo se permiten cantidades numericas"); }
                    }
                });
                //Text usoObjectStatic = new Text();
                usoObjectStatic.setText("Uso\n"
                    + "Este sistema de temperatura se utiliza en ocasiones \npara medir la temperatura de "
                    + "los almíbares y los \ncaramelos. "
                );
                usoObjectStatic.setFont(Font.font("Courier New", FontWeight.LIGHT, 12));
                usoObjectStatic.setFill(Color.web("#818181"));
                GridPane.setConstraints(usoObjectStatic, 0, 3, 2, 1, HPos.LEFT, VPos.CENTER);
                //PieChart pieChartObjectStatic = new PieChart(FXCollections.observableArrayList());
                pieChartObjectStatic.getData().clear();
//                pieChartObjectStatic.setStartAngle(90);
                pieChartObjectStatic.setLabelsVisible(false);
                //pieChartObjectStatic.setPrefSize(470, 360);
//                pieChartObjectStatic.setClockwise(false);
//                pieChartObjectStatic.setLabelLineLength(100);
//                pieChartObjectStatic.setPrefSize(200, 200);
//                pieChartObjectStatic.setLegendVisible(false);  
                pieChartObjectStatic.setTitle("Fahrenheit a Réaumur");
                pieChartObjectStatic.setTitleSide(Side.TOP);
                pieChartObjectStatic.setLegendSide(Side.BOTTOM);
                //PieChart.Data congelacionObjectStatic = new PieChart.Data("Estado de congelacion", 32);
                congelacionObjectStatic.setName("Limite del Estado de congelacion °Re 0 (congelado)");
                congelacionObjectStatic.setPieValue(0);
                pieChartObjectStatic.getData().add(congelacionObjectStatic);
                //PieChart.Data ebullicionObjectStatic = new PieChart.Data("", 0);
                ebullicionObjectStatic.setName("Limite del Estado de ebullicion °Re 80 (descongelado)");
                ebullicionObjectStatic.setPieValue(100);
                pieChartObjectStatic.getData().add(ebullicionObjectStatic);

                GridPane.setConstraints(pieChartObjectStatic, 2, 0, 1, 4, HPos.CENTER, VPos.CENTER);
                
                AnchorPane anchorPaneObject = new AnchorPane();
                //Button atrasObjectStatic = new Button("< Atras");
                //atrasObjectStatic.setFont(Font.font("Courier New", FontWeight.LIGHT, 12));
                atrasObjectStatic.setId("n-atras-center");
                AnchorPane.setLeftAnchor(atrasObjectStatic, 880.0);
                AnchorPane.setTopAnchor(atrasObjectStatic, 10.0);               
                atrasObjectStatic.setOnAction(new EventHandler<ActionEvent> () {
                    @Override public void handle(ActionEvent eventObject) {
                        INNER_GENERAL.toBack();
                        INNER_GENERAL.setVisible(false);
                        pieChartObjectStatic.getData().clear();
                    } 
                });            
                
                anchorPaneObject.getChildren().add(
                    atrasObjectStatic
                );
                gridPaneObject.getChildren().addAll(
                    textField1ObjectStatic, label1ObjectStatic, calcularObjectStatic, usoObjectStatic, pieChartObjectStatic
                );
                INNER_GENERAL.getChildren().addAll(
                        anchorPaneObject, gridPaneObject
                );
                centerObject.getChildren().add(
                    INNER_GENERAL
                );
            }
        });
        GridPane.setConstraints(fahrenheitReaumurObjectStatic, 0, 6, 1, 1, HPos.LEFT, VPos.BASELINE);
        //Button reaumurFahrenheitObjectStatic = new Button("Réaumur a Fahrenheit");
        reaumurFahrenheitObjectStatic.setPrefSize(980, 40);
        reaumurFahrenheitObjectStatic.setId("n-botones-calculos");
        reaumurFahrenheitObjectStatic.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent eventObject) {
                INNER_GENERAL.toFront();
                INNER_GENERAL.setVisible(true);
                label1ObjectStatic.setText("");
                
                GridPane gridPaneObject = new GridPane();
                gridPaneObject.setHgap(10);
                gridPaneObject.setVgap(10);
                gridPaneObject.setPadding(new Insets(50, 0, 0, 30));
                gridPaneObject.setStyle("-fx-margin: 20px; -fx-padding: 20px;");
                //gridPaneObject.setGridLinesVisible(true);
                //Label label1ObjectStatic = new Label();
                label1ObjectStatic.setText("Fahrenheit");
                label1ObjectStatic.setId("n-label-center");
                GridPane.setConstraints(label1ObjectStatic, 0, 1);
                //TextField textField1ObjectStatic = new TextField();
                textField1ObjectStatic.setPromptText("Ingresar los Fahrenheit");
                textField1ObjectStatic.setId("n-field-center");
                GridPane.setConstraints(textField1ObjectStatic, 0, 2, 1, 1);
                //Button calcularObjectStatic = new Button("Convertir");
                calcularObjectStatic.setText("Convertir");
                calcularObjectStatic.setId("n-carcular-center");
                GridPane.setConstraints(calcularObjectStatic, 1, 2); // column=1 row=0
                calcularObjectStatic.setOnAction(new EventHandler<ActionEvent> () {
                    @Override public void handle(ActionEvent eventObject) {
                        pieChartObjectStatic.getData().clear();
                        double fahrenheit;
                     
                        if(Expresion.numeros(textField1ObjectStatic.getText())) {
                            if(textField1ObjectStatic.getText().equals("")) {
                                usoObjectStatic.setText("Tienes que ingresar una cantidad numerica en Réaumur");
                            } else {
                                usoObjectStatic.setText("Uso\n"
                                + "Se utiliza por la población para usos no científicos \ny en determinadas industrias muy "
                                + "rígidas, como la del \npetróleo. Además, se utiliza esta escala en los \ninformes "
                                + "meteorológicos y en gastronomía. "
                                );
                            }

                        fahrenheit = (double)((2.25 * Double.parseDouble(textField1ObjectStatic.getText())) + 32);

                        if(fahrenheit > 212) {
                            PieChart.Data ebullicionObject = new PieChart.Data("Has superado el limite de 212 de ebullicion °F agua totalmente", 212);
                            pieChartObjectStatic.getData().add(ebullicionObject);
                        } else if(fahrenheit == 32) {
                            double ebullicion = 212 - fahrenheit;
                            PieChart.Data pieChartObject = new PieChart.Data("Estas en congelacion °F " + fahrenheit, ebullicion);
                            pieChartObjectStatic.getData().add(pieChartObject);
                            PieChart.Data ebullicionObject = new PieChart.Data("A " + ebullicion + " de ebullicion °F", fahrenheit);
                            pieChartObjectStatic.getData().add(ebullicionObject);
                        } else if(fahrenheit <= 31) {
                            PieChart.Data pieChartObject = new PieChart.Data("Has superado el limite de 32 de congelacion °F hielo totalmente", 32);
                            pieChartObjectStatic.getData().add(pieChartObject);
                        } else if(fahrenheit > 32 && fahrenheit <= 212){
                            double ebullicion = 212 - fahrenheit;
                            PieChart.Data pieChartObject = new PieChart.Data("A " + fahrenheit + " de congelacion °F ", fahrenheit);
                            pieChartObjectStatic.getData().add(pieChartObject);
                            PieChart.Data ebullicionObject = new PieChart.Data("A " + ebullicion + " de ebullicion °F", ebullicion);
                            pieChartObjectStatic.getData().add(ebullicionObject);
                        }
                    } else { usoObjectStatic.setText("Solo se permiten cantidades numericas"); }
                    }
                });
                //Text usoObjectStatic = new Text();
                usoObjectStatic.setText("Uso\n"
                    + "Se utiliza por la población para usos no científicos \ny en determinadas industrias muy "
                    + "rígidas, como la del \npetróleo. Además, se utiliza esta escala en los \ninformes "
                    + "meteorológicos y en gastronomía. "
                );
                usoObjectStatic.setFont(Font.font("Courier New", FontWeight.LIGHT, 12));
                usoObjectStatic.setFill(Color.web("#818181"));
                GridPane.setConstraints(usoObjectStatic, 0, 3, 2, 1, HPos.LEFT, VPos.CENTER);
                //PieChart pieChartObjectStatic = new PieChart(FXCollections.observableArrayList());
                pieChartObjectStatic.getData().clear();
//                pieChartObjectStatic.setStartAngle(90);
                pieChartObjectStatic.setLabelsVisible(false);
                //pieChartObjectStatic.setPrefSize(470, 360);
//                pieChartObjectStatic.setClockwise(false);
//                pieChartObjectStatic.setLabelLineLength(100);
//                pieChartObjectStatic.setPrefSize(200, 200);
//                pieChartObjectStatic.setLegendVisible(false);  
                pieChartObjectStatic.setTitle("Réaumur a Fahrenheit");
                pieChartObjectStatic.setTitleSide(Side.TOP);
                pieChartObjectStatic.setLegendSide(Side.BOTTOM);
                //PieChart.Data congelacionObjectStatic = new PieChart.Data("Estado de congelacion", 32);
                congelacionObjectStatic.setName("Limite del Estado de congelacion °F 32 (congelado)");
                congelacionObjectStatic.setPieValue(0);
                pieChartObjectStatic.getData().add(congelacionObjectStatic);
                //PieChart.Data ebullicionObjectStatic = new PieChart.Data("", 0);
                ebullicionObjectStatic.setName("Limite del Estado de ebullicion °F 212 (descongelado)");
                ebullicionObjectStatic.setPieValue(100);
                pieChartObjectStatic.getData().add(ebullicionObjectStatic);

                GridPane.setConstraints(pieChartObjectStatic, 2, 0, 1, 4, HPos.CENTER, VPos.CENTER);
                
                AnchorPane anchorPaneObject = new AnchorPane();
                //Button atrasObjectStatic = new Button("< Atras");
                //atrasObjectStatic.setFont(Font.font("Courier New", FontWeight.LIGHT, 12));
                atrasObjectStatic.setId("n-atras-center");
                AnchorPane.setLeftAnchor(atrasObjectStatic, 880.0);
                AnchorPane.setTopAnchor(atrasObjectStatic, 10.0);               
                atrasObjectStatic.setOnAction(new EventHandler<ActionEvent> () {
                    @Override public void handle(ActionEvent eventObject) {
                        INNER_GENERAL.toBack();
                        INNER_GENERAL.setVisible(false);
                        pieChartObjectStatic.getData().clear();
                    } 
                });            
                
                anchorPaneObject.getChildren().add(
                    atrasObjectStatic
                );
                gridPaneObject.getChildren().addAll(
                    textField1ObjectStatic, label1ObjectStatic, calcularObjectStatic, usoObjectStatic, pieChartObjectStatic
                );
                INNER_GENERAL.getChildren().addAll(
                        anchorPaneObject, gridPaneObject
                );
                centerObject.getChildren().add(
                    INNER_GENERAL
                );
            }
        });
        GridPane.setConstraints(reaumurFahrenheitObjectStatic, 0, 7, 1, 1, HPos.LEFT, VPos.BASELINE);

        generalGridPaneObject.getChildren().addAll(
            celsiusFahrenheitObjectStatic, fahrenheitCelsiusObjectStatic, fahrenheitKelvinObjectStatic,
            kelvinFahrenheitObjectStatic, fahrenheitRankineObjectStatic, rankineFahrenheitObjectStatic,
            fahrenheitReaumurObjectStatic, reaumurFahrenheitObjectStatic
        );
        GENERAL.getChildren().addAll(
            generalGridPaneObject, generalScrollPaneObject
        );
        centerObject.getChildren().add(
            GENERAL
        );
        
        return centerObject;
    }
}
