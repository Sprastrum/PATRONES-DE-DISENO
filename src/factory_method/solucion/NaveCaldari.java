package factory_method.solucion;

public class NaveCaldari implements IViajeEspacial {
    private String nacionalidad;
    private String tipoNave;

    @Override
    public String proposito() {
        return "Vengo a investigar.\n";
    }
}
