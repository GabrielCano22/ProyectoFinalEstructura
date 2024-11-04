import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.io.File;

public class ImportarTablets {
    // Método para importar la lista de tablets desde un archivo de texto
    // Retorna una lista de tablets
    // Si el archivo no existe, lo crea
    // Lee cada línea del archivo y crea un objeto TABLETA_GRAFICA con los atributos correspondientes
    public LinkedList<TABLETA_GRAFICA> ImportarArchivo() {
        String rutaArchivo = "Computadores.txt";
        LinkedList<TABLETA_GRAFICA> lista = new LinkedList<>();

        // Verifica si el archivo existe, si no, lo crea
        File archivo = new File(rutaArchivo);
        if (!archivo.exists()) {
            try (FileWriter fw = new FileWriter(rutaArchivo)) {
                System.out.println("Archivo creado: " + rutaArchivo);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // Lee cada línea del archivo y crea un objeto TABLETA_GRAFICA con los atributos correspondientes
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            TABLETA_GRAFICA obj = null;
            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("Nombre:")) {
                    if (obj != null) {
                        lista.add(obj);
                    }
                    obj= new TABLETA_GRAFICA();
                    obj.setNombre(linea.substring(8));
                } else if (linea.startsWith("Apellido:")) {
                    obj.setApellido(linea.substring(10));
                } else if (linea.startsWith("Cedula:")) {
                    obj.setCedula(Integer.valueOf(linea.substring(8)));
                } else if (linea.startsWith("Telefono:")) {
                    obj.setTelefono(Integer.valueOf(linea.substring(10)));
                } else if (linea.startsWith("Semestre:")) {
                    obj.setNumSeme(Integer.parseInt(linea.substring(10)));
                } else if (linea.startsWith("Promedio:")) {
                    obj.setPromedio(Double.parseDouble(linea.substring(10)));
                } else if (linea.startsWith("Marca:")) {
                    obj.setMarca(linea.substring(7));
                } else if (linea.startsWith("Tamaño:")) {
                    obj.setTamaño(Double.valueOf(linea.substring(8)));
                } else if (linea.startsWith("Precio:")) {
                    obj.setPrecio(Double.valueOf(linea.substring(8)));
                } else if (linea.startsWith("Peso:")) {
                    obj.setPeso(Double.valueOf(linea.substring(6)));
                } else if (linea.startsWith("Almacenamiento:")) {
                    obj.setTipoA(linea.substring(16));
                }
            }
            if (obj != null) {
                lista.add(obj);
            }
            System.out.println("Archivo importado correctamente");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
}