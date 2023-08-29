import java.util.*;

public class TpPlaneteOne {

public static void main(String[] args) {

 *****************************************************************************************
               1ere partie
 *****************************************************************************************

         Créer une clase Planete
         La planète sera caractérisé pour le moment par 3 propriétés:
 
         Son nom (String )
         La matière (String ) qui peut être "Gazeuse" ou "Tellurique"
         Le diamètre en kilomètres (long )
Instanciez les planètes du système solaire et attribuez des valeurs à leurs propriétés.

         Mercure, Venus, la Terre et Mars sont des planètes telluriques, les autres sont gazeuses.
 
         Vous pouvez trouver les diamètres des planètes ici :  https: la-voute-celeste.pagesperso-orange.fr/les_planetes.htm.
 
         Supprimez le contenu actuel situé dans le bloc du main , mais ajoutez un affichage (System.out.println ) de la matière et du diamètre de Jupiter sous la forme:

Jupiter est une planète Gazeuse avec un diamètre de 142984 kilomètres.


les planètes effectuent des rotations autour de leur étoile que l'on appelle plus précisément "révolutions" et qui correspondent au sens stricte aux années. En effet, une révolution de la terre autour du soleil correspond à une année terrestre.

Les planètes effectuent également des rotations sur elles-même, que l'on appelle tout simplement "rotation", et qui correspondent aux journées. Une rotations de la terre sur elle-même correspond à une journée terrestre.

Matérialiser ces 2 mouvements (rotation et révolution) à l'aide de méthodes, ajouter dans le corps de ces méthodes un affichage :

Pour la révolution : Je suis la planète <Nom de la planète> et je tourne autour de mon étoile.

Pour la rotation : Je suis la planète <Nom de la planète> et je tourne sur moi-même.



Faites ensuite tourner Neptune autour de son étoile et Mars autour d'elle-même en invoquant leur méthodes respectives dans le main .

         Planete mercure = new Planete();
         mercure.nom="mercure";
         mercure.matiere="tellurique";
         mercure.diametre = 4880;
         Planete venus = new Planete();
         venus.nom="venus";
         venus.matiere="tellurique";
         venus.diametre = 12100;
         Planete terre = new Planete();
         terre.nom="";
         terre.matiere="tellurique";
         terre.diametre = 12756;
         Planete mars = new Planete();
         mars.nom="mars";
         mars.matiere="tellurique";
         mars.diametre = 6792;
         Planete jupiter = new Planete();
         jupiter.nom="jupiter";
         jupiter.matiere="gazeuse";
         jupiter.diametre = 142984;
         Planete saturne = new Planete();
         saturne.nom="saturne";
         saturne.matiere="gazeuse";
         saturne.diametre = 120536;
         Planete uranus = new Planete();
         uranus.nom="uranus";
         uranus.matiere="gazeuse";
         uranus.diametre = 51118;
         Planete neptune = new Planete();
         neptune.nom="neptune";
         neptune.matiere="gazeuse";
         neptune.diametre = 49532;
 
 
         System.out.println(jupiter.nom+" est une planète "+jupiter.matiere+" avec un diamètre de "+jupiter.diametre+" kilomètres");

        Galaxie systemeSolaire=new Galaxie();
        systemeSolaire.nom="Systeme solaire";
         List<Planete> planetes=new ArrayList();

        Set<Planete> planetes =new HashSet<Planete>();

        PlaneteTellurique mercure = new PlaneteTellurique("Mercure",10);
        mercure.diametre = 4880;
        PlaneteTellurique venus = new PlaneteTellurique("Venus",1);
        venus.diametre = 12100;
        PlaneteTellurique terre = new PlaneteTellurique("Terre",3);
        terre.diametre = 12756;
        PlaneteTellurique mars = new PlaneteTellurique("Mars",100);
        mars.diametre = 6792;
        PlaneteGazeuse jupiter = new PlaneteGazeuse("Jupiter");
        jupiter.diametre = 142984;
        PlaneteGazeuse saturne = new PlaneteGazeuse("Saturne");
        saturne.diametre = 120536;
        PlaneteGazeuse uranus = new PlaneteGazeuse("Uranus");
        uranus.diametre = 51118;
        PlaneteGazeuse neptune = new PlaneteGazeuse("Neptune");
        neptune.diametre = 49532;

        planetes.add(mercure);
        planetes.add(venus);
        planetes.add(terre);
        planetes.add(mars);
        planetes.add(neptune);
        planetes.add(saturne);
        planetes.add(uranus);
        planetes.add(jupiter);
       systemeSolaire.planetes=planetes;
        mars.rotation();

        neptune.revolution();
        System.out.println(mercure.nom);

 *****************************************************************************************
               seconde partie
 *****************************************************************************************

Il est temps d'aller rendre visite à nos planètes. Nous sommes en 2156, et nous allons comptabiliser le nombre d'être humains qui aura posé le pied sur la planète.

Le nombre total sera matérialisé par une nouvelle propriété totalVisiteurs  de type int  qui a bien évidemment comme valeur de départ 0.

Deux nouvelles méthodes nommées accueillirVaisseau  ayant exactement le même nom et ne retournant rien,  vont permettre d'accueillir de nouveaux humains, et par conséquent incrémenter la propriété ajoutée un peu plus tôt.

La première prendra en paramètre le nombre de nouveaux humains arrivés avec le vaisseau

La seconde, surchargeant donc la 1ère, prendra en paramètre une chaîne de caractère valant :

Soit "CHASSEUR", ce qui équivaut à 3 êtres humains

Soit "FREGATE", ce qui équivaut à 12 êtres humains

Soit "CROISEUR", ce qui équivaut à 50 êtres humains

Dans le main , faites accoster sur Mars un convoi de 8 êtres humains, suivi d'une Frégate. Affichez ensuite le nombre d'être humains finalement comptabilisés sur Mars sous la forme :

Le nombre d'humains ayant déjà séjourné sur Mars est actuellement de 20.

         mars.accueillirVaisseau(8);
         mars.accueillirVaisseau("FREGATE");

 *****************************************************************************************
               troisième partie
 *****************************************************************************************

Nous allons créer une nouvelle classe Atmosphere  qui se définit par les propriétés suivantes :

Taux d'hydrogène en % : float

Taux de méthane en % :float

Taux d'azote en % : float

Taux d'hélium en % : float

Taux d'argon en % : float

Taux de dioxyde de carbone en % : float

Taux de sodium en % : float

Ajoutez à la classe Planete  une propriété de type Atmosphere  et valorisez l'atmosphère de la planète Uranus.

Affichez dans le main  la composition de l'atmosphère d'Uranus sous la forme :

L'atmosphère de Uranus est composée :
A X% d'hydrogène

A X% d'argon

A X% de dioxyde de carbone

A X% d'azote

A X% d'hélium

A X% de méthane

A X% de sodium

Uranus est composée :

D'hydrogène à 83%

D'hélium à 15%

De méthane à 2.5%



ensuite
*****************************************************************************************
Quatrième partie
 *****************************************************************************************

Les méthodes qui permettent à la planète d'accueillir un vaisseau recevaient en paramètre :

Soit le nombre de passagers

Soit le type de Vaisseau

Nous allons fusionner ces 2 méthodes en une seule qui va maintenant réellement recevoir en paramètre un objet de type Vaisseau. On considérera que le type du  Vaisseau (CROISEUR etc...) est maintenant une propriété de Vaisseau mais que celle ci ne détermine plus automatiquement le nombre de passagers. La classe Vaisseau disposera  également d'une nouvelle propriété de type int pour le nombre de passagers



IMPORTANT : Il n'est pas prévu pour le moment que nos planètes puissent accueillir les vaisseaux en nombre illimité. C'est le début de la conquête spatiale, les planètes ne disposent que d'une seule baie d'accostage. Autrement dit, si un vaisseau est déjà présent, il va devoir au préalable s'en aller.

La méthode qui permet d'accueillir le vaisseau devra également retourner le vaisseau en partance s'il existe. Pour que cela soit possible, la Planète devra disposer d'une propriété pour stocker le Vaisseau actuellement accosté.



Faites accoster sur Mars une Frégate de 9 passagers puis un Croiseur de 42 passagers.

         A chaque fois, indiquez si en arrivant, le nouveau vaisseau à remplacé un autre vaisseau déjà présent en affichant le type du vaisseau en partance sous la forme :

Aucun vaisseau ne s'en va.

ou

Un vaisseau de type X doit s'en aller.

A la fin du programme affichez toujours le nombre de visiteurs ayant déjà posé le pied sur la planète sous la forme :

Le nombre d'humains ayant déjà séjourné sur X est actuellement de Y.

         Atmosphere uranusAtmosphere=new Atmosphere();
         uranusAtmosphere.hydrogene=(float)83.0;
         uranusAtmosphere.helium=(float)15.0;
         uranusAtmosphere.methane=(float)2.5;
         uranus.atmosphere=uranusAtmosphere;
 
         System.out.println("L'atmosphère de Uranus est composée :");
         System.out.println("A "+uranus.atmosphere.hydrogene+"% d'hydrogène");
         System.out.println("A "+uranus.atmosphere.argon+"% d'argon");
         System.out.println("A "+uranus.atmosphere.co2+"% de dioxide de carbonne");
         System.out.println("A "+uranus.atmosphere.azote+"% d'azote");
         System.out.println("A "+uranus.atmosphere.helium+"% d'hélium");
         System.out.println("A "+uranus.atmosphere.methane+"% de méthane");
         System.out.println("A "+uranus.atmosphere.sodium+"% de sodium");

        Atmosphere marsAthmo=new Atmosphere();


           marsAthmo.constituants.put("CO2", 95F);
           marsAthmo.constituants.put("N2", 3F);
           marsAthmo.constituants.put("AR", 1.5F);
           marsAthmo.constituants.put("NO", 0.013F);

           mars.atmosphere=marsAthmo;
        for (Map.Entry<String, Float> constituants: mars.atmosphere.constituants.entrySet()
             ) {

            System.out.println(" L'atmosphere de mars est constituée de: ");
            System.out.println(constituants.getValue()+" de "+constituants.getKey());

        }



 
         Vaisseau premierVaisseau=new Vaisseau();
         premierVaisseau.type="Fregate";
         premierVaisseau.nbPassagers=9;
 
         Vaisseau secondVaisseau=new Vaisseau();
         secondVaisseau.type="Croiseur";
         secondVaisseau.nbPassagers=42;


         System.out.println("Le nombre d'humains ayant déjà séjourné sur "+mars.nom+" est actuellement de "+  mars.accueillirVaisseau(premierVaisseau));
 
         System.out.println("Le nombre d'humains ayant déjà séjourné sur "+mars.nom+" est actuellement de "+ mars.accueillirVaisseau(secondVaisseau));



A chaque fois que sera instancié une planète, nous allons incrémenter le nombre de planètes connues de 1.

Pour ce faire, nous allons premièrement ajouter à la classe Planete  une propriété statique nbPlanetesDecouvertes  dont la valeur de départ est 0.

Nous allons ensuite réécrire le constructeur sans paramètre de manière à profiter de l'instanciation pour incrémenter le nombre de planètes.

Enfin, vous devrez afficher le nombre de planètes dans le main  après les avoir toutes instanciées.
créer enfin un nouveau constructeur necessitant le nom de la planete car possedent toutes un nom

        System.out.println("nbPlanete: "+Planete.nbPlanetesDecouvertes);


 *******************************************************************
                    Héritage
 **********************************************************************



Dans les œuvres de science fiction, chasseurs, frégates et croiseurs sont des Vaisseaux qui ont beaucoup de points communs, notamment d'être tous les 3 des vaisseaux de guerre, ils sont donc équipés d'armement.

         Il existe également des vaisseaux de type "civils" comme le Cargo ou le Vaisseau-Monde. Ils ne peuvent utiliser d'armement mais ont quelques points communs avec les vaisseaux de guerre, comme la présence de passagers, notion qui existe déjà dans notre classe Vaisseau . Nous allons également ajouter à Vaisseau  :

un blindage .

la capacité d'utiliser un bouclier de défense.

Le blindage  sera une propriété de type int  qui représente la capacité de résistance intrinsèque de l'engin aux attaques. C'est une valeur numérique que nous considérerons sans unité.

         Le bouclier de défense résistera plus ou moins longtemps aux attaques. Nous ajouterons à la classe Vaisseau  une propriété resistanceDuBouclier  qui est le nombre de minutes de résistance restantes (int ). Ajouter également une méthode activerBouclier  et une méthode desactiverBouclier .
 
         Elles ne prennent aucun paramètre et ne retournent rien. Nous nous occuperons cependant plus tard du contenu de ces méthodes, pour l'instant faites leur simplement afficher :

Activation du bouclier d'un vaisseau de type X

Désactivation du bouclier d'un vaisseau de type X

Où X peut être (CHASSEUR, FREGATE, CROISEUR, CARGO ou VAISSEAU-MONDE).

Nous allons maintenant matérialiser concrètement ces deux types de vaisseaux - Vaisseaux de guerre et vaisseaux civils - en créant des nouvelles classes qui héritent de Vaisseau .

VaisseauDeGuerre

         VaisseauCivil

Les Vaisseaux de Guerre disposent de la capacité d'attaquer. Nous matérialiserons cela par une méthode attaque  qui prend en paramètre :

La cible qui est un autre Vaisseau

L'arme utilisée qui est pour l'instant un String

La durée de l'attaque en minutes : int

La méthode ne retourne rien.

         Si nous étions dans un film de Science-Fiction, l'attaque devrait permettre de réduire voire anéantir le bouclier, puis d'endommager voire détruire le blindage et ceci devrait dépendre du type d'arme utilisée, mais pour simplifier on dira que la méthode réalisera toujours les mêmes opérations, quelle que soit la forme de l'attaque :

D'afficher : "Un vaisseau de type X attaque un vaisseau de type Y en utilisant l'arme Z pendant t minutes."

De détruire complètement le bouclier

De diminuer le blindage de moitié

Note: Si vous avez de l'inspiration et que vous voulez aller plus loin n'hésitez pas !

         Dans le main  maintenant :

Créez un Chasseur disposant d'un blindage de valeur 156 et d'un bouclier capable de résister 2 minutes. Ne déclarez pas la variable sous forme du type parent Vaisseau.

         Créez un Vaisseau-Monde disposant d'un blindage de valeur 4784 et d'un bouclier capable de résister 30 minutes. Ne déclarez pas la variable sous forme du type parent Vaisseau.
 
         Activez le bouclier du Vaisseau-Monde et du chasseur

Avec le chasseur, attaquez le vaisseau-monde avec des "lasers photoniques" pendant 3 minutes.

         Désactiver le bouclier du Vaisseau-Monde

Afficher la durée de protection résiduelle du bouclier du Vaisseau-Monde (vous devez obtenir 0)

Afficher la valeur du blindage du Vaisseau-Monde (vous devriez obtenir 2392)

         VaisseauDeGuerre chasseur=new VaisseauDeGuerre();
         chasseur.type="Chasseur";
         chasseur.blindage=156;
         chasseur.resistanceDuBouclier=2;
         VaisseauCivil monde=new VaisseauCivil();
         monde.type="Vaisseau-monde";
         monde.blindage=4784;
         monde.resistanceDuBouclier=30;
         chasseur.activerBouclier();
         monde.activerBouclier();
         chasseur.attaque(monde, "lasers photoniques", 3);
         monde.desactiverBouclier();
         System.out.println(monde.resistanceDuBouclier);
         System.out.println(monde.blindage);



Considérons que dans notre logiciel les planètes telluriques sont habitables. Vous allez tout d'abord créer 2 nouvelles classes qui héritent de Planete  :

         PlaneteTellurique
 
         PlaneteGazeuse

Note : Pensez à la question du constructeur!

Supprimer la propriété matiere dans la classe Planete .

L'habitabilité sera associée aux planètes Telluriques au moyen d'une interface Habitable .

Cette interface définira la méthode accueillirVaisseau  que nous avions jusque là dans la classe Planete .

Vous remarquerez cependant que vous ne pourrez pas déplacer les propriétés totalVisiteurs  et vaisseauAccoste  vers l'interface, vous pourriez les laisser au niveau de Planete  mais leur place est plutôt dans PlaneteTellurique .

Dans le main :

modifiez l'ensemble des planètes de manière à respecter cette nouvelle nomenclature (Tellurique / Gazeuse). Modifiez également le type des variables.

Faites accoster sur Mars le Vaisseau-Monde créé à l'étape précédente.

Tentez de faire accoster sur Jupiter le Chasseur créé à l'étape précédente. La compilation devrait être possible étant donné que Jupiter n'est pas habitable donc vous pouvez revenir en arrière.

Faites accoster sur Mars le Chasseur.

         monde.nbPassagers=9;
         mars.accueillirVaisseau(monde);
         mars.accueillirVaisseau(chasseur);
         chasseur.attaque(monde, "laser", 3);
         System.out.println(mars.totalVisiteurs);
         jupiter.accueillirVaisseau(chasseur);






A présent tout engin de guerre qui se met en position de défense en activant son bouclier, verra son
armement
automatiquement désactivé.

     Cette règle ne s'applique bien évidemment pas au Vaisseau civil.
 
     Les méthodes d'activation et désactivation du bouclier se situent au niveau du parent Vaisseau . Réécrivez dans la classe VaisseauDeGuerre  la méthode d'activation, celle-ci doit désormais également désactiver l'armement du Vaisseau.
 
     Dans le main, déclarez maintenant les vaisseaux sous forme de variables de type Vaisseau afin de matérialiser le polymorphisme. Vous devrez cependant transtyper le chasseur pour l'attaque.
 
     Tentez d'activer le bouclier de protection du Chasseur juste avant l'attaque, rien ne doit se passer.


      tests ici




     Lorsque nous instancions des planètes, elles sont soit telluriques soit gazeuses. Une planète sans type ça n'existe pas, et même si l'on découvrait un jour une planète entièrement liquide, nous créerions un sous type PlaneteLiquide (Ne créez pas cette classe).
 
     Par conséquent, nous allons interdire d'instancier la classe Planete  en la déclarant abstraite.
 
     Du côté des vaisseaux, là aussi nous avons créé des sous-types. Nous pourrions considérer qu'il doit rester possible d'instancier Vaisseau, si par exemple un vaisseau inconnu d'une civilisation extra-terrestre venait à entrer en jeu. Pour autant, nous allons y être contraint.
 
     En effet, nous souhaitons maintenant ajouter aux vaisseaux la possibilité de transporter une cargaison de matériaux. C'est la nouvelle méthode emporterCargaison  qui prend en paramètre la quantité (tonnage) présentée à l'embarquement (int ) et qui retourne la potentielle quantité rejetée.
 
     Cependant, les règles qui permettent ou non d'embarquer une cargaison supplémentaire varient selon plusieurs critères propres à chaque vaisseau :
 
     Les chasseurs n'emportent pas de cargaison, l'ensemble sera rejeté.
     Les autres vaisseaux de guerre peuvent emporter une cargaison mais cela va requérir la présence d'au moins 12 passagers. Si c'est bien le cas, la quantité retenue est de 2 tonnes par passager dans la limite de la place disponible. La Frégate peut emporter 50 tonnes, le Croiseur 100 tonnes. Dans le cas où le nombre de passagers est insuffisant, tout est rejeté.
     Les vaisseaux civils peuvent emporter tout ce qui se présente dans la limite de la place disponible. Le Cargo peut emporter 500 tonnes et le Vaisseau-Monde 2000 tonnes.
     Vous devrez ajouter une propriété tonnageMax  et une propriété tonnageActuel . Modifiez les constructeurs pour valoriser tonnageMax  en fonction du type de Vaisseau .
 
     La méthode emporterCargaison  sera donc abstraite, car indéfinissable au niveau de la classe Vaisseau . Mais le fait de positionner cette méthode au niveau de Vaisseau va obliger les classes héritantes à implémenter la méthode.
 
     Le fait d'avoir une méthode abstraite va également vous obliger à déclarer la classe Vaisseau  abstraite.
 
     Adaptez le main  de manière à tenir compte des nouveaux constructeurs et ajoutez:
 
     Étape 1 : Un nouveau chasseur atterrit (sur Terre) et tente d'embarquer 20 tonnes. Affichez la quantité refusée, elle doit être de 20.
     Étape 2 : Une nouvelle frégate de 100 passagers atterrit (sur Terre) et tente d'embarquer 45 tonnes. Affichez la quantité refusée, elle doit être de 0. Puis essayez 12 tonnes, la quantité refusée doit être de 7 tonnes.
     Étape 3 : Une nouvelle frégate de 14 passagers atterrit (sur Terre) et tente d'embarquer 30 tonnes. Affichez la quantité refusée, elle doit être de 2.
     Étape 4 : Un Vaisseau-Monde atterrit (sur Terre) et tente d'embarquer 1560 tonnes. Affichez la quantité refusée, elle doit être de 0. Puis essayez 600 tonnes, la quantité refusée doit être de 160 tonnes.
 
         VaisseauDeGuerre chasseur=new VaisseauDeGuerre("CHASSEUR", 10);
         terre.accueillirVaisseaux(chasseur);
         System.out.println(chasseur.emporterCargaison(20));
 
         VaisseauDeGuerre fregate=new VaisseauDeGuerre("FREGATE",14);
         System.out.println(fregate.emporterCargaison(30));


               SCANNER


         Créez un vaisseau de chaque type (CHASSEUR, FREGATE, CROISEUR, CARGO et VAISSEAU-MONDE) ayant chacun un nombre de passagers à votre convenance puis demandez à l'utilisateur :
 
         1) Quel vaisseau il souhaite manipuler parmi les 5 précédemment créés en indiquant le type du vaisseau
 
         2) Sur quelle planète tellurique il souhaite se poser en indiquant le nom de la planète
 
         3) Quelle tonnage de cargaison il souhaite embarquer
 
         Enfin vous afficherez le tonnage rejeté lors du chargement.



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

 
         Vaisseau chasseurs=new VaisseauDeGuerre(TypeVaisseau.CHASSEUR, 24);
 
         Vaisseau fregates=new VaisseauDeGuerre(TypeVaisseau.FREGATE,24 );
 
         fregates.tonnageMax=50;
         Vaisseau croiseur=new VaisseauDeGuerre(TypeVaisseau.CROISEUR, 10);
         croiseur.nbPassagers=10;
         Vaisseau cargo=new VaisseauDeGuerre(TypeVaisseau.CARGO, 10);
         cargo.nbPassagers=10;
         Vaisseau monde=new VaisseauCivil(TypeVaisseau.VAISSEAUMONDE, 10);
         monde.nbPassagers=10;


        Vaisseau chasseurs=new VaisseauDeGuerre("chasseur", 24);

        Vaisseau fregates=new VaisseauDeGuerre("fregate",14 );

        fregates.tonnageMax=50;
        Vaisseau croiseur=new VaisseauDeGuerre("croiseur", 10);
        croiseur.nbPassagers=10;
        Vaisseau cargo=new VaisseauDeGuerre("cargo", 10);
        cargo.nbPassagers=10;
        Vaisseau monde=new VaisseauCivil("vaisseau-monde", 10);
        monde.nbPassagers=10;

         terre.accueillirVaisseaux(chasseurs);
        fregates.emporterCargaison(30);
        fregates.emporterCargaison(45);






           scanner sur l'entrée clavier System.in
         Scanner scan=new Scanner(System.in);
 
         String recommencer = "oui";
 
         do {
             System.out.println("Quelle Vaisseau souhaitez vous utiliser? CHASSEUR, CROISEUR, FREGATE, CARGO ou VAISSEAU-MONDE ?");
 
             String choixVaisseau = scan.nextLine();
             System.out.println("Vous avez choisi d'utiliser un/une: " + choixVaisseau);
             System.out.println("Sur quelle planète téllurique souhaitez vous vous poser? 1,2,3 ou 4?");
             String choixPlanete = scan.nextLine();
 
             System.out.println("Vous avez choisi de vous poser sur: " + choixPlanete);
             System.out.println("Quelle tonnage souhaitez vous embarquer");
             int tonnage = scan.nextInt();
             scan.nextLine();
             TypeVaisseau typeVaisseau = TypeVaisseau.valueOf(choixVaisseau);
             Vaisseau vaisseau = null;
 
             switch (typeVaisseau) {
                 case CHASSEUR:
                     vaisseau = chasseurs;
                     break;
                 case CROISEUR:
                     vaisseau = croiseur;
                     break;
                 case CARGO:
                     vaisseau = cargo;
                     break;
                 case VAISSEAUMONDE:
                     vaisseau = monde;
                     break;
                 case FREGATE:
                     vaisseau = fregates;
                     break;
 
             }
 
             Planete planeteSelec=null;
             for (Planete p:systemeSolaire.planetes ) {
 
 
                 if (p.nom.equalsIgnoreCase(choixPlanete)){
                     planeteSelec=p;
                     break;
 
                 }
             }
             if (planeteSelec instanceof PlaneteGazeuse){
 
                 System.out.println("Impossible de se poser sur une planète gazeuse");
                 continue;
             }
 
             PlaneteTellurique planete=(PlaneteTellurique)planeteSelec;
 
 
 
 
             switch (choixPlanete) {
                 case "VENUS":
                     planete = venus;
                     break;
                 case "MARS":
                     planete = mars;
                     break;
                 case "TERRE":
                     planete = terre;
                     break;
                 case "MERCURE":
                     planete = mercure;
                     break;
 
 
             }
 
 
             assert planete != null;
             if (!planete.restePlaceDisponible(vaisseau)) {
                 System.out.println("plus de place");
 
             } else {
                 planete.accueillirVaisseaux(vaisseau);
                 assert false;
                 int rejete = vaisseau.emporterCargaison(tonnage);
 
                 System.out.println("Quantité rejeté: " + rejete);
 
 
             }
             System.out.println("recommencer? ");
             recommencer = scan.nextLine();
         }
         while (recommencer.equalsIgnoreCase("oui"));




 
         do {
             System.out.println("Quelle Vaisseau souhaitez vous utiliser? CHASSEUR, CROISEUR, FREGATE, CARGO ou VAISSEAU-MONDE ?");
 
             String choixVaisseau = scan.nextLine();
             System.out.println("Vous avez choisi d'utiliser un/une: " + choixVaisseau);
             System.out.println("Sur quelle planète téllurique souhaitez vous vous poser? 1,2,3 ou 4?");
             int choixPlanete = scan.nextInt();
             scan.nextLine();
             System.out.println("Vous avez choisi de vous poser sur: " + choixPlanete);
             System.out.println("Quelle tonnage souhaitez vous embarquer");
             int tonnage = scan.nextInt();
             scan.nextLine();
             TypeVaisseau typeVaisseau = TypeVaisseau.valueOf(choixVaisseau);
             Vaisseau vaisseau = null;
 
             switch (typeVaisseau) {
                 case CHASSEUR:
                     vaisseau = chasseurs;
                     break;
                 case CROISEUR:
                     vaisseau = croiseur;
                     break;
                 case CARGO:
                     vaisseau = cargo;
                     break;
                 case VAISSEAUMONDE:
                     vaisseau = monde;
                     break;
                 case FREGATE:
                     vaisseau = fregates;
                     break;
 
             }
 
             Planete p= systemeSolaire.planetes.get(choixPlanete-1);
             if (p instanceof PlaneteGazeuse){
 
                 System.out.println("Impossible de se poser sur une planète gazeuse");
                 continue;
             }
 
 
             PlaneteTellurique planete = (PlaneteTellurique)p ;
 
              switch (choixPlanete) {
                  case "VENUS":
                      planete = venus;
                      break;
                  case "MARS":
                      planete = mars;
                      break;
                  case "TERRE":
                      planete = terre;
                      break;
                  case "MERCURE":
                      planete = mercure;
                      break;
  
  
              }
 
 
             assert planete != null;
             if (!planete.restePlaceDisponible(vaisseau)) {
                 System.out.println("plus de place");
 
             } else {
                 planete.accueillirVaisseaux(vaisseau);
                 assert false;
                 int rejete = vaisseau.emporterCargaison(tonnage);
 
                 System.out.println("Quantité rejeté: " + rejete);
 
 
             }
             System.out.println("recommencer? ");
             recommencer = scan.nextLine();
         }
         while (recommencer.equalsIgnoreCase("oui"));


            ARRAY UNIDIMENSIONNEL

         Les planètes telluriques ont maintenant la possibilité de faire accoster plusieurs vaisseaux. Le nombre de places dans la baie d'accostage dépendra de la planète, ceci n'est plus une valeur globale à toutes les planètes.
 
                 Nous supprimerons la possibilité donnée à un vaisseau d'accoster si la baie est pleine, il n'est donc plus question de "chasser" le vaisseau précédent.
 
                 Vous utiliserez un tableau pour matérialiser la baie d'accostage. La taille de la baie sera passée en paramètre du constructeur de la classe PlaneteTellurique .
 
         Avant d'accoster un vaisseau, vérifier dans le main  que la baie de la planète dispose d'une place libre. Il s'agira donc de rechercher une potentielle valeur nulle dans le tableau. Pour se faire, ajoutez une méthode restePlaceDisponible à PlaneteTellurique  qui renvoie un boolean   .
 
         S'il ne reste plus de place, écrivez : "Le vaisseau ne peut pas se poser sur la planète par manque de place dans la baie.".
 
         Afin de tester que le code réagit correctement lorsqu'il n'y a plus de place, vous pouvez créer une planète à 0 places, ou bien mieux, permettre à l'utilisateur de répéter le scénario autant de fois qu'il le souhaite. Pour cela :
 
         demandez lui : "Voulez-vous recommencer oui/non ?"
         S'il répond oui, vous retournerez à la 1ère question.
         Attention : Votre dernière question retourne actuellement un entier que vous récupérer avec la méthode nextInt()  de Scanner . Dans ce cas, le saut de ligne n'est pas "consommé" et il faudra utiliser nextLine()  pour passer à la ligne suivante.
 
 

              ELLIPSES


         La méthode accueillirVaisseau  prend en paramètre un seul Vaisseau . Grâce aux ellipses, nous allons permettre à la méthode d'accueillir plusieurs vaisseaux à la fois. La méthode deviendra accueillirVaisseaux .
 
         Dans le main , vous ajouterez 2 nouveaux chasseurs et un cargo sur la planète Terre, avant de passer la main à l'utilisateur.
 
 



         /     ArrayList
 
         Nous allons créer une classe Galaxie  qui dispose d'un nom et d'une collection de planètes. Cette collection sera matérialisée par une ArrayList  du nom de planetes .
 
                 Dans le main , constituer la Galaxie  "Système Solaire" qui comprendra l'ensemble de nos planètes rangées par ordre croissant de distance avec Soleil.
 
         Ne demandez plus à l'utilisateur le nom de la planète sur laquelle il veut faire se poser un vaisseau mais l'index de la planète dans la Galaxie. Vérifiez qu'il s'agit alors bien d'une planète Tellurique sans quoi vous afficherez un message d'échec et repartez à nouveau au début du scénario grâce à continue .



           set

         Notre List  de tout à l'heure permettrait  théoriquement de mettre plusieurs références à la même planète. Les collections de type Set  qui n'autorisent pas les doublons paraissent plus adaptées. Nous remplacerons l'ArrayList  par un HashSet .
 
         La contrepartie est que les planètes sont alors positionnées dans un ordre imprévisible.
 
                 Demandez à nouveau à l'utilisateur le nom de la planète
 
         Itérer sur la collection de planète jusqu'à retrouver la planète souhaitée.


          Map


         La classe Atmosphere  dispose actuellement d'une propriété de type Float  par type de gaz possiblement présent dans l'atmosphère d'une planète. Cette liste n'est pas exhaustive.
 
                 Si l'on conservait ce modèle, ajouter un nouveau gaz consisterait à rajouter une nouvelle propriété à la classe. Heureusement avec les collections tout devient plus simple. Nous allons utiliser une collection de type HashMap  pour référencer planète par planète uniquement les gaz que nous souhaitons valoriser. Cette nouvelle propriété de Atmosphere  s’appellera constituants .
 
         La clé de la Map  sera le symbole chimique du gaz, la valeur sera le numérique flottant (Float ).
 
                 Dans le main , valorisez l'atmosphère de Mars composée de :
 
         De dioxyde de carbone (CO2) à 95%
                 D'azote (N2) à 3%
         D'argon(AR) à 1.5%
         et bien d'autres dont le monoxyde de carbone (NO) que vous valoriserez à 0.013%
         Et afficherez le contenu de cette atmosphère grâce à une itération sur les clés de la Map  :
 
         "L'atmosphère de Mars est constituée de :
 
         95% de CO2
 
         etc...."



      TreeSet



         Transformez la collection de planètes de la classe Galaxie en TreeSet .
 
                 Ajoutez dans la classe Planete  une nouvelle propriété de type float  distanceEtoile  en millions de km.
 
         Cette propriété va servir au TreeSet  à ordonner automatiquement les planètes qui s'y trouvent par ordre de distance avec le soleil.
 
         Pour se faire vous devrez rendre les planètes Comparable et implémenter la méthode compareTo, equals et
         hashcode .
 
         Dans le main vérifiez l'ordre des planètes dans la galaxie en :
 
         Ajoutant les planètes dans un ordre aléatoire
         Énumérant le contenu de la galaxie une fois celle-ci constituée
         Les distances (en millions de km) sont les suivantes :
 
         Mercure 57,9
         Vénus 108,2
         Terre 149,6
         Mars 227,9
         Jupiter 778,3
         Saturne 1 427,0
         Uranus 2 877,38
         Neptune 4 497,07

 
         Vous allez créer un premier niveau de package conforme aux règles édictées par les concepteurs du langage, à savoir le nom de domaine de notre compagnie inversé. Nous choisirons :
 
         com.espacex
         Puis nous ajouterons un sous-package désignant le projet conforme aux pratiques communément admises :
 
         decouverte
         HelloUniverse  se trouvera à ce niveau.
 
         Créer un sous-package de decouverte  nommé objetsastro  qui regroupera les classes qui font référence à des objets en astrophysique, accompagnés des classes et interfaces associés :
 
         Planete
                 PlaneteTellurique
         PlaneteGazeuse
                 Habitable
         Galaxie
                 Atmosphere
         Créer un sous-package de decouverte  nommé enginsspatiaux qui regroupera les classes qui font référence aux vaisseaux et leurs concepts associés :
 
         TypeVaisseau
                 Vaisseau
         VaisseauCivil
                 VaisseauDeGuerre
         Vous remarquerez que désormais, la code ne compile plus et plusieurs classes apparaissent en erreur.
 
         Ajouter le mot clé public  devant toute propriété ou méthode qui requiert un accès à partir d'une classe d'un autre package.
 
         Ajouter également tous les imports suggérés


/    imports statiques


         Les différents types de Vaisseaux seront importés statiquement. Je vous laisse le soin cependant de juger s'ils sont utilisés de manière intensive ou pas.
 
         Supprimez dans le code toute référence à la classe TypeVaisseau  hormis au niveau des imports.



           Visibilité et modificateur d'acces

         La valeur de la propriététonnageActuel est modifiée lors de l'ajout de cargaison. Il pourrait être dangereux de laisser à une autre classe la possibilité de modifier cette propriété sans passer par la méthode emporterCargaison . En effet, la méthode vérifie avant toute chose que la nouvelle cargaison peut être emportée ! Modifiez la visibilité de la propriété en protected afin que seul Vaisseau  et ses héritants puissent accéder à cette propriété.
 
         La méthode desactiverArmes a vocation à passer à true  la valeur de la propriété armesDesactivees de l'objet courant. Ajouter une méthode activerArmes  pour repasser la valeur de la propriété à false . Il semblerait étrange de modifier la propriété sans passer par ses méthodes. Nous allons modifier la visibilité de la propriété à private .



           final

         Les méthodes qui nous ont permis de connaître le nombre de rotations ou de révolutions des planètes sont immuables. Rien ne pourra modifier la méthode de calcul.
 
         Par ailleurs, étant donnés le nom et l'objectif de ces méthodes, on ne voit pas très bien ce qu'elles pourraient faire de plus.
 
                 Même s'il n'est pas exclu qu'une classe héritant de Planete  ait un intérêt dans la réécriture de ces méthodes, il paraît plus intéressant de les rendre immuables afin d'empêcher l'altération de la formule de calcul. Vous allez donc déclarer ces 2 méthodes final .
 
         On voit mal également comment un Vaisseau  pourrait changer de type. Déclarer la propriété final. Vous allez devoir attribuer une valeur à la construction, ce que nous faisons déjà au niveau des héritants, mais ceux-ci devront faire explicitement appel à un constructeur parent prenant le même argument. Ajoutez donc à Vaisseau  un constructeur qui prenne en paramètre le type du vaisseau et adaptez les héritants.


          / Exception


         Jusqu'à présent nous avons considéré qu'il était possible de charger partiellement une cargaison.
 
         Nous allons maintenant interdire ceci. Une cargaison trop importante sera désormais intégralement refusée et la méthode devra rejeter une Exception  que nous appellerons DepassementTonnageException dans le package com.espacex.decouverte.enginsspatiaux .
 
                 Cette exception disposera d'un attribut tonnageEnExces  (int ) ainsi qu'un seul et unique constructeur qui :
 
         Prendra en argument tonnageEnExces
         Valorisera le message d'erreur : La cargaison ne peut être chargée car elle présente un excès de X
         Dans le cas ou cette exception survient, vous aurez alors à traiter 2 cas de figure. Demandez alors à l'utilisateur :
 
         s'il souhaite emporter une cargaison partielle à hauteur de la place disponible dans le vaisseau, ou
         s'il souhaite annuler l'opération.



                    Unchecked, exception non verifiée
 
         Lorsque nous demandons à l'utilisateur quel tonnage il souhaite que le vaisseau emporte, nous espérons avec la méthode nextInt()  de Scanner  que l'utilisateur veuille bien entrer une valeur numérique!
 
                 Or l'utilisateur même de bonne foi peut se tromper. Dans ce cas nextInt()  renverra une Exception  de type InputMismatchException , qui est une RuntimeException  (unchecked). Nous pouvons ou pas attraper cette exception si nous le souhaitons, et nous ne l'avons pas fait jusque ici.
 
                 Attrapez maintenant cette exception et demandez le cas échéant à l'utilisateur d'entrer une nouvelle valeur jusqu'à ce que celle ci soit cohérente.

    }

}
