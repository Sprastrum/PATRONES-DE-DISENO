package bridge.solucion.naves;

import bridge.solucion.tipoNave.ITipoNave;

public abstract class NaveEspacial {
    protected ITipoNave tipoNave;

    public NaveEspacial(ITipoNave tipoNave) {
        this.tipoNave = tipoNave;
    }

     public abstract String proposito();
}
