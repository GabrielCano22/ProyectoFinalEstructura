public class Estudiante_diseño {
    String Nombre;
    String Apellido;
    String Telefono;
    String Cedula;
    String Serial;
    double Promedio;
    int NumSeme;
    public Estudiante_diseño(String nombre, int numSeme, double promedio, String serial, String cedula, String telefono, String apellido) {
        Nombre = nombre;
        NumSeme = numSeme;
        Promedio = promedio;
        Serial = serial;
        Cedula = cedula;
        Telefono = telefono;
        Apellido = apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getNumSeme() {
        return NumSeme;
    }

    public void setNumSeme(int numSeme) {
        NumSeme = numSeme;
    }

    public double getPromedio() {
        return Promedio;
    }

    public void setPromedio(double promedio) {
        Promedio = promedio;
    }

    public String getSerial() {
        return Serial;
    }

    public void setSerial(String serial) {
        Serial = serial;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String cedula) {
        Cedula = cedula;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }


}
