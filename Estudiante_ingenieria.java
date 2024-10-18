
public class Estudiante_ingenieria {
    String Nombre;
    String Apellido;
    int Telefono;
    int Cedula;
    String Serial;
    double Promedio;
    int NumSeme;
    public Estudiante_ingenieria(String nombre, String apellido, int telefono, int cedula, double promedio, int numSeme) {
        Nombre = nombre;
        Apellido = apellido;
        Telefono= telefono;
        Cedula = cedula;
        Promedio = promedio;
        NumSeme = numSeme;
    }

    public Estudiante_ingenieria(String nombre, int numSeme, double promedio, int cedula, int telefono, String apellido) {
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


}
