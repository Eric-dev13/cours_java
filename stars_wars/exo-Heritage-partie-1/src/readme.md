


*******************************************************************
                  HERITAGE / partie1
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
