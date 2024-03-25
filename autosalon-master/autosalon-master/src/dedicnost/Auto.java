package dedicnost;

public class Auto {

    private int pocetsedadel = 5;
    private int pocetdveri = 5;
    private int pocetNahradnichKol = 1;
    private int pocetKoni;
    private int cena;

    private String barva;
    public Auto (int pocetKoni, int cena, String barva){
        this.pocetKoni=pocetKoni;
        this.cena=cena;
        this.barva=barva;
    }
    public void vypisInfo(){
        System.out.println("Počet sedadel: "+ pocetsedadel);
        System.out.println("Pocet dveří: "+ pocetdveri);
        System.out.println("Počet náhradních kol: "+ pocetNahradnichKol);
    }
    public void jizdaStart(){
        System.out.println("Auto začalo svou jízdu.");
    }
    public int getPocetsedadel() {
        return pocetsedadel;
    }
    public int getPocetdveri() {
        return pocetdveri;
    }
    public int getPocetNahradnichKol() {
        return pocetNahradnichKol;
    }
    public int getPocetKoni() {
        return pocetKoni;
    }
    public int getCena() {
        return cena;
    }
    public String getBarva() {
        return barva;
    }

}
