import javax.swing.JOptionPane;
import java.awt.*;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        while (opcion != 4) {
            String menu = "MENU PRINCIPAL: \n"
                    + "1. ESTUDIANTES DE INGENIERIA \n"
                    + "2. ESTUDIANTES DE DISEÑO \n"
                    + "3. IMPRIMIR INVENTARIO TOTAL \n"
                    + "4. SALIR \n";
            String input = JOptionPane.showInputDialog(null, menu, "MENU", JOptionPane.QUESTION_MESSAGE);

            if (input == null) {
                break;
            }
            try {
                opcion = Integer.parseInt(input);
                switch (opcion) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Menú de registro de equipos");
                        Metodos m= new Metodos();
                        m.mostrarMenuIngenieria();
                        break;
                    case 2:
                        JOptionPane.showMessageDialog((Component)null, "Menú de registro de equipos");
                        Metodos me = new Metodos();
                        me.mostrarMenuDiseño();
                        break;
                    case 3:
                        JOptionPane.showMessageDialog((Component)null, "INVENTARIO");
                        Metodos mt= new Metodos();
                        mt.MostrarInventario();
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null,"bye");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion invalida", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Opcion invalida", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}