package poo;

public class Coche {
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int pesoPlataforma;
    private String color;
    private int pesoTotal;
    private boolean asientosCuero, climatizador;

    public Coche() {
        this.ruedas = 4;
        this.largo = 2000;
        this.ancho = 300;
        this.motor = 1600;
        this.pesoPlataforma = 500;
    }

    public String dimeDatosGenerales() {
        return "La plataforma del vehículo tiene " + ruedas + " ruedas " +
                " Mide " + largo / 1000 + "metros con un ancho de " + ancho +
                "cm y un peso de plataforma de " + pesoPlataforma + " kg.";
    }

    public void estableceColor(String colorCoche) {
        color = colorCoche;
    }

    public String dimeColor() {
        return "El color del coche es " + color;
    }

    public void configuraAsientos(String asientosCuero) {
        if (asientosCuero.equalsIgnoreCase("si")) {
            this.asientosCuero = true;
        } else {
            this.asientosCuero = false;
        }
    }

    public String dimeAsientos() {
        if (asientosCuero) {
            return "El coche tiene asientos de cuero";
        } else {
            return "El coche tiene asientos de serie";
        }
    }

    public void configuraClimatizador(String climatizador) {
        if (climatizador.equalsIgnoreCase("si")) {
            this.climatizador = true;
        } else {
            this.climatizador = false;
        }
    }

    public String dimeClimatizador() {
        if (climatizador) {
            return "El coche incorpora climatizador";
        } else {
            return "El coche lleva aire acondicionado";
        }
    }

    public String dimePesoCoche() {
        int pesoCarroceria = 500;
        pesoTotal = pesoPlataforma + pesoCarroceria;
        if (asientosCuero) {
            pesoTotal += 50;
        }
        if (climatizador) {
            pesoTotal += 20;
        }
        return "El peso total del coche es " + pesoTotal;
    }
}
