package show;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import javax.imageio.ImageIO;
import sql.GetAndSet;

public class Foto {
    public static Button guardarObject = new Button("Guardar Foto");
    
    public static void 
    seleccionar() {
        FileChooser fileChooserObject = new FileChooser();
        configurar(fileChooserObject);
        File fileObject = fileChooserObject.showOpenDialog(GetAndSet.getStageObject());
        
        if (fileObject != null) {
            guardar(fileObject);
            guardarObject.setDisable(false);
            Sesion.editarImagenObject.setDisable(true);

            try {
                FileInputStream fileInputStreamObject = new FileInputStream(fileObject.getAbsoluteFile());
                GetAndSet.setImagenObject(fileInputStreamObject);
                
                int longitud = longitud = (int) fileObject.getAbsoluteFile().length();
                GetAndSet.setLongitudDeImagenObject(longitud);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Foto.class.getName()).log(Level.SEVERE, null, ex);
            }             
        }     
    }
    private static void 
    configurar(FileChooser fileChooserObject){                           
        fileChooserObject.setTitle("Open Resource File");
        fileChooserObject.setInitialDirectory(new File(System.getProperty("user.home"))); 
        fileChooserObject.getExtensionFilters().addAll(new ExtensionFilter("Seleccionar Imagen", "*.png", "*.jpg", "*.gif")); 
    }
    private static void 
    guardar(File fileObject){
        Stage secondStage = new Stage();

        Label name = new Label(fileObject.getAbsolutePath());
        Image image = new Image(fileObject.toURI().toString());
//        ImageView imageView = new ImageView();
        guardarObject.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent event) {
                FileChooser fileChooserObject = new FileChooser();
                fileChooserObject.setTitle("Save Image");
                fileChooserObject.setInitialDirectory(new File(System.getProperty("user.home"))); 
                
                File fileObject = fileChooserObject.showSaveDialog(secondStage);
                
                if (fileObject != null) {
                    try {
                        ImageIO.write(SwingFXUtils.fromFXImage(Sesion.fotoObjectStatic.getImage(), null), "jpg", fileObject);
                        GetAndSet.setNombreDeFotoObject(fileObject.getName());
                    } catch (IOException ex) {
                        Logger.getLogger(File.class.getName()).log(Level.SEVERE, null, ex);
                    }                              
                }
                
                guardarObject.setDisable(true);
                Sesion.editarImagenObject.setDisable(false);
            }
        });

        Sesion.fotoObjectStatic.setFitHeight(400);
        Sesion.fotoObjectStatic.setPreserveRatio(true);
        Sesion.fotoObjectStatic.setImage(image);
        Sesion.fotoObjectStatic.setSmooth(true);
        Sesion.fotoObjectStatic.setCache(true);    
    }
}
