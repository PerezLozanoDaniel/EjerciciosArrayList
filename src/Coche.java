public class Coche {

        private String matricula;
        private String marca;
        private String modelo;
        private int kilometros;
        StringBuilder constructorCadena = new StringBuilder();

        public Coche(String matricula, String marca, String modelo, int kilometros) {
            setMatricula(matricula);
            setMarca(marca);
            setModelo(modelo);
            setKilometros(kilometros);
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
            return this.constructorCadena.toString();
        }
}


