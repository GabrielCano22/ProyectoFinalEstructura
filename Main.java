import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args){
    int opcion =0;
    while(opcion!=6){
        String menu = "Menu de opciones: \n"
                + "1. Registrar Equipo \n"
                + "2. Eliminar Equipo \n"
                + "3. Registrar prestamo ingenieria \n"
                + "4. Registrar prestamo diseño \n"
                + "5. Inventario total \n"
                + "6. Salir \n";
        String input = JOptionPane.showInputDialog(null,menu, "MENU",JOptionPane.QUESTION_MESSAGE);

        if (input == null) {
            break;
        }
        try {
            opcion = Integer.parseInt(input);
            switch (opcion){
                case 1:
                    JOptionPane.showMessageDialog(null, "Registrar Equipo");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Eliminar Equipo");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Registrar prestamo ingenieria");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Registrar prestamo diseño");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Inventario total ");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Salir");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Opcion invalida","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    }
}
