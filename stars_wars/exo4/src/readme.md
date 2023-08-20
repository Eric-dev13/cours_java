*****************************************************************************************
               Quatrième partie
*****************************************************************************************

Les méthodes qui permettent à la planète d'accueillir un vaisseau recevaient en paramètre :

Soit le nombre de passagers

Soit le type de Vaisseau

Nous allons fusionner ces 2 méthodes en une seule qui va maintenant réellement recevoir en paramètre un objet de type Vaisseau. On considérera que le type du Vaisseau (CROISEUR etc...) est maintenant une propriété de Vaisseau mais que celle ci ne détermine plus automatiquement le nombre de passagers. La classe Vaisseau disposera  également d'une nouvelle propriété de type int pour le nombre de passagers



IMPORTANT : Il n'est pas prévu pour le moment que nos planètes puissent accueillir les vaisseaux en nombre illimité. C'est le début de la conquête spatiale, les planètes ne disposent que d'une seule baie d'accostage. Autrement dit, si un vaisseau est déjà présent, il va devoir au préalable s'en aller.

La méthode qui permet d'accueillir le vaisseau devra également retourner le vaisseau en partance s'il existe. Pour que cela soit possible, la Planète devra disposer d'une propriété pour stocker le Vaisseau actuellement accosté.



Faites accoster sur Mars une Frégate de 9 passagers puis un Croiseur de 42 passagers.

         A chaque fois, indiquez si en arrivant, le nouveau vaisseau à remplacé un autre vaisseau déjà présent en affichant le type du vaisseau en partance sous la forme :

Aucun vaisseau ne s'en va.

ou

Un vaisseau de type X doit s'en aller.

A la fin du programme affichez toujours le nombre de visiteurs ayant déjà posé le pied sur la planète sous la forme :

Le nombre d'humains ayant déjà séjourné sur X est actuellement de Y.