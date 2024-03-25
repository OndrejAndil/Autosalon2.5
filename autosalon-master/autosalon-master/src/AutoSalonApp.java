

import dedicnost.Audi;
        import dedicnost.Auto;
        import dedicnost.Fabia;
        import dedicnost.Ferrari;

public class AutoSalonApp {
    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari(400, 10000000, "červená");
        ferrari.jizdaStart();
        ferrari.vypisInfo();
        Audi audi = new Audi(200, 1000000, "stříbrná");
        audi.jizdaStart();
        audi.vypisInfo();
        Fabia fabia = new Fabia(80, 250000, "modrá");
        fabia.jizdaStart();
        fabia.vypisInfo();


        System.out.println("Cena Ferrari: " + ferrari.getCena());
        System.out.println("Cena Audi: " + audi.getCena());
        System.out.println("Cena Fabia: " + fabia.getCena());
    }
}