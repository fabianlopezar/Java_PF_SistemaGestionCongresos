//Fabian Esteban Lopez Arias 2216110 y Juan Felipe Plata Barbosa 2221109
package Vista;

import Modelo.Congreso;
import Modelo.Egresado;
import Modelo.Inscripcion;
import Modelo.Lugar;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class UsaCongreso {

    // Creo una lista de congresos.
    static LinkedList<Congreso> losCongresos = new LinkedList<>();

    //---> MetodoPrincipal
    public static void main(String[] args) {
        gestionarMenu();
    }

    //---> Metodo Gestionar Menu.
    public static void gestionarMenu() {
        //Menu De Operaciones.
        String menu = "MENU DE OPERACIONES CON LISTA DE CONGRESOS " + "\n";
        menu += "1) CREAR un Congreso sin Inscripcion." + "\n";
        menu += "2) CREAR Inscripcion para un congreso." + "\n";
        menu += "3) ELIMINAR Congreso." + "\n";
        menu += "4) Generar REPORTE detallado de un congreso." + "\n";
        menu += "5) Generar REPORTE lista ordenada ascendente de congresos por fecha." + "\n";
        menu += "6) ALMACENAR datos en un archivo texto." + "\n";
        menu += "7) RECUPERAR datos desde un archivo texto." + "\n";
        menu += "8) Mostrar Todos los Congresos" + "\n"; //METODO DE PRUEBA (ELIMINARLO DESPUES)
        menu += "9) SALIR " + "\n";

        int opcion;
        //Mostar las opciones por pantalla.
        do {
            do {//le pido que ingrese un valor.
                opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
                if (opcion < 1 || opcion > 9) {//si lo ingreso mal entonces...
                    JOptionPane.showMessageDialog(null, "ERROR: opcion invalida, debe ingresar un valor entre 1 y 9.");
                }
            } while (opcion < 1 || opcion > 9);//Le pido que vuelva a ingresar un valor.
            //------> C7aso Switch <------
            switch (opcion) {//Ingreso un valor entre 1 y 9. y ahora valido... 
                case 1:
                    registrarCongreso();
                    break;
                case 2:
                    //creando y agregando inscripcion
                    creandoInscripcion();
                    break;
                case 3:
                    eliminarCongreso();
                    break;
                case 4:
                    consultarUnCongreso();
                    break;
                case 5:
                    consultarLosCongresosOrdenadosPorFechaAscendente();
                    break;
                case 6:
                    almacenarEnArchivoTexto();
                    break;
                case 7:
                    losCongresos.clear();
                    recuperarDesdeArchivoTexto();
                    JOptionPane.showMessageDialog(null, "Se cargaron los datos a la colección desde un archivo de texto.\n" + "Genere reporte para ver la nueva información");
                    break;
                case 8:
                    mostrarLosCongresos();
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "El programa se cerrara");
                    System.exit(0);
                    break;
            }
        } while (opcion >= 1 && opcion <= 8);
    }//Fin Metodo Gestionar Menu.
//---->METODOS<----

    public static void registrarCongreso() {
        //1. Solicito los datos del objeto de la clase contenida y la clase contenedora.
        //Congreso
        JOptionPane.showMessageDialog(null, "Creando el congreso");
        String identificador = JOptionPane.showInputDialog("Ingresar identificador" + "\n" + "eje: (2023-04-23-0001)");
        if (!existeCongreso(identificador)) {//si no existe el codigo que digite, procede a crear un nuevo congreso.
            String nombre = JOptionPane.showInputDialog("Ingresar el nombre del congreso.(al menos 10 caracteres)");
            String fechaYHoraInicioAux = JOptionPane.showInputDialog("Ingersar la fecha Inicio usando el formato AAAA-MM-DD-HH-MM-SS" + "\n Donde A-Digito año, M-Digito mes, D-Digito dia H-Digito hora, -MDigito minutos -S Digito segundo. " + "\n Ej: 2021-07-01 01:00:00");

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime fechaYHoraInicio = LocalDateTime.parse(fechaYHoraInicioAux, formatter);
            String fechaYHoraTerminacionAux = JOptionPane.showInputDialog("Ingersar la fecha Terminacion usando el formato AAAA-MM-DD-HH-MM-SS" + "\n Donde A-Digito año, M-Digito mes, D-Digito dia H-Digito hora, -MDigito minutos -S Digito segundo. " + "\n Ej: 2021-07-01 01:00:00");
            LocalDateTime fechaYHoraTerminacion = LocalDateTime.parse(fechaYHoraTerminacionAux, formatter);
            String nombreOrganizador = JOptionPane.showInputDialog("Ingresar el nombre del organizador.(nombre persona o razon social empresa.)");
            //suLugar
            JOptionPane.showMessageDialog(null, "Creando el lugar del congreso.");
            String nombreLugar = JOptionPane.showInputDialog("Ingresar el nombre del lugar del congreso: ");
            String direccion = JOptionPane.showInputDialog("Ingresar direccion: ");
            String ciudad = JOptionPane.showInputDialog("Ingresar nombre de la ciudad:");
            //Creo el objeto lugar.
            Lugar objLugar;
            objLugar = new Lugar(nombreLugar, direccion, ciudad);
            JOptionPane.showMessageDialog(null, "EXITO, el lugar del congreso fue creado.");

            //Creo el objeto Congreso
            Congreso objCongreso;
            objCongreso = new Congreso(identificador, nombre, fechaYHoraInicio, fechaYHoraTerminacion, nombreOrganizador, objLugar);
            JOptionPane.showMessageDialog(null, "EXITO, el congreso fue creado.");

            losCongresos.add(objCongreso);
        } else {// si el Congreso ya existe entonces digite otro numero.
            JOptionPane.showMessageDialog(null, "El Congreso '" + identificador + "' se encuentra en la lista, no es posible crearlo nuevamente." + "\n digite un codigo diferente.");

        }
    }

    //agregar informacion inscripcion a un congerso.
    public static void agregarInscripcionCongreso(String numeroIdentificadorCongreso, Inscripcion nuevaInscripcion) {

        for (Congreso elem : losCongresos) {
            if (elem.getIdentificador().equals(numeroIdentificadorCongreso)) {
                elem.agregarInscripcion(nuevaInscripcion);
            }
        }

    }

    public static void creandoInscripcion() {
        //Solicitar numero congreso a buscar.
        String identificadorCongreso = JOptionPane.showInputDialog("Ingrese el NUMERO de identificacion del congreso deseado: ");
        if (existeCongreso(identificadorCongreso)) {

            //datos Inscripcion
            JOptionPane.showMessageDialog(null, "Datos de la inscripcion.");
            JOptionPane.showMessageDialog(null, "este es el tamaño de la coleccion de susInscripciones: " + losCongresos.get(encontrarPosicionCongreso(identificadorCongreso)).getSusInscripciones().size());
            int numero = 0;
            //metodo para calcular el numero de la inscripcion
            if (losCongresos.get(encontrarPosicionCongreso(identificadorCongreso)).getSusInscripciones().size() == 0) {//entra la clase Congreso que estoy buscando y de hay entra al LinkedList y toma el valor del tamaño y la comparo con 0.
                numero = 1;

            } else {
                numero = losCongresos.get(encontrarPosicionCongreso(identificadorCongreso)).calcularNumeroInscripcion(); //deberia ir un metodo.
            }
            String fechaYHoraInscripcionAux = JOptionPane.showInputDialog("Ingersar la fecha Inicio usando el formato AAAA-MM-DD-HH-MM-SS" + "\n Donde A-Digito año, M-Digito mes, D-Digito dia H-Digito hora, -MDigito minutos -S Digito segundo. " + "\n Ej: 2021-07-01 01:00:00");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime fechaYHoraInscripcion = LocalDateTime.parse(fechaYHoraInscripcionAux, formatter);
            char estado = JOptionPane.showInputDialog("Ingresar el estado (A: activa, C: cancelada, F: cerrada)").trim().toUpperCase().charAt(0);

            //Datos Egresado
            JOptionPane.showMessageDialog(null, "Datos del egresado.");
            String tipoIdentificacion = JOptionPane.showInputDialog("Ingresar tipo identificacion(Cedula de ciudadania, Cedula de extranjeria): ");
            //compruebo que si me este llegando un int como parametro.
            boolean aux1 = false;
            int numeroIdentificacion = 0;
            do {
                try {
                    numeroIdentificacion = Integer.parseInt(JOptionPane.showInputDialog("Ingese NUMERO identificacion:(entre 6 y 11 caracteres) "));
                    aux1 = true;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "ERROR: de convercion" + "\nDebe ingresar un numero entero.");
                }
            } while (!aux1);
            String nombreCompleto = JOptionPane.showInputDialog("Ingrese el nombre completo:(nombres y apellidos) ");
            //compruebo que si me este llegando un int como parametro.
            boolean aux2 = false;
            int numeroTelefonico = 0;
            do {
                try {
                    numeroTelefonico = Integer.parseInt(JOptionPane.showInputDialog("Ingrese NUMERO telefonico: "));
                    aux2 = true;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "ERROR: de convercion" + "\nDebe ingresar un numero entero.");
                }
            } while (!aux2);

            String email = JOptionPane.showInputDialog("Ingresar email: ");
            LinkedList<String> deportes = new LinkedList<>();
            //Bucle para obtener los deportes que practica el usuario.
            boolean aux3 = false;
            int numeroDeportes = 0;
            do {
                try {
                    numeroDeportes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el NUMERO de deportes que practica: " + "\n (0= Ninguno, >0 Ingrese el nombre del deporte.)"));
                    aux3 = true;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "ERROR: de convercion" + "\nDebe ingresar un numero entero.");
                }
            } while (!aux3);

            if (numeroDeportes == 0) {
                deportes.add("Ninguno");
            } else {
                for (int i = 0; i < numeroDeportes; i++) {
                    String deporteAux = JOptionPane.showInputDialog("Ingrese el deporte que practica: ");
                    deportes.add(deporteAux);
                }
            }
            String ultimoNFA = JOptionPane.showInputDialog("Ingresar ultimo nivel de estudio alcanzado" + "\n (profesional, especialista, maestria, doctorado.)");
            char cargo = JOptionPane.showInputDialog("Ingrese un caracter: (E= EMPRESARIO, N= NO EMPRESARIO)").trim().toUpperCase().charAt(0);
            //Creando Egresado
            Egresado suEgresado = new Egresado(tipoIdentificacion, numeroIdentificacion, nombreCompleto, numeroTelefonico, email, deportes, ultimoNFA, cargo);
            JOptionPane.showMessageDialog(null, "Egresado Creado Exitosamente.");

            //creando Inscripcion
            Inscripcion nuevaInscipcion = new Inscripcion(numero, fechaYHoraInscripcion, estado, suEgresado);
            JOptionPane.showMessageDialog(null, "Inscripcion Creada Exitosamente.");
            JOptionPane.showMessageDialog(null, suEgresado.toString() + "\n" + nuevaInscipcion.toString());//prueba

            //agregar inscripcion
            agregarInscripcionCongreso(identificadorCongreso, nuevaInscipcion);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro el identificador del congreso" + identificadorCongreso + " \nIngrese un identificador existente.");
        }
    }

    public static void eliminarCongreso() {
        String identificadorCongreso = JOptionPane.showInputDialog("Ingresar el identificador que quiere eliminar eje:(2023-04-23-0001)");
        for (Congreso elem : losCongresos) {
            if (identificadorCongreso.equals(elem.getIdentificador())) {
                losCongresos.remove(elem);
                JOptionPane.showMessageDialog(null, "Se elimino correctamente");
                break;
            }
        }
    }

    public static void mostrarLosCongresos() {
        String reporte = "REPORTE CONGRESOS POR identificador y Nombre: ";
        for (int i = 0; i < losCongresos.size(); i++) {
            reporte += "\nidentificador Congreso: " + losCongresos.get(i).getIdentificador() + "    Nombre congreso: " + losCongresos.get(i).getNombre();
        }
        JOptionPane.showMessageDialog(null, reporte);
    }

    public static boolean existeCongreso(String identificadorCongreso) {
        boolean existeCongreso = false;
        for (Congreso elem : losCongresos) {
            if (elem.getIdentificador().equals(identificadorCongreso)) {
                existeCongreso = true;
            }
        }
        return existeCongreso;
    }

    public static void consultarUnCongreso() {
        //Solicitar el indetificador a buscar.
        String identificador = JOptionPane.showInputDialog("Ingrese el identificador del congreso deseado: ");
        if (existeCongreso(identificador)) {

            JOptionPane.showMessageDialog(null, mostrarUnCongreso(identificador));
        } else {
            JOptionPane.showMessageDialog(null, "El identificador ingresado '" + identificador + "' no se encuentra" + "\n Intente con otro identificador");
        }
    }

    public static String mostrarUnCongreso(String identificadorCongreso) {

        String listado = "INFORME DETALLADO DE UN CONGRESO \n";
        for (Congreso elem : losCongresos) {
            if (elem.getIdentificador().equals(identificadorCongreso)) {
                listado = listado + elem.toString() + "\n";
            }
        }
        return listado;
    }

    public static void almacenarEnArchivoTexto() {
        try {
            //Se define el archivo donde se almacenara la informacion de la coleccion
            String nombreArchivo = "datosCongreso.txt";
            PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter(nombreArchivo)));

            //Se procesa la coleccion para extraer la informacion y almacenarla en archivo
            String linea = "";//Almacenara la informacion de cada linea del archivo.
            for (Congreso elem : losCongresos) {//entro a la coleccion y saco info
                linea = elem.getIdentificador() + "--" + elem.getNombre() + "--" + elem.getFechaYHoraInicio() + "--" + elem.getFechaYHoraTerminacion() + "--" + elem.getNombreOrganizador() + "--" + elem.getSuLugar().getNombreLugar() + "--" + elem.getSuLugar().getDireccion() + "--" + elem.getSuLugar().getCiudad();
                String lineaC = "--";
                if (elem.getSusInscripciones().size() != 0) {
                    for (int i = 0; i < elem.getSusInscripciones().size(); i++) {
                        //Conforma linea de salida de los cortes
                        lineaC += elem.getSusInscripciones().get(i).getNumero() + "," + elem.getSusInscripciones().get(i).getFechaYhora() + "," + elem.getSusInscripciones().get(i).getEstado() + ",";
                    }
                    linea += lineaC;
                }
                salida.println(linea);
            }//Fin for
            JOptionPane.showMessageDialog(null, "Exito datos guardados exitosamente");
            salida.close();
            //Procesando cortes para agregar a la lista linea del archivo.

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error almacenando los datos en archivo texto" + e.getMessage() + " -- " + e.toString());
        }
    }//fin Metodo Almacenar datos

    public static void recuperarDesdeArchivoTexto() {
        try {
            //Se define el archivo desde el cual se extrae la informacion.
            String nombreArchivo = "datosCongreso.txt";
            //Se crea el flujo de entrada.
            BufferedReader entrada = new BufferedReader(new FileReader(nombreArchivo));
            //se declaran datos para almacenar informacion extraida del archivo.
            String[] datosC;
            String linea;
            String identificador;
            String nombre;
            String fechaYHoraInicio;
            String fechaYHoraTerminacion;
            String nombreOrganizador;
            //String suLugar;
            String nombreLugar;
            String direccion;
            String ciudad;
            //Se procesa cada linea del archivo para extraer informacion.
            while ((linea = entrada.readLine()) != null) {
                //Separa cada dato de la cadena leida, usando el formato utilizado al guardar.
                datosC = linea.split("--");
                //Captura los datos y almacenarlos en losCongresos
                identificador = datosC[0];
                nombre = datosC[1];
                fechaYHoraInicio = datosC[2];
                fechaYHoraTerminacion = datosC[3];
                nombreOrganizador = datosC[4];
                nombreLugar = datosC[5];
                direccion = datosC[6];
                ciudad = datosC[7];
                LocalDateTime fechaYHoraInicioaux = LocalDateTime.parse(fechaYHoraInicio);
                LocalDateTime fechaYHoraTerminacionaux = LocalDateTime.parse(fechaYHoraTerminacion);

                Lugar suLugar = new Lugar(nombreLugar, direccion, ciudad);
                losCongresos.add(new Congreso(identificador, nombre, fechaYHoraInicioaux, fechaYHoraTerminacionaux, nombreOrganizador, suLugar));
            }

            entrada.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error recuperando los datos desde archivo texto" + e.getMessage() + "--" + e.toString());
        }
    }//Fin Metodo Recuperar Archivo

    public static void consultarLosCongresosOrdenadosPorFechaAscendente() {
        Collections.sort(losCongresos, new Comparator<Congreso>() {
            @Override
            public int compare(Congreso x, Congreso y) {
                return x.getFechaYHoraInicio().compareTo(y.getFechaYHoraInicio());
            }
        });
        JOptionPane.showMessageDialog(null, "los congresos " + losCongresos.toString());
    }//Metodo de prueba

    public static int encontrarPosicionCongreso(String identificadorCongreso) {
        int posicion = -1;
        for (Congreso elem : losCongresos) {
            posicion++;
            if (elem.getIdentificador().equals(identificadorCongreso)) {
                break;
            }
        }
        return posicion;
    }

    /*public static int encontrarPosicionCongresoDebug() {
        String auxIdentificador = JOptionPane.showInputDialog("ingrese el identificador:");
        int posicion = -1;// La variable se declara en -1 ya que la coleccion empieza en 0.
        for (Congreso elem : losCongresos) {
            posicion++;// 
            if (elem.getIdentificador().equals(auxIdentificador)) {
                //JOptionPane.showMessageDialog(null, "Deberia funcionar" + elem.toString());
                break;
            }
        }
        //JOptionPane.showMessageDialog(null, "ESTA ES LA POSICION DEL CONGRESO --> " + aux);
        return posicion;
    }
     */
}//fin clase
