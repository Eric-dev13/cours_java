public class Planete {
    String nom;
    // String matiere;
    Long diametre;
    Atmosphere atmosphere;
    boolean quaiLibre;
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




}

