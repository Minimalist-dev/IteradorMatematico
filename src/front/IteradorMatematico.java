package front;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;
import show.FrontEvento;
import show.botones.Calculadora;
import show.botones.Estadistica;
import show.botones.Finanza;
import show.botones.General;
import show.botones.Personal;
import show.escuchas.Escuchar;
import show.menu.Menu;
import sql.GetAndSet;
import sql.Identificador;
import sql.consultas.IniciarSesion;
import sql.inserciones.Insertar;
import sql.inserciones.Registrarse;
import x.ficheros.Sugerencias;

/**
 * @author neury
 * Created on : Oct 7, 2019, 9:10:58 AM
 * Author     : neury
 */
public class IteradorMatematico extends Application {
    private static Group groupObjectStatic = new Group();
    public static BorderPane borderPaneObjectStatic = new BorderPane();
    public StackPane centerObject = new StackPane();
    private VBox leftVBoxObject = new VBox();//leftObject
    private VBox rightVBoxObject = new VBox();//rightObject
    private int widthSide = 250;//WIDHT_SIDE 250
    private int heightSide = 460; //HEIGHT_SIDE 460
    //Iniciar Sesion -----------------------------------------------------------
    private Button iniciarSesionFormObject = new Button();
    private Pane iniciarSesionPaneObject = new Pane();
    private Text iniciarSesionTituloObject = new Text();
    private Text iniciarSesionFraseObject = new Text();
    private Label iniciarSesionEmailObject = new Label();
    public static TextField iniciarSesionCorreoObjectStatic = new TextField();
    private Label iniciarSesionPasswordObject = new Label();
    public static PasswordField iniciarSesionPasswordObjectStatic = new PasswordField();
    private Button iniciarSesionObject = new Button();
    private Button iniciarSesionCancelarObject = new Button();
    public static Text iniciarSesionErrorObjectStatic = new Text();
    //Registrarse  -------------------------------------------------------------
    private Button registrarseFormObject = new Button();
    private Pane registrarsePaneObject = new Pane();
    private GridPane registrarseGridPaneObject = new GridPane();
    private Text registrarseTituloObject = new Text();
    private Text registrarseFraseObject = new Text();
    private Label registrarseNombreObject = new Label();
    public static TextField registrarseNombreFieldObjectStatic = new TextField();
    private Label registrarseApellidosObject = new Label();
    public static TextField registrarseApellidosFieldObjectStatic = new TextField();
    private Label registrarseEmailObject = new Label();
    public static TextField registrarseCorreoFieldObjectStatic = new TextField();
    private Label registrarsePasswordObject = new Label();
    public static PasswordField registrarsePasswordFieldObjectStatic = new PasswordField();
    private Button registrarseObject = new Button();
    private Button registrarseCancelarObject = new Button();
    public static Text registrarseErrorObjectStatic = new Text();
    //Sugerencias --------------------------------------------------------------
    private Button sugerenciasFormObject = new Button();
    private Pane sugerenciasPaneObject = new Pane();
    private GridPane sugerenciasGridPaneObject = new GridPane();
    private Text sugerenciasTituloObject = new Text();
    private Text sugerenciasFraseObject = new Text();
    public static TextField sugerenciasNombreObjectStatic = new TextField();
    public static TextField sugerenciasAsuntoObjectStatic = new TextField();
    public static TextField sugerenciasCorreoObjectStatic = new TextField();
    public static TextArea sugerenciasMensajeObjectStatic = new TextArea();
    private Button sugerenciasObject = new Button("");
    private Button sugerenciasCancelarObject = new Button();
    public static Text sugerenciasErrorObjectStatic = new Text();
    // ToggleBottom ------------------------------------------------------------
    private final ToggleGroup toggleGroupObject = new ToggleGroup();
    private ToggleButton personalObject = new ToggleButton("Personal");
    private ToggleButton finanzaObject = new ToggleButton("Finanza");
    public static ToggleButton generalObjectStatic = new ToggleButton("General");
    private ToggleButton estadisticaObject = new ToggleButton("Estadistica");
    private ToggleButton calculadoraObject = new ToggleButton("Calculadora");
    public static FrontEvento frontEventObject = new FrontEvento();
//    public static Button b  = new  Button("Confirmar Cierre");
    public void 
    init(Stage stageObject){
        HBox topObject      = addHBoxTop();
        VBox leftObject     = addVBoxLeft();
        centerObject        = addStackPane();
        VBox rightObject    = addVBoxRight();
        HBox bottomObject   = addHBoxBottom();
        
        topObject.toFront();
        leftObject.toFront();
        centerObject.toFront();
        rightObject.toFront();
        bottomObject.toFront();
        
        borderPaneObjectStatic.setTop(topObject);
        borderPaneObjectStatic.setLeft(leftObject);
        borderPaneObjectStatic.setCenter(centerObject);
        borderPaneObjectStatic.setRight(rightObject);
        borderPaneObjectStatic.setBottom(bottomObject);
        
        borderPaneObjectStatic.setPrefSize(1500, 700);
        //Scene sceneObject = new Scene(borderPaneObjectStatic);
        Scene sceneObject = new Scene(groupObjectStatic);
        //groupObjectStatic.getChildren().addAll(sanFranciscoFireworks, borderPaneObjectStatic);
//        FrontEvento frontEventObject = new FrontEvento();
        groupObjectStatic.getChildren().addAll(frontEventObject.sanFranciscoFireworks, borderPaneObjectStatic);
        stageObject.setScene(sceneObject);
//        frontEventObject.stop();
        sceneObject.getStylesheets().add(IteradorMatematico.class.getResource("css/root.css").toExternalForm());
        sceneObject.getStylesheets().add(IteradorMatematico.class.getResource("css/top.css").toExternalForm());
        sceneObject.getStylesheets().add(IteradorMatematico.class.getResource("css/left.css").toExternalForm());
        sceneObject.getStylesheets().add(IteradorMatematico.class.getResource("css/center.css").toExternalForm());
        sceneObject.getStylesheets().add(IteradorMatematico.class.getResource("css/right.css").toExternalForm());
        sceneObject.getStylesheets().add(IteradorMatematico.class.getResource("css/bottom.css").toExternalForm());
        sceneObject.getStylesheets().add(IteradorMatematico.class.getResource("css/sesion.css").toExternalForm());
        
        Animacion.borderPane(borderPaneObjectStatic);
        GetAndSet.setStageObject(stageObject);
        GetAndSet.setSceneObject(sceneObject);
        Escuchar.ventana();
        Escuchar.ecena();
        Escuchar.bottom();
        Escuchar.general();
        Escuchar.generalPane();
    }
    private HBox 
    addHBoxTop() {
        HBox hBoxObject = new HBox();

        GridPane leftGridPaneObject = new GridPane();
        leftGridPaneObject.setHgap(10);
        leftGridPaneObject.setVgap(10);
        leftGridPaneObject.setPadding(new Insets(10, 10, 10, 10));
        //leftGridPaneObject.setGridLinesVisible(true);
        Image logoObject = new Image(getClass().getResourceAsStream("img/dukeWaveRed.gif"));
        ImageView logoViewObject = new ImageView(logoObject);
        logoViewObject.setFitHeight(100);
        logoViewObject.setFitWidth(100);
        logoViewObject.setPreserveRatio(true);
        logoViewObject.setSmooth(true);
        GridPane.setConstraints(logoViewObject, 0, 0, 1, 1, HPos.LEFT, VPos.BASELINE);
        
        Text nombreObject = new Text("Itermatico");
        nombreObject.getStyleClass().add("n-nombre");
        GridPane.setConstraints(nombreObject, 1, 0, 1, 1, HPos.LEFT, VPos.BOTTOM);
        
        GridPane rightGridPaneObject = new GridPane();
        rightGridPaneObject.setHgap(10);
        rightGridPaneObject.setVgap(40);
        rightGridPaneObject.setPadding(new Insets(10, 10, 10, 10));
        rightGridPaneObject.setTranslateX(800);
        //rightGridPaneObject.setGridLinesVisible(true);
        Button minimizarObject = new Button("_");
        minimizarObject.setId("n-stageStyle");
        minimizarObject.setTranslateX(20);
        GridPane.setConstraints(minimizarObject, 1, 0, 1, 1, HPos.RIGHT, VPos.BASELINE);
        minimizarObject.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent eventObject) {
                GetAndSet.getStageObject().setIconified(true);
            }
        });
        Button closeObject = new Button("x");
        closeObject.setId("n-stageStyle");
        GridPane.setConstraints(closeObject, 2, 0, 1, 1, HPos.RIGHT, VPos.BASELINE);
        closeObject.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent eventObject) { 
                GetAndSet.getStageObject().close();
            }
        });  

        Hyperlink idiomasObject = new Hyperlink("Idiomas");
        idiomasObject.setUnderline(false);
        idiomasObject.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent eventObject) {
                Menu.idiomas();
            }
        });
        GridPane.setConstraints(idiomasObject, 0, 1, 1, 1, HPos.LEFT, VPos.BASELINE);
        
        Hyperlink preferenciasObject = new Hyperlink("Preferencias");
        preferenciasObject.setUnderline(false);
        preferenciasObject.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent eventObject) {
                Menu.configuracion();
            }
        });
        GridPane.setConstraints(preferenciasObject, 1, 1, 1, 1, HPos.LEFT, VPos.BASELINE);
        
        Hyperlink ayudaObject = new Hyperlink("Ayuda");
        ayudaObject.setUnderline(false);
        ayudaObject.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent eventObject) {
                Menu.ayuda();
            }
        });
        GridPane.setConstraints(ayudaObject, 2, 1, 1, 1, HPos.LEFT, VPos.BASELINE);
        
        leftGridPaneObject.getChildren().addAll(
            logoViewObject, nombreObject
        );
        rightGridPaneObject.getChildren().addAll(
            minimizarObject, closeObject, idiomasObject, preferenciasObject, ayudaObject
        );
        hBoxObject.getChildren().addAll(
            leftGridPaneObject, rightGridPaneObject
        );
        
        return hBoxObject;
    } 
    private VBox
    addVBoxLeft() {
        leftVBoxObject.setPrefSize(widthSide, heightSide);
        leftVBoxObject.setAlignment(Pos.CENTER);
        //leftVBoxObject.setStyle("-fx-border-color: black;");//leftVBoxObject.getChildren().addAll();
//        Animacion.animateSide(leftVBoxObject);
        return leftVBoxObject;
    }
    public StackPane 
    addStackPane() {
        Pane centerPaneObject = new Pane();
//        centerPaneObject.toFront();
        GridPane centerGridPaneObject = new GridPane();
        centerGridPaneObject.setHgap(10);
        centerGridPaneObject.setVgap(10);
        centerGridPaneObject.setPadding(new Insets(150, 10, 10, 100));
        //centerGridPaneObject.setGridLinesVisible(true);
        Text preguntasObject = new Text();
        preguntasObject.setText("¿No tienes tiempo para aprender sobre el tema?\n¿No se te dan bien las Matematicas y las "
            + "Finanzas?\n¿Quisas no te gustan pero quieres controlar tu ingresos, finanzas y mas?");
        preguntasObject.getStyleClass().add("n-preguntas");
        GridPane.setConstraints(preguntasObject, 0, 0, 3, 1);
        //----------------------------------------------------------------------
        GetAndSet.setCenterObject(centerObject);
        //----------------------------------------------------------------------
        Text respuestaObject = new Text();
        respuestaObject.setText("Hecha un vistaso y veras que todo\nesta premarado para ti.");
        respuestaObject.getStyleClass().add("n-respuesta");
        GridPane.setConstraints(respuestaObject, 0, 1, 3, 1);
        //Button iniciarSesionFormObject = new Button("");
        iniciarSesionFormObject.setText("Iniciar Sesion");
        iniciarSesionFormObject.setId("n-center-button");
        GridPane.setConstraints(iniciarSesionFormObject, 0, 2);
        iniciarSesionFormObject.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent eventObject) {
                iniciarSesionFormObject.setDisable(true);
                iniciarSesionPaneObject.setVisible(true);
                registrarseFormObject.setDisable(false);
                registrarsePaneObject.setVisible(false);
                sugerenciasFormObject.setDisable(false);
                sugerenciasPaneObject.setVisible(false);
                leftVBoxObject.setPrefSize(500, heightSide);
                Animacion.entradaLateral(leftVBoxObject);
                Animacion.abrirLeft(centerObject);
                rightVBoxObject.setPrefSize(30, heightSide);
                iniciarSesionErrorObjectStatic.setText("");
                registrarseErrorObjectStatic.setText("");
                sugerenciasErrorObjectStatic.setText("");
                //Pane iniciarSesionPaneObject = new Pane();
                GridPane iniciarSesionGridPaneObject = new GridPane();
                iniciarSesionGridPaneObject.setHgap(10);
                iniciarSesionGridPaneObject.setVgap(10);
                iniciarSesionGridPaneObject.setPadding(new Insets(0, 0, 0, 45));
                iniciarSesionGridPaneObject.setManaged(true);
                //gridPaneObject.setGridLinesVisible(true);
                //Text iniciarSesionTituloObject = new Text("¡Bienvenido de nuevo!");
                iniciarSesionTituloObject.setText("¡Bienvenido de nuevo!");
                iniciarSesionTituloObject.setId("n-bienvenido");
                GridPane.setConstraints(iniciarSesionTituloObject, 0, 0, 2, 1, HPos.CENTER, VPos.BASELINE);
                //Text iniciarSesionFraseObject = new Text("¡Estamos muy entusiasmados por verte de nuevo!");
                iniciarSesionFraseObject.setText("¡Estamos muy entusiasmados por verte de nuevo!");
                iniciarSesionFraseObject.setId("n-frase-de-bienvenida");
                GridPane.setConstraints(iniciarSesionFraseObject, 0, 1, 2, 1, HPos.CENTER, VPos.BASELINE);
                //Label iniciarSesionEmailObject = new Label("Correo");
                iniciarSesionEmailObject.setText("Correo");
                iniciarSesionEmailObject.setId("n-label-form");
                GridPane.setConstraints(iniciarSesionEmailObject, 0, 3);
                //TextField iniciarSesionCorreoObjectStatic = new TextField();
                iniciarSesionCorreoObjectStatic.setPromptText("Introducir Correo");
                iniciarSesionCorreoObjectStatic.setPrefSize(200, 10);
                iniciarSesionCorreoObjectStatic.setId("n-field-form");
                GridPane.setConstraints(iniciarSesionCorreoObjectStatic, 0, 4);
                //Label iniciarSesionPasswordObject = new Label("Contraseña");
                iniciarSesionPasswordObject.setText("Contraseña");
                iniciarSesionPasswordObject.setId("n-label-form");
                GridPane.setConstraints(iniciarSesionPasswordObject, 1, 3);
                //PasswordField iniciarSesionasswordFieldObject = new PasswordField();
                iniciarSesionPasswordObjectStatic.setPromptText("Introducir Contraseña");
                iniciarSesionPasswordObjectStatic.setPrefSize(200, 10);
                iniciarSesionPasswordObjectStatic.setId("n-field-form");
                GridPane.setConstraints(iniciarSesionPasswordObjectStatic, 1, 4);
                //Button iniciarSesionObject = new Button("");
                iniciarSesionObject.setText("Iniciar Sesion");
                iniciarSesionObject.setPrefSize(410, 10);
                iniciarSesionObject.setId("n-aceptar-form");
                GridPane.setConstraints(iniciarSesionObject, 0, 6, 2, 1);
                iniciarSesionObject.setOnAction(new EventHandler<ActionEvent>() {
                    @Override public void handle(ActionEvent eventObject) {
                        //Normal -----------------------------------------------
                        //IniciarSesion.iniciarSesion();
                        //Preparada --------------------------------------------
                        IniciarSesion.iniciarSesion();
                        frontEventObject.play();
//                        iniciarSesionFormObject.setDisable(false);
//                        iniciarSesionPaneObject.setVisible(false);
//                        leftVBoxObject.setPrefSize(widthSide, heightSide); 
//                        rightVBoxObject.setPrefSize(widthSide, heightSide);
                    }    
                });
                //Button iniciarSesionCancelarObject = new Button("");
                iniciarSesionCancelarObject.setText("Cancelar");
                iniciarSesionCancelarObject.setPrefSize(410, 10);
                iniciarSesionCancelarObject.setId("n-cancelar-form");
                GridPane.setConstraints(iniciarSesionCancelarObject, 0, 7, 2, 1);
                iniciarSesionCancelarObject.setOnAction(new EventHandler<ActionEvent>() {
                    @Override public void handle(ActionEvent eventObject) {
                        iniciarSesionFormObject.setDisable(false);
                        iniciarSesionPaneObject.setVisible(false);
                        leftVBoxObject.setPrefSize(widthSide, heightSide); 
////                        Animacion.salidaLateral(leftVBoxObject);
//                        Animacion.salidaLateral(iniciarSesionPaneObject);
                        Animacion.cancelarLeft(centerObject);
                        rightVBoxObject.setPrefSize(widthSide, heightSide);
                        iniciarSesionErrorObjectStatic.setText("");
                    }
                });
                iniciarSesionErrorObjectStatic.setId("n-error-form");
                GridPane.setConstraints(iniciarSesionErrorObjectStatic, 0, 8, 2, 1, HPos.LEFT, VPos.BASELINE);
                
                iniciarSesionGridPaneObject.getChildren().addAll(
                    iniciarSesionTituloObject, iniciarSesionFraseObject, iniciarSesionEmailObject, 
                    iniciarSesionCorreoObjectStatic, iniciarSesionPasswordObject, iniciarSesionPasswordObjectStatic, 
                    iniciarSesionObject, iniciarSesionCancelarObject, iniciarSesionErrorObjectStatic
                );
                iniciarSesionPaneObject.getChildren().add(
                    iniciarSesionGridPaneObject 
                );
                leftVBoxObject.getChildren().add(
                    iniciarSesionPaneObject
                );
            }
        });
        //Button registrarseFormObject = new Button("Registrarse");
        registrarseFormObject.setText("Registrarse");
        registrarseFormObject.setId("n-center-button");
        GridPane.setConstraints(registrarseFormObject, 1, 2);
        registrarseFormObject.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent eventObject) {
                registrarseFormObject.setDisable(true);
                registrarsePaneObject.setVisible(true);
                iniciarSesionFormObject.setDisable(false);
                iniciarSesionPaneObject.setVisible(false);
                sugerenciasFormObject.setDisable(false);
                sugerenciasPaneObject.setVisible(false);
                sugerenciasGridPaneObject.setManaged(false);
                leftVBoxObject.setPrefSize(30, heightSide);
                rightVBoxObject.setPrefSize(500, heightSide);
                Animacion.entradaLateral(rightVBoxObject);
                Animacion.abrirRight(centerObject);
                iniciarSesionErrorObjectStatic.setText("");
                registrarseErrorObjectStatic.setText("");
                sugerenciasErrorObjectStatic.setText("");
                //Pane registrarsePaneObject = new Pane();
                //GridPane registrarseGridPaneObject = new GridPane();
                registrarseGridPaneObject.setHgap(10);
                registrarseGridPaneObject.setVgap(10);
                registrarseGridPaneObject.setPadding(new Insets(0, 0, 0, 45));
                registrarseGridPaneObject.setManaged(true);
                //gridPaneObject.setGridLinesVisible(true);
                //Text registrarseTituloObject = new Text("");
                registrarseTituloObject.setText("¡Bienvenido a Itermatico!");
                registrarseTituloObject.setId("n-bienvenido");
                GridPane.setConstraints(registrarseTituloObject, 0, 0, 2, 1, HPos.CENTER, VPos.BASELINE);
                //Text registrarseFraseObject = new Text("");
                registrarseFraseObject.setText("¡Estamos muy entusiasmados de que te unas!");
                registrarseFraseObject.setId("n-frase-de-bienvenida");
                GridPane.setConstraints(registrarseFraseObject, 0, 1, 2, 1, HPos.CENTER, VPos.BASELINE);
                //Label registrarseNombreObject = new Label("");
                registrarseNombreObject.setText("Nombre");
                registrarseNombreObject.setId("n-label-form");
                GridPane.setConstraints(registrarseNombreObject, 0, 3);
                //TextField registrarseNombreFieldObjectStatic = new TextField();
                registrarseNombreFieldObjectStatic.setPromptText("Introducir nombre");
                registrarseNombreFieldObjectStatic.setPrefSize(200, 10);
                registrarseNombreFieldObjectStatic.setId("n-field-form");
                GridPane.setConstraints(registrarseNombreFieldObjectStatic, 0, 4);
                //Label registrarseApellidosObject = new Label("");
                registrarseApellidosObject.setText("Apellidos");
                registrarseApellidosObject.setId("n-label-form");
                GridPane.setConstraints(registrarseApellidosObject, 1, 3);
                //TextField registrarseApellidosFieldObjectStatic = new TextField();
                registrarseApellidosFieldObjectStatic.setPromptText("Introducir Apellidos");
                registrarseApellidosFieldObjectStatic.setPrefSize(200, 10);
                registrarseApellidosFieldObjectStatic.setId("n-field-form");
                GridPane.setConstraints(registrarseApellidosFieldObjectStatic, 1, 4);
                //Label registrarseEmailObject = new Label("");
                registrarseEmailObject.setText("Correo");
                registrarseEmailObject.setId("n-label-form");
                GridPane.setConstraints(registrarseEmailObject, 0, 5);
                //TextField registrarseCorreoFieldObjectStatic = new TextField();
                registrarseCorreoFieldObjectStatic.setPromptText("Introducir Correo");
                registrarseCorreoFieldObjectStatic.setPrefSize(200, 10);
                registrarseCorreoFieldObjectStatic.setId("n-field-form");
                GridPane.setConstraints(registrarseCorreoFieldObjectStatic, 0, 6);
                //Label registrarsePasswordObject = new Label("");
                registrarsePasswordObject.setText("Contraseña");
                registrarsePasswordObject.setId("n-label-form");
                GridPane.setConstraints(registrarsePasswordObject, 1, 5);
                //PasswordField passwordFieldObject = new PasswordField();
                registrarsePasswordFieldObjectStatic.setPromptText("Introducir Contraseña");
                registrarsePasswordFieldObjectStatic.setPrefSize(200, 10);
                registrarsePasswordFieldObjectStatic.setId("n-field-form");
                GridPane.setConstraints(registrarsePasswordFieldObjectStatic, 1, 6);
                //Button registrarseObject = new Button("Registrarse");
                registrarseObject.setText("Registrarse");
                registrarseObject.setPrefSize(410, 10);
                registrarseObject.setId("n-aceptar-form");
                GridPane.setConstraints(registrarseObject, 0, 8, 2, 1);
                registrarseObject.setOnAction(new EventHandler<ActionEvent>() {
                    @Override public void handle(ActionEvent eventObject) {
                        //Normal -----------------------------------------------
//                        Registrarse.registrarse();
                        //Preparada --------------------------------------------
                        Registrarse.registrarse();
//                        registrarseFormObject.setDisable(false);
//                        registrarsePaneObject.setVisible(false);
//                        registrarseGridPaneObject.setManaged(false);
//                        leftVBoxObject.setPrefSize(widthSide, heightSide);  
//                        rightVBoxObject.setPrefSize(widthSide, heightSide);
                    }
                });
                //Button registrarseCancelarObject = new Button("Cancelar");
                registrarseCancelarObject.setText("Cancelar");
                registrarseCancelarObject.setPrefSize(410, 10);
                registrarseCancelarObject.setId("n-cancelar-form");
                GridPane.setConstraints(registrarseCancelarObject, 0, 9, 2, 1);
                registrarseCancelarObject.setOnAction(new EventHandler<ActionEvent>() {
                    @Override public void handle(ActionEvent eventObject) {
                        registrarseFormObject.setDisable(false);
                        registrarsePaneObject.setVisible(false);
                        registrarseGridPaneObject.setManaged(false);
                        leftVBoxObject.setPrefSize(widthSide, heightSide);  
                        rightVBoxObject.setPrefSize(widthSide, heightSide);
                        Animacion.cancelarRight(centerObject);
                        registrarseErrorObjectStatic.setText("");
                    }
                });
                registrarseErrorObjectStatic.setId("n-error-form");
                GridPane.setConstraints(registrarseErrorObjectStatic, 0, 10, 2, 1);
                registrarseGridPaneObject.getChildren().addAll(
                    registrarseTituloObject, registrarseFraseObject, registrarseNombreObject, registrarseNombreFieldObjectStatic, 
                    registrarseApellidosObject, registrarseApellidosFieldObjectStatic, registrarseEmailObject, 
                    registrarseCorreoFieldObjectStatic, registrarsePasswordObject, registrarsePasswordFieldObjectStatic,
                    registrarseObject, registrarseCancelarObject, registrarseErrorObjectStatic
                );
                registrarsePaneObject.getChildren().add(
                       registrarseGridPaneObject 
                );
                rightVBoxObject.getChildren().add(
                    registrarsePaneObject
                );
            }
        });
        //Button sugerenciasFormObject = new Button("Sugerencias");
        sugerenciasFormObject.setText("Sugerencias");
        sugerenciasFormObject.setId("n-center-button");
        GridPane.setConstraints(sugerenciasFormObject, 2, 2);
        sugerenciasFormObject.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent eventObject) {
                sugerenciasFormObject.setDisable(true);
                sugerenciasPaneObject.setVisible(true);
                iniciarSesionFormObject.setDisable(false);
                iniciarSesionPaneObject.setVisible(false);
                registrarseFormObject.setDisable(false);
                registrarsePaneObject.setVisible(false);
                registrarseGridPaneObject.setManaged(false);
                leftVBoxObject.setPrefSize(30, heightSide);
                rightVBoxObject.setPrefSize(500, heightSide);
                Animacion.entradaLateral(rightVBoxObject);
                Animacion.abrirRight(centerObject);
                iniciarSesionErrorObjectStatic.setText("");
                registrarseErrorObjectStatic.setText("");
                sugerenciasErrorObjectStatic.setText("");
                //Pane sugerenciasPaneObject = new Pane();
                //GridPane sugerenciasGridPaneObject = new GridPane();
                sugerenciasGridPaneObject.setHgap(10);
                sugerenciasGridPaneObject.setVgap(10);
                sugerenciasGridPaneObject.setPadding(new Insets(0, 0, 0, 45));
                sugerenciasGridPaneObject.setManaged(true);
                //sugerenciasGridPaneObject.setGridLinesVisible(true);
                //Text sugerenciasTituloObject = new Text("");
                sugerenciasTituloObject.setText("¡Suregencia!");
                sugerenciasTituloObject.setId("n-bienvenido");
                GridPane.setConstraints(sugerenciasTituloObject, 0, 0, 2, 1, HPos.CENTER, VPos.BASELINE);
                //Text sugerenciasFraseObject = new Text("");
                sugerenciasFraseObject.setText("¡Dejanos tu sugerencia para seguir aportando valor!");
                sugerenciasFraseObject.setId("n-frase-de-bienvenida");
                GridPane.setConstraints(sugerenciasFraseObject, 0, 1, 2, 1, HPos.CENTER, VPos.BASELINE);
                //TextField sugerenciasNombreObjectStatic = new TextField();
                sugerenciasNombreObjectStatic.setPromptText("Nombre");
                sugerenciasNombreObjectStatic.setPrefSize(200, 10);
                sugerenciasNombreObjectStatic.setId("n-field-form");
                GridPane.setConstraints(sugerenciasNombreObjectStatic, 0, 3);
                //TextField sugerenciasAsuntoObjectStatic = new TextField();
                sugerenciasAsuntoObjectStatic.setPromptText("Asunto");
                sugerenciasAsuntoObjectStatic.setPrefSize(0, 10);
                sugerenciasAsuntoObjectStatic.setId("n-field-form");
                GridPane.setConstraints(sugerenciasAsuntoObjectStatic, 1, 3);
                //TextField sugerenciasCorreoObjectStatic = new TextField();
                sugerenciasCorreoObjectStatic.setPromptText("Correo");
                sugerenciasCorreoObjectStatic.setPrefSize(200, 10);
                sugerenciasCorreoObjectStatic.setId("n-field-form");
                GridPane.setConstraints(sugerenciasCorreoObjectStatic, 0, 4, 2, 1);
                //sugerenciasMensajeObjectStatic = new TextArea();
                sugerenciasMensajeObjectStatic.setPromptText("Mensaje...");
                sugerenciasMensajeObjectStatic.setPrefSize(0, 180);
                sugerenciasMensajeObjectStatic.setId("n-text-area-form");
                GridPane.setConstraints(sugerenciasMensajeObjectStatic, 0, 5, 2, 1);
                //Button sugerenciasObject = new Button("");
                sugerenciasObject.setText("Enviar");
                sugerenciasObject.setPrefSize(410, 10);
                sugerenciasObject.setId("n-aceptar-form");
                GridPane.setConstraints(sugerenciasObject, 0, 7, 2, 1);
                sugerenciasObject.setOnAction(new EventHandler<ActionEvent>() {
                    @Override public void handle(ActionEvent eventObject) {
                        //Normail ----------------------------------------------
                        //Sugerencias.sugerencias();
                        //Preparada --------------------------------------------
                        Insertar.sugerencias();
                        sugerenciasNombreObjectStatic.setText("");
                        sugerenciasAsuntoObjectStatic.setText("");
                        sugerenciasCorreoObjectStatic.setText("");
                        sugerenciasMensajeObjectStatic.setText("");
                    }
                });
                //Button sugerenciasCancelarObject = new Button("");
                sugerenciasCancelarObject.setText("Cancelar");
                sugerenciasCancelarObject.setPrefSize(410, 10);
                sugerenciasCancelarObject.setId("n-cancelar-form");
                GridPane.setConstraints(sugerenciasCancelarObject, 0, 8, 2, 1);
                sugerenciasCancelarObject.setOnAction(new EventHandler<ActionEvent>() {
                    @Override public void handle(ActionEvent eventObject) {
                        sugerenciasFormObject.setDisable(false);
                        sugerenciasPaneObject.setVisible(false);
                        sugerenciasGridPaneObject.setManaged(false);
                        leftVBoxObject.setPrefSize(widthSide, heightSide);  
                        rightVBoxObject.setPrefSize(widthSide, heightSide); 
                        Animacion.cancelarRight(centerObject);
                        sugerenciasErrorObjectStatic.setText("");
                    }
                });
                sugerenciasErrorObjectStatic.setId("n-error-form");
                GridPane.setConstraints(sugerenciasErrorObjectStatic, 0, 9, 2, 1);
                sugerenciasGridPaneObject.getChildren().addAll(
                    sugerenciasTituloObject, sugerenciasFraseObject, sugerenciasNombreObjectStatic, 
                    sugerenciasAsuntoObjectStatic, sugerenciasCorreoObjectStatic, sugerenciasMensajeObjectStatic,
                    sugerenciasObject, sugerenciasCancelarObject, sugerenciasErrorObjectStatic
                );
                sugerenciasPaneObject.getChildren().add(
                    sugerenciasGridPaneObject 
                );
                rightVBoxObject.getChildren().add(
                    sugerenciasPaneObject
                );
            }
        });
       
        centerGridPaneObject.getChildren().addAll(
            preguntasObject, respuestaObject, iniciarSesionFormObject, registrarseFormObject, sugerenciasFormObject
        );
        centerPaneObject.getChildren().addAll(
            centerGridPaneObject
        );
        centerObject.getChildren().add(
            centerPaneObject 
        );
        
        return centerObject;
    }
    private VBox
    addVBoxRight() {
        rightVBoxObject.setPrefSize(250, 0);
        rightVBoxObject.setAlignment(Pos.CENTER);
        //rightVBoxObject.setStyle("-fx-border-color: black;");//rightVBoxObject.getChildren().addAll();
        return rightVBoxObject;
    }
    private HBox 
    addHBoxBottom() {
        HBox hBoxObject = new HBox();
        hBoxObject.setSpacing(4);
        hBoxObject.setPrefHeight(120);
        hBoxObject.setAlignment(Pos.CENTER);hBoxObject.toFront();
        //final ToggleGroup toggleGroupObject = new ToggleGroup();
        //ToggleButton personalObject = new ToggleButton("Personal");
        Image imagenPersonalObject = new Image(getClass().getResourceAsStream("img/personal.png"));
        ImageView imgViewPersonalObject = new ImageView(imagenPersonalObject);
        imgViewPersonalObject.setFitWidth(50);
        imgViewPersonalObject.setFitHeight(50);
        imgViewPersonalObject.setPreserveRatio(true);
        imgViewPersonalObject.setSmooth(true);
        personalObject.setToggleGroup(toggleGroupObject);
        personalObject.setPrefSize(290, 100);
        personalObject.setGraphic(imgViewPersonalObject);
        personalObject.setContentDisplay(ContentDisplay.TOP);
        personalObject.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent eventObject) {
                if(!personalObject.isSelected()) {
                    personalObject.setContentDisplay(ContentDisplay.TOP);
                    personalObject.setText("Personal");
                    borderPaneObjectStatic.setCenter(centerObject);
                } else {
                    personalObject.setText("Salir");
                    finanzaObject.setText("Finanza");
                    generalObjectStatic.setText("General");
                    estadisticaObject.setText("Estadistica");
                    calculadoraObject.setText("Calculadora");
                    personalObject.getStyleClass().add("n-selected");
                    personalObject.setContentDisplay(ContentDisplay.TEXT_ONLY);
                    finanzaObject.setContentDisplay(ContentDisplay.TOP);
                    generalObjectStatic.setContentDisplay(ContentDisplay.TOP);
                    estadisticaObject.setContentDisplay(ContentDisplay.TOP);
                    calculadoraObject.setContentDisplay(ContentDisplay.TOP);
                    Personal eventoObject = new Personal(); borderPaneObjectStatic.setCenter(eventoObject.personalEvento());
                }
            }
        });
        personalObject.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent eventObject) {
                personalObject.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
            }
        });
        personalObject.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent eventObject) {
                if(personalObject.isSelected()) { personalObject.setContentDisplay(ContentDisplay.TEXT_ONLY); } 
                else { personalObject.setContentDisplay(ContentDisplay.TOP); }
            }
        }); 
        //ToggleButton finanzaObject = new ToggleButton("Finanza");
        Image imagenFinanzaObject = new Image(getClass().getResourceAsStream("img/finanza.png"));
        ImageView imgViewFinanzaObject = new ImageView(imagenFinanzaObject);
        imgViewFinanzaObject.setFitWidth(50);
        imgViewFinanzaObject.setFitHeight(50);
        imgViewFinanzaObject.setPreserveRatio(true);
        imgViewFinanzaObject.setSmooth(true);
        finanzaObject.setToggleGroup(toggleGroupObject);
        finanzaObject.setPrefSize(290, 100);
        finanzaObject.setGraphic(imgViewFinanzaObject);
        finanzaObject.setContentDisplay(ContentDisplay.TOP);
        finanzaObject.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent eventObject) {
                if(!finanzaObject.isSelected()) {
                    finanzaObject.setContentDisplay(ContentDisplay.TOP);
                    finanzaObject.setText("Finanza");
                    borderPaneObjectStatic.setCenter(centerObject);
                } else {
                    personalObject.setText("Personal");
                    finanzaObject.setText("Salir");
                    generalObjectStatic.setText("General");
                    estadisticaObject.setText("Estadistica");
                    calculadoraObject.setText("Calculadora");
                    finanzaObject.getStyleClass().add("n-selected");
                    personalObject.setContentDisplay(ContentDisplay.TOP);
                    finanzaObject.setContentDisplay(ContentDisplay.TEXT_ONLY);
                    generalObjectStatic.setContentDisplay(ContentDisplay.TOP);
                    estadisticaObject.setContentDisplay(ContentDisplay.TOP);
                    calculadoraObject.setContentDisplay(ContentDisplay.TOP);
                    Finanza eventoObject = new Finanza(); borderPaneObjectStatic.setCenter(eventoObject.finanzaEvento());  
                }
            }
        });
        finanzaObject.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent eventObject) {
                finanzaObject.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
            }
        });
        finanzaObject.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent eventObject) {
                if(finanzaObject.isSelected()) { finanzaObject.setContentDisplay(ContentDisplay.TEXT_ONLY); } 
                else { finanzaObject.setContentDisplay(ContentDisplay.TOP); }
            }
        }); 
        //ToggleButton generalObjectStatic = new ToggleButton("General");
        Image imagenGeneralObject = new Image(getClass().getResourceAsStream("img/general.png"));
        ImageView imgViewGeneralObject = new ImageView(imagenGeneralObject);
        imgViewGeneralObject.setFitWidth(50);
        imgViewGeneralObject.setFitHeight(50);
        imgViewGeneralObject.setPreserveRatio(true);
        imgViewGeneralObject.setSmooth(true);
        generalObjectStatic.setToggleGroup(toggleGroupObject);
        generalObjectStatic.setPrefSize(290, 100);
        generalObjectStatic.setGraphic(imgViewGeneralObject);
        generalObjectStatic.setContentDisplay(ContentDisplay.TOP);
        generalObjectStatic.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent eventObject) {
                if(!generalObjectStatic.isSelected()) {
                    generalObjectStatic.setContentDisplay(ContentDisplay.TOP);
                    generalObjectStatic.setText("General");
                    borderPaneObjectStatic.setCenter(centerObject);
                } else {
                    personalObject.setText("Personal");
                    finanzaObject.setText("Finanza");
                    generalObjectStatic.setText("Salir");
                    estadisticaObject.setText("Estadistica");
                    calculadoraObject.setText("Calculadora");
                    generalObjectStatic.getStyleClass().add("n-selected");
                    personalObject.setContentDisplay(ContentDisplay.TOP);
                    finanzaObject.setContentDisplay(ContentDisplay.TOP);
                    generalObjectStatic.setContentDisplay(ContentDisplay.TEXT_ONLY);
                    estadisticaObject.setContentDisplay(ContentDisplay.TOP);
                    calculadoraObject.setContentDisplay(ContentDisplay.TOP);
                    General eventoObject = new General(); borderPaneObjectStatic.setCenter(eventoObject.generalEvento()); 
                }
            }
        });
        generalObjectStatic.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent eventObject) {
                generalObjectStatic.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
            }
        });
        generalObjectStatic.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent eventObject) {
                if(generalObjectStatic.isSelected()) { generalObjectStatic.setContentDisplay(ContentDisplay.TEXT_ONLY); } 
                else { generalObjectStatic.setContentDisplay(ContentDisplay.TOP); }
            }
        }); 
        //ToggleButton estadisticaObject = new ToggleButton("Estadistica");
        Image imagenEstadisticaObject = new Image(getClass().getResourceAsStream("img/estadistica.png"));
        ImageView imgViewEstadisticaObject = new ImageView(imagenEstadisticaObject);
        imgViewEstadisticaObject.setFitWidth(50);
        imgViewEstadisticaObject.setFitHeight(50);
        imgViewEstadisticaObject.setPreserveRatio(true);
        imgViewEstadisticaObject.setSmooth(true);
        estadisticaObject.setToggleGroup(toggleGroupObject);
        estadisticaObject.setPrefSize(290, 100);
        estadisticaObject.setGraphic(imgViewEstadisticaObject);
        estadisticaObject.setContentDisplay(ContentDisplay.TOP);
        estadisticaObject.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent eventObject) {
                if(!estadisticaObject.isSelected()) {
                    estadisticaObject.setContentDisplay(ContentDisplay.TOP);
                    estadisticaObject.setText("Estadistica");
                    borderPaneObjectStatic.setCenter(centerObject);
                } else {
                    personalObject.setText("Personal");
                    finanzaObject.setText("Finanza");
                    generalObjectStatic.setText("General");
                    estadisticaObject.setText("Salir");
                    calculadoraObject.setText("Calculadora");
                    estadisticaObject.getStyleClass().add("n-selected");
                    personalObject.setContentDisplay(ContentDisplay.TOP);
                    finanzaObject.setContentDisplay(ContentDisplay.TOP);
                    generalObjectStatic.setContentDisplay(ContentDisplay.TOP);
                    estadisticaObject.setContentDisplay(ContentDisplay.TEXT_ONLY);
                    calculadoraObject.setContentDisplay(ContentDisplay.TOP);
                    Estadistica eventoObject = new Estadistica(); borderPaneObjectStatic.setCenter(eventoObject.estadisticaEvento());   
                }
            }
        });
        estadisticaObject.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent eventObject) {
                estadisticaObject.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
            }
        });
        estadisticaObject.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent eventObject) {
                if(estadisticaObject.isSelected()) { estadisticaObject.setContentDisplay(ContentDisplay.TEXT_ONLY); } 
                else { estadisticaObject.setContentDisplay(ContentDisplay.TOP); }
            }
        });
        //ToggleButton calculadoraObject = new ToggleButton("Calculadora");
        Image imagenCalculadoraObject = new Image(getClass().getResourceAsStream("img/calculadora.png"));
        ImageView imgViewCalculadoraObject = new ImageView(imagenCalculadoraObject);
        imgViewCalculadoraObject.setFitWidth(50);
        imgViewCalculadoraObject.setFitHeight(50);
        imgViewCalculadoraObject.setPreserveRatio(true);
        imgViewCalculadoraObject.setSmooth(true);
        calculadoraObject.setToggleGroup(toggleGroupObject);
        calculadoraObject.setPrefSize(290, 100);
        calculadoraObject.setGraphic(imgViewCalculadoraObject);
        calculadoraObject.setContentDisplay(ContentDisplay.TOP);
        calculadoraObject.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent eventObject) {
                if(!calculadoraObject.isSelected()) {
                    calculadoraObject.setContentDisplay(ContentDisplay.TOP);
                    calculadoraObject.setText("Calculadora");
                    borderPaneObjectStatic.setCenter(centerObject);
                } else {
                    personalObject.setText("Personal");
                    finanzaObject.setText("Finanza");
                    generalObjectStatic.setText("General");
                    estadisticaObject.setText("Estadistica");
                    calculadoraObject.setText("Salir");
                    calculadoraObject.getStyleClass().add("n-selected");
                    personalObject.setContentDisplay(ContentDisplay.TOP);
                    finanzaObject.setContentDisplay(ContentDisplay.TOP);
                    generalObjectStatic.setContentDisplay(ContentDisplay.TOP);
                    estadisticaObject.setContentDisplay(ContentDisplay.TOP);
                    calculadoraObject.setContentDisplay(ContentDisplay.TEXT_ONLY);
                    Calculadora eventoObject = new Calculadora(); borderPaneObjectStatic.setCenter(eventoObject.calculadoraEvento());   
                }
            }
        });
        calculadoraObject.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent eventObject) {
                calculadoraObject.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
            }
        });
        calculadoraObject.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent eventObject) {
                if(calculadoraObject.isSelected()) { calculadoraObject.setContentDisplay(ContentDisplay.TEXT_ONLY); } 
                else { calculadoraObject.setContentDisplay(ContentDisplay.TOP); }
            }
        });
        
        hBoxObject.getChildren().addAll(
            personalObject, finanzaObject, generalObjectStatic, estadisticaObject, calculadoraObject
        );

        return hBoxObject;
    }
    @Override public void 
    start(Stage stageObject) throws Exception {
        init(stageObject);
        stageObject.getIcons().add(new Image(getClass().getResourceAsStream("img/dukeWaveRed.gif")));
        //stageObject.initStyle(StageStyle.TRANSPARENT);
        stageObject.show();
    }
}
