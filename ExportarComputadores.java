import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class ExportarComputadores {
    public void exportarArchivo(LinkedList<COMPUTADOR_PORTATIL> lista) {
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía, no se puede exportar el archivo");
            return;
        }
        try (FileWriter e = new FileWriter("Computadores.txt")) {
            for (COMPUTADOR_PORTATIL obj : lista) {
                e.write("Serial: " + obj.getSerial() + "\n");
                e.write("Marca: " + obj.getMarca() + "\n");
                e.write("Tamaño: " + obj.getTamaño() + "\n");
                e.write("Precio: " + obj.getPrecio() + "\n");
                e.write("Sistema Operativo: " + obj.getSistemaOperativo() + "\n");
                e.write("Tipo de Procesador: " + obj.getTipoProcesador() + "\n");
                e.write("------------------------------------------------------\n");
            }
            System.out.println("Archivo exportado correctamente");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}