import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // ********************************************************************
        // Les variables: les types
        // ********************************************************************

        /*
        Les types primitifs:  écrit intégralement en minuscule
        int : pour les entiers: accepte des entiers : -2 147 483 648 à 2 147 483 647
        Limite de ce que l'on peut encoder sur 32 bits
        long pour 64 bits
        short pour 16 bits => -32768 à 32767
        byte => 8 octets = -128 à +127
        char pour un caractère
        boolean pour booleen
        float, décimal pour 32 its
        double, décimal sur 64 bits
        */

        int monAge;
        monAge = 20;

        int ageCapitaine = 50;
        ageCapitaine = 60;

        long distanceTerreLune = 38440000000L; // defini le type long et confirme avec "L" sur le chiffre

        float var1 = 1.5F; // Obligatoire pour lui faire comprendre que ce n'est pas un double

        char caractere = 'c';

        char caractere2 = '\uf127';

        System.out.println(caractere2);

        boolean vrai = true;
        boolean a;  // false par defaut
        int b;      // 0 par defaut
        char c;     // '' par defaut

        // Possible depuis java 10 de déclarer une variable sans typage.
        var toto = "toto";

        // Type Objet
        String monPrenom = "eric"; // double quote obligatoire

        // *************************************************************************
        // Opérateurs arithmétiques
        // *************************************************************************
        int result = 5 * 2;
        result = 5 + 2;
        result = 5 % 2;
        result = 5 - 2;
        result = 5 / 2;
        System.out.println(result);

        float test = 5 / 2;
        System.out.println(test);
        test = 5F / 2;
        System.out.println(test);

        // *************************************************************************
        // OPERATEURS RELATIONNEL
        // *************************************************************************
        boolean vraiFaux = 20 == 30;
        System.out.println(vraiFaux);
        vraiFaux = 20 <= 30;
        System.out.println(vraiFaux);
        vraiFaux = 20 >= 30;
        System.out.println(vraiFaux);
        vraiFaux = 20 < 30;
        System.out.println(vraiFaux);
        vraiFaux = 20 > 30;
        System.out.println(vraiFaux);
        vraiFaux = 20 != 30;
        System.out.println(vraiFaux);

        char char1 = 'c';
        char char2 = 'y';
        vraiFaux = char1 < char2; // Ordre alphabétique
        System.out.println(vraiFaux);


        boolean bool1 = true;
        boolean bool2 = false;
        boolean bool3 = false;

        vraiFaux = bool1 & bool2; // et
        System.out.println();

        vraiFaux = bool1 | bool2; // ou
        System.out.println(vraiFaux);

        vraiFaux = bool1 ^ !bool3; // XOR ou exclusif (on exclu le fait que ...)
        System.out.println(vraiFaux);

        // Il existe aussi && et || et est recommandé ce qui permet d'évaluer la premiere condition et pousse à la deuxieme si la condition n'est pas rempli'
        // en effet boolean var=true||false. Ici la 1ere partie étant true, il n'evalue la seconde partie car automatiquement true
        // var=false&&true ici la 1ere partie etant false, il n'évalue pas la seconde car automatiquement false

        // *************************************************************************
        // INCREMENTATION ET DECREMENTATION
        // *************************************************************************

        int valInt = 5;
        valInt = valInt + 1;
        System.out.println(valInt);
        valInt = 5;
        valInt++;
        System.out.println(valInt);


        int valInt2;
        valInt2 = ++valInt;
        System.out.println(valInt);
        valInt2 = --valInt;
        System.out.println(valInt);
        valInt2 = valInt++;   // L'affectation a lieu avant l'incrémentation de valInt
        System.out.println(valInt);
        valInt2 = valInt--;   // L'affectation a lieu avant l'incrémentation de valInt
        System.out.println(valInt);


        // *************************************************************************
        // OPERATEUR DE CONCATENATION POUR LES CHAINES DE CARACTERES
        // *************************************************************************
        String maString = "Mon age est: ";
        String maString2 = " 37 ans ";
        System.out.println(maString + maString2);

        int age = 37;
        System.out.println(maString + age + " ans");

        System.out.println(maString + age + 1 + " ans");

        System.out.println(maString + (age + 1) + " ans");


        // *************************************************************************
        // FORMATAGE DE CHAINE
        // *************************************************************************

        // Il est peu recommandé d'enchainer les concaténations avec + car créer une chaine intermédiaire à chaque fois avec gauche et droite au +

        maString2 = "ans";
        double f = 3.5;

        System.out.printf("Je concatene une chaine: %s %d %s et ca n'a rien à voir mais j'affiche %f", maString, age, maString2, f);
        // %s : String
        // %d : (digit) int
        // %f : float

        // SCOOP DANS LE SCOOP DE LA METHODE
        {
            // espace local
            int tonAge=32;
            System.out.println("Dans un scoop" + tonAge);
        }
        // System.out.println("Dans un scoop" + tonAge); tonAge N'EXISTE PAS EN DEHORS DU BLOC D'INSTRUCTION

        int tonAge=30;

        if(tonAge>30) // possible sous les {} mais à éviter avec plusieurs blocs d'insctruction.
            System.out.println("Tu fais plus jeune");

        // similaire à
        if(tonAge>30){
            System.out.println("Tu fais plus jeune");
        }


        // *************************************************************************
        // STRUCTURE TERNAIRE
        // *************************************************************************
        System.out.println(ageCapitaine>30 && ageCapitaine<50 ? "Le capitaine a moins de 50 ans et plus de 30 ans" : "Le capitaine a plus de 50 ou moins de 30 ans");
        int ageDuCapitaine=48;


        // *************************************************************************
        // STRUCTURE SWITCH CASE
        // *************************************************************************
        int mois =1;
        switch (mois){
            case 1 :
                System.out.println("Janvier");
                break;

            case 2 :
                System.out.println("Février");
                break;

            case 3 :
                System.out.println("Mars");
                break;

            case 4 :
                System.out.println("Avril");
                break;
            case 5 :
                System.out.println("Mai");
                break;

            case 6 :
                System.out.println("Juin");
                break;

            case 7 :
                System.out.println("Juillet");
                break;

            case 8 :
                System.out.println("Août");
                break;
            case 9 :
                System.out.println("Septembre");
                break;

            case 10 :
                System.out.println("Octobre");
                break;

            case 11 :
                System.out.println("Novembre");
                break;

            case 12 :
                System.out.println("Décembre");
                break;
            default:
                System.out.println("Inexistant");
        }

        // EXEMPLE N°2
        int saison =1;
        switch (mois){
            case 1 :
            case 2 :
            case 3 :
                System.out.println("Hiver");
                break;
            case 4 :
            case 5 :
            case 6 :
                System.out.println("Printemps");
                break;
            case 7 :
            case 8 :
            case 9 :
                System.out.println("Eté");
                break;
            default:
                System.out.print("Inexistant");
        }

        // EXEMPLE N°3 IDENTIQUE AU PRECEDENT
        switch (saison) {
            case 1, 2, 3 -> System.out.println("Hiver");
            case 4, 5, 6 -> System.out.println("Printemps");
            case 7, 8, 9 -> System.out.println("Eté");
            default -> System.out.print("Inexistant");
        }


        // *************************************************************************
        // STRUCTURES ITERATIVES (boucles)
        // *************************************************************************

//        for (;;){
//            System.out.println("Boucle infini");
//        }

        boolean verifer=true;
        for ( ;verifer; ){
            System.out.println("c'est vrai !");
            verifer=false;
        }

        // ***********************************
        // boucle while, généralement utilisée pour les booléens
        // ***********************************

        int index = 0;
        boolean jeBoucle = true;

        //Tant que
        while (jeBoucle) {
            System.out.println("Un tour de plus");

            //Bloc d'instruction qui finira par faire passer notre booléen à false
            jeBoucle=false;
        }

        // *****************

        boolean jeReBoucle=true;

        //Faire tant que
        do {
            System.out.println("Un tour de plus");
            jeReBoucle=true;
            break;
        }while (jeReBoucle);

        // *****************
        boolean jeContinue = true;
        int nb=0;

        while(jeContinue)
        {
            System.out.println("Tour n° :" + (nb+1));
            nb++;
            if(nb==5){
                continue;
            }
            if(nb>10){
                jeContinue=false;
            }
            System.out.println("Je continu");
        }


        // ***********************************
        // CLASSE SYSTEM
        // ***********************************
        /*
       Ne peut être instancié sans constructeur
       Possède des méthodes et propriétés statiques (d'ou le fait que nous n'ayons pas besoin d'instancier d'objet)

       Propriété statique OUT:

       Correspond au flux d'écriture standard, par default le terminal
       Elle est valorisée au moment du lancement de la machine virtuelle.

       out est une propriété de type PrintStream qui possede multitude de methode comme print, println, printf.

       Autre flux d'écriture standard: System.ini=> flux d'entrée standard (saisie ou clavier)
                                       System.err=> est retourné quoi qu'il en soit dans le terminal meme avec un flux redirigé.
                                       System.exit() pour mettre fin à la machine virtuelle avec un code erreur (0 pour tout s'est bien passé. Sinon quitte l'execution avec l'affichage du code d'erreur.

        Quelques méthodes :
            System.currentTimeMillis(); // retourne un long qui représente le nombre de millisecondes écoulées.
            Depuis le 01/01/1978
            Sytem.nanoTime(); // pour calculer des intrevales de temps */
            long start= System.nanoTime();
            System.out.println("Hello world");
            long end=System.nanoTime();
            System.out.println(end-start);


        System.out.println(System.getProperty("out"));

        System.out.println(System.getProperty("user.name"));

        System.out.println(System.getenv("path"));

        /*
        Classe scanner

        Ecoute les flux entrnt comme System.in
        Elle necessite l'import de java.util.Scanner

        */
        Scanner scanner=new Scanner(System.in);
        System.out.println("entrez votre prénom");
        String prenom=scanner.nextLine();

        float t=1.5F;
        Float f1=1.5F;
        Double d=1.5D;
        Integer i1=10;
        Long l1=100L;
        String l2=new String("test"); // auto instancié par defaut

        f1.floatValue(); // renvoie la valeur du type primitf
        Float f2=Float.parseFloat("1.5"); // converti la chaine en float

        //Float f=1.5f; // non valorisé == null

        System.out.println(f1==f2); // Ne compare pas la valeur mais l'objet donc dans ce cas.

        f2.equals(f1); // Pour comparer des valeurs de type Objet seulement.


        String ca="ja";
        String ja="ja";
        System.out.println(ca==ja);
        /*
         Renvoi true
        Dans ce cas, les chaînes de caractères ca et ja contiennent des valeurs différentes ("ca" et "ja" respectivement), donc les objets correspondants seront différents en mémoire. Ce qui renvoi false.
        */

//        String ca="ja";
//        String ja="ja";
//        System.out.println(ca==ja);
        /*
         Renvoie false parce que c'est un type objet
         */

        String cb=new String("cb");
        String jb=new String("jb");
        System.out.println(cb==jb);

        // Grace au type objet, les variables non valorisées prendront par defaut une valeur null



    }

}