//Fabian esteban lopez arias
package Modelo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedList;

public final class EgresadoNoEmpresarioEmpleado extends EgresadoNoEmpresario {

    private String nombreEmpresa;
    private String cargoEmpleado;
    private LocalDate fechaIngreso;

    public EgresadoNoEmpresarioEmpleado(String nombreEmpresa, String cargoEmpleado, LocalDate fechaIngreso, String tipoIdentificacion, int numeroIdentificacion, String nombreCompleto, int numeroTelefono, String email, LinkedList<String> deportes, String ultimoNFA, char cargo) {
        super(tipoIdentificacion, numeroIdentificacion, nombreCompleto, numeroTelefono, email, deportes, ultimoNFA, cargo);
        this.nombreEmpresa = nombreEmpresa;
        this.cargoEmpleado = cargoEmpleado;
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getCargoEmpleado() {
        return cargoEmpleado;
    }

    public void setCargoEmpleado(String cargoEmpleado) {
        this.cargoEmpleado = cargoEmpleado;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "EgresadoNoEmpresarioEmpleado{" + "nombreEmpresa=" + nombreEmpresa + ", cargoEmpleado=" + cargoEmpleado + ", fechaIngreso=" + fechaIngreso + '}';
    }

    public double calcularAntiguedad() {
        LocalDate hoy = LocalDate.now();
        double antiguedad = 0.0;
        //Fecha de ingreso menos fecha actual
        antiguedad = ChronoUnit.DAYS.between(hoy, fechaIngreso);
        return antiguedad;
    }
}
