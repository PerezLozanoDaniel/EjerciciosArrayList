package ArrayListVehiculos;

public class Vehiculo implements InterfaceVehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private int kilometros;
    private int numeroRuedas;
    TipoVehiculo tipoVehiculo;
    StringBuilder constructorCadena = new StringBuilder();

    public Vehiculo(String matricula, String marca, String modelo, int kilometros, int numeroRuedas) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometros = kilometros;
        this.numeroRuedas = numeroRuedas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    @Override
    public String toString() {
        this.constructorCadena.append("\nMatrícula: ");
        this.constructorCadena.append(matricula);
        this.constructorCadena.append("\nMarca: ");
        this.constructorCadena.append(marca);
        this.constructorCadena.append("\nModelo: ");
        this.constructorCadena.append(modelo);
        this.constructorCadena.append("\nKm: ");
        this.constructorCadena.append(kilometros);
        switch (this.numeroRuedas) {
            case 2:
                this.tipoVehiculo = TipoVehiculo.moto;
                break;
            case 4:
                this.tipoVehiculo = TipoVehiculo.coche;
                break;
            case 6:
                this.tipoVehiculo = TipoVehiculo.camion;
                break;
            default:
                break;
        }
        this.constructorCadena.append("\nTipo de vehiculo: ");
        this.constructorCadena.append(tipoVehiculo);
        return this.constructorCadena.toString();
    }

    @Override
    public int getNumeroRuedas() {
        return this.numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

}
