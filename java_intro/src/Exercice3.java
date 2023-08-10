import java.util.Scanner;

public class Exercice3 {

    public static void main(String[] args) {
        /*
            Nous avons déterminé le nombre de planètes dans le système solaire en fonction d'une date (année) donnée.
            Nous allons maintenant modifier intégralement notre code pour réaliser la démarche inverse, c'est à dire afficher à quelle période correspond un nombre de planète donné :
            Pour 7, afficher "On sait qu'au 16ème siècle, seules 7 planètes avaient été découvertes"
            Pour 8, afficher "On sait que le nombre de planètes est passé de 7 à 8 au 17ème siècle, mais il a également été réduit de 9 à 8 en 2006"
            Pour 9, afficher "On sait que le nombre de planètes est passé de 8 à 9 au 18ème siècle et ce jusqu'en 2006, où ce nombre a été réduit à 8".
            Pour tout autre nombre, on va afficher le message "Le programme ne peut pas fournir de résultat pour <nombre>"
            Plutôt que d'utiliser une structure en if - else if - else pour tenir compte de tous les cas possibles, nous allons introduire le switch - case - default .
            Vous allez appliquer un switch sur le nombre de planètes souhaité.
            Profitez du default pour les valeurs qui ne sont pas prise en charge par le programme.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir le nombre de planètes :");
        int nbrePlanete = sc.nextInt();

        for (; nbrePlanete < 10; nbrePlanete++){
            switch (nbrePlanete) {
                case 7:
                    System.out.println("On sait qu'au 16ème siècle, seules 7 planètes avaient été découvertes");
                    break;
                case 8:
                    System.out.println("On sait que le nombre de planètes est passé de 7 à 8 au 17ème siècle, mais il a également été réduit de 9 à 8 en 2006");
                    break;
                case 9:
                    System.out.println("On sait que le nombre de planètes est passé de 8 à 9 au 18ème siècle et ce jusqu'en 2006, où ce nombre a été réduit à 8");
                    break;
                default:
                    System.out.printf("Le programme ne peut pas fournir de résultat pour %d \n", nbrePlanete);
            }
    }

    }
}
