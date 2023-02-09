package factory_method.solucion;

public class EstacionEspacial {
    private String nombre;
    public EstacionEspacial(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Aquí " + nombre +", reporte su proposito.";
    }
}
