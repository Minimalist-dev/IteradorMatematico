package show;

import sql.actualizaciones.EditarPerfil;
import front.IteradorMatematico;
import java.util.Optional;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Point3D;
import javafx.geometry.Side;
import javafx.geometry.VPos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.StageStyle;
import show.escuchas.Escuchar;
import sql.GetAndSet;
import sql.consultas.Consultar;
import sql.eliminaciones.Eliminar;
import sql.inserciones.Insertar;

public class Sesion extends IteradorMatematico {
    public static ImageView fotoObjectStatic = new ImageView();
    //Editar Perfil ------------------------------------------------------------
    public static TextField editarNombreObjectStatic   = new TextField();
    public static TextField editarApellidoObjectStatic = new TextField();
    public static TextField editarCorreoObjectStatic   = new TextField();
    public static PasswordField editarPasswordObjectStatic = new PasswordField();
    public static PasswordField editarPasswordConfirmObjectStatic = new PasswordField();
    //TableView ----------------------------------------------------------------
    public static final TableView<ConstructorDeDatos> TABLE_VIEW = new TableView<>();
    public static ObservableList<ConstructorDeDatos> observableListStaticType = FXCollections.observableArrayList();
    public static TextField campoDeFilaObejctStatic  = new TextField();
    //Otros --------------------------------------------------------------------
    public static FrontEvento frontEventObject2 = new FrontEvento();
    public static Button editarImagenObject;
//    public static ImageView fotoObjectStatic = new ImageView();
    public StackPane 
    sesion() {
        Pane cuentaPaneObject = new Pane();
        cuentaPaneObject.setStyle(""
            + "-fx-background-color: transparent; "
            + "-fx-background-radius: 40px; "
            + "-fx-border-radius: 40px;"
        );
        
        TabPane tabPaneObject = new TabPane();
        tabPaneObject.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);
        tabPaneObject.setRotationAxis(Point3D.ZERO);
        tabPaneObject.setPrefSize(970, 460);
        tabPaneObject.setSide(Side.BOTTOM);  
        tabPaneObject.setTabMinWidth(250);
        //SQL ------------------------------------------------------------------
            //Normal -----------------------------------------------------------
            //Perfil.perfilConsulta();
            //Preparado --------------------------------------------------------
            Consultar.perfil();
        //SQL ------------------------------------------------------------------
        Tab perfilObject = new Tab();
        perfilObject.setText("Perfil");
        perfilObject.setContent(perfil());
        perfilObject.setId("n-perfil-tab");
        
        Tab editarPerfilObject = new Tab();
        editarPerfilObject.setText("EditarPerfil");
        editarPerfilObject.setContent(editarPerfil());
        editarPerfilObject.setId("n-perfil-tab");
       
        tabPaneObject.getTabs().addAll(
            perfilObject, editarPerfilObject
        );
        cuentaPaneObject.getChildren().addAll(
            tabPaneObject
        );
        centerObject.getChildren().add(
            cuentaPaneObject  
        );
        return centerObject;
    }
    public Pane 
    perfil() {
        BorderPane perfilBorderPaneObject = new BorderPane();
        perfilBorderPaneObject.setPadding(new Insets(20, 0, 20, 20));
//        perfilBorderPaneObject.setStyle("-fx-border-color: black;");
        GridPane gridPaneObject = new GridPane();
        //SQL ------------------------------------------------------------------
//        Perfil.perfilConsulta();
        //SQL ------------------------------------------------------------------
        perfilBorderPaneObject.setTop(null);
        perfilBorderPaneObject.setLeft(gridPaneObject);
        perfilBorderPaneObject.setCenter(null);
        perfilBorderPaneObject.setRight(null);
        perfilBorderPaneObject.setBottom(null);
       
        gridPaneObject.setHgap(10);
        gridPaneObject.setVgap(10);
        gridPaneObject.setPadding(new Insets(90, 10, 10, 10));
        gridPaneObject.setPrefSize(800, 400);
        //gridPaneObject.setGridLinesVisible(true);
        Image perfilImagenObject = 
        new Image(getClass().getResourceAsStream("/front/foto/"+GetAndSet.getNombreDeImagenObject()));

        ImageView perfilImagenViewObject = new ImageView();

        perfilImagenViewObject.setImage(perfilImagenObject);
        perfilImagenViewObject.setFitWidth(200);
        perfilImagenViewObject.setFitHeight(200);
        perfilImagenViewObject.setStyle("");
        GridPane.setConstraints(perfilImagenViewObject, 0, 0, 1, 6, HPos.LEFT, VPos.BASELINE);

        Text perfilNombreObject = new Text();
        perfilNombreObject.setText(GetAndSet.getNombreObject());
        perfilNombreObject.setId("n-perfil-nombre");
        GridPane.setConstraints(perfilNombreObject, 1, 2, 2, 1);

        Text perfilApellidosObject = new Text();
        perfilApellidosObject.setText(GetAndSet.getApellidoObject());
        perfilApellidosObject.setId("n-perfil-nombre");
        GridPane.setConstraints(perfilApellidosObject, 1, 3, 2, 1);

        Text perfilCorreoObject = new Text();
        perfilCorreoObject.setText(GetAndSet.getCorreoObject());
        perfilCorreoObject.setId("n-perfil-correo");
        GridPane.setConstraints(perfilCorreoObject , 1, 4, 2, 1, HPos.LEFT, VPos.TOP);

        Button cerrarSesionObject = new Button("Cerrar Sesion");
        cerrarSesionObject.setId("n-perfil-cerrar");
        GridPane.setConstraints(cerrarSesionObject, 1, 5, 1, 1, HPos.LEFT, VPos.BASELINE);
        cerrarSesionObject.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent eventObject) {
                Alert.AlertType innerAlertaObject = Alert.AlertType.CONFIRMATION;
                
                Alert alertObject = new Alert(innerAlertaObject, "");
                alertObject.initStyle(StageStyle.TRANSPARENT);
                alertObject.initModality(Modality.APPLICATION_MODAL);
           
                final DialogPane dialogPaneObject = alertObject .getDialogPane();
                dialogPaneObject.setHeaderText(null);
                dialogPaneObject.setGraphic(null);
                dialogPaneObject.getStylesheets().add(Sesion.class.getResource("/front/css/sesion.css").toExternalForm());

                Pane pane = new Pane();
                pane.setPrefSize(500, 100);

                Text textObject = new Text("¿Seguro que quiere cerrar la sesion?");
                textObject.setId("n-alert-text");

                pane.getChildren().addAll(textObject);

                dialogPaneObject.setContent(pane);
                
                dialogPaneObject.lookupButton(ButtonType.OK).setId("n-alert-aceptar");
                dialogPaneObject.lookupButton(ButtonType.CANCEL).setId("n-alert-cancelar");

                Optional<ButtonType> optioneliminarFilaObjectType = alertObject.showAndWait();

                if(optioneliminarFilaObjectType.get() == ButtonType.OK) {
                    IteradorMatematico.borderPaneObjectStatic.setCenter(GetAndSet.getCenterObject());
                    iniciarSesionCorreoObjectStatic.setText("");
                    iniciarSesionPasswordObjectStatic.setText("");

                    registrarseNombreFieldObjectStatic.setText("");
                    registrarseApellidosFieldObjectStatic.setText("");
                    registrarseCorreoFieldObjectStatic.setText("");
                    registrarsePasswordFieldObjectStatic.setText("");
                    Insertar.cierreDeSesion();
                } 
            }
        });
        
        Button fuegosArtificialesObject = new Button();
        fuegosArtificialesObject.setText("Detener Fuegos Artificiales");
        fuegosArtificialesObject.setId("n-perfil-cerrar");
        GridPane.setConstraints(fuegosArtificialesObject, 2, 5, 1, 1, HPos.LEFT, VPos.BASELINE);
        fuegosArtificialesObject.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent eventObject) {
                fuegosArtificialesObject.setDisable(true);
                frontEventObject2.stop();
            }
        });
        gridPaneObject.getChildren().addAll(
            perfilNombreObject, perfilApellidosObject, perfilCorreoObject, perfilImagenViewObject, cerrarSesionObject
            , fuegosArtificialesObject
        );
        
        return perfilBorderPaneObject;
    }
    public Pane 
    editarPerfil() {
        BorderPane perfilBorderPaneObject = new BorderPane();
        perfilBorderPaneObject.setPadding(new Insets(20, 20, 20, 20));
        perfilBorderPaneObject.setStyle(
            "-fx-background-color: white; -fx-background-radius: 40px; -fx-border-radius: 40px;"
        );
        
        GridPane gridPaneObject = new GridPane();
        GridPane rightGridPaneObject = new GridPane();
        //SQL ------------------------------------------------------------------
//        Perfil.perfilConsulta();
        //SQL ------------------------------------------------------------------
        perfilBorderPaneObject.setTop(null);
        perfilBorderPaneObject.setLeft(null);
        perfilBorderPaneObject.setCenter(gridPaneObject);
        perfilBorderPaneObject.setRight(rightGridPaneObject);
        perfilBorderPaneObject.setBottom(null);
       
        gridPaneObject.setHgap(10);
        gridPaneObject.setVgap(10);
        //gridPaneObject.setGridLinesVisible(true);
        rightGridPaneObject.setHgap(10);
        rightGridPaneObject.setVgap(10);
        //rightGridPaneObject.setGridLinesVisible(true);
        Image perfilEditarImagenObject = new Image(getClass().getResourceAsStream("/front/foto/"+GetAndSet.getNombreDeImagenObject()));
//        ImageView fotoObjectStatic = new ImageView(perfilEditarImagenObject);
        fotoObjectStatic.setImage(perfilEditarImagenObject);
        fotoObjectStatic.setFitWidth(200);
        fotoObjectStatic.setFitHeight(200);
        fotoObjectStatic.setStyle("n-perfil-imagen");
        GridPane.setConstraints(fotoObjectStatic, 0, 0, 1, 7, HPos.LEFT, VPos.BASELINE);
        
        editarImagenObject = new Button("Seleccionar foto");
        editarImagenObject.setMaxWidth(200);
        editarImagenObject.setMaxHeight(70);
        editarImagenObject.setId("n-actualizar-editar");
        GridPane.setConstraints(editarImagenObject, 0, 7, 1, 1, HPos.LEFT, VPos.BASELINE);
        editarImagenObject.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent eventObject) {
                if(editarImagenObject.equals(eventObject.getSource())) {
                    Foto.seleccionar();
                }
            }
        });

        Foto.guardarObject.setMaxWidth(200);
        Foto.guardarObject.setMaxHeight(70);
        Foto.guardarObject.setDisable(true);
        Foto.guardarObject.setId("n-actualizar-editar");
        GridPane.setConstraints(Foto.guardarObject, 0, 8, 1, 1, HPos.LEFT, VPos.BASELINE);
        Label registrarseNombreObject = new Label();
        registrarseNombreObject.setText("Nombre");
        registrarseNombreObject.setId("n-label-editar");
        GridPane.setConstraints(registrarseNombreObject, 1, 0);
        //TextField editarNombreObjectStatic = new TextField();
        editarNombreObjectStatic.setText(GetAndSet.getNombreObject());
        editarNombreObjectStatic.setPrefSize(200, 10);
        editarNombreObjectStatic.setId("n-field-editar");
        GridPane.setConstraints(editarNombreObjectStatic, 1, 1);
        
        Label registrarseApellidosObject = new Label();
        registrarseApellidosObject.setText("Apellidos");
        registrarseApellidosObject.setId("n-label-editar");
        GridPane.setConstraints(registrarseApellidosObject, 1, 2);
        //TextField editarApellidoObjectStatic = new TextField();
        editarApellidoObjectStatic.setText(GetAndSet.getApellidoObject());
        editarApellidoObjectStatic.setPrefSize(200, 10);
        editarApellidoObjectStatic.setId("n-field-editar");
        GridPane.setConstraints(editarApellidoObjectStatic, 1, 3);
        
        Label registrarseEmailObject = new Label();
        registrarseEmailObject.setText("Correo");
        registrarseEmailObject.setId("n-label-editar");
        GridPane.setConstraints(registrarseEmailObject, 1, 4);
        //TextField editarCorreoObjectStatic = new TextField();
        editarCorreoObjectStatic.setText(GetAndSet.getCorreoObject());
        editarCorreoObjectStatic.setPrefSize(200, 10);
        editarCorreoObjectStatic.setDisable(true);
        editarCorreoObjectStatic.setId("n-field-editar");
        GridPane.setConstraints(editarCorreoObjectStatic, 1, 5);
        
        Label registrarsePasswordObject = new Label();
        registrarsePasswordObject.setText("Contraseña");
        registrarsePasswordObject.setId("n-label-editar");
        GridPane.setConstraints(registrarsePasswordObject, 1, 6);
        //PasswordField editarPasswordObjectStatic = new PasswordField();
        editarPasswordObjectStatic.setText(GetAndSet.getPasswordObject());
        editarPasswordObjectStatic.setPrefSize(200, 10);
        editarPasswordObjectStatic.setId("n-field-editar");
        GridPane.setConstraints(editarPasswordObjectStatic, 1, 7);
        //PasswordField editarPasswordConfirmObjectStatic = new PasswordField();
        editarPasswordConfirmObjectStatic.setPromptText("Confirmal Contraseña");
        editarPasswordConfirmObjectStatic.setPrefSize(200, 10);
        editarPasswordConfirmObjectStatic.setId("n-field-editar");
        GridPane.setConstraints(editarPasswordConfirmObjectStatic, 1, 8);
        
        Button perfilActualizarObject = new Button("Actualizar Perfil");
        perfilActualizarObject.setPrefWidth(200);
        perfilActualizarObject.setId("n-actualizar-editar");
        GridPane.setConstraints(perfilActualizarObject, 0, 9);
        perfilActualizarObject.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent eventObject) {
                Alert.AlertType innerAlertaObject = Alert.AlertType.CONFIRMATION;
                
                Alert alertObject = new Alert(innerAlertaObject, "");
                alertObject.initStyle(StageStyle.TRANSPARENT);
                alertObject.initModality(Modality.APPLICATION_MODAL);
           
                final DialogPane dialogPaneObject = alertObject .getDialogPane();
                dialogPaneObject.setHeaderText(null);
                dialogPaneObject.setGraphic(null);
                dialogPaneObject.getStylesheets().add(Sesion.class.getResource("/front/css/sesion.css").toExternalForm());

                Pane pane = new Pane();
                pane.setPrefSize(500, 100);

                Text textObject = new Text("¿Seguro que quiere actualiar tus datos?");
                textObject.setId("n-alert-text");

                pane.getChildren().addAll(textObject);

                dialogPaneObject.setContent(pane);
                
                dialogPaneObject.lookupButton(ButtonType.OK).setId("n-alert-aceptar");
                dialogPaneObject.lookupButton(ButtonType.CANCEL).setId("n-alert-cancelar");

                Optional<ButtonType> optioneliminarFilaObjectType = alertObject.showAndWait();

                if(optioneliminarFilaObjectType.get() == ButtonType.OK) {
                    EditarPerfil.editarPerfil();
                }
                //Normal -------------------------------------------------------
                //EditarPerfil.editarPerfil();
                //Preparada ----------------------------------------------------
            }
        });
        Button perfilEliminarObject = new Button("Eliminar Perfil");
        perfilEliminarObject.setPrefWidth(200);
        perfilEliminarObject.setId("n-actualizar-editar");
        GridPane.setConstraints(perfilEliminarObject, 1, 9);
        perfilEliminarObject.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent eventObject) {
                Alert.AlertType innerAlertaObject = Alert.AlertType.CONFIRMATION;
                
                Alert alertObject = new Alert(innerAlertaObject, "");
                alertObject.initStyle(StageStyle.TRANSPARENT);
                alertObject.initModality(Modality.APPLICATION_MODAL);
           
                final DialogPane dialogPaneObject = alertObject .getDialogPane();
                dialogPaneObject.setHeaderText(null);
                dialogPaneObject.setGraphic(null);
                dialogPaneObject.getStylesheets().add(Sesion.class.getResource("/front/css/sesion.css").toExternalForm());

                Pane pane = new Pane();
                pane.setPrefSize(500, 100);

                Text textObject = new Text("¿Seguro que quieres eliminar tu cuenta?");
                textObject.setId("n-alert-text");

                pane.getChildren().addAll(textObject);

                dialogPaneObject.setContent(pane);
                
                dialogPaneObject.lookupButton(ButtonType.OK).setId("n-alert-aceptar");
                dialogPaneObject.lookupButton(ButtonType.CANCEL).setId("n-alert-cancelar");

                Optional<ButtonType> optioneliminarFilaObjectType = alertObject.showAndWait();

                if(optioneliminarFilaObjectType.get() == ButtonType.OK) {
                    Eliminar.perfil();
                    
                    IteradorMatematico.borderPaneObjectStatic.setCenter(GetAndSet.getCenterObject());
                    iniciarSesionCorreoObjectStatic.setText("");
                    iniciarSesionPasswordObjectStatic.setText("");

                    registrarseNombreFieldObjectStatic.setText("");
                    registrarseApellidosFieldObjectStatic.setText("");
                    registrarseCorreoFieldObjectStatic.setText("");
                    registrarsePasswordFieldObjectStatic.setText("");
                }
                //Normal ------------------------------------------------------
                //EliminarPerfil.eliminarPerfil();
            }
        });
        //Corta -----------------------------------------------------------------
////TableColumn<ConstructorDeDatos,String> firstNameCol = new TableColumn<ConstructorDeDatos,String>("First Name");
//// firstNameCol.setCellValueFactory(new PropertyValueFactory<ConstructorDeDatos,String>("firstName"));
        //Larga -----------------------------------------------------------------------------
//        TableColumn<ConstructorDeDatos,String> firstNameCol = new TableColumn<ConstructorDeDatos,String>("First Name");
// firstNameCol.setCellValueFactory(new Callback<CellDataFeatures<ConstructorDeDatos, String>, ObservableValue<String>>() {
//     public ObservableValue<String> call(CellDataFeatures<ConstructorDeDatos, String> p) {
//         // p.getValue() returns the ConstructorDeDatos instance for a particular TableView row
//         return p.getValue().firstNameProperty();
//     }
//  });
// }
        final TableColumn filaObject = new TableColumn("#");
        filaObject.setVisible(false);
        filaObject.setMinWidth(92);
        filaObject.setCellValueFactory(new PropertyValueFactory<>("fila"));
       
        final TableColumn historialObject = new TableColumn("Historial");
        historialObject.setMinWidth(392);
        historialObject.setSortable(false);
        historialObject.setCellValueFactory(new PropertyValueFactory<>("historial"));
        
        TableRow trow = new TableRow();//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
        trow.setPrefHeight(300);//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
        //TABLE_VIEW.setTableMenuButtonVisible(true);
        TABLE_VIEW.getColumns().clear();
//        TABLE_VIEW
        TABLE_VIEW.getColumns().addAll(filaObject, historialObject);
        TABLE_VIEW.setPrefSize(392, 284);
        GridPane.setConstraints(TABLE_VIEW, 0, 0, 2, 9, HPos.RIGHT, VPos.TOP);
        
        Text placeHolderObject = new Text("No hay historial guardado.");
        placeHolderObject.setStyle("-fx-fill: #818181; -fx-font-weight: bold; -fx-font-size: 16px;");
        TABLE_VIEW.setPlaceholder(placeHolderObject);
        TABLE_VIEW.setItems(observableListStaticType);
        Escuchar.historial();//Escucha --------------------------------------------------------------
        // SQL -----------------------------------------------------------------
            observableListStaticType.clear();
            Consultar.historial();
        // SQL -----------------------------------------------------------------  }
        //TextField campoDeFilaObejctStatic = new TextField();
        campoDeFilaObejctStatic.setPromptText("Solo para visualización");
        campoDeFilaObejctStatic.setPrefWidth(200);
        campoDeFilaObejctStatic.setDisable(true);
        campoDeFilaObejctStatic.setId("n-field-editar");
        GridPane.setConstraints(campoDeFilaObejctStatic, 0, 9, 1, 1, HPos.LEFT, VPos.TOP);
        
        Button eliminarFilaObject = new Button("Eliminar");
        eliminarFilaObject.setPrefWidth(200);
        eliminarFilaObject.setId("n-actualizar-editar");
        GridPane.setConstraints(eliminarFilaObject, 1, 9, 1, 1, HPos.LEFT, VPos.BASELINE);
        eliminarFilaObject.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent eventObject) {              
                Alert.AlertType innerAlertaObject = Alert.AlertType.CONFIRMATION;
                
                Alert alertObject = new Alert(innerAlertaObject, "");
                alertObject.initStyle(StageStyle.TRANSPARENT);
                alertObject.initModality(Modality.APPLICATION_MODAL);
           
                final DialogPane dialogPaneObject = alertObject .getDialogPane();
                dialogPaneObject.setHeaderText(null);
                dialogPaneObject.setGraphic(null);
                dialogPaneObject.getStylesheets().add(Sesion.class.getResource("/front/css/sesion.css").toExternalForm());

                Pane pane = new Pane();
                pane.setPrefSize(500, 100);

                Text textObject = new Text("¿Seguro que quiere eliminar el historial?");
                textObject.setId("n-alert-text");

                pane.getChildren().addAll(textObject);

                dialogPaneObject.setContent(pane);
                
                dialogPaneObject.lookupButton(ButtonType.OK).setId("n-alert-aceptar");
                dialogPaneObject.lookupButton(ButtonType.CANCEL).setId("n-alert-cancelar");

                Optional<ButtonType> optioneliminarFilaObjectType = alertObject.showAndWait();

                if(optioneliminarFilaObjectType.get() == ButtonType.OK) {
                    Eliminar.fila();
                    TABLE_VIEW.getSelectionModel().clearSelection();
                }
            }
        });
        
        Button historialesObject = new Button("Eliminar todo el historial");
        historialesObject.setPrefWidth(400);
        historialesObject.setId("n-actualizar-editar");
        GridPane.setConstraints(historialesObject, 0, 10, 2, 1, HPos.LEFT, VPos.BASELINE);
        historialesObject.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent eventObject) {
                Alert.AlertType innerAlertaObject = Alert.AlertType.CONFIRMATION;
                
                Alert alertObject = new Alert(innerAlertaObject, "");
                alertObject.initStyle(StageStyle.TRANSPARENT);
                alertObject.initModality(Modality.APPLICATION_MODAL);
           
                final DialogPane dialogPaneObject = alertObject .getDialogPane();
                dialogPaneObject.setHeaderText(null);
                dialogPaneObject.setGraphic(null);
                dialogPaneObject.getStylesheets().add(Sesion.class.getResource("/front/css/sesion.css").toExternalForm());

                Pane pane = new Pane();
                pane.setPrefSize(500, 100);

                Text textObject = new Text("¿Seguro que quiere eliminar todo?");
                textObject.setId("n-alert-text");

                pane.getChildren().addAll(textObject);

                dialogPaneObject.setContent(pane);
                
                dialogPaneObject.lookupButton(ButtonType.OK).setId("n-alert-aceptar");
                dialogPaneObject.lookupButton(ButtonType.CANCEL).setId("n-alert-cancelar");

                Optional<ButtonType> optioneliminarFilaObjectType = alertObject.showAndWait();

                if(optioneliminarFilaObjectType.get() == ButtonType.OK) {
                    TABLE_VIEW.getColumns().clear();
                    Eliminar.historial();
                }
            }
        });
        
        gridPaneObject.getChildren().addAll(
            fotoObjectStatic, 
                editarImagenObject, 
                Foto.guardarObject,
                registrarseNombreObject, editarNombreObjectStatic, 
            registrarseApellidosObject, editarApellidoObjectStatic, registrarseEmailObject, editarCorreoObjectStatic, 
            registrarsePasswordObject, editarPasswordObjectStatic,editarPasswordConfirmObjectStatic,perfilActualizarObject, 
            perfilEliminarObject //, listViewType, historialObject, historialesObject
        );
        rightGridPaneObject.getChildren().addAll(
            TABLE_VIEW, campoDeFilaObejctStatic, eliminarFilaObject, historialesObject
        );
        
        return perfilBorderPaneObject;
    }
}
