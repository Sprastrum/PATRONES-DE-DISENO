package factory_method.solucion;

public class NaveGallente implements IViajeEspacial {
    private String nacionalidad;

    @Override
    public String proposito() {
        return "Vengo a construir.\n";
    }
}
