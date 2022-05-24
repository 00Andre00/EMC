package Ubicacion;

public class Departamento {
    public String nombre;
    public String provincia;
    public String distrito;

    Departamento(String nombre, String provincia, String distrito) {
        setNombre(nombre);
        setProvincia(provincia);
        setDistrito(distrito);

    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }
    void setDistrito(String distrito) {
        this.distrito = distrito;
    }
    void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    String getNombre() {
        return nombre;
    }
    String getProvincia() {
        return provincia;
    }
    String getDistrito() {
        return distrito;
    }

}
