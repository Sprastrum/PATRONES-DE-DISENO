package bridge.solucion;

import bridge.solucion.naves.*;
import bridge.solucion.tipoNave.*;

public class Main {
    public static void main(String[] args) {
        NaveEspacial[] naveEspaciales = new NaveEspacial[6];

        naveEspaciales[0] = new NaveCaldari(new NaveCombate());
        System.out.println(naveEspaciales[0].proposito());

        naveEspaciales[1] = new NaveGallente(new NaveCombate());
        System.out.println(naveEspaciales[1].proposito());

        naveEspaciales[2] = new NaveMinmatar(new NaveCientifica());
        System.out.println(naveEspaciales[2].proposito());

        naveEspaciales[3] = new NaveAmarr(new NaveConstruccion());
        System.out.println(naveEspaciales[3].proposito());

        naveEspaciales[4] = new NaveCaldari(new NaveMineria());
        System.out.println(naveEspaciales[4].proposito());

        naveEspaciales[5] = new NaveMinmatar(new NaveMineria());
        System.out.println(naveEspaciales[5].proposito());
    }
}
