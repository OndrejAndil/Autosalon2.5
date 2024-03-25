package dedicnost;

public class Fabia extends Auto{
    public Fabia (int pocetKoni, int cena, String barva){

        super(pocetKoni, cena, barva);
    }
    @Override
    public void jizdaStart(){
        System.out.println("Fabia engine is started");
        System.out.println("Počet sedadel: " + getPocetsedadel());
    }
}
