//* @author fabian_esteban.lopez
package Modelo;

import java.time.LocalDateTime;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Congreso {

    private String identificador;
    private String nombre;
    private LocalDateTime fechaYHoraInicio;
    private LocalDateTime fechaYHoraTerminacion;
    private String nombreOrganizador;
    private Lugar suLugar;
    private LinkedList<Inscripcion> susInscripciones;


    public Congreso(String identificador, String nombre, LocalDateTime fechaYHoraInicio, LocalDateTime fechaYHoraTerminacion, String nombreOrganizador, Lugar suLugar, LinkedList<Inscripcion> susInscripciones) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.fechaYHoraInicio = fechaYHoraInicio;
        this.fechaYHoraTerminacion = fechaYHoraTerminacion;
        this.nombreOrganizador = nombreOrganizador;
        this.suLugar = suLugar;
        this.susInscripciones = susInscripciones;
    }

    public Congreso(String identificador, String nombre, LocalDateTime fechaYHoraInicio, LocalDateTime fechaYHoraTerminacion, String nombreOrganizador, Lugar suLugar) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.fechaYHoraInicio = fechaYHoraInicio;
        this.fechaYHoraTerminacion = fechaYHoraTerminacion;
        this.nombreOrganizador = nombreOrganizador;
        this.suLugar = suLugar;
        this.susInscripciones = new LinkedList<>();
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFechaYHoraInicio() {
        return fechaYHoraInicio;
    }

    public void setFechaYHoraInicio(LocalDateTime fechaYHoraInicio) {
        this.fechaYHoraInicio = fechaYHoraInicio;
    }

    public LocalDateTime getFechaYHoraTerminacion() {
        return fechaYHoraTerminacion;
    }

    public void setFechaYHoraTerminacion(LocalDateTime fechaYHoraTerminacion) {
        this.fechaYHoraTerminacion = fechaYHoraTerminacion;
    }

    public String getNombreOrganizador() {
        return nombreOrganizador;
    }

    public void setNombreOrganizador(String nombreOrganizador) {
        this.nombreOrganizador = nombreOrganizador;
    }

    public Lugar getSuLugar() {
        return suLugar;
    }

    public void setSuLugar(Lugar suLugar) {
        this.suLugar = suLugar;
    }

    public LinkedList<Inscripcion> getSusInscripciones() {
        return susInscripciones;
    }

    public void setSusInscripciones(LinkedList<Inscripcion> susInscripciones) {
        this.susInscripciones = susInscripciones;
    }

    @Override
    public String toString() {
        return "Congreso{" + "\nidentificador=" + identificador + ",\n nombre=" + nombre + ",\n fechaYHoraInicio=" + fechaYHoraInicio + ",\n fechaYHoraTerminacion=" + fechaYHoraTerminacion + ",\n nombreOrganizador=" + nombreOrganizador + ",\n suLugar=" + suLugar.toString() + ",\n susInscripciones=" + listarTodasLasInscripciones() + '}';
    }

    //---> METODOS PROPIOS <----
    public int calcularNumeroInscripcion() {
        int numeroInscripcion = susInscripciones.getLast().getNumero();
        numeroInscripcion++;
        return numeroInscripcion;
    }

    //agregar una nueva Inscripcion
    public void agregarInscripcion(Inscripcion nuevaInscripcion) {
        susInscripciones.add(nuevaInscripcion);
    }

    public String listarTodasLasInscripciones() {
        String listado = "";
        for (Inscripcion elem : susInscripciones) {
            listado += "\n" + elem.toString();
        }
        return listado;
    }

  
}
