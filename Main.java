import javax.swing.JOptionPane;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        while (opcion != 6) {
            String menu = "Menu de opciones: \n"
                    + "1. Registrar Equipo \n"
                    + "2. Eliminar Equipo \n"
                    + "3. Registrar prestamo ingenieria \n"
                    + "4. Registrar prestamo diseño \n"
                    + "5. Inventario total \n"
                    + "6. Salir \n";
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
                            JOptionPane.showMessageDialog(null, "Bienvenido al apartado de registro de portatiles");
                            Metodos c = new Metodos();
                            LinkedList<COMPUTADOR_PORTATIL> ListaC = c.LlenarComputador();
                            c.MostrarComputadores(ListaC);
                            String ListaComputadores = JOptionPane.showInputDialog(null, "1. Importar Computadores\n2. Exportar Computadores\n 3. Continuar", "Deseas conocer la lista de equipos?", JOptionPane.QUESTION_MESSAGE);
                            int ImportarC = Integer.parseInt(ListaComputadores);
                            switch (ImportarC) {
                                case 1:
                                    ImportarComputador importar = new ImportarComputador();
                                    ListaC = importar.ImportarArchivo();
                                    c.MostrarComputadores(ListaC);
                                    break;
                                case 2:
                                    ExportarComputadores exportar = new ExportarComputadores();
                                    exportar.exportarArchivo(ListaC);
                                    break;
                            }
                        } else if (opcionE == 2) {
                            JOptionPane.showMessageDialog(null, "Bienvenido al apartado de registro de tablets");
                            Metodos m = new Metodos();
                            LinkedList<TABLETA_GRAFICA> ListaT = m.LlenarTablets();
                            m.MostrarTablets(ListaT);
                            String ListaTablets = JOptionPane.showInputDialog(null, "1. Importar Tablets\n2. Exportar Tablets\n3. Continuar", "Deseas conocer la lista de equipos?", JOptionPane.QUESTION_MESSAGE);
                            int ImportarT = Integer.parseInt(ListaTablets);
                            switch (ImportarT) {
                                case 1:
                                    ImportarTablets importar = new ImportarTablets();
                                    ListaT = importar.ImportarArchivo();
                                    m.MostrarTablets(ListaT);
                                    break;
                                case 2:
                                    ExportarTablets exportar = new ExportarTablets();
                                    exportar.exportarArchivo(ListaT);
                                    break;
                            }
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