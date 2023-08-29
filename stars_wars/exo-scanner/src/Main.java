import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // SCANNER ET ENUM
        PlaneteTellurique terre = new PlaneteTellurique("Terre",3);


        Vaisseau freg= new VaisseauDeGuerre(TypeVaisseau.FREGATE,12);

        terre.placeVaisseauDisponible[0]=freg;
        terre.accueillirVaisseau(freg);

        terre.placeVaisseauDisponible[1]=freg;
        terre.accueillirVaisseau(freg);

        terre.placeVaisseauDisponible[2]=freg;
        terre.accueillirVaisseau(freg);

        // Partie

        Scanner scanner=new Scanner(System.in);

        System.out.println("Quel vaisseau souhaitez vous manipuler? (chasseur, fregate, croiseur, cargo, vaisseauMonde)");
        String choixVaisseau = scanner.nextLine();

        System.out.println("Quelle nombre de passager avez-vous embarqué ?");
        int nbrePassger = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Quelle tonnage de cargaison souhaitez-vous embarquer");
        int tonnage = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Sur quelle planète tellurique souhaitez-vous vous poser?");
        String choixPlaneteAccostage = scanner.nextLine();

        // Instance de la planete d'accostage
        PlaneteTellurique planete = new PlaneteTellurique(choixPlaneteAccostage,3);

        String ouiNon = "non";
        do {
            // Instanciation du vaisseau
            TypeVaisseau typeVaisseau = Enum.valueOf(TypeVaisseau.class, choixVaisseau.toUpperCase());
            Vaisseau vaisseauChoice =  new VaisseauDeGuerre(typeVaisseau, nbrePassger);
            System.out.println("Bienvenue sur " + choixVaisseau);

            vaisseauChoice.emporterCargaison(tonnage);
            // essayer d'accoster
            planete.accueillirVaisseau(vaisseauChoice);

            System.out.println("Voulez-vous recommencer : oui/non");
            ouiNon = scanner.nextLine();

        } while(ouiNon.equalsIgnoreCase("oui"));

    }
}