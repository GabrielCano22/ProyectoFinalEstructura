import javax.swing.JOptionPane;
import java.util.LinkedList;
public class TABLETA_GRAFICA { //Creamos la clase TABLETA_GRAFICA con las variables que se van a utilizar
    String Nombre;
    String Apellido;
    int Telefono;
    int Cedula;
    double Promedio;
    int NumSeme;
    String Serial;
    String Marca;
    String TipoA;
    Double Tamaño;
    Double Precio;
    Double Peso;

    //Creamos un constructor vacio
    public TABLETA_GRAFICA() {

    }

    //Creamos los metodos get y set para cada una de las variables
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int cedula) {
        Cedula = cedula;
    }

    public double getPromedio() {
        return Promedio;
    }

    public void setPromedio(double promedio) {
        Promedio = promedio;
    }

    public int getNumSeme() {
        return NumSeme;
    }

    public void setNumSeme(int numSeme) {
        NumSeme = numSeme;
    }

    public String getSerial() {
        return Serial;
    }

    public void setSerial(String serial) {
        Serial = serial;
    }

    public String getTipoA() {
        return TipoA;
    }

    public void setTipoA(String tipoA) {
        TipoA = tipoA;
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

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    //Creamos un constructor con todas las variables
    public TABLETA_GRAFICA(String nombre, String apellido, int telefono, int cedula, double promedio, int numSeme, String serial, String marca, String tipoA, Double tamaño, Double precio, Double peso) {
        Nombre = nombre;
        Apellido = apellido;
        Telefono = telefono;
        Cedula = cedula;
        Promedio = promedio;
        NumSeme = numSeme;
        Serial = serial;
        Marca = marca;
        TipoA = tipoA;
        Tamaño = tamaño;
        Precio = precio;
        Peso = peso;
    }
}
