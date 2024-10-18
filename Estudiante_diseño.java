public class Estudiante_diseño {
    String Nombre;
    String Apellido;
    int Telefono;
    int Cedula;
    double Promedio;
    int NumSeme;
    public Estudiante_diseño(String nombre, int numSeme, double promedio, int cedula, int telefono, String apellido) {
        Nombre = nombre;
        NumSeme = numSeme;
        Promedio = promedio;
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

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int cedula) {
        Cedula = cedula;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }


}
