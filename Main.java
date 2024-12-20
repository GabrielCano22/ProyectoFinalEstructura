import javax.swing.JOptionPane;
import java.awt.*;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Metodos metodos = new Metodos(); //Instanciamos la clase métodos para poder usarla en cada una de las opciones del menú
        int opcion = 0; // creacion de una variable para el menu
        while (opcion != 4) {
            String menu = "MENU PRINCIPAL: \n"
                    + "1. ESTUDIANTES DE INGENIERIA \n"
                    + "2. ESTUDIANTES DE DISEÑO \n"
                    + "3. IMPRIMIR INVENTARIO TOTAL \n"
                    + "4. SALIR \n";
            String input = JOptionPane.showInputDialog(null, menu, "MENU", JOptionPane.QUESTION_MESSAGE); //pop up para el menu y registro de opcion

            if (input == null) { // Si el usuario no ingresa nada, se cierre
                break;
            }
            try {
                opcion = Integer.parseInt(input); //Parseamos el string a entero para poder escoger una opción
                switch (opcion) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Menú de registro de equipos");
                        metodos.mostrarMenuIngenieria();
                        break;
                    case 2:
                        JOptionPane.showMessageDialog((Component)null, "Menú de registro de equipos");
                        metodos.mostrarMenuDiseño();
                        break;
                    case 3:
                        JOptionPane.showMessageDialog((Component)null, "INVENTARIO");
                        metodos.MostrarInventarioTotal();
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null,"Hasta luego.");
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