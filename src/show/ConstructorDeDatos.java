package show;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;//javafx.beans.property

public class ConstructorDeDatos {
    SimpleIntegerProperty fila;//IntegerProperty fila;
    SimpleStringProperty historial;

    public 
    ConstructorDeDatos(Integer fila, String historial) {
        this.fila = new SimpleIntegerProperty(fila);
        this.historial = new SimpleStringProperty(historial);
    }

    public Integer getFila() {
        return fila.get();
    }

    public void setFila(Integer fila) {
        this.fila.set(fila);
    }

    public String getHistorial() {
        return historial.get();
    }

    public void setHistorial(String historial) {
        this.historial.set(historial);//this.historial = new SimpleStringProperty(historial);
    }
}
