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
	

 	les planètes effectuent des rotations autour de leur étoile que l'on appelle plus précisément "révolutions" et qui correspondent au sens stricte aux années. En effet, une révolution de la terre 	autour du soleil correspond à une année terrestre.
 
 	Les planètes effectuent également des rotations sur elles-même, que l'on appelle tout simplement "rotation", et qui correspondent aux journées. Une rotations de la terre sur elle-même 		correspond à une journée terrestre.

/ /Matérialiser ces 2 mouvements (rotation et révolution) à l'aide de méthodes, ajouter dans le corps de ces méthodes un
affichage :

 	Pour la révolution : Je suis la planète <Nom de la planète> et je tourne autour de mon étoile.
 
 	Pour la rotation : Je suis la planète <Nom de la planète> et je tourne sur moi-même.
 
 
 
 	Faites ensuite tourner Neptune autour de son étoile et Mars autour d'elle-même en invoquant leur méthodes respectives dans le main .

 *****************************************************************************************

               seconde partie

 *****************************************************************************************

Il est temps d'aller rendre visite à nos planètes. Nous sommes en 2156, et nous allons comptabiliser le nombre d'être
humains qui aura posé le pied sur la planète.

Le nombre total sera matérialisé par une nouvelle propriété totalVisiteurs de type int qui a bien évidemment comme
valeur de départ 0.

Deux nouvelles méthodes nommées accueillirVaisseau ayant exactement le même nom et ne retournant rien, vont permettre
d'accueillir de nouveaux humains, et par conséquent incrémenter la propriété ajoutée un peu plus tôt.

La première prendra en paramètre le nombre de nouveaux humains arrivés avec le vaisseau

La seconde, surchargeant donc la 1ère, prendra en paramètre une chaîne de caractère valant :

Soit "CHASSEUR", ce qui équivaut à 3 êtres humains

Soit "FREGATE", ce qui équivaut à 12 êtres humains

Soit "CROISEUR", ce qui équivaut à 50 êtres humains

Dans le main , faites accoster sur Mars un convoi de 8 êtres humains, suivi d'une Frégate. Affichez ensuite le nombre
d'être humains finalement comptabilisés sur Mars sous la forme :

Le nombre d'humains ayant déjà séjourné sur Mars est actuellement de 20.



 *****************************************************************************************

               troisième partie

 *****************************************************************************************

Nous allons créer une nouvelle classe Atmosphere qui se définit par les propriétés suivantes :

Taux d'hydrogène en % : float

Taux de méthane en % :float

Taux d'azote en % : float

Taux d'hélium en % : float

Taux d'argon en % : float

Taux de dioxyde de carbone en % : float

Taux de sodium en % : float

Ajoutez à la classe Planete une propriété de type Atmosphere et valorisez l'atmosphère de la planète Uranus.

Affichez dans le main la composition de l'atmosphère d'Uranus sous la forme :

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




  *****************************************************************************************

               Quatrième partie

 *****************************************************************************************

Les méthodes qui permettent à la planète d'accueillir un vaisseau recevaient en paramètre :

Soit le nombre de passagers

Soit le type de Vaisseau

Nous allons fusionner ces 2 méthodes en une seule qui va maintenant réellement recevoir en paramètre un objet de type
Vaisseau. On considérera que le type du Vaisseau (CROISEUR etc...) est maintenant une propriété de Vaisseau mais que
celle ci ne détermine plus automatiquement le nombre de passagers. La classe Vaisseau disposera également d'une nouvelle
propriété de type int pour le nombre de passagers

IMPORTANT : Il n'est pas prévu pour le moment que nos planètes puissent accueillir les vaisseaux en nombre illimité.
C'est le début de la conquête spatiale, les planètes ne disposent que d'une seule baie d'accostage. Autrement dit, si un
vaisseau est déjà présent, il va devoir au préalable s'en aller.

La méthode qui permet d'accueillir le vaisseau devra également retourner le vaisseau en partance s'il existe. Pour que
cela soit possible, la Planète devra disposer d'une propriété pour stocker le Vaisseau actuellement accosté.

Faites accoster sur Mars une Frégate de 9 passagers puis un Croiseur de 42 passagers.

         A chaque fois, indiquez si en arrivant, le nouveau vaisseau à remplacé un autre vaisseau déjà présent en affichant le type du vaisseau en partance sous la forme :

Aucun vaisseau ne s'en va.

ou

Un vaisseau de type X doit s'en aller.

A la fin du programme affichez toujours le nombre de visiteurs ayant déjà posé le pied sur la planète sous la forme :

Le nombre d'humains ayant déjà séjourné sur X est actuellement de Y.


  *****************************************************************************************

               cinquième partie

 *****************************************************************************************
A chaque fois que sera instancié une planète, nous allons incrémenter le nombre de planètes connues de 1.

Pour ce faire, nous allons premièrement ajouter à la classe Planete une propriété statique nbPlanetesDecouvertes dont la
valeur de départ est 0.

Nous allons ensuite réécrire le constructeur sans paramètre de manière à profiter de l'instanciation pour incrémenter le
nombre de planètes.

Enfin, vous devrez afficher le nombre de planètes dans le main après les avoir toutes instanciées.
créer enfin un nouveau constructeur necessitant le nom de la planete car possedent toutes un nom


 *******************************************************************

                    Héritage

 **********************************************************************


 *******************************************************************

                  partie1

 **********************************************************************


Dans les œuvres de science fiction, chasseurs, frégates et croiseurs sont des Vaisseaux qui ont beaucoup de points
communs, notamment d'être tous les 3 des vaisseaux de guerre, ils sont donc équipés d'armement.

         Il existe également des vaisseaux de type "civils" comme le Cargo ou le Vaisseau-Monde. Ils ne peuvent utiliser d'armement mais ont quelques points communs avec les vaisseaux de guerre, comme la présence de passagers, notion qui existe déjà dans notre classe Vaisseau . Nous allons également ajouter à Vaisseau  :

un blindage .

la capacité d'utiliser un bouclier de défense.

Le blindage sera une propriété de type int qui représente la capacité de résistance intrinsèque de l'engin aux attaques.
C'est une valeur numérique que nous considérerons sans unité.

         Le bouclier de défense résistera plus ou moins longtemps aux attaques. Nous ajouterons à la classe Vaisseau  une propriété resistanceDuBouclier  qui est le nombre de minutes de résistance restantes (int ). Ajouter également une méthode activerBouclier  et une méthode desactiverBouclier .
 
         Elles ne prennent aucun paramètre et ne retournent rien. Nous nous occuperons cependant plus tard du contenu de ces méthodes, pour l'instant faites leur simplement afficher :

Activation du bouclier d'un vaisseau de type X

Désactivation du bouclier d'un vaisseau de type X

Où X peut être (CHASSEUR, FREGATE, CROISEUR, CARGO ou VAISSEAU-MONDE).

Nous allons maintenant matérialiser concrètement ces deux types de vaisseaux - Vaisseaux de guerre et vaisseaux civils -
en créant des nouvelles classes qui héritent de Vaisseau .

VaisseauDeGuerre

         VaisseauCivil

Les Vaisseaux de Guerre disposent de la capacité d'attaquer. Nous matérialiserons cela par une méthode attaque qui prend
en paramètre :

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

Créez un Chasseur disposant d'un blindage de valeur 156 et d'un bouclier capable de résister 2 minutes. Ne déclarez pas
la variable sous forme du type parent Vaisseau.

         Créez un Vaisseau-Monde disposant d'un blindage de valeur 4784 et d'un bouclier capable de résister 30 minutes. Ne déclarez pas la variable sous forme du type parent Vaisseau.
 
         Activez le bouclier du Vaisseau-Monde et du chasseur

Avec le chasseur, attaquez le vaisseau-monde avec des "lasers photoniques" pendant 3 minutes.

         Désactiver le bouclier du Vaisseau-Monde

Afficher la durée de protection résiduelle du bouclier du Vaisseau-Monde (vous devez obtenir 0)

Afficher la valeur du blindage du Vaisseau-Monde (vous devriez obtenir 2392)

 *******************************************************************

                  partie2

 **********************************************************************

Considérons que dans notre logiciel les planètes telluriques sont habitables. Vous allez tout d'abord créer 2 nouvelles
classes qui héritent de Planete  :

         PlaneteTellurique
 
         PlaneteGazeuse

Note : Pensez à la question du constructeur!

Supprimer la propriété matiere dans la classe Planete .

L'habitabilité sera associée aux planètes Telluriques au moyen d'une interface Habitable .

Cette interface définira la méthode accueillirVaisseau que nous avions jusque là dans la classe Planete .

Vous remarquerez cependant que vous ne pourrez pas déplacer les propriétés totalVisiteurs et vaisseauAccoste vers
l'interface, vous pourriez les laisser au niveau de Planete mais leur place est plutôt dans PlaneteTellurique .

Dans le main :

modifiez l'ensemble des planètes de manière à respecter cette nouvelle nomenclature (Tellurique / Gazeuse). Modifiez
également le type des variables.

Faites accoster sur Mars le Vaisseau-Monde créé à l'étape précédente.

Tentez de faire accoster sur Jupiter le Chasseur créé à l'étape précédente. La compilation devrait être possible étant
donné que Jupiter n'est pas habitable donc vous pouvez revenir en arrière.

Faites accoster sur Mars le Chasseur.


 *******************************************************************

                  partie3

 **********************************************************************


A présent tout engin de guerre qui se met en position de défense en activant son bouclier, verra son
armement
automatiquement désactivé.

     Cette règle ne s'applique bien évidemment pas au Vaisseau civil.
 
     Les méthodes d'activation et désactivation du bouclier se situent au niveau du parent Vaisseau . Réécrivez dans la classe VaisseauDeGuerre  la méthode d'activation, celle-ci doit désormais également désactiver l'armement du Vaisseau.
 
     Dans le main, déclarez maintenant les vaisseaux sous forme de variables de type Vaisseau afin de matérialiser le polymorphisme. Vous devrez cependant transtyper le chasseur pour l'attaque.
 
     Tentez d'activer le bouclier de protection du Chasseur juste avant l'attaque, rien ne doit se passer.

 *******************************************************************

                  partie4

 **********************************************************************

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




