public class Planete {
    String nom;
    String matiere;
    Long diametre;

    void rotation(){
//      System.out.println("Je suis la planète " + this.nom + " et je tourne sur moi-même.");
        System.out.printf("Je suis la planète %s et je tourne sur moi-même.\n", this.nom);
    }

    void revolution(){
//      System.out.println("Je suis la planète " + this.nom + " et je tourne autour de mon étoile");
        System.out.printf("Je suis la planète %s et je tourne autour de mon étoile.\n", this.nom);
    }
}
