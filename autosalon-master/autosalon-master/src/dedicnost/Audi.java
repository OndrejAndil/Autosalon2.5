package dedicnost;

public class Audi extends Auto{
    public Audi (int pocetKoni, int cena, String barva){

        super(pocetKoni, cena, barva);
    }
    @Override
    public void jizdaStart(){
        System.out.println("Audi engine is started");
        System.out.println("Počet sedadel: " + getPocetsedadel());
    }
}
