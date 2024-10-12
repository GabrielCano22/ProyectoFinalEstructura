import javax.swing.JOptionPane;
import java.util.LinkedList;
public class objInge {


    public LinkedList<Estudiante_ingenieria> llenarEstu(){
    boolean continuar=true;
    LinkedList<Estudiante_ingenieria> ListaInge= new LinkedList<>();
        String Nombre;
        String Apellido;
        int Telefono;
        int Cedula;
        String Serial;
        double Promedio;
        int NumSeme;
        int opt=0;
        while (continuar){
            JOptionPane.showMessageDialog(null,"Bienvenido");
            Nombre=JOptionPane.showInputDialog( "por favor ingrese su  nombre: ");
            Apellido= JOptionPane.showInputDialog("Por favor ingrese su apellido: ");
            Telefono= Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese su telefono: "));
            Cedula= Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese su cedula: "));
            Promedio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su promedio: "));
            NumSeme= Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de semestre: "));

            Object e= new Estudiante_ingenieria(Nombre, NumSeme, Promedio, Cedula, Telefono , Apellido);
            ListaInge.add((Estudiante_ingenieria) e);
            opt=Integer.parseInt(JOptionPane.showInputDialog(null, "¿Desea agregar más estudiantes? 1:SI \n" +"2: NO",JOptionPane.QUESTION_MESSAGE));
            if (opt==2){
                continuar=false;
            }

        } return ListaInge;

    }public void mostarEstudianteIne(LinkedList<Estudiante_ingenieria>ListaInge){
        for (Estudiante_ingenieria estu: ListaInge) {
            System.out.println("Nombre: "+estu.getNombre());
            System.out.println("Apellido: "+estu.getApellido());
            System.out.println("Cedula: "+estu.getCedula());
            System.out.println("Telefono: "+estu.getTelefono());
            System.out.println("Promedio: "+estu.getPromedio());
            System.out.println("Numero de Semestre: "+estu.getNumSeme());

        }
    }
}
