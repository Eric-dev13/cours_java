public class Planete {
    String nom;
    // String matiere;
    Long diametre;
    Atmosphere atmosphere;
    static int nbPlanetesDecouvertes = 0;

    float distanceSoleil;

    Planete(){
        nbPlanetesDecouvertes++;
        this.atmosphere = new Atmosphere();
    }

    Planete(String nom){
        this();
        this.nom = nom;
    }

    void rotation(){
        System.out.printf("Je suis la planète %s et je tourne sur moi-même.\n", this.nom);
    }

    void revolution(){
        System.out.printf("Je suis la planète %s et je tourne autour de mon étoile.\n", this.nom);
    }

}

