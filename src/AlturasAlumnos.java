import java.util.*;


public class AlturasAlumnos {

    ArrayList<Double> alturaAlumnos = new ArrayList<>();

    private int alumnos;
    private double altura;
    Scanner entradaTeclado = new Scanner(System.in);

    public void alumnosEnClase() {

        System.out.println("Introduce el número de alumnos en la clase");

        while (this.alumnos < 1) {
            this.alumnos = entradaTeclado.nextInt();
        }
    }

    public void addAltura() {

        int posicionAlumno = 1;
        double altura;

        while (posicionAlumno < this.alumnos) {
            System.out.println("\nIntrocuce la altura del alumno número " + posicionAlumno);
            altura = entradaTeclado.nextDouble();
            posicionAlumno++;
            this.alturaAlumnos.add(altura);
        }
    }

    public void resultados() {
        int alumnosPorEncimaMedia = 0;
        int alumnosPorDebajoMedia = 0;
        Double mediaDeAltura = 0d;

        System.out.println("\nLas alturas de todos los alumnos son: " + this.alturaAlumnos);

        for (Double cadaAlumno : this.alturaAlumnos) {
            mediaDeAltura = mediaDeAltura + cadaAlumno;
        }
        for (Double cadaAlumno : this.alturaAlumnos) {
            if (cadaAlumno < mediaDeAltura){
                alumnosPorDebajoMedia++;
            }
            else alumnosPorEncimaMedia++;
            }

        System.out.println("\nLa altura media de la clase es: "+ mediaDeAltura);
        System.out.println("\nHay "+ alumnosPorDebajoMedia +" alumnos por debajo de la media");
        System.out.println("\nHay "+ alumnosPorEncimaMedia +" alumnos por encima de la media");

    }
}


