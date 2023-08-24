import java.util.ArrayList;
import java.util.List;

public class PlaneteTellurique extends Planete implements Habitable{

    int totalVisiteurs = 0;

    Vaisseau[] placeVaisseauDisponible;

    PlaneteTellurique(){}

    PlaneteTellurique(String nom){
        super(nom);
    }

    PlaneteTellurique(String nom, int nbrVaisseauPouvantAccoster) {
        super(nom);
        this.placeVaisseauDisponible = new Vaisseau[nbrVaisseauPouvantAccoster];
    }

    public boolean restePlaceDisponible(){

        for(int i=0; i < placeVaisseauDisponible.length; i++){

            if (placeVaisseauDisponible[i]==null){
                return true;
            }
        }
        return false;
    }

    @Override
    public void accueillirVaisseau(Vaisseau vaisseau) {
        if (restePlaceDisponible()) {
            this.totalVisiteurs += vaisseau.nbPassager;
            System.out.println("Vous pouvez atterrir\n");
        } else {
            System.out.println("Vous ne pouvez pas atterrir");
        }
        System.out.printf("Le nombre d'humains ayant déjà séjourné sur %s est actuellement de %d\n",this.nom,this.totalVisiteurs);
    }
}

