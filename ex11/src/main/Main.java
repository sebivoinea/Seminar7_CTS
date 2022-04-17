package main;

import clase.Calator;
import clase.ICalator;
import clase.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        MijlocTransport mijlocTransport = new MijlocTransport(137);
        ICalator c1 = new Calator("Mihai");
        ICalator c2 = new Calator("Ionel");
        ICalator c3 = new Calator("Gigel");

        mijlocTransport.adaugaCalator(c1);
        mijlocTransport.adaugaCalator(c2);

        mijlocTransport.trimiteMesajePlecareCapatLinie();
        System.out.println();

        mijlocTransport.stergeCalator(c2);
        mijlocTransport.adaugaCalator(c3);

        mijlocTransport.trimiteMesajePlecareCapatLinie();
    }
}
