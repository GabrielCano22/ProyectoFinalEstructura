import javax.swing.JOptionPane;
import java.util.LinkedList;

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
        String menuE = "1. Registrar Portatil \n"+"2. Registrar Tablet \n"+"3. Regresar";

        if (input == null) {
            break;
        }
        try {
            opcion = Integer.parseInt(input);
            switch (opcion){
                case 1:
                    JOptionPane.showMessageDialog(null, "Menú de registro de equipos");
                    String TipoEquipo = JOptionPane.showInputDialog(null,menuE, "Que Equipo deseas ingresar?",JOptionPane.QUESTION_MESSAGE);
                    int opcionE = Integer.parseInt(TipoEquipo);

                    if (opcionE ==1){
                        JOptionPane.showMessageDialog(null,"Bienvenido al apartado de registro de portatiles");
                        Metodos c = new Metodos();
                        LinkedList<COMPUTADOR_PORTATIL> ListaC = new LinkedList<>();
                        ListaC = c.LlenarComputador();
                      /*  String ListaComputadores = JOptionPane.showInputDialog(null,menuE, "Deseas conocer la lista de equipos?",JOptionPane.QUESTION_MESSAGE);
                        int ImportarC =Integer.parseInt(ListaComputadores);
                        switch (ImportarC){
                            case 1:
                                ListaC= c.ImportarC();
                                break;
                            case 2:
                                c.ExportarComputadores(ListaC);
                                break;
                        }*/
                        c.MostrarComputadores(ListaC);
                    }else if (opcionE ==2){
                        JOptionPane.showMessageDialog(null,"Bienvenido al apartado de registro de tablets");
                        Metodos m = new Metodos();
                       LinkedList<TABLETA_GRAFICA> ListaT = new LinkedList<>();
                        ListaT = m.LlenarTablets();
                        m.MostrarTablets(ListaT);
                    }
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Eliminar Equipo");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Registrar prestamo ingenieria");
                    objInge obji= new objInge();
                    LinkedList<Estudiante_ingenieria> ListaInge = new LinkedList<>();
                    ListaInge=obji.llenarEstu();
                    obji.mostarEstudianteIne(ListaInge);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Registrar prestamo diseño");
                    objDiseño obDis= new objDiseño();
                    LinkedList<Estudiante_diseño> ListaDiseño = new LinkedList<>();
                    ListaDiseño=obDis.llenarEstu();
                    obDis.mostarestudiantesDiseño(ListaDiseño);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Inventario total ");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Saliendo...");
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
