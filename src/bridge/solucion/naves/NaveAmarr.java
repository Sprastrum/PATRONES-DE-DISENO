package bridge.solucion.naves;

import bridge.solucion.tipoNave.ITipoNave;

public class NaveAmarr extends NaveEspacial {
    public NaveAmarr(ITipoNave tipoNave) {
        super(tipoNave);
    }

    @Override
    public String proposito() {
        return "Vengo a " + tipoNave.getProposito() + " por los Amarrianos\n";
    }
}
