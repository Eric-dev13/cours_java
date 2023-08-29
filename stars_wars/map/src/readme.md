Map

La classe Atmosphere dispose actuellement d'une propriété de type Float par type de gaz possiblement présent dans l'atmosphère d'une planète. Cette liste n'est pas exhaustive.

Si l'on conservait ce modèle, ajouter un nouveau gaz consisterait à rajouter une nouvelle propriété à la classe. Heureusement avec les collections tout devient plus simple. Nous allons utiliser une collection de type HashMap  pour référencer planète par planète uniquement les gaz que nous souhaitons valoriser. Cette nouvelle propriété de Atmosphere  s’appellera constituants .

La clé de la Map sera le symbole chimique du gaz, la valeur sera le numérique flottant (Float ).

Dans le main , valorisez l'atmosphère de Mars composée de :

De dioxyde de carbone (CO2) à 95%
         D'azote (N2) à 3%
 D'argon(AR) à 1.5%
 et bien d'autres dont le monoxyde de carbone (NO) que vous valoriserez à 0.013%
 Et afficherez le contenu de cette atmosphère grâce à une itération sur les clés de la Map  :

 "L'atmosphère de Mars est constituée de :

 95% de CO2

 etc...."
