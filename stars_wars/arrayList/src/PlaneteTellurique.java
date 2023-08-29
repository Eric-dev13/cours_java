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

    public boolean restePlaceDisponible(Vaisseau vaisseau){
        for(int i = 0; i < placeVaisseauDisponible.length; i++){
            if ( placeVaisseauDisponible[i] == null){
                placeVaisseauDisponible[i] = vaisseau;
                return true;
            }
        }
        return false;
    }

    @Override
    public void accueillirVaisseau(Vaisseau... vaisseau) {
        System.out.printf("%d vaisseau veulent accoster\n", vaisseau.length);
        for(int i =0; i < vaisseau.length; i++) {
            if (restePlaceDisponible(vaisseau[i])) {
                this.totalVisiteurs += vaisseau[i].nbPassager;
                System.out.println("Le quai est libre, vous pouvez accoster !");
            } else {
                System.out.println("Le vaisseau ne peut pas se poser sur la planète par manque de place dans la baie.");
            }
            System.out.printf("Le nombre d'humains ayant déjà séjourné sur %s est actuellement de %d\n", this.nom, this.totalVisiteurs);
        }
    }
}

