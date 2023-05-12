//Fabian Esteban Lopez Arias
package Modelo;

import java.util.LinkedList;

public final class EgresadoNoEmpresarioDesempleado extends EgresadoNoEmpresario {

    private int mesesDesempleado;
    private String cargoAspirar;
    private int aniosExpLaboral;

    public EgresadoNoEmpresarioDesempleado(int mesesDesempleado, String cargoAspirar, int aniosExpLaboral, String tipoIdentificacion, int numeroIdentificacion, String nombreCompleto, int numeroTelefono, String email, LinkedList<String> deportes, String ultimoNFA, char cargo) {
        super(tipoIdentificacion, numeroIdentificacion, nombreCompleto, numeroTelefono, email, deportes, ultimoNFA, cargo);
        this.mesesDesempleado = mesesDesempleado;
        this.cargoAspirar = cargoAspirar;
        this.aniosExpLaboral = aniosExpLaboral;
    }

    

    public int getMesesDesempleado() {
        return mesesDesempleado;
    }

    public void setMesesDesempleado(int mesesDesempleado) {
        this.mesesDesempleado = mesesDesempleado;
    }

    public String getCargoAspirar() {
        return cargoAspirar;
    }

    public void setCargoAspirar(String cargoAspirar) {
        this.cargoAspirar = cargoAspirar;
    }

    public int getAniosExpLaboral() {
        return aniosExpLaboral;
    }

    public void setAniosExpLaboral(int aniosExpLaboral) {
        this.aniosExpLaboral = aniosExpLaboral;
    }

    @Override
    public String toString() {
        return "EgresadoNoEmpresarioDesempleado{" + "mesesDesempleado=" + mesesDesempleado + ", cargoAspirar=" + cargoAspirar + ", aniosExpLaboral=" + aniosExpLaboral + '}';
    }

}
