package bridge.solucion.naves;

import bridge.solucion.tipoNave.ITipoNave;

public class NaveGallente extends NaveEspacial {
    public NaveGallente(ITipoNave tipoNave) {
        super(tipoNave);
    }

    @Override
    public String proposito() {
        return "Vengo a " + tipoNave.getProposito() + " por los Gallentes\n";
    }
}
