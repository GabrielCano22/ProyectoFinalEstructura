import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;

public class ImportarComputador {
    public LinkedList<COMPUTADOR_PORTATIL> ImportarArchivo() {
        String rutaArchivo = "Computadores.txt";
        LinkedList<COMPUTADOR_PORTATIL> lista = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            COMPUTADOR_PORTATIL obj = null;
            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("Serial:")) {
                    if (obj != null) {
                        lista.add(obj);
                    }
                    obj = new COMPUTADOR_PORTATIL();
                    obj.setSerial(linea.substring(8));
                } else if (linea.startsWith("Marca:")) {
                    if (obj != null) {
                        obj.setMarca(linea.substring(7));
                    }
                } else if (linea.startsWith("Tamaño:")) {
                    if (obj != null) {
                        obj.setTamaño(Double.valueOf(linea.substring(8)));
                    }
                } else if (linea.startsWith("Precio:")) {
                    if (obj != null) {
                        obj.setPrecio(Double.valueOf(linea.substring(8)));
                    }
                } else if (linea.startsWith("Sistema Operativo:")) {
                    if (obj != null) {
                        obj.setSistemaOperativo(linea.substring(19));
                    }
                } else if (linea.startsWith("Tipo de Procesador:")) {
                    if (obj != null) {
                        obj.setTipoProcesador(linea.substring(20));
                    }
                }
            }
            System.out.println("Archivo importado correcrtamente ");

        } catch (Exception e) {
            // TODO: handle exception
        }
        return lista;
    }

}