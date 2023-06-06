//Fabian Esteban Lopez Arias 2216110 y Juan Felipe Plata Barbosa 2221109
package Modelo;

public class Empresa {

    private String nombreEmpresa;
    private String direccion;
    private int telefono;
    private String actividadEconomica;

    public Empresa(String nombreEmpresa, String direccion, int telefono, String actividadEconomica) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
        this.telefono = telefono;
        this.actividadEconomica = actividadEconomica;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getActividadEconomica() {
        return actividadEconomica;
    }

    public void setActividadEconomica(String actividadEconomica) {
        this.actividadEconomica = actividadEconomica;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombreEmpresa=" + nombreEmpresa + ", direccion=" + direccion + ", telefono=" + telefono + ", actividadEconomica=" + actividadEconomica + '}';
    }

}//--> fin clase
