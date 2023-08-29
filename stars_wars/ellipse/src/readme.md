SCANNER

 Créez un vaisseau de chaque type (CHASSEUR, FREGATE, CROISEUR, CARGO et VAISSEAU-MONDE) ayant chacun un nombre de passagers à votre convenance puis demandez à l'utilisateur :

 1) Quel vaisseau il souhaite manipuler parmi les 5 précédemment créés en indiquant le type du vaisseau

 2) Sur quelle planète tellurique il souhaite se poser en indiquant le nom de la planète

 3) Quelle tonnage de cargaison il souhaite embarquer

 Enfin vous afficherez le tonnage rejeté lors du chargement.

*******************************************************************

SCANNER ET ENUM


 Lorsque dans notre code nous devions instancier des Vaisseau, ils devaient avoir un type prédéfini parmi CHASSEUR, FREGATE, CROISEUR, CARGO et VAISSEAU-MONDE.

         Cependant, rien dans le code ne nous empêchait d'instancier un vaisseau d'un tout autre type.

 Nous allons utiliser une énumération pour définir l'ensemble des types de vaisseaux autorisés. L'énumération s’appellera TypeVaisseau . Attention, vous ne pourrez pas mettre de - entre VAISSEAU et MONDE.

         Le nom réel du type de vaisseau deviendra une nouvelle propriété nom  de TypeVaisseau . Les valeurs seront : Chasseur, Frégate, Croiseur, Cargo et Vaisseau-Monde, avec des minuscules et des -.

 La classe Vaisseau  aura maintenant un attribut type sous forme de TypeVaisseau  et non plus de String .

         Vous devrez adapter les constructeurs.

 Adaptez l'ensemble des classes qui font référence au type de vaisseau. Dans le main vous devrez :

 Permettre à l'utilisateur de choisir le type de vaisseau par sa valeur énumérée : CHASSEUR, ....ou VAISSEAUMONDE (sans tiret)

 Adaptez le switch de manière à tenir compte de l'énumération.

 Vérifier que le programme fonctionne toujours.


 Les planètes telluriques ont maintenant la possibilité de faire accoster plusieurs vaisseaux. Le nombre de places dans la baie d'accostage dépendra de la planète, ceci n'est plus une valeur globale à toutes les planètes.

         Nous supprimerons la possibilité donnée à un vaisseau d'accoster si la baie est pleine, il n'est donc plus question de "chasser" le vaisseau précédent.

         Vous utiliserez un tableau pour matérialiser la baie d'accostage. La taille de la baie sera passée en paramètre du constructeur de la classe PlaneteTellurique .

 Avant d'accoster un vaisseau, vérifier dans le main  que la baie de la planète dispose d'une place libre. Il s'agira donc de rechercher une potentielle valeur nulle dans le tableau. Pour se faire, ajoutez une méthode restePlaceDisponible à PlaneteTellurique  qui renvoie un boolean   .

 S'il ne reste plus de place, écrivez : "Le vaisseau ne peut pas se poser sur la planète par manque de place dans la baie.".

 Afin de tester que le code réagit correctement lorsqu'il n'y a plus de place, vous pouvez créer une planète à 0 places, ou bien mieux, permettre à l'utilisateur de répéter le scénario autant de fois qu'il le souhaite. Pour cela :

 demandez lui : "Voulez-vous recommencer oui/non ?"
 S'il répond oui, vous retournerez à la 1ère question.
 Attention : Votre dernière question retourne actuellement un entier que vous récupérer avec la méthode nextInt()  de Scanner . Dans ce cas, le saut de ligne n'est pas "consommé" et il faudra utiliser nextLine()  pour passer à la ligne suivante.

/*
PlaneteTellurique terre = new PlaneteTellurique("Terre",3);

        VaisseauDeGuerre fregate20 = new VaisseauDeGuerre(TypeVaisseau.FREGATE,14 );
        terre.accueillirVaisseau(fregate20);
        fregate20.emporterCargaison(30);

        VaisseauCivil vaisseauMonde2 = new VaisseauCivil(TypeVaisseau.VAISSEAU_MONDE, 500);
        terre.accueillirVaisseau(vaisseauMonde2);
        vaisseauMonde2.emporterCargaison(1560);
        vaisseauMonde2.emporterCargaison(600);*/

        // SCANNER

//        // Créez un vaisseau de chaque type (CHASSEUR, FREGATE, CROISEUR, CARGO et VAISSEAU-MONDE)
//        Vaisseau chasseurScan =  new VaisseauDeGuerre(TypeVaisseau.CHASSEUR, 25);
//        Vaisseau fregateScan =  new VaisseauDeGuerre(TypeVaisseau.FREGATE, 50);
//        Vaisseau croiseurScan =  new VaisseauDeGuerre(TypeVaisseau.CROISEUR, 100);
//        Vaisseau cargoScan =  new VaisseauCivil(TypeVaisseau.CARGO, 70);
//        Vaisseau vaisseauMondeScan =  new VaisseauCivil(TypeVaisseau.VAISSEAU_MONDE, 10);


        /* ************************************************** */
//        Scanner scanner=new Scanner(System.in);
//
//        System.out.println("Quel vaisseau souhaitez vous manipuler ? (chasseur, fregate, croiseur, cargo, vaisseauMonde)");
//        String vaisseau = scanner.nextLine();
//
//        System.out.println("Sur quelle planète tellurique souhaitez-vous vous poser ?");
//        String planete = scanner.nextLine();
//
//        System.out.println("Quelle tonnage de cargaison souhaitez-vous embarquer");
//        int tonnage = scanner.nextInt();
//
//
//        switch (vaisseau) {
//            case "chasseur":
//                chasseurScan.emporterCargaison(tonnage);
//                break;
//            case "fregate":
//                fregateScan.emporterCargaison(tonnage);
//                break;
//            case "croiseur":
//                croiseurScan.emporterCargaison(tonnage);
//                break;
//            case "cargo":
//                cargoScan.emporterCargaison(tonnage);
//                break;
//            case "vaisseauMonde":
//                vaisseauMondeScan.emporterCargaison(tonnage);
//                break;
//            default:
//                System.out.println("Il exite pas ton vaisseau a2 balles");
//        }

/*
PlaneteTellurique terre = new PlaneteTellurique("Terre",3);

    Vaisseau freg= new VaisseauDeGuerre(TypeVaisseau.FREGATE,12);
    Vaisseau freg1= new VaisseauDeGuerre(TypeVaisseau.FREGATE,12);
    Vaisseau freg2= new VaisseauDeGuerre(TypeVaisseau.FREGATE,12);
    Vaisseau freg3= new VaisseauDeGuerre(TypeVaisseau.FREGATE,12);

    terre.placeVaisseauDisponible[0]=freg;
    terre.accueillirVaisseau(freg);

    terre.placeVaisseauDisponible[1]=freg1;
    terre.accueillirVaisseau(freg1);

    terre.placeVaisseauDisponible[2]=freg2;
    terre.accueillirVaisseau(freg2);
    */
