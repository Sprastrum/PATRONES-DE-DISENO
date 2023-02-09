package factory_method.solucion;

public class NaveAmarr implements IViajeEspacial {
    private String nacionalidad;

    @Override
    public String proposito() {
        return "Vengo a luchar.\n";
    }
}
