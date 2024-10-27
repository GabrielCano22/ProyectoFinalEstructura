import javax.swing.JOptionPane;
import java.util.LinkedList;
public class TABLETA_GRAFICA {
        String Serial;
        String Marca;
        String TipoA;
        Double Tamaño;
        Double Precio;
        Double Peso;

    public TABLETA_GRAFICA(String serial, String marca, Double tamaño, Double precio, Double peso, String tipoA) {
        Serial = serial;
        Marca = marca;
        Tamaño = tamaño;
        Precio = precio;
        Peso = peso;
        TipoA = tipoA;
    }

    public TABLETA_GRAFICA() {

    }

    public String getTipoA() {
        return TipoA;
    }

    public void setTipoA(String tipoA) {
        TipoA = tipoA;
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

    public Double getPeso() {
        return Peso;
    }

    public void setPeso(Double peso) {
        Peso = peso;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double precio) {
        Precio = precio;
    }

    }

