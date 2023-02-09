package bridge.solucion.naves;

import bridge.solucion.tipoNave.ITipoNave;

public class NaveCaldari extends NaveEspacial {
    public NaveCaldari(ITipoNave tipoNave) {
        super(tipoNave);
    }

    @Override
    public String proposito() {
        return "Vengo a " + tipoNave.getProposito() + " por los Caldarianos\n";
    }
}
