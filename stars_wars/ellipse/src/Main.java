import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Sur quelle planète tellurique souhaitez-vous vous poser?");
        String choixPlaneteAccostage = scanner.nextLine();

        System.out.println("Quelles sont les types des 4 vaisseaux que vous souhaitez faire accoster? (chasseur, fregate, croiseur, cargo, vaisseauMonde)");
        String choixVaisseau = scanner.nextLine();

        System.out.println("Quelle nombre de passager avez-vous embarqué ?");
        int nbrePassger = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Quelle tonnage de cargaison souhaitez-vous embarquer");
        int tonnage = scanner.nextInt();
        scanner.nextLine();


        // Instance de la planete d'accostage
        PlaneteTellurique planete = new PlaneteTellurique(choixPlaneteAccostage,3);


        // Instanciation du vaisseau
        TypeVaisseau typeVaisseau = Enum.valueOf(TypeVaisseau.class, choixVaisseau.toUpperCase());
        Vaisseau vaisseauChoice =  new VaisseauDeGuerre(typeVaisseau, nbrePassger);
        System.out.println("Bienvenue sur " + choixVaisseau);

        vaisseauChoice.emporterCargaison(tonnage);
        // essayer d'accoster
        planete.accueillirVaisseau(vaisseauChoice, vaisseauChoice, vaisseauChoice, vaisseauChoice);

    }
}