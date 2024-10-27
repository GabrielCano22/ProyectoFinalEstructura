import javax.swing.JOptionPane;
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
            String menuE = "1. Registrar Portatil \n" + "2. Registrar Tablet \n" + "3. Regresar";

            if (input == null) {
                break;
            }
            try {
                opcion = Integer.parseInt(input);
                switch (opcion) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Menú de registro de equipos");
                        String TipoEquipo = JOptionPane.showInputDialog(null, menuE, "Que Equipo deseas ingresar?", JOptionPane.QUESTION_MESSAGE);
                        int opcionE = Integer.parseInt(TipoEquipo);

                        if (opcionE == 1) {
                            Metodos c = new Metodos();
                            c.mostrarMenuIngenieria();
                        } else if (opcionE == 2) {
                            Metodos m = new Metodos();
                            m.mostrarMenuDiseño();
                        }
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Eliminar Equipo");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Registrar prestamo ingenieria");
                        objInge obji = new objInge();
                        LinkedList<Estudiante_ingenieria> ListaInge = obji.llenarEstu();
                        obji.mostarEstudianteIne(ListaInge);
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Registrar prestamo diseño");
                        objDiseño obDis = new objDiseño();
                        LinkedList<Estudiante_diseño> ListaDiseño = obDis.llenarEstu();
                        obDis.mostarestudiantesDiseño(ListaDiseño);
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Inventario total ");
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Saliendo...");
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