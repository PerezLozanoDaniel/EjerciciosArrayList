package RotarArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class RotarArray {
    ArrayList<Integer> listaArray = new ArrayList<>();

    Scanner entradaTeclado = new Scanner(System.in);


    public void llenarArray() {
        Integer arraySize=0;
        while (arraySize <= 0) {
            System.out.print("\nIntrocuce cantidad de elementos del array, ha de ser mayor de 0: ");
            arraySize = this.entradaTeclado.nextInt();
        }
        for (Integer posicion = 0; posicion < arraySize; posicion++) {
            System.out.println("\nIntroduce el elemento de la posición  " + posicion + " =");
            this.listaArray.add(this.entradaTeclado.nextInt());

        }
    }

    public void moverDerechaValor() {
            Integer posicion;

        posicion = this.listaArray.get(this.listaArray.size() - 1);
        this.listaArray.add(0, posicion);
        this.listaArray.remove(this.listaArray.size() - 1);

    }

    public void mostrarArray(){
        System.out.println(this.listaArray);
    }



}

