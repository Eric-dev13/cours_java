public class PlaneteTellurique extends Planete implements Habitable{

    int totalVisiteurs = 0;
    Vaisseau vaisseauAccoste;

    PlaneteTellurique(){
        super();
    }


    @Override
    public void accueillirVaisseau(Vaisseau vaisseau) {
            if (this.vaisseauAccoste==null) {
                System.out.println("Aucun vaisseau ne s'en va");
            } else {
                System.out.printf("Un vaisseau de type %s doit s'en aller\n",this.vaisseauAccoste.typeVaisseau);
            }
        this.vaisseauAccoste=vaisseau;
        this.totalVisiteurs = this.totalVisiteurs + this.vaisseauAccoste.nbPassager;
        System.out.printf("Le nombre d'humains ayant déjà séjourné sur %s est actuellement de %d\n",this.nom,this.totalVisiteurs);
    }
}
