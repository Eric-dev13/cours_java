import java.util.Scanner;

public class Exercice {
    /*
    *********************************************************************************
                    EXERCICE 1
    ********************************************************************************
        Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de : 8
        Il y a quelques années cependant, elles étaient au nombre de : 9
        Il s’agit d'afficher un message avec quelque variations sous la forme :
        En <numéro année>, les planètes du système solaire étaient au nombre de : <nombre planètes>
        Les éléments entre <> seront variables et dépendent du moment qui nous intéresse.
        Si l’on veut par exemple connaître le nombre de planètes en 2003 le message affiché sera :
        En 2003, les planètes du système solaire étaient au nombre de : 9
        Si l’on veut par exemple connaître le nombre de planètes en 2014 le message affiché sera :
        En 2014, les planètes du système solaire étaient au nombre de : 8
        Pluton a été effectivement exclu du rang des planètes en Août 2006. Cela signifie donc que le nombre de planètes dans le système solaire est passé de 9 à 8 à ce moment exact. Mais pour simplifier le code, nous n’allons pas considérer le mois de l’année. Nous dirons simplement que ce nombre était de 9 avant 2006 et est passé à 8 à partir de 2006 inclus.
        Vous allez créer une variable de type entier pour stocker l’année voulue et décider de ce qui doit être affiché en fonction de la valeur de cette variable.
        Exécuter une première fois votre code avec 2003 et vérifiez le résultat.
        Exécuter une seconde fois votre code avec 2014 et vérifiez le résultat.
        Exécuter enfin votre code avec 2006 et vérifiez le résultat.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir une année :");
        int year = sc.nextInt();

        int nbrePlanete=0;


        if(year < 1600 || year > 2020) {
            System.out.printf("Le programme ne peut pas fournir de résultat pour l'année");
        } else {
            if(year < 1708){
                nbrePlanete=7;
            } else if(year < 1800){
                nbrePlanete=8;
            } else if (year < 2006){
                nbrePlanete=9;
            }
            System.out.printf("les planètes du système solaire étaient au nombre de : %d",nbrePlanete );
        }

        /*
        Notre code n’est pas tout à fait correct fonctionnellement.
        En réalité personne ne sait si les scientifiques ne changeront pas d’avis dans le futur et excluront pourquoi pas Mercure du rang de planète.
        De la même manière, les planètes n’ont pas toutes été découvertes d’un coup, Uranus par exemple fut découverte au 17ème siècle et Neptune au 18ème.
        On va améliorer notre code de manière à restreindre notre gamme de valeurs acceptables. On acceptera des valeurs à partir de l’an 1600 et jusqu’à disons 2020 incluse.
        Dans le cas contraire, il faudra alors afficher le message :
        Le programme ne peut pas fournir de résultat pour l'année <année>
        Si en revanche l'année choisi est acceptable, alors on va également considérer les 2 cas supplémentaires qui corresponde à la découverte de Uranus et Neptune.
        Si l'année est inférieure à 1700 alors le nombre de planètes est de 7
        Sinon si l'année est inférieure à 1800 alors le nombre de planètes est de 8
        Pour réaliser cet exercice, vous allez devoir utiliser:
        2 blocs conditionnels imbriqués
        une séquence de if - else if - else qui comporte 2 fois un else if
        Notes :
        Il existe plusieurs manières d’aboutir au résultat mais la meilleure option consiste à considérer d’abord le cas des valeurs hors limite.
        Les valeurs 1600, 1700, 1800, 2006 et 2020 sont des valeurs particulières car elles délimitent nos différents comportements.
         */
    }


}
