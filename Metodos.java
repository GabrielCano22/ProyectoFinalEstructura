import java.awt.*;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Metodos {
    // Variables para llevar el control de la cantidad de computadores y tablets
    private int TotalComputadores = 0;
    private int TotalTablets = 0;
    private LinkedList<COMPUTADOR_PORTATIL> ListaC = new LinkedList<>();
    private LinkedList<TABLETA_GRAFICA> ListaT = new LinkedList<>();
    //Las declaramos como private para que estas sean manipuladas unicamente desde la clase métodos

    // Método para mostrar el menú de estudiantes de ingeniería
    public void mostrarMenuIngenieria() {
        int opcion = 0;
        while (opcion != 5) {
            String menu = "MENU ESTUDIANTES INGENIERIA: \n"
                    + "1. Registrar Préstamo de Equipo \n"
                    + "2. Modificar Préstamo de Equipo \n"
                    + "3. Devolución de Equipo \n"
                    + "4. Buscar Equipo \n"
                    + "5. Volver al menú principal \n";
            String input = JOptionPane.showInputDialog(null, menu, "MENU", JOptionPane.QUESTION_MESSAGE);
            if (input == null) {
                break;
            }
            try {
                opcion = Integer.parseInt(input);
                switch (opcion) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Bienvenido al apartado de registro de portátiles");
                        // LlenarComputador() retorna una lista de computadores
                        ListaC.addAll(LlenarComputador());
                        // MostrarComputadores() imprime en consola la lista de computadores
                        MostrarComputadores(ListaC);
                        // Se pregunta al usuario si desea importar o exportar la lista de computadores
                        String listaComputadores = JOptionPane.showInputDialog(null, "1. Importar Computadores\n2. Exportar Computadores\n3. Continuar", "Deseas conocer la lista de equipos?", JOptionPane.QUESTION_MESSAGE);
                        try {
                            int importarC = Integer.parseInt(listaComputadores);
                            switch (importarC) {
                                case 1:
                                    ListaC.addAll(ImportarC());
                                    JOptionPane.showMessageDialog(null, "Importación completada. Lista actualizada:");
                                    MostrarComputadores(ListaC);
                                    break;
                                case 2:
                                    ExportarComputadores(ListaC);
                                    JOptionPane.showMessageDialog(null, "Exportación completa.");
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Opción inválida");
                                    break;
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Opción inválida, por favor ingrese un número");
                        }
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Bienvenido al apartado de modificación de portátiles");
                        // modificarComputador() modifica un computador de la listaC
                        modificarComputador(ListaC);
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Bienvenido al apartado de devolución de portátiles");
                        // DevolverPc() hace la cancelacion de un computador de la listaC
                        DevolverPc(ListaC);
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Bienvenido al apartado de búsqueda de portátiles");
                        // BuscarC() busca un computador en la listaC
                        BuscarC(ListaC);
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Volviendo al menú principal");
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Opción inválida", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    // Método para mostrar el menú de estudiantes de diseño
    public void mostrarMenuDiseño() {
        int opcionD = 0;
        while (opcionD != 5) {
            String menu = "MENU ESTUDIANTES DISEÑO: \n"
                    + "1. Registrar Préstamo de Tablet \n"
                    + "2. Modificar Préstamo de Tablet \n"
                    + "3. Devolución de Tablet \n"
                    + "4. Buscar Tablet \n"
                    + "5. Volver al menú principal \n";
            String input = JOptionPane.showInputDialog(null, menu, "MENU", JOptionPane.QUESTION_MESSAGE);
            if (input == null) {
                break;
            }
            try {
                opcionD = Integer.parseInt(input);
                switch (opcionD) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Bienvenido al apartado de registro de Tablets");
                        // LlenarTablets() retorna una lista de tablets
                        ListaT.addAll(LlenarTablets());
                        // MostrarTablets() imprime en consola la lista de tablets
                        MostrarTablets(ListaT);
                        // Se pregunta al usuario si desea importar o exportar la lista de tablets
                        String ListaTablets = JOptionPane.showInputDialog(null, "1. Importar Tablets\n2. Exportar Tablets\n3. Continuar", "Deseas conocer la lista de equipos?", JOptionPane.QUESTION_MESSAGE);
                        try {
                            int ImportarT = Integer.parseInt(ListaTablets);
                            switch (ImportarT) {
                                case 1:
                                    ListaT.addAll(ImportarT());
                                    JOptionPane.showMessageDialog(null, "Importación completada. Lista actualizada:");
                                    MostrarTablets(ListaT);
                                    break;
                                case 2:
                                    ExportarTablets(ListaT);
                                    JOptionPane.showMessageDialog(null, "Exportación completa.");
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Opción inválida");
                                    break;
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Opción inválida, por favor ingrese un número correcto");
                        }
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Bienvenido al apartado de modificación de Tablets");
                        // Le permite al usuario modificar una tablet de la listaT
                        modificarTablet(ListaT);
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Bienvenido al apartado de devolución de Tablets");
                        // Le permite al usuario devolver una tablet de la listaT
                        DevolverTb(ListaT);
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Bienvenido al apartado de busqueda de Tablets");
                        // Le permite al usuario buscar una tablet en la listaT
                        BuscarT(ListaT);
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Volviendo al menú principal");
                        break;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Opcion invalida", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Metodo para llenar la lista de computadores
    public LinkedList<COMPUTADOR_PORTATIL> LlenarComputador() {
        // Se inicializa la variable continuar en true para que el ciclo while se ejecute al menos una vez
        boolean continuar = true;
        // Se crea una lista de computadores
        LinkedList<COMPUTADOR_PORTATIL> ListaC = new LinkedList<>();
        // Se inicializan las variables que se van a utilizar
        String Nombre;
        String Apellido;
        int Telefono;
        int Cedula;
        double Promedio;
        int NumSeme;
        String Serial;
        String Marca;
        String SistemaOperativo;
        String TipoProcesador = "";
        Double Tamaño = 0.0;
        Double Precio;
        int opt = 0;
        int OperativeSystem = 0;
        int Procesador = 0;

        while (continuar) {
            while (true) {
                Nombre = JOptionPane.showInputDialog("Por favor ingrese su nombre: ");
                if (Nombre != null && !Nombre.matches(".*\\d.*")) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Entrada no válida. Intente nuevamente.");
                }
            }
            while (true) {
                Apellido = JOptionPane.showInputDialog("Por favor ingrese su apellido: ");
                if (Apellido != null && !Apellido.matches(".*\\d.*")) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Entrada no válida. Intente nuevamente.");
                }
            }
            while (true) {
                try {
                    Telefono = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese su telefono: "));
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog((Component) null, "Entrada no válida. Intente nuevamente.");
                }
            }
            while (true) {
                try {
                    Cedula = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese su cedula: "));
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog((Component) null, "Entreda no validad. Intente nuevamente");
                }
            }

            while (true) {
                try {
                    Promedio = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese su promedio: "));
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog((Component) null, "Entrada no válida. Intente nuevamente.");
                }
            }
            while (true) {
                try {
                    NumSeme = Integer.parseInt(JOptionPane.showInputDialog("Por facor ingrese su numero de semestre: "));
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog((Component) null, "Entrada no válida. Intente nuevamente.");
                }
            }

            while (true) {
                Serial = JOptionPane.showInputDialog("Por favor ingrese el serial del pc: ");
                if (Serial != null && !Serial.matches(".*\\d.*")) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Entrada no válida. Intente nuevamente.");
                }
            }
            while (true) {
                Marca = JOptionPane.showInputDialog("Por favor ingrese la marca del pc: ");
                if (Marca != null && !Marca.matches(".*\\d.*")) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Entrada no válida. Intente nuevamente.");
                }
            }
            while (true) {
                try {
                    Tamaño = Double.valueOf(JOptionPane.showInputDialog("Por favor ingrese el tamaño del computador en PULGADAS: "));
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog((Component) null, "Entrada no válida. Intente nuevamente.");
                }
            }
            while (true) {
                try {
                    Precio = Double.valueOf(JOptionPane.showInputDialog("Por favor ingrese el precio del computador: "));
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog((Component) null, "Entreda no valida. Intente nuevamente");
                }
            }

            while (true) {
                try {
                    OperativeSystem = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el sistema operativo que necesita: \n1. Windows 7 \n 2. Windows 10\n 3. Windows 11"));
                    break;
                } catch (NumberFormatException var27) {
                    JOptionPane.showMessageDialog((Component) null, "Entrada no validad. Intente nuevamente");
                }
            }

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
                    SistemaOperativo = "no valido";
            }

            while (true) {
                try {
                    Procesador = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el tipo de procesador que necesita: \n1. Intel®Core™i5 \n 2. AMD Ryzen"));
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog((Component) null, "Entrada no valida. Intente nuevamente");
                }
            }

            switch (Procesador) {
                case 1:
                    TipoProcesador = "Intel®Core™i5";
                    break;
                case 2:
                    TipoProcesador = "AMD Ryzen";
                    break;
                default:
                    TipoProcesador = "no valido";
            }
            // Se crea un objeto COMPUTADOR_PORTATIL con los datos ingresados
            COMPUTADOR_PORTATIL c = new COMPUTADOR_PORTATIL(Nombre, Apellido, Telefono, Cedula, Promedio, NumSeme, Serial, Marca, SistemaOperativo, TipoProcesador, Tamaño, Precio);
            // Se agrega el objeto a la lista de computadores
            ListaC.add(c);
            // Se incrementa el total de computadores
            TotalComputadores++;
            String input = JOptionPane.showInputDialog((Component) null, "Desea agregar mas computadores? 1=SI; 2=NO", 1);
            opt = Integer.parseInt(input);
            if (opt == 2) {
                continuar = false;
            }
            JOptionPane.showMessageDialog(null, "Computador agregado exitosamente. Total de computadores: " + TotalComputadores);

        }
        return ListaC;
    }

    // Método para llenar la lista de tablets
    public LinkedList<TABLETA_GRAFICA> LlenarTablets() {
        // Se inicializa la variable continuar en true para que el ciclo while se ejecute al menos una vez
        boolean continuar = true;
        // Se crea una lista de tablets
        LinkedList<TABLETA_GRAFICA> ListaT = new LinkedList<>();
        // Se inicializan las variables que se van a utilizar
        String Nombre;
        String Apellido;
        int Telefono;
        int Cedula;
        double Promedio;
        int NumSeme;
        String Serial;
        String Marca;
        String TipoA = "";
        Double Tamaño;
        Double Precio;
        Double Peso;
        int opt = 0;
        int Storage = 0;
        while (continuar) {
            while (true) {
                Nombre = JOptionPane.showInputDialog("Por favor ingrese su nombre: ");
                if (Nombre != null && !Nombre.matches(".*\\d.*")) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Entrada no válida. Intente nuevamente.intente otra vez");
                }
            }

            while (true) {
                Apellido = JOptionPane.showInputDialog("Por favor ingrese su apellido: ");
                if (Apellido != null && !Apellido.matches(".*\\d.*")) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Entrada no válida. Intente nuevamente.intente otra vez");
                }
            }
            while (true) {
                try {
                    Telefono = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese su telefono: "));
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog((Component) null, "Entrada no válida. Intente nuevamente.");
                }
            }
            while (true) {
                try {
                    Cedula = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese su cedula: "));
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog((Component) null, "Entreda no validad. Intente nuevamente");
                }
            }

            while (true) {
                try {
                    Promedio = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese su promedio: "));
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog((Component) null, "Entrada no válida. Intente nuevamente.");
                }
            }
            while (true) {
                try {
                    NumSeme = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese su numero de semestre: "));
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog((Component) null, "Entrada no válida. Intente nuevamente.");
                }
            }
            while (true) {
                Serial = JOptionPane.showInputDialog("Por favor ingrese el serial de la tablet ");
                if (Serial != null && !Serial.matches(".*\\d.*")) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Entrada no válida. Intente nuevamente.");
                }
            }
            while (true) {
                Marca = JOptionPane.showInputDialog("Por favor ingrese la marca de la tablet: ");
                if (Marca != null && !Marca.matches(".*\\d.*")) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "intente otra vez");
                }
            }
            while (true) {
                try {
                    Tamaño = Double.valueOf(JOptionPane.showInputDialog("Ingrese el tamaño de la tablet en PULGADAS: "));
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Entrada no válida. Intente nuevamente.");
                }
            }
            while (true) {
                try {
                    Precio = Double.valueOf(JOptionPane.showInputDialog(null, "Por favor ingrese el precio de la tablet"));
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Entrada no válida. Intente nuevamente.");
                }
            }

            while (true) {
                try {
                    Peso = Double.valueOf(JOptionPane.showInputDialog("Por favor Ingrese el peso de la tablet en KG: "));
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog((Component) null, "Entrada no válida. Intente nuevamente.");
                }
            }
            while (true) {
                try {
                    Storage = Integer.parseInt(JOptionPane.showInputDialog("Por favor Ingrese el tipo de almacenamiento que necesita: \n1. 256 GB\n 2. 512 GB\n 3. 1 TB"));
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
                            TipoA = "Inválido";
                            JOptionPane.showMessageDialog(null, "Opción no válida.");
                    }
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Entrada no válida. Intente nuevamente.");
                }
            }
            // Se crea un objeto TABLETA_GRAFICA con los datos ingresados
            TABLETA_GRAFICA t = new TABLETA_GRAFICA(Nombre, Apellido, Telefono, Cedula, Promedio, NumSeme, Serial, Marca, TipoA, Tamaño, Precio, Peso);
            // Se agrega el objeto a la lista de tablets
            ListaT.add(t);
            // Se incrementa el total de tablets
            TotalTablets++;
            String input = JOptionPane.showInputDialog((Component) null, "Desea agregar mas tablets? 1=SI; 2=NO", 1);
            opt = Integer.parseInt(input);
            if (opt == 2) {
                continuar = false;
            }
            JOptionPane.showMessageDialog(null, "Tablet agregada exitosamente. Total de tablets: " + TotalTablets);
        }
        return ListaT;
    }
    //Método para mostrar en consola y en la ejecucion todos los datos ingresados de las tablets
    public void MostrarTablets(LinkedList<TABLETA_GRAFICA> ListaT) {
        for (TABLETA_GRAFICA itemT : ListaT) {
            System.out.println("Nombre: " + itemT.getNombre());
            System.out.println("Apellido: " + itemT.getApellido());
            System.out.println("Cedula: " + itemT.getCedula());
            System.out.println("Telefono: " + itemT.getTelefono());
            System.out.println("Promedio: " + itemT.getPromedio());
            System.out.println("Numero de Semestre: " + itemT.getNumSeme());
            System.out.println("Serial: " + itemT.getSerial());
            System.out.println("Marca: " + itemT.getMarca());
            System.out.println("Tamaño: " + itemT.getTamaño());
            System.out.println("Precio: " + itemT.getPrecio());
            System.out.println("Peso: " + itemT.getPeso());
            System.out.println("Almacenamiento: " + itemT.getTipoA());
            System.out.println("------------------------------------");
        }
    }

    // Método para mostrar en consola y en la ejecución todos los datos ingresados de los computadores
    public void MostrarComputadores(LinkedList<COMPUTADOR_PORTATIL> ListaC) {
        for (COMPUTADOR_PORTATIL itemC : ListaC) {
            System.out.println("Nombre: " + itemC.getNombre());
            System.out.println("Apellido: " + itemC.getApellido());
            System.out.println("Cedula: " + itemC.getCedula());
            System.out.println("Telefono: " + itemC.getTelefono());
            System.out.println("Promedio: " + itemC.getPromedio());
            System.out.println("Numero de Semestre: " + itemC.getNumSeme());
            System.out.println("Serial: " + itemC.getSerial());
            System.out.println("Marca: " + itemC.getMarca());
            System.out.println("Tamaño: " + itemC.getTamaño());
            System.out.println("Precio: " + itemC.getPrecio());
            System.out.println("Sistema Operativo: " + itemC.getSistemaOperativo());
            System.out.println("Tipo de Procesador: " + itemC.getTipoProcesador());
            System.out.println("------------------------------------");
        }
    }

    //Metodo para buscar un computador en la lista de computadores
    public COMPUTADOR_PORTATIL BuscarC(LinkedList<COMPUTADOR_PORTATIL> ListaC) {
        // Hacemos que se busque por la cedula del estudiante
        int CedulaBuscarC = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del estudiante: "));
        COMPUTADOR_PORTATIL resultadoBusquedaC = null;
        // Recorremos la lista de computadores
        for (COMPUTADOR_PORTATIL ItemBusquedaC : ListaC) {
            // Si la cedula del estudiante es igual a la cedula ingresada por el usuario se muestra la informacion del computador
            if (ItemBusquedaC.getCedula() == CedulaBuscarC) {
                resultadoBusquedaC = ItemBusquedaC;
                break;
            }
        }
        // Si el computador se encuentra en la lista se muestra la informacion del computador
        if (resultadoBusquedaC != null) {
            JOptionPane.showMessageDialog(null, "Computador encontrado:\n" +
                    "Nombre: " + resultadoBusquedaC.getNombre() + "\n" +
                    "Apellido: " + resultadoBusquedaC.getApellido() + "\n" +
                    "Cedula: " + resultadoBusquedaC.getCedula() + "\n" +
                    "Telefono: " + resultadoBusquedaC.getTelefono() + "\n" +
                    "Semestre: " + resultadoBusquedaC.getNumSeme() + "\n" +
                    "Promedio: " + resultadoBusquedaC.getPromedio() + "\n" +
                    "Serial: " + resultadoBusquedaC.getSerial() + "\n" +
                    "Marca: " + resultadoBusquedaC.getMarca() + "\n" +
                    "Tamaño: " + resultadoBusquedaC.getTamaño() + "\n" +
                    "Precio: " + resultadoBusquedaC.getPrecio() + "\n" +
                    "Sistema Operativo: " + resultadoBusquedaC.getSistemaOperativo() + "\n" +
                    "Tipo de Procesador: " + resultadoBusquedaC.getTipoProcesador() + "\n");
        } else {
            JOptionPane.showMessageDialog(null, "Computador no encontrado");
        }
        return resultadoBusquedaC;
    }

    // Metodo para modificar un computador en la lista de computadores
    public void modificarComputador(LinkedList<COMPUTADOR_PORTATIL> listaC) {
        // Se pide al usuario que ingrese el serial del computador que desea modificar
        String serialModificar = JOptionPane.showInputDialog("Ingrese el serial del computador que desea modificar: ");
        COMPUTADOR_PORTATIL computadorModificar = null;
        // Se recorre la lista de computadores para buscar el computador con el serial ingresado
        for (COMPUTADOR_PORTATIL item : listaC) {
            // Si el serial del computador es igual al serial ingresado por el usuario se guarda el computador en la variable computadorModificar
            if (item.getSerial().equals(serialModificar)) {
                computadorModificar = item;
                break;
            }
        }
        // Si se encuentra el computador se pide al usuario que ingrese los nuevos datos del computador
        if (computadorModificar != null) {
            String nuevaMarca = JOptionPane.showInputDialog("Ingrese la nueva marca del computador:", computadorModificar.getMarca());
            Double nuevoTamaño = Double.valueOf(JOptionPane.showInputDialog("Ingrese el nuevo tamaño del computador en PULGADAS:", computadorModificar.getTamaño()));
            Double nuevoPrecio = Double.valueOf(JOptionPane.showInputDialog("Ingrese el nuevo precio del computador:", computadorModificar.getPrecio()));

            int operativoOpt = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo sistema operativo:\n1. Windows 7\n2. Windows 10\n3. Windows 11"));
            String nuevoSistemaOperativo;
            switch (operativoOpt) {
                case 1:
                    nuevoSistemaOperativo = "Windows 7";
                    break;
                case 2:
                    nuevoSistemaOperativo = "Windows 10";
                    break;
                case 3:
                    nuevoSistemaOperativo = "Windows 11";
                    break;
                default:
                    nuevoSistemaOperativo = computadorModificar.getSistemaOperativo();
            }
            int procesadorOpt = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo tipo de procesador:\n1. Intel®Core™i5\n2. AMD Ryzen"));
            String nuevoProcesador;
            switch (procesadorOpt) {
                case 1:
                    nuevoProcesador = "Intel®Core™i5";
                    break;
                case 2:
                    nuevoProcesador = "AMD Ryzen";
                    break;
                default:
                    nuevoProcesador = computadorModificar.getTipoProcesador();
            }
            // Se modifican los datos del computador
            computadorModificar.setMarca(nuevaMarca);
            computadorModificar.setTamaño(nuevoTamaño);
            computadorModificar.setPrecio(nuevoPrecio);
            computadorModificar.setSistemaOperativo(nuevoSistemaOperativo);
            computadorModificar.setTipoProcesador(nuevoProcesador);

            JOptionPane.showMessageDialog(null, "El computador ha sido modificado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró un computador con el serial proporcionado.");
        }
    }

    // Método para exportar la lista de computadores a un archivo
    public void ExportarComputadores(LinkedList<COMPUTADOR_PORTATIL> listaC) {
        ExportarComputadores exportarC = new ExportarComputadores();
        exportarC.exportarArchivo(listaC);
    }

    // Método para importar la lista de computadores desde un archivo
    public LinkedList<COMPUTADOR_PORTATIL> ImportarC() {
        ImportarComputador importarC = new ImportarComputador();
        LinkedList<COMPUTADOR_PORTATIL> listaC = importarC.ImportarArchivo();
        return listaC;
    }

    // Método para exportar la lista de tablets a un archivo
    public void ExportarTablets(LinkedList<TABLETA_GRAFICA> listaT) {
        ExportarTablets exportarT = new ExportarTablets();
        exportarT.exportarArchivo(listaT);
    }

    // Método para importar la lista de tablets desde un archivo
    public LinkedList<TABLETA_GRAFICA> ImportarT() {
        ImportarTablets importarT = new ImportarTablets();
        LinkedList<TABLETA_GRAFICA> listaT = importarT.ImportarArchivo();
        return listaT;
    }

    // Método para buscar una tablet en la lista de tablets
    public TABLETA_GRAFICA BuscarT(LinkedList<TABLETA_GRAFICA> ListaT) {
        // Se busca la tablet por la cedula del estudiante
        int CedulaBuscarT = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del estudiante: "));
        // Se inicializa la variable resultadoBusquedaT en null
        TABLETA_GRAFICA resultadoBusquedaT = null;
        // Se recorre la lista de tablets para buscar la tablet con la cedula ingresada por el usuario
        for (TABLETA_GRAFICA ItemBusquedaT : ListaT) {
            if (ItemBusquedaT.getCedula() == CedulaBuscarT) {
                resultadoBusquedaT = ItemBusquedaT;
                break;
            }
        }
        // Si se encuentra la tablet se muestra la informacion de la tablet
        if (resultadoBusquedaT != null) {
            JOptionPane.showMessageDialog(null, "Tablet encontrada:\n" +
                    "Nombre: " + resultadoBusquedaT.getNombre() + "\n" +
                    "Apellido: " + resultadoBusquedaT.getApellido() + "\n" +
                    "Cedula: " + resultadoBusquedaT.getCedula() + "\n" +
                    "Telefono: " + resultadoBusquedaT.getTelefono() + "\n" +
                    "Semestre: " + resultadoBusquedaT.getNumSeme() + "\n" +
                    "Promedio: " + resultadoBusquedaT.getPromedio() + "\n" +
                    "Serial: " + resultadoBusquedaT.getSerial() + "\n" +
                    "Marca: " + resultadoBusquedaT.getMarca() + "\n" +
                    "Tamaño: " + resultadoBusquedaT.getTamaño() + "\n" +
                    "Precio: " + resultadoBusquedaT.getPrecio() + "\n" +
                    "Peso: " + resultadoBusquedaT.getPeso() + "\n" +
                    "Almacenamiento: " + resultadoBusquedaT.getTipoA() + "\n");
        } else {
            JOptionPane.showMessageDialog(null, "Tablet no encontrada");
        }
        return resultadoBusquedaT;
    }

    // Método para modificar una tablet en la lista de tablets
    public void modificarTablet(LinkedList<TABLETA_GRAFICA> ListaT) {
        // Se pide al usuario que ingrese el serial de la tablet que desea modificar
        String serialModificarT = JOptionPane.showInputDialog("Ingrese el serial de la tablet que desea modificar: ");
        TABLETA_GRAFICA tabletModificar = null;
        // Se recorre la lista de tablets para buscar la tablet con el serial ingresado
        for (TABLETA_GRAFICA itemT : ListaT) {
            if (itemT.getSerial().equals(serialModificarT)) {
                tabletModificar = itemT;
                break;
            }
        }
        // Si se encuentra la tablet se pide al usuario que ingrese los nuevos datos de la tablet
        if (tabletModificar != null) {
            String nuevaMarcaT = JOptionPane.showInputDialog("Ingrese la nueva marca de la tablet:", tabletModificar.getMarca());
            Double nuevoTamañoT = Double.valueOf(JOptionPane.showInputDialog("Ingrese el nuevo tamaño de la tablet en PULGADAS:", tabletModificar.getTamaño()));
            Double nuevoPrecioT = Double.valueOf(JOptionPane.showInputDialog("Ingrese el nuevo precio de la tablet:", tabletModificar.getPrecio()));
            Double nuevoPesoT = Double.valueOf(JOptionPane.showInputDialog("Ingrese el nuevo peso de la tablet en KG:", tabletModificar.getPeso()));
            int storageOpt = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo tipo de almacenamiento:\n1. 256 GB\n2. 512 GB\n3. 1 TB"));
            String nuevoTipoA;
            switch (storageOpt) {
                case 1:
                    nuevoTipoA = "256 GB";
                    break;
                case 2:
                    nuevoTipoA = "512 GB";
                    break;
                case 3:
                    nuevoTipoA = "1 TB";
                    break;
                default:
                    nuevoTipoA = tabletModificar.getTipoA();
            }
            // Se modifican los datos de la tablet
            tabletModificar.setMarca(nuevaMarcaT);
            tabletModificar.setTamaño(nuevoTamañoT);
            tabletModificar.setPrecio(nuevoPrecioT);
            tabletModificar.setPeso(nuevoPesoT);
            tabletModificar.setTipoA(nuevoTipoA);
            JOptionPane.showMessageDialog(null, "La tablet ha sido modificada exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró una tablet con el serial proporcionado.");
        }
    }

    // Método para devolver un computador de la lista de computadores
    public LinkedList<COMPUTADOR_PORTATIL> DevolverPc(LinkedList<COMPUTADOR_PORTATIL> listaC) {
        // Se pide al usuario que ingrese el serial del computador que desea devolver
        String SerialDevolverC = JOptionPane.showInputDialog("Ingrese el serial del computador a devolver: ");
        // Se inicializa la variable encontrado en false para saber si se encontró el computador
        boolean encontrado = false;
        // Se recorre la lista de computadores para buscar el computador con el serial ingresado
        Iterator<COMPUTADOR_PORTATIL> iterator = listaC.iterator();
        // Si se encuentra el computador se elimina de la lista y se muestra un mensaje de éxito
        while (iterator.hasNext()) {
            // Se obtiene el computador de la lista
            COMPUTADOR_PORTATIL co = iterator.next();
            // Si el serial del computador es igual al serial ingresado por el usuario se elimina de la lista
            if (co.getSerial().equals(SerialDevolverC)) {
                iterator.remove();
                JOptionPane.showMessageDialog(null, "El computador ha sido eliminado de la lista");
                // Se cambia la variable encontrado a true para indicar que se encontró el computador
                encontrado = true;
                // Se decrementa el total de computadores
                TotalComputadores--;
                break;
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "No se halló el computador");
        }
        return listaC;
    }
    // Método para devolver una tablet de la lista de tablets
    public LinkedList<TABLETA_GRAFICA> DevolverTb(LinkedList<TABLETA_GRAFICA> listaT) {
        // Se pide al usuario que ingrese el serial de la tablet que desea devolver
        String SerialDevolverT = JOptionPane.showInputDialog("Ingrese el serial del computador a devolver: ");
        // Se inicializa la variable encontrado en false para saber si se encontró la tablet
        boolean encontrado = false;
        // Se recorre la lista de tablets para buscar la tablet con el serial ingresado
        Iterator<TABLETA_GRAFICA> iterator = listaT.iterator();
        // Si se encuentra la tablet se elimina de la lista y se muestra un mensaje de éxito
        while (iterator.hasNext()) {
            // Se obtiene la tablet de la lista
            TABLETA_GRAFICA ta = iterator.next();
            // Si el serial de la tablet es igual al serial ingresado por el usuario se elimina de la lista
            if (ta.getSerial().equals(SerialDevolverT)) {
                iterator.remove();
                JOptionPane.showMessageDialog(null, "El computador ha sido eliminado de la lista");
                // Se cambia la variable encontrado a true para indicar que se encontró la tablet
                encontrado = true;
                // Se decrementa el total de tablets
                TotalTablets--;
                break;
            }
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "No se halló el computador");
        }
        return listaT;
    }

    // Método para mostrar el inventario total de computadores y tablets
    public void MostrarInventarioTotal(){
        // Se calcula el inventario total sumando el total de computadores y el total de tablets
        int InventarioTotal=TotalComputadores+TotalTablets;
        JOptionPane.showMessageDialog(null, "Inventario Total:\n" +
                "Computadores: " + TotalComputadores + "\n" +
                "Tablets: " + TotalTablets + "\n" +
                // Se muestra el inventario total
                "Inventario total: " + InventarioTotal);
    }
}
