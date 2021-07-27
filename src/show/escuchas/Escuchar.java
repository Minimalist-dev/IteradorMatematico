package show.escuchas;

import front.IteradorMatematico;
import javafx.collections.ListChangeListener;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.stage.WindowEvent;
import show.ConstructorDeDatos;
import static show.Sesion.TABLE_VIEW;
import static show.Sesion.campoDeFilaObejctStatic;
import show.botones.General;
import sql.GetAndSet;
import sql.inserciones.InsertarEscucha;

public class Escuchar {
    public static void 
    historial() {
        TABLE_VIEW.getSelectionModel().getSelectedItems().addListener(new ListChangeListener<ConstructorDeDatos>() {
           public void onChanged(ListChangeListener.Change<? extends ConstructorDeDatos> listenerObject) {
                campoDeFilaObejctStatic.setText(
                    "#" + TABLE_VIEW.getSelectionModel().getSelectedItems().get(0).getFila()+ " Selecionado"
                );
            }
        });
    }
    public static void 
    ventana() {
        GetAndSet.getStageObject().addEventHandler(WindowEvent.WINDOW_SHOWN, new EventHandler<WindowEvent>() {
            @Override public void handle(WindowEvent eventObject) {
                System.out.println("Has mostrar");//Sin usar --------------------------------------------------
            }
        });
        GetAndSet.getStageObject().addEventHandler(WindowEvent.WINDOW_SHOWING, new EventHandler<WindowEvent>() {
            @Override public void handle(WindowEvent eventObject) {
                System.out.println("Has mostrando");//Sin usar --------------------------------------------------
            }
        });
        GetAndSet.getStageObject().addEventHandler(WindowEvent.WINDOW_CLOSE_REQUEST, new EventHandler<WindowEvent>() {
            @Override public void handle(WindowEvent eventObject) {
                System.out.println("Has Cerrado");//Sin usar --------------------------------------------------
            }
        });
    }
    public static void 
    ecena() {
        GetAndSet.getSceneObject().setOnMouseMoved(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent eventObject) {
                InsertarEscucha.movido("posicion x: " + eventObject.getX() + ", posicion y: " + eventObject.getY());
                eventObject.consume();
            }
        });
        GetAndSet.getSceneObject().setOnMouseEntered(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent eventObject) {
                InsertarEscucha.ingreso("Ingredo en x: " + eventObject.getX() + ", y: " + eventObject.getY());
                eventObject.consume();
            }
        });
        GetAndSet.getSceneObject().setOnMouseExited(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent eventObject) {
                InsertarEscucha.salido("Salido en x: " + eventObject.getX() + ", y: " + eventObject.getY());
                eventObject.consume();
            }
        });
        GetAndSet.getSceneObject().setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent eventObject) {
                InsertarEscucha.hizoClic(
                    "Hizo clic en x: " + eventObject.getX() + ", y: " + eventObject.getY() + ", " + 
                    eventObject.getClickCount() + " veces"
                );
                eventObject.consume();
            }
        });
        GetAndSet.getSceneObject().setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent eventObject) {
                InsertarEscucha.presiono("Presionado en x: " + eventObject.getX() + ", y: " + eventObject.getY());
                eventObject.consume();
            }
        });
        GetAndSet.getSceneObject().setOnMouseReleased(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent eventObject) {
                InsertarEscucha.liberado("Liberado en x: " + eventObject.getX() + ", y: " + eventObject.getY());
                eventObject.consume();
            }
        });
    }
    public static void 
    bottom() {
        IteradorMatematico.generalObjectStatic.addEventHandler(MouseEvent.MOUSE_MOVED, new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent eventObject) {
                InsertarEscucha.movidoBottom("General posición x: " + eventObject.getX() +", y: " + eventObject.getY());
                eventObject.consume();
            }
        });
        IteradorMatematico.generalObjectStatic.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent eventObject) {
                InsertarEscucha.ingresoBottom("Ingreso a General por x: " + eventObject.getX() +", y: " + eventObject.getY());
                eventObject.consume();
            }
        });
        IteradorMatematico.generalObjectStatic.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent eventObject) {
                InsertarEscucha.salidoBottom("Salido de General por x: " + eventObject.getX() +", y: " + eventObject.getY());
                eventObject.consume();
            }
        });
        IteradorMatematico.generalObjectStatic.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent eventObject) {
                InsertarEscucha.hizoClicBottom(
                    "Hizo clic en General por x: " + eventObject.getX() + ", y: " + eventObject.getY()
                );
                eventObject.consume();
            }
        });
        IteradorMatematico.generalObjectStatic.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent eventObject) {
                InsertarEscucha.presionoBottom(
                    "Presionado en General por x: " + eventObject.getX() + ", y: " + eventObject.getY()
                );
                eventObject.consume();
            }
        });
        IteradorMatematico.generalObjectStatic.addEventHandler(MouseEvent.MOUSE_RELEASED, new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent eventObject) {
                InsertarEscucha.presionoBottom(
                    "Liberado en General por x: " + eventObject.getX() + ", y: " + eventObject.getY()
                );
                eventObject.consume();
            }
        });
    }
    public static void 
    general() {
        General.celsiusFahrenheitObjectStatic.addEventHandler(MouseEvent.MOUSE_MOVED, new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent eventObject) {
                InsertarEscucha.movidoBottom("Celsius a Fahrenheit posición x: " + eventObject.getX() +", y: " + eventObject.getY());
                eventObject.consume();
            }
        });
        General.celsiusFahrenheitObjectStatic.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent eventObject) {
                InsertarEscucha.ingresoBottom("Ingreso a Celsius a Fahrenheit por x: " + eventObject.getX() +", y: " + eventObject.getY());
                eventObject.consume();
            }
        });
        General.celsiusFahrenheitObjectStatic.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent eventObject) {
                InsertarEscucha.salidoBottom("Salido de Celsius a Fahrenheit por x: " + eventObject.getX() +", y: " + eventObject.getY());
                eventObject.consume();
            }
        });
        General.celsiusFahrenheitObjectStatic.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent eventObject) {
                InsertarEscucha.hizoClicBottom(
                    "Hizo clic en Celsius a Fahrenheit por x: " + eventObject.getX() + ", y: " + eventObject.getY()
                );
                eventObject.consume();
            }
        });
        General.celsiusFahrenheitObjectStatic.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent eventObject) {
                InsertarEscucha.presionoBottom(
                    "Presionado en Celsius a Fahrenheit por x: " + eventObject.getX() + ", y: " + eventObject.getY()
                );
                eventObject.consume();
            }
        });
        General.celsiusFahrenheitObjectStatic.addEventHandler(MouseEvent.MOUSE_RELEASED, new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent eventObject) {
                InsertarEscucha.presionoBottom(
                    "Liberado en Celsius a Fahrenheit por x: " + eventObject.getX() + ", y: " + eventObject.getY()
                );
                eventObject.consume();
            }
        });
    }
    public static void 
    generalPane() {
        General.calcularObjectStatic.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent eventObject) {
                InsertarEscucha.iso(
                    General.datosDeCalculoObjectStatic.getText() +
                    ": Campo No.1: " + General.textField1ObjectStatic.getText()
                );
                eventObject.consume();
            }
        });
       
    }
}
