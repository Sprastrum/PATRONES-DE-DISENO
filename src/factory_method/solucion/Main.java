package factory_method.solucion;

public class Main {
    public static void main(String[] args) {
        EstacionEspacial estacionEspacial = new EstacionEspacial("Jita");
        Acoplamiento acoplamiento = new Acoplamiento();

        System.out.println(estacionEspacial.toString());
        IViajeEspacial viajeEspacial1 = acoplamiento.getAcoplamiento("Amarr");
        System.out.println(viajeEspacial1.proposito());

        System.out.println(estacionEspacial.toString());
        IViajeEspacial viajeEspacial2 = acoplamiento.getAcoplamiento("Caldari");
        System.out.println(viajeEspacial2.proposito());

        System.out.println(estacionEspacial.toString());
        IViajeEspacial viajeEspacial3 = acoplamiento.getAcoplamiento("Gallente");
        System.out.println(viajeEspacial3.proposito());

        System.out.println(estacionEspacial.toString());
        IViajeEspacial viajeEspacial4 = acoplamiento.getAcoplamiento("Minmatar");
        System.out.println(viajeEspacial4.proposito());

        System.out.println(estacionEspacial.toString());
        IViajeEspacial viajeEspacial5 = acoplamiento.getAcoplamiento(null);
        System.out.println(viajeEspacial5.proposito());
    }
}
