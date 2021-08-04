package poo;

import javax.swing.*;

public class UsoVehicle {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.estableceColor(JOptionPane.showInputDialog("Introduce color"));
        System.out.println(miCoche.dimeColor());
        Furgoneta miFurgoneta1 = new Furgoneta(560, 6);
        System.out.println(miFurgoneta1.dimeDatosGenerales() + "\n" + miFurgoneta1.dimeDatosFurgoneta());


        /*
        miCoche.estableceColor(JOptionPane.showInputDialog("Introduce color"));
        System.out.println(miCoche.dimeDatosGenerales());
        System.out.println(miCoche.dimeColor());
        miCoche.configuraAsientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
        System.out.println(miCoche.dimeAsientos());
        miCoche.configuraClimatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
        System.out.println(miCoche.dimeClimatizador());
        System.out.println(miCoche.dimePesoCoche());
        System.out.println("El precio final del cloche es ");
         */
    }
}
