import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class ExportarComputadores {
    // Método para exportar la lista de computadores a un archivo de texto
    // Recibe como parámetro una lista de computadores
    // Si la lista está vacía, imprime un mensaje y retorna void (no hace nada)
    // Si la lista no está vacía, crea un archivo de texto llamado "Computadores.txt"
    public void exportarArchivo(LinkedList<COMPUTADOR_PORTATIL> lista) {
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía, no se puede exportar el archivo");
            return;
        }
        try (FileWriter e = new FileWriter("Computadores.txt")) {
            for (COMPUTADOR_PORTATIL obj : lista) {
                // Se escribe en el archivo cada uno de los atributos del objeto
                e.write("Nombre: " + obj.getNombre() + "\n");
                e.write("Apellido: " + obj.getApellido() + "\n");
                e.write("Cedula: " + obj.getCedula() + "\n");
                e.write("Telefono: " + obj.getTelefono() + "\n");
                e.write("Semestre: " + obj.getNumSeme() + "\n");
                e.write("Promedio: " + obj.getPromedio() + "\n");
                e.write("Serial: " + obj.getSerial() + "\n");
                e.write("Marca: " + obj.getMarca() + "\n");
                e.write("Tamaño: " + obj.getTamaño() + "\n");
                e.write("Precio: " + obj.getPrecio() + "\n");
                e.write("Sistema Operativo: " + obj.getSistemaOperativo() + "\n");
                e.write("Tipo de Procesador: " + obj.getTipoProcesador() + "\n");
                e.write("------------------------------------------------------\n");
            }
            System.out.println("Archivo exportado correctamente");
            // Si ocurre una excepción al escribir en el archivo, se imprime el mensaje de error
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

