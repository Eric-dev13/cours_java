package container;

import container.humain.Passager;
import container.vehicule.Port;
import container.vehicule.VehiculeAMoteur;
import container.vehicule.marin.bateau.Bateau;
import container.vehicule.terrestre.voiture.ExceptionNotNull;
import container.vehicule.terrestre.voiture.ExecptionInvalidFormat;
import container.vehicule.terrestre.voiture.TypeBoiteVitesse;
import container.vehicule.terrestre.voiture.Voiture;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        /*
        Instancié un objet alloue à la mémoire l'affectation référence elle l'emplacement de l'objet instancié, on par de pointeur de l'objet.
         */
        Voiture voiture = new Voiture();
        voiture.nbPortes = 5;
        voiture.couleur = "rouge";
        voiture.modele = "peugeot 12008";

        voiture.klaxonner();

        // transtypage
        VehiculeAMoteur maVoiture = new Voiture(); // seule les propriétés de véhicule sont accessibles.

        Voiture maVoiturePourRobotPeinture = (Voiture) maVoiture;

        maVoiturePourRobotPeinture.couleur = "rouge";

        maVoiturePourRobotPeinture.accelerer(100);

        Port vieuxPort = new Port(200);
        Bateau yatch = new Bateau();
        yatch.masse = 50;
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


        /* ***********************************
                    LES TYPES ENUM
        *********************************** */
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
        int[] tableauDeInteger = new int[5];
        Voiture[] tableauDeVoiture = new Voiture[2];
        tableauDeVoiture[0] = maVoiturePourRobotPeinture;

        tableauDeInteger[3] = 10;
        //System.out.println(tableauDeVoiture[0].boiteVitesse.nomTypeBoite);

        String[] villeEtapes = new String[1];
        villeEtapes[0] = "Arles";

        Passager moi = new Passager("moi");
        // maVoiturePourRobotPeinture.transporter(moi,"aix","Marseille",villeEtapes);

        /* ***********************************
                    LES ELLIPSES
        *********************************** */
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
        */

        // String... villesEtapes : a partir des 3 points les arguments seront pusher dans le tableau villesEtapes

        maVoiturePourRobotPeinture.transporter(moi, "aix", "Marseille", "arles", "nimes", "lunnel");



    /* *************************************************
                    TABLEAUX MULTIDIMENSIONNELS
     ************************************************* */
        int[][][] tabs = new int[2][2][2]; // necessite de renseigner la taille de chacunes des dimensions obligatoirement à la déclaration.

    /*
    *************************************************
                    COLLECTIONS
    *************************************************
        Set, List, Maps et Queue.

        ****************
                LIST
        *****************
        Necessite un import de java.util

         Tableau d'objet auto-indexé :  CLE => VALEUR peux contenir des doublons
         les méthodes qui s'appliquent dessus:
             .add() => attend en parametre des objets => ici pour ajouter à la collection
             .remove() => attends en parametre des objets => ici pour retirer de la collection
             .get() => attend en parametre l'indice de objetpour le recuperer


         ****************
                SET
        *****************

        Liste non ordonnée, ne peux contenir de doublons


        ****************
               MAP
        *****************
        *
    */

        Integer douze = 12; // la classe sera automatiquement instancier new int();, grace à l'auto-boxing.

        Voiture maBelleVoiture = new Voiture();

        List list = new ArrayList();
        list.add("toto");
        list.add(12);
        list.add(5000000000001214545L);
        list.add(1.524);
        list.add(maBelleVoiture);
        list.add(maBelleVoiture);
        list.add(maBelleVoiture);
        list.add(0,1);
        System.out.println(list.get(1));
        System.out.println(list.get(5));
        System.out.println(list.get(6));


        // il est prefrable de faire des collections typée, pour cela on utilise l'opérateur diamant <> grace a cela les transtypage n'est plus obligatoire.
        List<Integer> listInt=new ArrayList<>();



        /* ****************
                SET
        ***************** */
        /*
        Liste non ordonnée, ne peux contenir de doublons
         */

        Set<String> setString = new HashSet<>();
        setString.add("deux");
        setString.add("cinq");
        setString.add("douze");
        setString.add("zero");
        setString.add("six");
        setString.add("huit");

        // On doit convertir en tableau la collection pour accèder à une entrée.
        String str = (String) setString.toArray()[2];
        Object[] arr = setString.toArray();
        System.out.println(str);

        for(Object st: setString)
        {
            System.out.println(st);
            // On ne peux pas modifier la collection (SET) dans une boucle foreach

            // 2nd maniere de parcourir une collection
            // L'interface Iterable

            Iterator<String> stringIterator = setString.iterator();
            // cette methode retourne une classe implémentant l'interface iterator

            // iterator commence au debut de la collection
            String st1 = stringIterator.next();
            String st2 = stringIterator.next();
            String st3 = stringIterator.next();
            System.out.println(st1);
            System.out.println(st2);
            System.out.println(st3);

            // .hasNext() est une methode qui renvoie true tant qu'il existe des éléménts dans la collection.
            System.out.println("itérator hasNext:");
            while (stringIterator.hasNext()){
                if(stringIterator.next().equals("douze")){
                    String var = stringIterator.next();
                    System.out.println(var);
                    var="treize";
                    System.out.println(var);
                }
            }

        /* ****************
               MAP
        ***************** */
            Voiture v1 = new Voiture("rouge", 3);
            Voiture v2 = new Voiture("noire", 3);
            Voiture v3 = new Voiture("jaune", 5);
            Voiture v4 = new Voiture("bleu", 3);

            Map<String, Voiture> mapVoiture = new HashMap<>();
            /*  l'operateur diamant attend:
              - le type de la clé
              - ainsi que le type de la valeur pour ajouter un élément à la collection on utlise la methode put()
             */
            mapVoiture.put("peugeot",v1);
            mapVoiture.put("renault",v2);
            mapVoiture.put("mercedes",v3);
            mapVoiture.put("audi",v4);
            System.out.println(mapVoiture.get("renault").couleur);

            for(Map.Entry<String, Voiture> voitureEntry: mapVoiture.entrySet())
            {
                System.out.println("clé: " + voitureEntry);
            }

            // Pour recuperer uniquement les cles
            for(String cle: mapVoiture.keySet())
            {
                System.out.println("clé: " + cle);
            }

            // Pour recuperer uniquement les valeurs
            for(Voiture valeur: mapVoiture.values())
            {
                System.out.println("valeur: " + valeur.couleur);
            }

            // Quelques methodes de l'interface Collections:
            System.out.println(mapVoiture.size()); // renvoie le nombre d'entrées de la collection
            System.out.println(mapVoiture.isEmpty()); // Renvoie vrai si vide.
            System.out.println(mapVoiture.containsKey("peugeot")); // renvoie vrai si la clé existe
            System.out.println(mapVoiture.containsValue(v1)); // uniquement pour les map, renvoie vrai si l'objet existe.
            System.out.println(setString.contains("douze")); // pour les set et les list
            mapVoiture.clear(); // vide une collection.
            System.out.println(mapVoiture.isEmpty());
        }

        // La classe collection
        List<Integer> listInte=new ArrayList<>();
        listInte.add(2);
        listInte.add(8);
        listInte.add(0);
        listInte.add(250);
        listInte.add(110);
        listInte.add(5000);
        listInte.add(5000);

        Collections.replaceAll(listInte,5000,55555555);

        for(Integer i: listInte){
            System.out.println(i);
        }

        // pour ordonner tous les types objet natifs
        Voiture v10 = new Voiture("rouge", 3);
        Voiture v20 = new Voiture("noire", 3);
        Voiture v30 = new Voiture("jaune", 5);
        Voiture v40 = new Voiture("bleu", 3);

        List<Voiture>listVoit=new ArrayList<>();
        listVoit.add(v10);
        listVoit.add(v20);
        listVoit.add(v30);
        listVoit.add(v40);

//        Collections.sort(listInte);
//        for(Integer i: listInte){
//            System.out.println(i);
//        }

        // pour ordonner des objets non triable, il nous faudra donc implementer dans notre classe l'interface comparable
        List<Carre> listCarre = new ArrayList<>();
        listCarre.add(new Carre(150));
        listCarre.add(new Carre(500));
        listCarre.add(new Carre(10));
        listCarre.add(new Carre(165548984984L));
        listCarre.add(new Carre(3));

        System.out.println("Liste carré non ordonnée: ");
        for(Carre c : listCarre) {
            System.out.println(c.cote);
        }

        // Trier
        Collections.sort(listCarre);
        System.out.println("Liste ordonnée: ");
        for(Carre c : listCarre)
        {
            System.out.println(c.cote);
        }

        // Pour ordonner naturellement les collections, on peux utiliser les TreeSet et les TreeMap ou lieu des hasSet ou hasMap
        // on peux l'utiliser de maniere systematique mais tout objet non triable devra impléménter l'interface comparable avec sa methode compareTo

        // TreeSet - trie la liste par ordre alphabétique
        Set<String> treeSetString =  new TreeSet<>();
        treeSetString.add("un");
        treeSetString.add("deux");
        treeSetString.add("trois");
        treeSetString.add("quatre");
        treeSetString.add("cinq");
        treeSetString.add("six");

        for(String stri: treeSetString) {
            System.out.println(stri);
        }

        /* Retour console *
        cinq
        deux
        quatre
        six
        trois
        un
         */

        Bateau b1= new Bateau(100);
        Bateau b2= new Bateau(600);
        Bateau b3= new Bateau(200);
        Bateau b4= new Bateau(200);
        Bateau b5= new Bateau(550);

        Voiture v1 = new Voiture("rouge", 3);
        Voiture v2 = new Voiture("noire", 3);
        Voiture v3 = new Voiture("jaune", 5);
        Voiture v4 = new Voiture("bleu", 3);

        Map<Bateau, Voiture> nimp =new TreeMap<>();
        nimp.put(b1, v1);
        nimp.put(b2, v2);
        nimp.put(b3, v3);
        nimp.put(b4, v4);
        nimp.put(b5, v4);

        System.out.println("Liste MAPS ordonnée: ");
        for(Map.Entry<Bateau, Voiture> entreeNimp: nimp.entrySet()){
            System.out.println("cle: " + entreeNimp + " dont le tonnage est de: " + entreeNimp.getKey().masse+" hashcode:"+entreeNimp.getKey().hashCode());
        }

        // Il est obligatoire de redéfinir equals et hascode dans une classe qui implemente Comparable

        // compareTo est utilisé dans les collections triables mais equals de meme au moment de l'ajout pour savoir si l'objet existe deja, hashCode() est une méthode qui retourne un entier unique. Chaque instance doit montrer un hashCode différent sauf si considérée equivalent.
        // Si equals indique une égalité, hascode doit renvoyer une meme valeur sur les 2 instances. hashcode est automatiquement appelé lors des hashSet et hashMap pour vérifier une egalite car le jre considere l methode plus rapide mais en revanche la jvm va tout de meme vérifier l'egalité avec la methode equals.



        /* ******************************************
              VISIBILITE ET MODIFICATEUR D'ACCES
        ******************************************* */
        /*
        4 TYPES/ organisée DU PLUS VISIBLES AU MOINS VISIBLE
        public => visible partout

        A partir de cette visibilité les getters et les setteres (accesseurs /mutateurs) seront partiellement obligatoire.

        package => visibilité de base (on ne peut pas préfixer d'une visibilite package car par default)

        Accessible pour toutes les classes du package

        protected => accessible à tous les enfants d'une classe mere

        private => accessible uniquement dans la classe courante


        -------------
        IMPORT STATIC
        -------------
        Si je souhaite accèder aux propriétés ou constantes ou méthodes
        ex: Math
        System.out.println("Math.PI");

        Avec la création d'un import static
        Import static java.lang.Math.PI

         je peux saisir:
         System.out.println("PI");


        -------------
            PREFIXE
        -------------
        le prefixe final final (possible sur class, methode ou propriété)
        sur classe, ne peut etre heritée
        sur methode, ne peut etre surchargée
        sur propriété, ne peut etre modifier et doit etre imperative valorisée de type objet.

        final static => est une constante de ce fait doit etre déclarée en majuscule

        Méthodes finales :
        Lorsqu'une méthode est déclarée comme final, elle ne peut pas être redéfinie (surchargée) par les classes dérivées (classes enfants). Cela garantit que le comportement de la méthode ne peut pas être modifié dans les classes enfants.

        Classes finales :
        Lorsqu'une classe est déclarée comme final, elle ne peut pas être étendue par d'autres classes (c'est-à-dire, elle ne peut pas être une classe parente).


         ---------------
            EXCEPTION
        ----------------
         */
        try {
            ((Voiture) v1).immatriculer("");
        } catch (Exception E) {
            System.out.println(E.getMessage());
        } finally {
            System.out.println("Ca se produit toujours");
        }



    }
}