public class Planete {
    String nom;
    String matiere;
    Long diametre;


    int totalVisiteurs = 0;

    void rotation(){
//      System.out.println("Je suis la planète " + this.nom + " et je tourne sur moi-même.");
        System.out.printf("Je suis la planète %s et je tourne sur moi-même.\n", this.nom);
    }

    void revolution(){
//      System.out.println("Je suis la planète " + this.nom + " et je tourne autour de mon étoile");
        System.out.printf("Je suis la planète %s et je tourne autour de mon étoile.\n", this.nom);
    }

    void accueillirVaisseau(int nbHumain){
        this.totalVisiteurs += nbHumain;
        System.out.printf("Le nombre d'humains ayant déjà séjourné sur Mars est actuellement de %d.\n", this.totalVisiteurs);
    }

    void accueillirVaisseau(String typeVaisseau){
        if( typeVaisseau.equals("CHASSEUR") ){
            totalVisiteurs += 3;
        } else if ( typeVaisseau.equals("FREGATE") ) {
            totalVisiteurs += 12;
        } else if ( typeVaisseau.equals("CROISEUR") ) {
            totalVisiteurs += 50;
        } else {
            System.out.println("Salariés en grève!!!");
        }
        System.out.printf("Le nombre d'humains ayant déjà séjourné sur Mars est actuellement de %d.\n", this.totalVisiteurs);
    }



}
