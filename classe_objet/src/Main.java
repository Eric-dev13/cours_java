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


        // ***********************************
        // LES TYPES ENUM
        // ***********************************
        /*
        Etant utilisé avec static on peut partager les valeurs de ses variables avec toutes les instances de classe
            static boolean auto = true;
            static boolean manuel = true;

        Mais pour améliorer ce cas on utiliseront une enumération

        public enum TypeBoiteVitesse {
            AUTO("boite automatique"),
            SEMI_AUTO("boite semi automatique"),
            MANUELLE("manuelle");
            final String nomTypeBoite;

            private TypeBoiteVitesse(String nomTypeBoite)
            {
                this.nomTypeBoite=nomTypeBoite;
            }
        }
         */

        maVoiturePourRobotPeinture.boiteVitesse = TypeBoiteVitesse.MANUELLE;

        System.out.println(maVoiturePourRobotPeinture.boiteVitesse);

        System.out.println(maVoiturePourRobotPeinture.boiteVitesse.nomTypeBoite);

        System.out.println(maVoiturePourRobotPeinture.boiteVitesse.ordinal()); // Renvoie la position;

        TypeBoiteVitesse auto = TypeBoiteVitesse.valueOf("AUTO");
        System.out.println(auto);

        // ***********************************
        // LES TABLEAU UNIDIMENSIONNEL
        // ***********************************
        int[] tableauDeInteger=new int[5];
        Voiture[] tableauDeVoiture=new Voiture[2];
        tableauDeVoiture[0]= maVoiturePourRobotPeinture;

        tableauDeInteger[3]=10;
        System.out.println(tableauDeVoiture[0].boiteVitesse.nomTypeBoite);

        String[] villeEtapes=new String[1];
        villeEtapes[0]="Arles";

        Passager moi= new Passager("moi");
        // maVoiturePourRobotPeinture.transporter(moi,"aix","Marseille",villeEtapes);

        // ***********************************
        // LES ELLIPSES
        // ***********************************
        /*
        void transporter(Passager passager, String villeDeDepart, String villeArrivee, String... villesEtapes )
        {
            System.out.println(passager.prenom+" voyage avec moi de "+villeDeDepart+" jusqu'a "+villeArrivee);
            System.out.println("Nous passerons par : ");
            for (int i = 0; i < villesEtapes.length ; i++)
            {
                System.out.println(villesEtapes[i]);
            }
        }

        // String... villesEtapes : a partir des 3 points les arguments seront pusher dans le tableau villesEtapes
         */

        maVoiturePourRobotPeinture.transporter(moi,"aix","Marseille","arles","nimes","lunnel");
    }

}