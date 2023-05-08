package LeerNumeros;

import java.util.ArrayList;
import java.util.Scanner;

public class LeerNumeros {

    ArrayList<Integer> listaNumeros = new ArrayList<>();
    int suma;
    double media;

    Scanner entradaTeclado = new Scanner(System.in);

    public void introducirNumeros(){

        while (this.entradaTeclado.nextInt()!=-99)
            System.out.print("\nIntroduce entero. -99 para acabar: \n");
            this.listaNumeros.add(this.entradaTeclado.nextInt());
    }

    public void sumaNumeros (){
        for(Integer numero : listaNumeros){
            this.suma+=numero;
        }
    }

    public void resultados(){
        int numerosPorEncimaMedia=0;

        for(Integer numero :listaNumeros){
            if (numero>this.media) numerosPorEncimaMedia++;
        }

        System.out.println("\n Los números introducidos son:"+ this.listaNumeros);
        System.out.println("\nLa suma de todos los números es: "+ this.suma);
        System.out.println("\nLa media es: "+this.media);
        System.out.println("\n Hay "+numerosPorEncimaMedia +" números superiores a la media");

    }

}
