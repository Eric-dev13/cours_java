public class Main {
    public static void main(String[] args) {
        Planete mercure =new Planete();
        mercure.nom =  "Mercure";
        mercure.matiere = "Tellurique";
        mercure.diametre = 4880l;

        Planete venus =new Planete();
        venus.nom =  "Venus";
        venus.matiere = "Tellurique";
        venus.diametre = 12100l;

        Planete terre =new Planete();
        terre.nom =  "Terre";
        terre.matiere = "Tellurique";
        terre.diametre = 12756l;

        Planete mars =new Planete();
        mars.nom =  "Mars";
        mars.matiere = "Tellurique";
        mars.diametre = 6792l;

        Planete jupiter =new Planete();
        jupiter.nom =  "Jupiter";
        jupiter.matiere = "Gazeuse";
        jupiter.diametre = 142984l;
        System.out.println("Jupiter est une planète Gazeuse avec un diamètre de 142984 kilomètres");
        System.out.println(jupiter.nom + " est une planète" + jupiter.matiere + " avec un diamètre de " + jupiter.diametre +  " kilomètres");
        System.out.printf("%s est une planète %s avec un diamètre de %d kilomètres \n",jupiter.nom, jupiter.matiere , jupiter.diametre);

        Planete saturne =new Planete();
        saturne.nom =  "Saturne";
        saturne.matiere = "Gazeuse";
        saturne.diametre = 120536l;

        Planete uranus =new Planete();
        uranus.nom =  "Uranus";
        uranus.matiere = "Gazeuse";
        uranus.diametre = 51118l;

        Planete neptune =new Planete();
        neptune.nom =  "Neptune";
        neptune.matiere = "Gazeuse";
        neptune.diametre = 49532l;

        Planete pluton =new Planete();
        pluton.nom =  "Pluton";
        pluton.matiere = "Gazeuse";
        pluton.diametre = 2300l;


        neptune.revolution();
        mars.rotation();

        mars.accueillirVaisseau(8);
        mars.accueillirVaisseau("FREGATE");
    }
}