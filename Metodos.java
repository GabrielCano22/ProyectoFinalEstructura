import java.util.LinkedList;
import javax.swing.JOptionPane;
public class Metodos {
    public LinkedList<TABLETA_GRAFICA> LlenarTablets(){
        boolean continuar = true;
        LinkedList<TABLETA_GRAFICA> ListaT = new LinkedList<>();
        String Serial;
        String Marca;
        Double Tamaño;
        Double Precio;
        Double Peso;
        int opt =0;
        while(continuar){
            Serial = JOptionPane.showInputDialog("Ingrese el serial del tablet: ");
            Marca = JOptionPane.showInputDialog("Ingrese la marca de la tablet: ");
            Tamaño = Double.valueOf(JOptionPane.showInputDialog("Ingrese el tamaño de la tablet en PULGADAS: "));
            Precio = Double.valueOf(JOptionPane.showInputDialog("Ingrese el precio de la tablet: "));
            Peso = Double.valueOf(JOptionPane.showInputDialog("Ingrese el peso de la tablet en KG: "));

            Object t = new TABLETA_GRAFICA(Serial,Marca,Tamaño,Precio,Peso);
            ListaT.add((TABLETA_GRAFICA) t);
            String input = JOptionPane.showInputDialog(null, "Desea agregar mas tablets? 1=SI; 2=NO",JOptionPane.QUESTION_MESSAGE);
            opt = Integer.parseInt(input);
            if (opt == 2){
                continuar = false;
            }
        }return  ListaT;
    }   public void MostrarTablets(LinkedList<TABLETA_GRAFICA> ListaT){
        for (TABLETA_GRAFICA itemT : ListaT){
            System.out.println( "Serial: "+itemT.getSerial());
            System.out.println( "Marca: "+itemT.getMarca());
            System.out.println( "Tamaño: "+itemT.getTamaño());
            System.out.println( "Precio: "+itemT.getPrecio());
            System.out.println( "Peso: "+itemT.getPeso());
        }
    }
}
