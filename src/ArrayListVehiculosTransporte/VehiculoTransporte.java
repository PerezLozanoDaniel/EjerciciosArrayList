package ArrayListVehiculosTransporte;

public class VehiculoTransporte implements ITransportador {
    private String matricula;
    private String marca;
    private String modelo;
    private int kilometros;
    private int numeroRuedas;
    TipoVehiculoTransporte tipoVehiculoTransporte;
    StringBuilder constructorCadena = new StringBuilder();

    public VehiculoTransporte(String matricula, String marca, String modelo, int kilometros, int numeroRuedas) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometros = kilometros;
        this.numeroRuedas = numeroRuedas;
    }

    @Override
    public String getMarca() {
        return this.marca;
    }

    public int getKilometros() {
        return kilometros;
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
                this.tipoVehiculoTransporte = TipoVehiculoTransporte.moto;
                break;
            case 4:
                this.tipoVehiculoTransporte = TipoVehiculoTransporte.coche;
                break;
            case 6:
                this.tipoVehiculoTransporte = TipoVehiculoTransporte.camion;
                break;
            default:
                break;
        }
        this.constructorCadena.append("\nTipo de vehiculo: ");
        this.constructorCadena.append(tipoVehiculoTransporte);
        return this.constructorCadena.toString();
    }
}
