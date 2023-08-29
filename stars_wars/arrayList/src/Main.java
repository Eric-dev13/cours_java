import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
//
//        System.out.println("Sur quelle planète tellurique souhaitez-vous vous poser?");
//        String choixPlaneteAccostage = scanner.nextLine();
//
//        System.out.println("Quelles sont les types des 4 vaisseaux que vous souhaitez faire accoster? (chasseur, fregate, croiseur, cargo, vaisseauMonde)");
//        String choixVaisseau = scanner.nextLine();
//
//        System.out.println("Quelle nombre de passager avez-vous embarqué ?");
//        int nbrePassger = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.println("Quelle tonnage de cargaison souhaitez-vous embarquer");
//        int tonnage = scanner.nextInt();
//        scanner.nextLine();
//
//
//        // Instance de la planete d'accostage
//        PlaneteTellurique planete = new PlaneteTellurique(choixPlaneteAccostage,3);
//
//
//        // Instanciation du vaisseau
//        TypeVaisseau typeVaisseau = Enum.valueOf(TypeVaisseau.class, choixVaisseau.toUpperCase());
//        Vaisseau vaisseauChoice =  new VaisseauDeGuerre(typeVaisseau, nbrePassger);
//        System.out.println("Bienvenue sur " + choixVaisseau);
//
//        vaisseauChoice.emporterCargaison(tonnage);
//        // essayer d'accoster
//        planete.accueillirVaisseau(vaisseauChoice, vaisseauChoice, vaisseauChoice, vaisseauChoice);



        /* ******* INSTANCIATION DES PLANETES ****** */

        PlaneteTellurique mercure = new PlaneteTellurique("mercure", 3);

        PlaneteTellurique venus = new PlaneteTellurique("venus", 3);

        PlaneteTellurique terre = new PlaneteTellurique("terre", 3);

        PlaneteTellurique mars = new PlaneteTellurique("mars", 3);

        PlaneteGazeuse jupiter = new PlaneteGazeuse();
        jupiter.nom = "jupiter";
        jupiter.diametre = 139820L;
        jupiter.distanceSoleil = 778.3F;

        PlaneteGazeuse saturne = new PlaneteGazeuse();
        saturne.nom = "saturne";
        saturne.diametre = 116460L;
        saturne.distanceSoleil = 1427.0F;

        PlaneteGazeuse uranus = new PlaneteGazeuse();
        uranus.nom = "uranus";
        uranus.diametre = 50724L;

        PlaneteGazeuse neptune = new PlaneteGazeuse();
        neptune.nom = "neptune";
        neptune.diametre = 49244L;
        uranus.distanceSoleil = 4497.07F;



        Galaxie galaxie = new Galaxie();
        galaxie.nom ="systeme solaire";
        galaxie.planetes.add(mercure);
        galaxie.planetes.add(venus);
        galaxie.planetes.add(terre);
        galaxie.planetes.add(mars);
        galaxie.planetes.add(jupiter);
        galaxie.planetes.add(saturne);
        galaxie.planetes.add(uranus);
        galaxie.planetes.add(neptune);

        System.out.println("Quelles type de vaisseau voulez-vous (chasseur, fregate, croiseur, cargo, vaisseauMonde)");
        String choixVaisseau = scanner.nextLine();

        // Instanciation du vaisseau
        TypeVaisseau typeVaisseau = Enum.valueOf(TypeVaisseau.class, choixVaisseau.toUpperCase());
        Vaisseau vaisseauChoice =  new VaisseauDeGuerre(typeVaisseau, 10);

        // renvoie la planete
        String ouiNon = "oui";
        Planete planeteDestination;
        do {
            System.out.println("Donner l'index de la planete de destination de 0 à 7");
            int index = scanner.nextInt();
            scanner.nextLine();
            planeteDestination = galaxie.planetes.get(index);
            if(planeteDestination instanceof PlaneteGazeuse){
                System.out.printf("La planète %s est de type gazeuse et ne peut être sélectionnée.\n", planeteDestination.nom );
                continue;
            }

            System.out.printf("Vous pouvez accoster sur la planete %s .\n", planeteDestination.nom );

            System.out.println("Voulez-vous continuer : oui/non");
            ouiNon = scanner.nextLine();
        }while(ouiNon.equalsIgnoreCase("oui"));

        if(planeteDestination instanceof PlaneteTellurique){
            ((PlaneteTellurique) planeteDestination).accueillirVaisseau(vaisseauChoice);
        }



    }


}