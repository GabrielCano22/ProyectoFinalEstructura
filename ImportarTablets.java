import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.io.File;

public class ImportarTablets {
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

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            TABLETA_GRAFICA obj = null;
            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("Serial:")) {
                    if (obj != null) {
                        lista.add(obj);
                    }
                    obj = new TABLETA_GRAFICA();
                    obj.setSerial(linea.substring(8));
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