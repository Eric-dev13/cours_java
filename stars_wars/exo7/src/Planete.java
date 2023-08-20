public class Planete {
    String nom;
    // String matiere;
    Long diametre;
    Atmosphere atmosphere;
    Vaisseau VaisseauSurPlanete;
    int totalVisiteurs = 0;
    static int nbPlanetesDecouvertes = 0;

    Planete(){
        nbPlanetesDecouvertes++;
        this.atmosphere = new Atmosphere();
    }

    Planete(String nom){
        this();
        this.nom = nom;
    }

    void rotation(){
//      System.out.println("Je suis la planète " + this.nom + " et je tourne sur moi-même.");
        System.out.printf("Je suis la planète %s et je tourne sur moi-même.\n", this.nom);
    }

    void revolution(){
//      System.out.println("Je suis la planète " + this.nom + " et je tourne autour de mon étoile");
        System.out.printf("Je suis la planète %s et je tourne autour de mon étoile.\n", this.nom);
    }

    void accueillirVaisseau(Vaisseau vaisseau) {
        if (this.VaisseauSurPlanete==null) {
            this.VaisseauSurPlanete=vaisseau;
            this.totalVisiteurs += vaisseau.nbPassager;
            System.out.println("Aucun vaisseau ne s'en va");
        } else {
            System.out.printf("Un vaisseau de type %s doit s'en aller\n",this.VaisseauSurPlanete.typeVaisseau);

        }
        System.out.printf("Le nombre d'humains ayant déjà séjourné sur %s est actuellement de %d\n",this.nom,this.totalVisiteurs);
    }



}

