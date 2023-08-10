public class Main {
    public static void main(String[] args) {

        /*
        Instancié un objet alloue à la mémoire l'affectation référence elle l'emplacement de l'objet instancié, on par de pointeur de l'objet.
         */
        Voiture voiture= new Voiture();
        voiture.nbPortes = 5;
        voiture.couleur = "rouge";
        voiture.modele = "peugeot 12008";

        voiture.klaxonner();

        // transtypage
        VehiculeAMoteur maVoiture = new Voiture(); // seule les propriétés de véhicule sont accessibles.

        Voiture maVoiturePourRobotPeinture= (Voiture)maVoiture;

        maVoiturePourRobotPeinture.couleur= "rouge";

        maVoiturePourRobotPeinture.accelerer(100);

        Port vieuxPort=new Port(200);
        Bateau yatch=new Bateau();
        yatch.masse=50;
        vieuxPort.acceuillirEngin(yatch);
        vieuxPort.acceuillirEngin(yatch);
        vieuxPort.acceuillirEngin(yatch);
        vieuxPort.acceuillirEngin(yatch);

        /*
        ici l'interface Amarable nous permet de mettre en lumière le fait que la seule chose qui interesse notre port est que l'engin soit amarable ainsi que le fait de savoir de combien de cordes et d'emplacement, il aura besoin.
        Sans cette interface chaques engin aurait du impémenter la methode accueillir engin.

        Une interface peut hériter elle meme d'un nombre illimite d'interface.
        Une interface peut-etre déclarer sans contenu, on l'appelle drapeau.elle a pour but de signaler une fonction de la classe qui l'implenete ou bien de l'interface qui en herite (ex: Devissable, Revissable dans vidangeable).
        Une interface peut contenir des propriétés, mais pas leur valeurs devra e^tre affecté à la déclaration.


         */

    }

}