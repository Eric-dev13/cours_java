import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

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
        galaxie.nom = "systeme solaire";
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
        Vaisseau vaisseauChoice = new VaisseauDeGuerre(typeVaisseau, 10);

        // renvoie la planete
        String ouiNon = "oui";
        Planete planeteDestination = null;
        do {
            System.out.println("Donner le nom de la planete de destination");
            String nomPlanete = scanner.nextLine();

            for (Planete planete : galaxie.planetes) {
                if (planete.nom.equalsIgnoreCase(nomPlanete) ) {
                    planeteDestination = planete;
                    break;
                }
            }

            if (planeteDestination instanceof PlaneteGazeuse) {
                System.out.printf("La planète %s est de type gazeuse et ne peut être sélectionnée.\n", planeteDestination.nom);
                continue;
            }

            ((PlaneteTellurique) planeteDestination).accueillirVaisseau(vaisseauChoice);

            System.out.println("Voulez-vous recommencer : oui/non");
            ouiNon = scanner.nextLine();
        }
        while (ouiNon.equalsIgnoreCase("oui"));

    }

}