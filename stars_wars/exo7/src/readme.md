 *******************************************************************
                  partie2
 **********************************************************************

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
