package factory_method.solucion;
//Fabrica
public class Acoplamiento {
    public IViajeEspacial getAcoplamiento(String nacionalidad) {
        if(null == nacionalidad) {
            return new NaveAlienigena();
        } else if("Caldari".equals(nacionalidad)) {
            return new NaveCaldari();
        } else if ("Amarr".equals(nacionalidad)) {
            return new NaveAmarr();
        } else if ("Gallente".equals(nacionalidad)) {
            return new NaveGallente();
        } else if ("Minmatar".equals(nacionalidad)) {
            return new NaveMinmatar();
        }
        return null;
    }
}
