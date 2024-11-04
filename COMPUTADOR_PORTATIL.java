public class COMPUTADOR_PORTATIL { //Creacion de la clase y declaracion de las variables
    String Nombre;
    String Apellido;
    int Telefono;
    int Cedula;
    double Promedio;
    int NumSeme;
    String Serial;
    String Marca;
    String SistemaOperativo;
    String TipoProcesador;
    Double Tamaño;
    Double Precio;

    //Creacion de un constructor vacio
    public COMPUTADOR_PORTATIL() {

    }
    //Creacion de los metodos get y set para cada una de las variables
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

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getSerial() {
        return Serial;
    }

    public void setSerial(String serial) {
        Serial = serial;
    }

    public String getSistemaOperativo() {
        return SistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        SistemaOperativo = sistemaOperativo;
    }

    public String getTipoProcesador() {
        return TipoProcesador;
    }

    public void setTipoProcesador(String tipoProcesador) {
        TipoProcesador = tipoProcesador;
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
    //Creacion de un constructor con todas las variables
    public COMPUTADOR_PORTATIL(String nombre, String apellido, int telefono, int cedula, double promedio, int numSeme, String serial, String marca, String sistemaOperativo, String tipoProcesador, Double tamaño, Double precio) {
        Nombre = nombre;
        Apellido = apellido;
        Telefono = telefono;
        Cedula = cedula;
        Promedio = promedio;
        NumSeme = numSeme;
        Serial = serial;
        Marca = marca;
        SistemaOperativo = sistemaOperativo;
        TipoProcesador = tipoProcesador;
        Tamaño = tamaño;
        Precio = precio;
    }
}