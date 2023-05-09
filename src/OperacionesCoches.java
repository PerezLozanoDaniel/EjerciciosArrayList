import java.util.ArrayList;
import java.util.Scanner;

public class OperacionesCoches {
    private String matricula;
    private String marca;
    private String modelo;
    private int kilometros;
    ArrayList<Coche> listaCoches =new ArrayList<>();

    Scanner entradaTeclado = new Scanner(System.in);

    public void altaCoches(){
        boolean continuar=true;
        int posicionListaCoches=listaCoches.lastIndexOf(listaCoches)+1;
        String control;

        while (continuar) {

            System.out.println("Coche " + posicionListaCoches);
            System.out.print("Matrícula: ");
            this.matricula = this.entradaTeclado.nextLine();
            System.out.print("Marca: ");
            this.marca = this.entradaTeclado.nextLine();
            System.out.print("Modelo: ");
            this.modelo = this.entradaTeclado.nextLine();
            System.out.print("Número de Kilómetros: ");
            this.kilometros = this.entradaTeclado.nextInt();
            this.entradaTeclado.nextLine();
            Coche nuevoCoche = new Coche(this.matricula, this.marca, this.modelo, this.kilometros);
            listaCoches.add(posicionListaCoches,nuevoCoche);

            System.out.println("¿Desea dar de alta un coche?[s/n]");
            control=this.entradaTeclado.nextLine();
            if (control.equalsIgnoreCase("n")) {
                continuar = false;
            }else posicionListaCoches++;
        }
    }

    public void mostrarCoches() {
        for (int posicionListaCoches = 0; posicionListaCoches < this.listaCoches.size(); posicionListaCoches++)
            System.out.println(this.listaCoches.get(posicionListaCoches));
    }

    public void mismaMarca(){
        String marca;
        System.out.print("Introduce marca: ");
        marca = this.entradaTeclado.nextLine();
        System.out.println("Coches de la marca " + marca);
        for(int posicionListaCoches = 0; posicionListaCoches < this.listaCoches.size(); posicionListaCoches++){
            if(this.listaCoches.get(posicionListaCoches).getMarca().equalsIgnoreCase(marca))
                System.out.println(this.listaCoches.get(posicionListaCoches));
        }
    }

    public void ordenarPorKm(){
        int kilometros;
        System.out.print("Introduce número de kilómetros: ");
        kilometros = this.entradaTeclado.nextInt();
        System.out.println("Coches con menos de " + kilometros + " Kilometros");
        for(int posicionListaCoches = 0; posicionListaCoches < this.listaCoches.size(); posicionListaCoches++){
            if(this.listaCoches.get(posicionListaCoches).getKilometros() < kilometros)
                System.out.println(this.listaCoches.get(posicionListaCoches));
        }
    }

    public Coche conMasKm(){
        Coche masKilometros = this.listaCoches.get(0);
        for(int i = 0; i < this.listaCoches.size(); i++){
            if(this.listaCoches.get(i).getKilometros() > masKilometros.getKilometros())
                masKilometros = this.listaCoches.get(i);
        }
        return masKilometros;
    }

    public void mostrarOrdenadosPorKmMenorAMayor(){
        int i, j;
        Coche temporalParaOrdenar;
        for(i = 0; i < this.listaCoches.size()-1; i++)
            for(j=0; j < this.listaCoches.size()-i-1; j++)
                if(this.listaCoches.get(j+1).getKilometros() < this.listaCoches.get(j).getKilometros()){
                    temporalParaOrdenar = this.listaCoches.get(j+1);
                    this.listaCoches.set(j+1, this.listaCoches.get(j));
                    this.listaCoches.set(j, temporalParaOrdenar);
                }
        mostrarCoches();
    }
}
