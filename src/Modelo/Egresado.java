//  @author fabian_esteban.lopez
package Modelo;

import java.util.LinkedList;

public class Egresado {
    protected String tipoIdentificacion;
    protected int numeroIdentificacion;
    protected String nombreCompleto;
    protected int numeroTelefono;
    protected String email;
    protected LinkedList<String> deportes;
    protected String ultimoNFA;
    protected char cargo;

    public Egresado(String tipoIdentificacion, int numeroIdentificacion, String nombreCompleto, int numeroTelefono, String email, LinkedList<String> deportes, String ultimoNFA, char cargo) {
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombreCompleto = nombreCompleto;
        this.numeroTelefono = numeroTelefono;
        this.email = email;
        this.deportes = deportes;
        this.ultimoNFA = ultimoNFA;
        this.cargo = cargo;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(int numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LinkedList<String> getDeportes() {
        return deportes;
    }

    public void setDeportes(LinkedList<String> deportes) {
        this.deportes = deportes;
    }

    public String getUltimoNFA() {
        return ultimoNFA;
    }

    public void setUltimoNFA(String ultimoNFA) {
        this.ultimoNFA = ultimoNFA;
    }

    public char getCargo() {
        return cargo;
    }

    public void setCargo(char cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Egresado{" + "tipoIdentificacion=" + tipoIdentificacion + ", numeroIdentificacion=" + numeroIdentificacion + ", nombreCompleto=" + nombreCompleto + ", numeroTelefono=" + numeroTelefono + ", email=" + email + ", deportes=" + deportes + ", ultimoNFA=" + ultimoNFA + ", cargo=" + cargo + '}';
    }

   

}//fin clase
