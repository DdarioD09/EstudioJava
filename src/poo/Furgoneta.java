package poo;

public class Furgoneta extends Coche {
    private int capacidadCarga;
    private int plazasExtra;

    public Furgoneta(int capacidadCarga, int plazasExtra) {
        super();
        this.capacidadCarga = capacidadCarga;
        this.plazasExtra = plazasExtra;
    }

    public String dimeDatosFurgoneta() {
        return "La capacidad de carga es: " + capacidadCarga + " y las plazas son " + plazasExtra;
    }
}
