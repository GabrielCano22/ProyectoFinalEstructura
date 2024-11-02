import java.awt.*;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Metodos {
    private int TotalComputadores = 0;
    private int TotalTablets = 0;
    private LinkedList<COMPUTADOR_PORTATIL> ListaC = new LinkedList<>();
    private LinkedList<TABLETA_GRAFICA> ListaT = new LinkedList<>();

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
                        ListaC.addAll(LlenarComputador());
                        MostrarComputadores(ListaC);
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
                        modificarComputador(ListaC);
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Bienvenido al apartado de devolución de portátiles");
                        DevolverPc(ListaC);
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Bienvenido al apartado de búsqueda de portátiles");
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
                        ListaT.addAll(LlenarTablets());
                        MostrarTablets(ListaT);
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
                        modificarTablet(ListaT);
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Bienvenido al apartado de devolución de Tablets");
                        DevolverTb(ListaT);
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Bienvenido al apartado de busqueda de Tablets");
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

    public LinkedList<COMPUTADOR_PORTATIL> LlenarComputador() {
        boolean continuar = true;
        LinkedList<COMPUTADOR_PORTATIL> ListaC = new LinkedList<>();
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
                Nombre = JOptionPane.showInputDialog("Por favor, ingrese su nombre: ");
                if (Nombre != null && !Nombre.matches(".*\\d.*")) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "intente otra vez");
                }
            }
            while (true) {
                Apellido = JOptionPane.showInputDialog("Por favor, ingrese su apellido: ");
                if (Apellido != null && !Apellido.matches(".*\\d.*")) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "intente otra vez");
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
                    Promedio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su promedio: "));
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog((Component) null, "Entrada no válida. Intente nuevamente.");
                }
            }
            while (true) {
                try {
                    NumSeme = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de semestre: "));
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog((Component) null, "Entrada no válida. Intente nuevamente.");
                }
            }

            while (true) {
                Serial = JOptionPane.showInputDialog("Por favor, el serial del pc: ");
                if (Serial != null && !Serial.matches(".*\\d.*")) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "intente otra vez");
                }
            }
            while (true) {
                Marca = JOptionPane.showInputDialog("Por favor, ingrese la marca del pc: ");
                if (Marca != null && !Marca.matches(".*\\d.*")) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "intente otra vez");
                }
            }
            while (true) {
                try {
                    Tamaño = Double.valueOf(JOptionPane.showInputDialog("Ingrese el tamaño del computador en PULGADAS: "));
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog((Component) null, "Entrada no válida. Intente nuevamente.");
                }
            }
            while (true) {
                try {
                    Precio = Double.valueOf(JOptionPane.showInputDialog("Ingrese el precio del computador: "));
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog((Component) null, "Entreda no valida. Intente nuevamente");
                }
            }

            while (true) {
                try {
                    OperativeSystem = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el sistema operativo que necesita: \n1. Windows 7 \n 2. Windows 10\n 3. Windows 11"));
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
                    Procesador = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de procesador que necesita: \n1. Intel®Core™i5 \n 2. AMD Ryzen"));
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

            COMPUTADOR_PORTATIL c = new COMPUTADOR_PORTATIL(Nombre, Apellido, Telefono, Cedula, Promedio, NumSeme, Serial, Marca, SistemaOperativo, TipoProcesador, Tamaño, Precio);
            ListaC.add(c);
            TotalComputadores++;
            String input = JOptionPane.showInputDialog((Component) null, "Desea agregar mas computadores? 1=SI; 2=NO", 3);
            opt = Integer.parseInt(input);
            if (opt == 2) {
                continuar = false;
            }
            JOptionPane.showMessageDialog(null, "Computador agregado exitosamente. Total de computadores: " + TotalComputadores);

        }
        return ListaC;
    }

    public LinkedList<TABLETA_GRAFICA> LlenarTablets() {
        boolean continuar = true;
        LinkedList<TABLETA_GRAFICA> ListaT = new LinkedList<>();
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
                Nombre = JOptionPane.showInputDialog("Por favor, ingrese su nombre: ");
                if (Nombre != null && !Nombre.matches(".*\\d.*")) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "intente otra vez");
                }
            }

            while (true) {
                Apellido = JOptionPane.showInputDialog("Por favor, ingrese su nombre: ");
                if (Apellido != null && !Apellido.matches(".*\\d.*")) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "intente otra vez");
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
                    Promedio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su promedio: "));
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog((Component) null, "Entrada no válida. Intente nuevamente.");
                }
            }
            while (true) {
                try {
                    NumSeme = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de semestre: "));
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog((Component) null, "Entrada no válida. Intente nuevamente.");
                }
            }
            while (true) {
                Serial = JOptionPane.showInputDialog("Por favor, el serial del pc: ");
                if (Serial != null && !Serial.matches(".*\\d.*")) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "intente otra vez");
                }
            }
            while (true) {
                Marca = JOptionPane.showInputDialog("Por favor, ingrese la marca del pc: ");
                if (Marca != null && !Marca.matches(".*\\d.*")) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "intente otra vez");
                }
            }
            while (true) {
                try {
                    Tamaño = Double.valueOf(JOptionPane.showInputDialog("Ingrese el tamaño del computador en PULGADAS: "));
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Entrada no válida. Intente nuevamente.");
                }
            }
            while (true) {
                try {
                    Precio = Double.valueOf(JOptionPane.showInputDialog(null, "ingrese precio"));
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "intete otra vez");
                }
            }

            while (true) {
                try {
                    Peso = Double.valueOf(JOptionPane.showInputDialog("Ingrese el peso de la tablet en KG: "));
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog((Component) null, "Entrada no válida. Intente nuevamente.");
                }
            }
            while (true) {
                try {
                    Storage = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de almacenamiento que necesita: \n1. 256 GB\n 2. 512 GB\n 3. 1 TB"));
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog((Component) null, "Entrada no válida. Intente nuevamente.");
                }
            }
            switch (Storage) {
                case 1:
                    TipoA = "256 GB";
                case 2:
                    TipoA = "512 GB";
                case 3:
                    TipoA = "1 T";
                default:
                    TipoA = "invalido";
            }
            TABLETA_GRAFICA t = new TABLETA_GRAFICA(Nombre, Apellido, Telefono, Cedula, Promedio, NumSeme, Serial, Marca, TipoA, Tamaño, Precio, Peso);
            ListaT.add(t);
            TotalTablets++;
            String input = JOptionPane.showInputDialog((Component) null, "Desea agregar mas tablets? 1=SI; 2=NO", 3);
            opt = Integer.parseInt(input);
            if (opt == 2) {
                continuar = false;
            }
            JOptionPane.showMessageDialog(null, "Tablet agregada exitosamente. Total de tablets: " + TotalTablets);
        }
        return ListaT;
    }

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

    public COMPUTADOR_PORTATIL BuscarC(LinkedList<COMPUTADOR_PORTATIL> ListaC) {
        int CedulaBuscarC = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del estudiante: "));
        COMPUTADOR_PORTATIL resultadoBusquedaC = null;
        for (COMPUTADOR_PORTATIL ItemBusquedaC : ListaC) {
            if (ItemBusquedaC.getCedula() == CedulaBuscarC) {
                resultadoBusquedaC = ItemBusquedaC;
                break;
            }
        }
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

    public void modificarComputador(LinkedList<COMPUTADOR_PORTATIL> listaC) {
        String serialModificar = JOptionPane.showInputDialog("Ingrese el serial del computador que desea modificar: ");
        COMPUTADOR_PORTATIL computadorModificar = null;
        for (COMPUTADOR_PORTATIL item : listaC) {
            if (item.getSerial().equals(serialModificar)) {
                computadorModificar = item;
                break;
            }
        }
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

    public void ExportarComputadores(LinkedList<COMPUTADOR_PORTATIL> listaC) {
        ExportarComputadores exportarC = new ExportarComputadores();
        exportarC.exportarArchivo(listaC);
    }

    public LinkedList<COMPUTADOR_PORTATIL> ImportarC() {
        ImportarComputador importarC = new ImportarComputador();
        LinkedList<COMPUTADOR_PORTATIL> listaC = importarC.ImportarArchivo();
        return listaC;
    }

    public void ExportarTablets(LinkedList<TABLETA_GRAFICA> listaT) {
        ExportarTablets exportarT = new ExportarTablets();
        exportarT.exportarArchivo(listaT);
    }

    public LinkedList<TABLETA_GRAFICA> ImportarT() {
        ImportarTablets importarT = new ImportarTablets();
        LinkedList<TABLETA_GRAFICA> listaT = importarT.ImportarArchivo();
        return listaT;
    }

    public TABLETA_GRAFICA BuscarT(LinkedList<TABLETA_GRAFICA> ListaT) {
        int CedulaBuscarT = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del estudiante: "));
        TABLETA_GRAFICA resultadoBusquedaT = null;
        for (TABLETA_GRAFICA ItemBusquedaT : ListaT) {
            if (ItemBusquedaT.getCedula() == CedulaBuscarT) {
                resultadoBusquedaT = ItemBusquedaT;
                break;
            }
        }
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

    public void modificarTablet(LinkedList<TABLETA_GRAFICA> ListaT) {
        String serialModificarT = JOptionPane.showInputDialog("Ingrese el serial de la tablet que desea modificar: ");
        TABLETA_GRAFICA tabletModificar = null;
        for (TABLETA_GRAFICA itemT : ListaT) {
            if (itemT.getSerial().equals(serialModificarT)) {
                tabletModificar = itemT;
                break;
            }
        }
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

    public LinkedList<COMPUTADOR_PORTATIL> DevolverPc(LinkedList<COMPUTADOR_PORTATIL> listaC) {
        String SerialDevolverC = JOptionPane.showInputDialog("Ingrese el serial del computador a devolver: ");
        boolean encontrado = false;
        Iterator<COMPUTADOR_PORTATIL> iterator = listaC.iterator();
        while (iterator.hasNext()) {
            COMPUTADOR_PORTATIL co = iterator.next();
            if (co.getSerial().equals(SerialDevolverC)) {
                iterator.remove();
                JOptionPane.showMessageDialog(null, "El computador ha sido eliminado de la lista");
                encontrado = true;
                TotalComputadores--;
                break;
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "No se halló el computador");
        }
        return listaC;
    }
    public LinkedList<TABLETA_GRAFICA> DevolverTb(LinkedList<TABLETA_GRAFICA> listaT) {
        String SerialDevolverT = JOptionPane.showInputDialog("Ingrese el serial del computador a devolver: ");
        boolean encontrado = false;
        Iterator<TABLETA_GRAFICA> iterator = listaT.iterator();
        while (iterator.hasNext()) {
            TABLETA_GRAFICA ta = iterator.next();
            if (ta.getSerial().equals(SerialDevolverT)) {
                iterator.remove();
                JOptionPane.showMessageDialog(null, "El computador ha sido eliminado de la lista");
                encontrado = true;
                TotalTablets--;
                break;
            }
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "No se halló el computador");
        }
        return listaT;
    }public void MostrarInventarioTotal(){
        int InventarioTotal=TotalComputadores+TotalTablets;
        JOptionPane.showMessageDialog(null, "Inventario Total:\n" +
                "Computadores: " + TotalComputadores + "\n" +
                "Tablets: " + TotalTablets + "\n" +
                "Inventario total: " + InventarioTotal);
    }
}
