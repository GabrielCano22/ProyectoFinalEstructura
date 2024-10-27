import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Metodos {
    public LinkedList<COMPUTADOR_PORTATIL> LlenarComputador() {
        boolean continuar = true;
        LinkedList<COMPUTADOR_PORTATIL> ListaC = new LinkedList<>();
        String Serial;
        String Marca;
        String SistemaOperativo;
        String TipoProcesador;
        Double Tamaño;
        Double Precio;
        int opt = 0;
        int OperativeSystem = 0;
        int Procesador =0;

        while (continuar) {
            Serial = JOptionPane.showInputDialog("Ingrese el serial del computador: ");
            Marca = JOptionPane.showInputDialog("Ingrese la marca del computador: ");
            Tamaño = Double.valueOf(JOptionPane.showInputDialog("Ingrese el tamaño del computador en PULGADAS: "));
            Precio = Double.valueOf(JOptionPane.showInputDialog("Ingrese el precio del computador: "));
            OperativeSystem = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el sistema operativo que necesita: \n1. Windows 7 \n 2. Windows 10\n 3. Windows 11"));
            switch (OperativeSystem) {
                case 1:
                    SistemaOperativo = "Windows 7";
                    break;
                case 2:
                    SistemaOperativo = "Windows 10";
                    break;
                case 3:
                    SistemaOperativo = "Windows 11";
                    break;
                default:
                    SistemaOperativo = "Sistema Operativo no valido";
            }
            Procesador= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de procesador que necesita: \n1. Intel®Core™i5 \n 2. AMD Ryzen"));
            switch (Procesador) {
                case 1:
                    TipoProcesador = "Intel®Core™i5";
                    break;
                case 2:
                    TipoProcesador = "AMD Ryzen";
                    break;
                default:
                    TipoProcesador = "Procesador no valido";
            }
            COMPUTADOR_PORTATIL c = new COMPUTADOR_PORTATIL(Serial, Marca, Tamaño, Precio, SistemaOperativo, TipoProcesador);
            ListaC.add(c);

            String input = JOptionPane.showInputDialog(null, "Desea agregar mas computadores? 1=SI; 2=NO", JOptionPane.QUESTION_MESSAGE);
            opt = Integer.parseInt(input);
            if (opt == 2) {
                continuar = false;
            }
        }
        return ListaC;
    }

    public LinkedList<TABLETA_GRAFICA> LlenarTablets() {
        boolean continuar = true;
        LinkedList<TABLETA_GRAFICA> ListaT = new LinkedList<>();
        String Serial;
        String Marca;
        String TipoA;
        Double Tamaño;
        Double Precio;
        Double Peso;
        int opt = 0;
        int Storage = 0;

        while (continuar) {
            Serial = JOptionPane.showInputDialog("Ingrese el serial del tablet: ");
            Marca = JOptionPane.showInputDialog("Ingrese la marca de la tablet: ");
            Tamaño = Double.valueOf(JOptionPane.showInputDialog("Ingrese el tamaño de la tablet en PULGADAS: "));
            Precio = Double.valueOf(JOptionPane.showInputDialog("Ingrese el precio de la tablet: "));
            Peso = Double.valueOf(JOptionPane.showInputDialog("Ingrese el peso de la tablet en KG: "));
            Storage = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de almacenamiento que necesita: \n1. 256 GB\n 2. 512 GB\n 3. 1 TB"));
            switch (Storage) {
                case 1:
                    TipoA = "256 GB";
                    break;
                case 2:
                    TipoA = "512 GB";
                    break;
                case 3:
                    TipoA = "1 TB";
                    break;
                default:
                    TipoA = "Almacenamiento no valido";
            }

            TABLETA_GRAFICA t = new TABLETA_GRAFICA(Serial, Marca, Tamaño, Precio, Peso, TipoA);
            ListaT.add(t);
            String input = JOptionPane.showInputDialog(null, "Desea agregar mas tablets? 1=SI; 2=NO", JOptionPane.QUESTION_MESSAGE);
            opt = Integer.parseInt(input);
            if (opt == 2) {
                continuar = false;
            }
        }
        return ListaT;
    }

    public void MostrarTablets(LinkedList<TABLETA_GRAFICA> ListaT) {
        for (TABLETA_GRAFICA itemT : ListaT) {
            System.out.println("Serial: " + itemT.getSerial());
            System.out.println("Marca: " + itemT.getMarca());
            System.out.println("Tamaño: " + itemT.getTamaño());
            System.out.println("Precio: " + itemT.getPrecio());
            System.out.println("Peso: " + itemT.getPeso());
            System.out.println("Almacenamiento: " + itemT.getTipoA());
            System.out.println("------------------------------------");
        }
    }

    public void MostrarComputadores(LinkedList<COMPUTADOR_PORTATIL> ListaC) {
        for (COMPUTADOR_PORTATIL itemC : ListaC) {
            System.out.println("Serial: " + itemC.getSerial());
            System.out.println("Marca: " + itemC.getMarca());
            System.out.println("Tamaño: " + itemC.getTamaño());
            System.out.println("Precio: " + itemC.getPrecio());
            System.out.println("Sistema Operativo: " + itemC.getSistemaOperativo());
            System.out.println("Tipo de Procesador: " + itemC.getTipoProcesador());
            System.out.println("------------------------------------");
        }
    }

    public void ExportarComputadores(LinkedList<COMPUTADOR_PORTATIL> listaC) {
        ExportarComputadores exportarC = new ExportarComputadores();
        exportarC.exportarArchivo(listaC);
    }

    public LinkedList<COMPUTADOR_PORTATIL> ImportarC() {
        ImportarComputador importarC = new ImportarComputador();
        LinkedList<COMPUTADOR_PORTATIL> listaC = importarC.ImportarArchivo();
        return listaC;
    }
    public void ExportarTablets(LinkedList<TABLETA_GRAFICA> listaT) {
        ExportarTablets exportarT = new ExportarTablets();
        exportarT.exportarArchivo(listaT);
    }
    public LinkedList<TABLETA_GRAFICA> ImportarT() {
        ImportarTablets importarT = new ImportarTablets();
        LinkedList<TABLETA_GRAFICA> listaT = importarT.ImportarArchivo();
        return listaT;
    }
}