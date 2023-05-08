import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //ALTURAS DE ALUMNOS

        AlturasAlumnos calcularAlturasAlumnos =new AlturasAlumnos();
        calcularAlturasAlumnos.alumnosEnClase();
        calcularAlturasAlumnos.addAltura();
        calcularAlturasAlumnos.resultados();


        //LEER NÚMEROS DE TECLADO

        LeerNumeros listaNumeros =new LeerNumeros();
        listaNumeros.introducirNumeros();
        listaNumeros.sumaNumeros();
        listaNumeros.resultados();


        //ROTAR VALORES ARRAYLIST

        RotarArray listaArray = new RotarArray();
        listaArray.llenarArray();
        listaArray.mostrarArray();
        listaArray.moverDerechaValor();
        listaArray.mostrarArray();


        //CADENA MÁS LARGA

        calcularCadenaMasLarga cadenaMasLarga =new calcularCadenaMasLarga();
        cadenaMasLarga.llenarArray();
        cadenaMasLarga.cualEsMasLarga();


        //





        }
    }
