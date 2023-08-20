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
        System.out.printf("%s est une planète %s avec un diamètre de %d kilomètres\n",jupiter.nom, jupiter.matiere , jupiter.diametre);

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
        System.out.printf("Nombre de planete: %d", pluton.nbPlanetesDecouvertes);

        neptune.revolution();
        mars.rotation();

        uranus.atmosphere.hydrogene = 83f;
        uranus.atmosphere.hélium=15f;
        uranus.atmosphere.methane=2.5f;

        System.out.printf("L'atmosphère de %s est composée :\n",uranus.nom);
        System.out.printf("A %f d'hydrogène\n",uranus.atmosphere.argon);
        System.out.printf("A %f d'hydrogène\n",uranus.atmosphere.hélium);
        System.out.printf("A %f d'hydrogène\n",uranus.atmosphere.methane);
        System.out.printf("A %f d'hydrogène\n",uranus.atmosphere.hydrogene);
        System.out.printf("A %f d'hydrogène\n",uranus.atmosphere.co2);
        System.out.printf("A %f d'hydrogène\n",uranus.atmosphere.azote);
        System.out.printf("A %f d'hydrogène\n",uranus.atmosphere.sodium);

        Vaisseau vaisseau = new Vaisseau();
        vaisseau.typeVaisseau = "FREGATE";
        vaisseau.nbPassager = 10;
        mars.accueillirVaisseau(vaisseau);

        Vaisseau vaisseau2 = new Vaisseau();
        vaisseau2.typeVaisseau = "FREGATE";
        vaisseau2.nbPassager = 10;
        mars.accueillirVaisseau(vaisseau2);

    }
}