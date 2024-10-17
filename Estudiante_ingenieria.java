
public class Estudiante_ingenieria {
    String Nombre;
    String Apellido;
    String Telefono;
    String Cedula;
    String Serial;
    double Promedio;
    int NumSeme;
    public Estudiante_ingenieria(String nombre, String apellido, String telefono, String cedula, String serial, double promedio, int numSeme) {
        Nombre = nombre;
        Apellido = apellido;
        Telefono= telefono;
        Cedula = cedula;
        Serial = serial;
        Promedio = promedio;
        NumSeme = numSeme;
    }
    public String getSerial() {
        return Serial;
    }
    public void setSerial(String serial) {
        Serial = serial;
    }
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
    public String getTelefono() {
        return Telefono;
    }
    public void setTelefono(String telefono) {
        Telefono = telefono;
    }
    public String getCedula() {
        return Cedula;
    }
    public void setCedula(String cedula) {
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


}
