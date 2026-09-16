public class Vuelo {
    private String numero;
    private String origen;
    private String destino;
    private int ocupacion;
    private int capacidad;

    public Vuelo(String numero, String origen, String destino, int ocupacion,int capacidad) {
        this.numero = numero;
        this.origen = origen;
        this.destino = destino;
        this.capacidad = capacidad;

        setOcupacion(ocupacion);
    }
    public Vuelo(String numero, String origen, String destino) {
        this.numero = numero;
        this.origen = origen;
        this.destino = destino;
        this.ocupacion = 0;
    }
    public Vuelo (){

    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getOrigen() {
        return origen;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public int getOcupacion() {
        return ocupacion;
    }
    public void setOcupacion(int ocupacion) {
        if (ocupacion <= capacidad) {
            this.ocupacion = ocupacion;
        } else {
            System.out.println("Error: La ocupación no puede superar la capacidad del vuelo.");
        }
    }
    public void mostrarInformacion() {
        System.out.println("Número de vuelo: " + numero);
        System.out.println("Origen: " + origen);
        System.out.println("Destino: " + destino);
        System.out.println("Ocupación: " + ocupacion);
        System.out.println("Capacidad: " + capacidad);
    }
    public void embarcar(int pasajeros) {
        if (ocupacion + pasajeros <= capacidad) {
            ocupacion += pasajeros;
            System.out.println(pasajeros + " pasajeros embarcados. Ocupación actual: " + ocupacion);
        } else {
            System.out.println("Error: No se puede embarcar a " + pasajeros + " pasajeros. Capacidad insuficiente.");
        }
    }
    public void desembarcar(int pasajeros) {
        if (ocupacion - pasajeros >= 0) {
            ocupacion -= pasajeros;
            System.out.println(pasajeros + " pasajeros desembarcados. Ocupación actual: " + ocupacion);
        } else {
            System.out.println("Error: No se puede desembarcar a " + pasajeros + " pasajeros. Ocupación insuficiente.");
        }
    }
    
}