import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.io.File;

public class ImportarComputador {
    // Método para importar la lista de computadores desde un archivo de texto
    // Retorna una lista de computadores
    // Si el archivo no existe, lo crea
    // Lee cada línea del archivo y crea un objeto COMPUTADOR_PORTATIL con los atributos correspondientes
    public LinkedList<COMPUTADOR_PORTATIL> ImportarArchivo() {
        String rutaArchivo = "Computadores.txt";
        LinkedList<COMPUTADOR_PORTATIL> lista = new LinkedList<>();

        // Verifica si el archivo existe, si no, lo crea
        File archivo = new File(rutaArchivo);
        if (!archivo.exists()) {
            try (FileWriter fw = new FileWriter(rutaArchivo)) {
                System.out.println("Archivo creado: " + rutaArchivo);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // Lee cada línea del archivo y crea un objeto COMPUTADOR_PORTATIL con los atributos correspondientes
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            COMPUTADOR_PORTATIL obj = null;
            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("Nombre:")) {
                    if (obj != null) {
                        lista.add(obj);
                    }
                  obj= new COMPUTADOR_PORTATIL();
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
                }else if (linea.startsWith("Serial:")) {
                    obj.setSerial(linea.substring(8));
                }
                else if (linea.startsWith("Marca:")) {
                    obj.setMarca(linea.substring(7));
                } else if (linea.startsWith("Tamaño:")) {
                    obj.setTamaño(Double.valueOf(linea.substring(8)));
                } else if (linea.startsWith("Precio:")) {
                    obj.setPrecio(Double.valueOf(linea.substring(8)));
                } else if (linea.startsWith("Sistema Operativo:")) {
                    obj.setSistemaOperativo(linea.substring(19));
                } else if (linea.startsWith("Tipo de Procesador:")) {
                    obj.setTipoProcesador(linea.substring(20));
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