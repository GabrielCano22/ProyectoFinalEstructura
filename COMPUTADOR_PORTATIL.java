import java.util.LinkedList;
public class COMPUTADOR_PORTATIL {
    String Serial;
    String Marca;
    String SistemaOperativo;
    String TipoProcesador;
    Double Tamaño;
    Double Precio;



    public COMPUTADOR_PORTATIL(String serial, String marca, Double tamaño, Double precio,String sistemaOperativo, String tipoProcesador) {
        Serial = serial;
        Marca = marca;
        Tamaño = tamaño;
        Precio = precio;
        SistemaOperativo = sistemaOperativo;
        TipoProcesador = tipoProcesador;
    }

    public COMPUTADOR_PORTATIL() {

    }

    public String getSistemaOperativo() {
        return SistemaOperativo;
    }

    public String getTipoProcesador() {
        return TipoProcesador;
    }

    public void setTipoProcesador(String tipoProcesador) {
        TipoProcesador = tipoProcesador;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        SistemaOperativo = sistemaOperativo;
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
}
