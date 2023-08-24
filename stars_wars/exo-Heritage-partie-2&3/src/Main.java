public class Main {
    public static void main(String[] args) {
        PlaneteTellurique mercure = new PlaneteTellurique();
        mercure.nom = "Mercure";
        mercure.diametre = 4880l;

        PlaneteTellurique venus = new PlaneteTellurique();
        venus.nom = "Venus";
        venus.diametre = 12100l;

        PlaneteTellurique terre = new PlaneteTellurique();
        terre.nom = "Terre";
        terre.diametre = 12756l;

        PlaneteTellurique mars = new PlaneteTellurique();
        mars.nom = "Mars";
        mars.diametre = 6792l;

        PlaneteGazeuse jupiter = new PlaneteGazeuse();
        jupiter.nom = "Jupiter";
        jupiter.diametre = 142984l;

        PlaneteGazeuse saturne = new PlaneteGazeuse();
        saturne.nom = "Saturne";
        saturne.diametre = 120536l;

        PlaneteGazeuse uranus = new PlaneteGazeuse();
        uranus.nom = "Uranus";
        uranus.diametre = 51118l;

        PlaneteGazeuse neptune = new PlaneteGazeuse();
        neptune.nom = "Neptune";
        neptune.diametre = 49532l;

        PlaneteGazeuse pluton = new PlaneteGazeuse();
        pluton.nom = "Pluton";
        pluton.diametre = 2300l;
        System.out.printf("Nombre de planete: %d", pluton.nbPlanetesDecouvertes);

        neptune.revolution();
        mars.rotation();

        uranus.atmosphere.hydrogene = 83f;
        uranus.atmosphere.hélium = 15f;
        uranus.atmosphere.methane = 2.5f;

        System.out.printf("L'atmosphère de %s est composée :\n", uranus.nom);
        System.out.printf("A %f d'hydrogène\n", uranus.atmosphere.argon);
        System.out.printf("A %f d'hydrogène\n", uranus.atmosphere.hélium);
        System.out.printf("A %f d'hydrogène\n", uranus.atmosphere.methane);
        System.out.printf("A %f d'hydrogène\n", uranus.atmosphere.hydrogene);
        System.out.printf("A %f d'hydrogène\n", uranus.atmosphere.co2);
        System.out.printf("A %f d'hydrogène\n", uranus.atmosphere.azote);
        System.out.printf("A %f d'hydrogène\n", uranus.atmosphere.sodium);

        Vaisseau vaisseau = new Vaisseau();
        vaisseau.typeVaisseau = "FREGATE";
        vaisseau.nbPassager = 10;

        Vaisseau vaisseau2 = new Vaisseau();
        vaisseau2.enumTypeVaisseau = TypeVaisseau.VAISSEAU_MONDE;
        vaisseau2.typeVaisseau = "FREGATE";
        vaisseau2.nbPassager = 10;

        // Heritage - Partie n°1
        VaisseauDeGuerre chasseur = new VaisseauDeGuerre();
        chasseur.nbPassager =10;
        chasseur.typeVaisseau = "Chasseur";
        chasseur.blindage = 156;
        chasseur.resistanceDuBouclier = 2;

        VaisseauCivil vaisseau_Monde = new VaisseauCivil();
        vaisseau_Monde.nbPassager= 50;
        vaisseau_Monde.typeVaisseau = "Vaisseau monde";
        vaisseau_Monde.blindage = 4784;
        vaisseau_Monde.resistanceDuBouclier = 30;

        chasseur.activerBouclier();
        vaisseau_Monde.activerBouclier();

        chasseur.attaque(vaisseau_Monde, "lasers photoniques", 3);
        vaisseau_Monde.desactiverBouclier();

        System.out.println("Durée de protection résiduelle du bouclier: " + vaisseau_Monde.resistanceDuBouclier);
        System.out.println("Valeur du blindage du " + vaisseau_Monde.typeVaisseau + " " + vaisseau_Monde.blindage + " mn");

        // Partie n°2
        mars.accueillirVaisseau(chasseur);
        mars.accueillirVaisseau(vaisseau_Monde);



        // Partie n°3

        // déclarez maintenant les vaisseaux sous forme de variables de type Vaisseau afin de matérialiser le polymorphisme.

        /*
        POLYMORPHISME (déclaration de type heritage) - TRANSTYPAGE (permet de changer de type)

        Vaisseau chasseur = new Vaisseau(); // Donne access aux propriétés et méthodes de la classe Vaisseau.
        Vaisseau chasseur = new VaisseauDeGuerre() // Donne access aux propriétés et méthodes de la classe Vaisseau.

        Transtypage impossible si Vaisseau chasseur = new Vaisseau();
        Transtypage possible si Vaisseau chasseur = new VaisseauDeGuerre();

        VaisseauDeGuerre chasseur2  = (VaisseauDeGuerre) chasseur2;
        EQUIVAUT
        VaisseauDeGuerre chasseur3 = new VaisseauDeGuerre();

        */

        Vaisseau chasseur2 = new Vaisseau();
        chasseur2.nbPassager =10;
        chasseur2.typeVaisseau = "Chasseur";
        chasseur2.blindage = 156;
        chasseur2.resistanceDuBouclier = 2; // 5 f - 2 Methode

        Vaisseau chasseur5 = new VaisseauDeGuerre();


        VaisseauDeGuerre chasseur6 = new VaisseauDeGuerre();


        // chasseur5.activerBouclier(); // polymorphysme

        Vaisseau vaisseau_Monde2 = new VaisseauCivil();
        vaisseau_Monde2.nbPassager= 50;
        vaisseau_Monde2.typeVaisseau = "Vaisseau monde";
        vaisseau_Monde2.blindage = 4784;
        vaisseau_Monde2.resistanceDuBouclier = 30;



        VaisseauDeGuerre chasseur3  = (VaisseauDeGuerre) chasseur2;
        chasseur3.activerBouclier();
        chasseur3.attaque(vaisseau_Monde2, "lasers photoniques", 3);
//
        chasseur3.desactiverBouclier();
        chasseur3.attaque(vaisseau_Monde2, "lasers photoniques", 3);


    }
}