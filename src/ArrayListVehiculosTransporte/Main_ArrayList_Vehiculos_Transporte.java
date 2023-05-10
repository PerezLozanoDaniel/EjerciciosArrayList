package ArrayListVehiculosTransporte;

public class Main_ArrayList_Vehiculos_Transporte {
    public static void main(String[] args) {

        AccionesVehiculosTransporte operarListaVehiculos = new AccionesVehiculosTransporte();
        operarListaVehiculos.altaVehiculo();
        operarListaVehiculos.mostrarVehiculo();
        operarListaVehiculos.mismaMarca();
        operarListaVehiculos.ordenarPorKm();
        operarListaVehiculos.conMasKm();
        operarListaVehiculos.mostrarOrdenadosPorKmMenorAMayor();
    }
}
