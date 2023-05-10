package ArrayListVehiculosTransporte;

import java.util.ArrayList;
import java.util.Scanner;

public class AccionesVehiculosTransporte {
    private String matricula;
    private String marca;
    private String modelo;
    private int kilometros;
    private int numeroRuedas;

    ArrayList<ITransportador> listaVehiculos = new ArrayList<>();
    Scanner entradaTeclado = new Scanner(System.in);
    ITransportador nuevoVehiculo;


    public void altaVehiculo() {
        boolean continuar = true;
        int posicionListaVehiculos = listaVehiculos.lastIndexOf(listaVehiculos) + 1;
        String control;

        while (continuar) {

            System.out.println("Vehiculo " + posicionListaVehiculos);
            System.out.print("Matrícula: ");
            this.matricula = this.entradaTeclado.nextLine();
            System.out.print("Marca: ");
            this.marca = this.entradaTeclado.nextLine();
            System.out.print("Modelo: ");
            this.modelo = this.entradaTeclado.nextLine();
            System.out.print("Número de Kilómetros: ");
            this.kilometros = this.entradaTeclado.nextInt();
            System.out.print("Número de Ruedas: ");
            this.numeroRuedas = this.entradaTeclado.nextInt();
            this.entradaTeclado.nextLine();
            switch (this.numeroRuedas) {
                case 2:
                    this.nuevoVehiculo = new Moto(matricula, marca, modelo, kilometros, numeroRuedas);
                    break;
                case 4:
                    this.nuevoVehiculo = new Coche(matricula, marca, modelo, kilometros, numeroRuedas);
                    break;
                case 6:
                    this.nuevoVehiculo = new Camion(matricula, marca, modelo, kilometros, numeroRuedas);
                    break;
                default:
                    System.out.println("\nEl número de ruedas debe ser 2,4 ó 6");
            }

            listaVehiculos.add(posicionListaVehiculos, nuevoVehiculo);

            System.out.println("¿Desea dar de alta un nuevo vehiculo?[s/n]");
            control = this.entradaTeclado.nextLine();
            if (control.equalsIgnoreCase("n")) {
                continuar = false;
            } else posicionListaVehiculos++;
        }
    }


        public void mostrarVehiculo () {
            for (int posicionListaVehiculos = 0; posicionListaVehiculos < this.listaVehiculos.size(); posicionListaVehiculos++)
                System.out.println(this.listaVehiculos.get(posicionListaVehiculos));
        }

        public void mismaMarca () {
            String marca;
            System.out.print("Introduce marca: ");
            marca = this.entradaTeclado.nextLine();
            System.out.println("Coches de la marca " + marca);
            for (int posicionListaVehiculos = 0; posicionListaVehiculos < this.listaVehiculos.size(); posicionListaVehiculos++) {
                if (this.listaVehiculos.get(posicionListaVehiculos).getMarca().equalsIgnoreCase(marca))
                    System.out.println(this.listaVehiculos.get(posicionListaVehiculos));
            }
        }

        public void ordenarPorKm () {
            int kilometros;
            System.out.print("Introduce número de kilómetros: ");
            kilometros = this.entradaTeclado.nextInt();
            System.out.println("Coches con menos de " + kilometros + " Kilometros");
            for (int posicionListaCoches = 0; posicionListaCoches < this.listaVehiculos.size(); posicionListaCoches++) {
                if (this.listaVehiculos.get(posicionListaCoches).getKilometros() < kilometros)
                    System.out.println(this.listaVehiculos.get(posicionListaCoches));
            }
        }

        public ITransportador conMasKm () {
            ITransportador masKilometros = this.listaVehiculos.get(0);
            for (int i = 0; i < this.listaVehiculos.size(); i++) {
                if (this.listaVehiculos.get(i).getKilometros() > masKilometros.getKilometros())
                    masKilometros = this.listaVehiculos.get(i);
            }
            return masKilometros;
        }

        public void mostrarOrdenadosPorKmMenorAMayor () {
            int i, j;
            ITransportador temporalParaOrdenar;
            for (i = 0; i < this.listaVehiculos.size() - 1; i++)
                for (j = 0; j < this.listaVehiculos.size() - i - 1; j++)
                    if (this.listaVehiculos.get(j + 1).getKilometros() < this.listaVehiculos.get(j).getKilometros()) {
                        temporalParaOrdenar = this.listaVehiculos.get(j + 1);
                        this.listaVehiculos.set(j + 1, this.listaVehiculos.get(j));
                        this.listaVehiculos.set(j, temporalParaOrdenar);
                    }
            mostrarVehiculo();
        }
}
