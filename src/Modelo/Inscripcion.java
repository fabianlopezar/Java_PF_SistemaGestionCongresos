// * @author fabian_esteban.lopez
package Modelo;

import java.time.LocalDateTime;
import javax.swing.JOptionPane;

public class Inscripcion {

    private int numero;
    private LocalDateTime fechaYhora;
    private char estado;
    private Egresado suEgresado;

    public Inscripcion(int numero, LocalDateTime fechaYhora, char estado, Egresado suEgresado) {
        this.numero = numero;
        this.fechaYhora = fechaYhora;
        this.estado = estado;
        this.suEgresado = suEgresado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDateTime getFechaYhora() {
        return fechaYhora;
    }

    public void setFechaYhora(LocalDateTime fechaYhora) {
        this.fechaYhora = fechaYhora;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public Egresado getSuEgresado() {
        return suEgresado;
    }

    public void setSuEgresado(Egresado suEgresado) {
        this.suEgresado = suEgresado;
    }

    @Override
    public String toString() {
        return "Inscripcion{" + "numero=" + numero + ", fechaYhora=" + fechaYhora + ", estado=" + estado + ", suEgresado=" + suEgresado.toString() + '}';
    }

}
