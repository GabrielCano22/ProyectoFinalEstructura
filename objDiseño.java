import javax.swing.JOptionPane;
import java.util.LinkedList;
public class objDiseño {
    public LinkedList<Estudiante_diseño> llenarEstu() {
        boolean continuar = true;
        LinkedList<Estudiante_diseño> ListaDiseño = new LinkedList<>();
        String Nombre;
        String Apellido;
        int Telefono;
        int Cedula;
        double Promedio;
        int NumSeme;
        int opt = 0;
        while (continuar) {
            JOptionPane.showMessageDialog(null,"Bienvenido");
            Nombre = JOptionPane.showInputDialog("por favor ingrese su  nombre: ");
            Apellido = JOptionPane.showInputDialog("Por favor ingrese su apellido: ");
            Telefono = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese su telefono: "));
            Cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cedula: "));
            Promedio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su promedio: "));
            NumSeme = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de semestre: "));

            Object es = new Estudiante_diseño(Nombre, NumSeme, Cedula, Telefono, NumSeme,Apellido );
            ListaDiseño.add((Estudiante_diseño) es);
            opt = Integer.parseInt(JOptionPane.showInputDialog(null,"¿Desea agregar más estudiantes? 1:SI \n 2: NO" , JOptionPane.QUESTION_MESSAGE));
            if (opt == 2) {
                continuar = false;
            }
        }
        return ListaDiseño;
    }

    public void mostarestudiantesDiseño(LinkedList<Estudiante_diseño> ListaDiseño) {
        for (Estudiante_diseño estudi: ListaDiseño) {
            System.out.println("Nombre: " + estudi.getNombre());
            System.out.println("Apellido: " + estudi.getApellido());
            System.out.println("Cedula: " + estudi.getCedula());
            System.out.println("Telefono: " + estudi.getTelefono());
            System.out.println("Promedio: " + estudi.getPromedio());
            System.out.println("Numero de Semestre: " + estudi.getNumSeme());

        }
    }
}