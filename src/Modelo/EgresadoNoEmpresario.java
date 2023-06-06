//Fabian Esteban Lopez Arias 2216110 y Juan Felipe Plata Barbosa 2221109
package Modelo;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class EgresadoNoEmpresario extends Egresado {

    public EgresadoNoEmpresario(String tipoIdentificacion, int numeroIdentificacion, String nombreCompleto, int numeroTelefono, String email, LinkedList<String> deportes, String ultimoNFA, char cargo) {
        super(tipoIdentificacion, numeroIdentificacion, nombreCompleto, numeroTelefono, email, deportes, ultimoNFA, cargo);
    }

    //No tiene getter, setter ni toString.
    //---> Metodos Propios <---
    public boolean estaEmpleado() {
        boolean esEmpleado = false;
        char estaEmpleado = JOptionPane.showInputDialog("Esta empleado? (S/N) ").charAt(0);
        if (estaEmpleado == 'S' || estaEmpleado == 's') {
            esEmpleado = true;
        } else {
            esEmpleado = false;
        }
        return esEmpleado;
    }

}
