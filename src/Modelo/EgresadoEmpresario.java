//Fabian Esteban Lopez Arias 2216110 y Juan Felipe Plata Barbosa 2221109
package Modelo;

import java.util.LinkedList;

public final class EgresadoEmpresario extends Egresado {

    private Empresa suEmpresa;

    public EgresadoEmpresario(Empresa suEmpresa, String tipoIdentificacion, int numeroIdentificacion, String nombreCompleto, int numeroTelefono, String email, LinkedList<String> deportes, String ultimoNFA, char cargo) {
        super(tipoIdentificacion, numeroIdentificacion, nombreCompleto, numeroTelefono, email, deportes, ultimoNFA, cargo);
        this.suEmpresa = suEmpresa;
    }

    

    //getter y setter
    public Empresa getSuEmpresa() {
        return suEmpresa;
    }

    public void setSuEmpresa(Empresa suEmpresa) {
        this.suEmpresa = suEmpresa;
    }

    //toString
    @Override
    public String toString() {
        return "EgresadoEmpresario{" + "suEmpresa=" + suEmpresa.toString() + '}';
    }

}
