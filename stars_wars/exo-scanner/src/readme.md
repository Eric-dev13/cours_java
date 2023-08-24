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
