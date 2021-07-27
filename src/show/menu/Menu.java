package show.menu;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.control.Accordion;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.StageStyle;

public class Menu {
    public static Dialog 
    idiomas() {
        Dialog<ButtonType> dialogObjectType = new Dialog<>();
        dialogObjectType.initStyle(StageStyle.TRANSPARENT);
        dialogObjectType.initModality(Modality.APPLICATION_MODAL);
    
        final DialogPane dialogPaneObject = dialogObjectType.getDialogPane();
        dialogPaneObject.getStylesheets().add(Menu.class.getResource("/front/css/top.css").toExternalForm()); 
        
        ButtonType cerrarObject = new ButtonType("X", ButtonBar.ButtonData.NO);  
        dialogPaneObject.getButtonTypes().addAll(cerrarObject);
        dialogPaneObject.lookupButton(cerrarObject).getStyleClass().addAll(
            "n-button-type-cerrar", "n-button-type-idioma"
        );

        FlowPane flowPaneObject = new FlowPane();   
        flowPaneObject.setPadding(new Insets(0, 20, 0, 20));
        flowPaneObject.setPrefWrapLength(1400); // preferred width allows for two columns
        flowPaneObject.setTranslateY(30);
        
        Hyperlink idiomaObject[] = new Hyperlink[100];
        
        String nombreObject[] = {
            "afrikáans", "albanés", "alemán", "amhárico", "árabe", "armenio", "azerí", "bengalí", "bielorruso", "birmano",
            "bosnio", "búlgaro", "camboyano", "canarés", "catalán", "cebuano", "checo", "chichewa", "chino (simplificado)",
            "chino (tradicional)", "cingalés", "coreano", "corso", "criollo haitiano", "croata", "danés", "eslovaco",
            "esloveno", "español", "esperanto", "estonio", "euskera", "finlandés", "francés", "frisio", "gaélico escocés",
            "galés", "gallego", "georgiano", "griego", "gujarati", "hausa", "hawaiano", "hebreo", "hindi", "hmong", 
            "húngaro", "igbo", "indonesio", "ingles", "irlandés", "islandés", "italiano", "japonés", "javanés", "kazajo",
            "kirguís", "kurdo", "lao", "latín", "letón", "lituano", "luxemburgués", "macedonio", "malayalam", "malayo",
            "malgache", "maltés", "maorí", "maratí", "mongol", "neerlandés", "nepalí", "noruego", "panyabí", "pastún",
            "persa", "polaco", "portugués", "rumano", "ruso", "samoano", "serbio", "sesoto", "shona", "sindhi", "somalí",
            "suajili", "sueco", "sundanés", "tagalo", "tailandés", "tamil", "tayiko", "telugu", "turco", "ucraniano",
            "urdu", "uzbeco", "vietnamita", "xhosa", "yidis", "yoruba", "zulú"
        };
        
        for (int i = 0; i < 100; i++) {
            idiomaObject[i] = new  Hyperlink(nombreObject[i]);
            idiomaObject[i].setPrefWidth(140);
            idiomaObject[i].setUnderline(false);
            idiomaObject[i].setId("n-idioma-hyperlink");
            flowPaneObject.getChildren().add(idiomaObject[i]);
        }

        idiomaObject[28].setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent eventObject) {
//                JOptionPane.showConfirmDialog(null, "Español");
                dialogObjectType.close();
            }
        });
        idiomaObject[49].setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent eventObject) {
//                JOptionPane.showConfirmDialog(null, "Ingles");
                dialogObjectType.close();
            }
        });
        
        dialogPaneObject.setContent(flowPaneObject);
        dialogObjectType.showAndWait();
//Optional<ButtonType> result = dialogObjectType.showAndWait();if (result.isPresent() && result.get() == ButtonType.OK) {}
        return dialogObjectType;
    } 
    public static Dialog 
    configuracion() {
        Dialog<ButtonType> dialogObjectType = new Dialog<>();
        dialogObjectType.setTitle("Dialog Demo");
        dialogObjectType.initStyle(StageStyle.TRANSPARENT);

        final DialogPane dialogPaneObject = dialogObjectType.getDialogPane();
        
        ButtonType loginButtonType = new ButtonType("Ok", ButtonBar.ButtonData.OK_DONE);
        dialogPaneObject.getButtonTypes().addAll(loginButtonType);
                
        Pane pane = new Pane();
        pane.setPrefSize(600, 300);
        pane.setStyle("-fx-background-color: white;");
        
        Label label = new Label("En Desarrollo");
        label.setStyle("-fx-font-size: 50px; -fx-text-fill: #818181; -fx-font-weight: bold;");
        label.setTranslateX(100);
        label.setTranslateY(140);
        
        pane.getChildren().addAll(label);

        dialogPaneObject.setContent(pane);
        dialogObjectType.initModality(Modality.WINDOW_MODAL);
        dialogObjectType.showAndWait();
        
        return dialogObjectType;
    }
    public static Dialog 
    ayuda() {
        Dialog<ButtonType> dialogObjectType = new Dialog<>();
        dialogObjectType.setTitle("Dialog Demo");
        dialogObjectType.initStyle(StageStyle.TRANSPARENT);
        dialogObjectType.initModality(Modality.APPLICATION_MODAL);
        
        final DialogPane dialogPaneObject = dialogObjectType.getDialogPane();
        dialogPaneObject.getStylesheets().add(Menu.class.getResource("/front/css/top.css").toExternalForm()); 
        
        ButtonType cerrarObject = new ButtonType("X", ButtonBar.ButtonData.NO);  
        dialogPaneObject.getButtonTypes().addAll(cerrarObject);
        dialogPaneObject.lookupButton(cerrarObject).getStyleClass().addAll(
            "n-button-type-cerrar", "n-button-type-ayuda"
        );
        
        final TitledPane acercaObject = new TitledPane();
        acercaObject.setText("Acerca");

        GridPane acercaGridPaneObject = new GridPane();
        acercaGridPaneObject.setPadding(new Insets(30, 0, 0, 30));
        
        Label acercaDeObject = new Label("Acerca de");
        acercaDeObject.setId("n-label-ayuda");
        GridPane.setConstraints(acercaDeObject, 0, 0, 1, 1, HPos.LEFT, VPos.TOP);
        Text descripcionObject = new Text("\tItermatico es un software de utilidades financias, \n "
            + "\tcalculos y estadisticas pre-preparadas para facilidad de uso.\n");
        descripcionObject.setId("n-text-ayuda");
        GridPane.setConstraints(descripcionObject, 0, 1, 1, 1, HPos.LEFT, VPos.TOP);
        Text fechaObject = new Text("\t7 de octubre 2019 - // de // 2020, Neury E. Aguasviavs L.");
        fechaObject.setId("n-text-ayuda");
        GridPane.setConstraints(fechaObject, 0, 2, 1, 1, HPos.LEFT, VPos.TOP);
        
        acercaGridPaneObject.getChildren().addAll(
            acercaDeObject, descripcionObject, fechaObject
        );
        acercaObject.setContent(acercaGridPaneObject);
        
        final TitledPane sitioWebObject = new TitledPane();
        sitioWebObject.setText("Esplorar");
        
        GridPane sitioWebGridPaneObject = new GridPane();
        sitioWebGridPaneObject.setPadding(new Insets(30, 0, 0, 30));
        
        Label sitioWebOficialObject = new Label("Sitio Web");
        sitioWebOficialObject.setId("n-label-ayuda");
        GridPane.setConstraints(sitioWebOficialObject, 0, 0, 1, 1, HPos.LEFT, VPos.TOP);
        Text sitioWebLinkObject = new Text("\titermatico.com");
        sitioWebLinkObject.setId("n-text-ayuda");
        GridPane.setConstraints(sitioWebLinkObject, 0, 1, 1, 1, HPos.LEFT, VPos.TOP);
        
        sitioWebGridPaneObject.getChildren().addAll(
            sitioWebOficialObject, sitioWebLinkObject
        );
        sitioWebObject.setContent(sitioWebGridPaneObject);
        
        final TitledPane creditosObject = new TitledPane();
        creditosObject.setText("Creditos");
        
        GridPane creditosGridPaneObject = new GridPane();
        creditosGridPaneObject.setPadding(new Insets(30, 0, 0, 30));

        Label designObject = new Label("Diseñado por");
        designObject.setId("n-label-ayuda");
        GridPane.setConstraints(designObject, 0, 0, 1, 1, HPos.LEFT, VPos.TOP);
        Text designerObject = new Text("\tNeury E. Aguasvivas L.\n\teleasar0991@gmail.com\n");
        designerObject.setId("n-text-ayuda");
        GridPane.setConstraints(designerObject, 0, 1, 1, 1, HPos.LEFT, VPos.TOP);
        
        Label creadoObject = new Label("Creado por");
        creadoObject.setId("n-label-ayuda");
        GridPane.setConstraints(creadoObject, 0, 2, 1, 1, HPos.LEFT, VPos.TOP);
        Text creadorObject = new Text("\tNeury E. Aguasvivas L.\n\teleasar0991@gmail.com\n");
        creadorObject.setId("n-text-ayuda");
        GridPane.setConstraints(creadorObject, 0, 3, 1, 1, HPos.LEFT, VPos.TOP);
        
        Label traducidoObject = new Label("Traducido por");
        traducidoObject.setId("n-label-ayuda");
        GridPane.setConstraints(traducidoObject, 0, 4, 1, 1, HPos.LEFT, VPos.TOP);
        Text traductorObject = new Text("\tNeury E. Aguasvivas L.\n\teleasar0991@gmail.com\n");
        traductorObject.setId("n-text-ayuda");
        GridPane.setConstraints(traductorObject, 0, 5, 1, 1, HPos.LEFT, VPos.TOP);
        
        creditosGridPaneObject.getChildren().addAll(
            designObject, designerObject, creadoObject, creadorObject, traducidoObject, traductorObject
        );
        creditosObject.setContent(creditosGridPaneObject);
        
        final Accordion accordionObject = new Accordion(); 
        accordionObject.setTranslateY(30);
        accordionObject.setPrefSize(600, 320);
        accordionObject.setExpandedPane(acercaObject);
       
        accordionObject.getPanes().addAll(
            acercaObject, sitioWebObject, creditosObject
        );
        
        dialogPaneObject.setContent(accordionObject);
        dialogObjectType.showAndWait();
        
        return dialogObjectType;
    }
}
