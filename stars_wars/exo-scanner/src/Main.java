
public class Main {
    public static void main(String[] args) {

    PlaneteTellurique pl1 = new PlaneteTellurique("terre", 3);

    PlaneteTellurique terre1 = new PlaneteTellurique("Terre",3);
    Vaisseau freg= new VaisseauDeGuerre(TypeVaisseau.FREGATE,12);
    Vaisseau freg1= new VaisseauDeGuerre(TypeVaisseau.FREGATE,12);
    Vaisseau freg2= new VaisseauDeGuerre(TypeVaisseau.FREGATE,12);
    Vaisseau freg4= new VaisseauDeGuerre(TypeVaisseau.FREGATE,12);
    terre1.placeVaisseauDisponible[0]=freg;
    terre1.placeVaisseauDisponible[1]=freg1;
    terre1.placeVaisseauDisponible[2]=freg2;
    terre1.accueillirVaisseau(freg4);

    }
}