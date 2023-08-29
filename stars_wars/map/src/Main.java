import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* ******* INSTANCIATION DES PLANETES ****** */
        PlaneteTellurique mars = new PlaneteTellurique("mars", 3);


        //    Dans le main , valorisez l'atmosphère de Mars composée de :
        //
        //    De dioxyde de carbone (CO2) à 95%
        //    D'azote (N2) à 3%
        //    D'argon(AR) à 1.5%
        //    et bien d'autres dont le monoxyde de carbone (NO) que vous valoriserez à 0.013%
        //    Et afficherez le contenu de cette atmosphère grâce à une itération sur les clés de la Map  :
        //
        //            "L'atmosphère de Mars est constituée de :
        //
        //            95% de CO2
        //
        //    etc...."
        mars.atmosphere.constituants.put("CO2", 95F);
        mars.atmosphere.constituants.put("N2", 3F);
        mars.atmosphere.constituants.put("AR", 1.5F);
        mars.atmosphere.constituants.put("NO", 0.013F);

        // Afficherez le contenu de cette atmosphère grâce à une itération sur les clés de la Map
        // L'atmosphère de Mars est constituée de :
        System.out.println("L'atmosphère de Mars est constituée de :");
        for(String key : mars.atmosphere.constituants.keySet()){
            Float value =  mars.atmosphere.constituants.get(key);
            System.out.println(key + " : " + value);
        }

        // AUTRE POSSIBILITE
        /*for ( Map.Entry<String, Float> composition : mars.atmosphere.constituants.entrySet())
        {
            System.out.println("La composition de Mars est faite de : "+composition.getKey()+" à "+composition.getValue()+"% \n");
        }*/




    }

}