 // @author fabian_esteban.lope
package Modelo;

public class Lugar {
    private String nombreLugar;
    private String direccion;
    private String ciudad;

    public Lugar(String nombreLugar, String direccion, String ciudad) {
        this.nombreLugar = nombreLugar;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    
    public String getNombreLugar() {
        return nombreLugar;
    }

    public void setNombreLugar(String nombreLugar) {
        this.nombreLugar = nombreLugar;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Lugar{" + "nombreLugar=" + nombreLugar + ", direccion=" + direccion + ", ciudad=" + ciudad + '}';
    }
    
    
}
