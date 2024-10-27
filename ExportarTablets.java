import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class ExportarTablets {
    public void exportarArchivo(LinkedList<TABLETA_GRAFICA> lista) {
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía, no se puede exportar el archivo");
            return;
        }
        try (FileWriter e = new FileWriter("Tablets.txt")) {
            for (TABLETA_GRAFICA obj : lista) {
                e.write("Serial: " + obj.getSerial() + "\n");
                e.write("Marca: " + obj.getMarca() + "\n");
                e.write("Tamaño: " + obj.getTamaño() + "\n");
                e.write("Precio: " + obj.getPrecio() + "\n");
                e.write("Sistema Operativo: " + obj.getPeso() + "\n");
                e.write("Tipo de Procesador: " + obj.getTipoA() + "\n");
                e.write("------------------------------------------------------\n");
            }
            System.out.println("Archivo exportado correctamente");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

