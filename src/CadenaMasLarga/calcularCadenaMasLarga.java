package CadenaMasLarga;

import java.util.ArrayList;
import java.util.Scanner;

public class calcularCadenaMasLarga {

    ArrayList<String> arrayCadenas = new ArrayList<>();

    Scanner entradaTeclado = new Scanner(System.in);

    public void llenarArray() {
        String cadena;
        boolean continuar = true;

        while (continuar) {
            System.out.print("\nIntrocuce una cadena de caracteres, escribe [fin] para finalizar: ");
            cadena = this.entradaTeclado.nextLine();
            if (cadena.equalsIgnoreCase("fin")) continuar = false;
            else arrayCadenas.add(cadena);
        }
    }

        public void cualEsMasLarga() {
            String masLarga;
            masLarga = arrayCadenas.get(0);

            for (int contadorArray=1; contadorArray<arrayCadenas.size(); contadorArray++) {
                if (arrayCadenas.get(contadorArray).length() > masLarga.length()) masLarga = arrayCadenas.get(contadorArray);
            }
            System.out.println("\nLa caden más larga es: "+masLarga);
        }


}

