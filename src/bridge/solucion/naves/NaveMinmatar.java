package bridge.solucion.naves;

import bridge.solucion.tipoNave.ITipoNave;

public class NaveMinmatar extends NaveEspacial {
    public NaveMinmatar(ITipoNave tipoNave) {
        super(tipoNave);
    }

    @Override
    public String proposito() {
        return "Vengo a " + tipoNave.getProposito() + " por los Minmatarianos\n";
    }
}
