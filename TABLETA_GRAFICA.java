import javax.swing.JOptionPane;
import java.util.LinkedList;
public class TABLETA_GRAFICA {
        String Serial;
        String Marca;
        Double Tamaño;
        Double Precio;
        Double Peso;
    public TABLETA_GRAFICA(String serial, String marca, Double tamaño, Double precio, Double peso) {
        Serial = serial;
        Marca = marca;
        Tamaño = tamaño;
        Precio = precio;
        Peso = peso;
    }
    public String getSerial() {
        return Serial;
    }

    public void setSerial(String serial) {
        Serial = serial;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public Double getTamaño() {
        return Tamaño;
    }

    public void setTamaño(Double tamaño) {
        Tamaño = tamaño;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double precio) {
        Precio = precio;
    }

    public Double getPeso() {
        return Peso;
    }

    public void setPeso(Double peso) {
        Peso = peso;
    }
}
