public class Main {
    public static void main(String[] args) {


        /* ******* INSTANCIATION DES PLANETES ****** */

        PlaneteGazeuse neptune = new PlaneteGazeuse();
        neptune.nom = "neptune";
        neptune.diametre = 49244L;
        neptune.distanceEtoile = 4497.07F;

        PlaneteTellurique venus = new PlaneteTellurique("venus", 6);
        venus.nom = "venus";
        venus.diametre = 12104L;
        venus.distanceEtoile = 108.2F;

        PlaneteTellurique terre = new PlaneteTellurique("terre", 3);
        terre.nom = "terre";
        terre.diametre = 12742L;
        terre.distanceEtoile = 149.6F;

        PlaneteGazeuse jupiter = new PlaneteGazeuse();
        jupiter.nom = "jupiter";
        jupiter.diametre = 139820L;
        jupiter.distanceEtoile = 778.3F;

        PlaneteTellurique mercure = new PlaneteTellurique("mercure", 4);
        mercure.nom = "mercure";
        mercure.diametre = 4879L;
        mercure.distanceEtoile = 57.9F;

        PlaneteGazeuse saturne = new PlaneteGazeuse();
        saturne.nom = "saturne";
        saturne.diametre = 116460L;
        saturne.distanceEtoile = 1427.0F;

        PlaneteTellurique mars = new PlaneteTellurique("mars", 3);
        mars.nom = "mars";
        mars.diametre = 6779L;
        mars.distanceEtoile = 227.9F;
        mars.atmosphere.constituants.put("De dioxyde de carbone (CO2)", 95F);
        mars.atmosphere.constituants.put("D'azote (N2)", 3F);
        mars.atmosphere.constituants.put("D'argon(AR)", 1.5F);
        mars.atmosphere.constituants.put("De monoxyde de carbone (NO)", 0.013F);

        PlaneteGazeuse uranus = new PlaneteGazeuse();
        uranus.nom = "uranus";
        uranus.diametre = 50724L;
        uranus.distanceEtoile = 2877.38F;

        Galaxie galaxie =new Galaxie();
        galaxie.planetes.add(mars);
        galaxie.planetes.add(mercure);
        galaxie.planetes.add(venus);
        galaxie.planetes.add(terre);
        galaxie.planetes.add(jupiter);
        galaxie.planetes.add(saturne);
        galaxie.planetes.add(uranus);
        galaxie.planetes.add(neptune);

        /*mars.atmosphere.constituants.put("CO2", 95F);
        mars.atmosphere.constituants.put("N2", 3F);
        mars.atmosphere.constituants.put("AR", 1.5F);
        mars.atmosphere.constituants.put("NO", 0.013F);*/

        // Afficherez le contenu de cette atmosphère grâce à une itération sur les clés de la Map
        // L'atmosphère de Mars est constituée de :
        /*System.out.println("L'atmosphère de Mars est constituée de :");
        for(String key : mars.atmosphere.constituants.keySet()){
            Float value =  mars.atmosphere.constituants.get(key);
            System.out.println(key + " : " + value);
        }*/

        // AUTRE POSSIBILITE
        /*for ( Map.Entry<String, Float> composition : mars.atmosphere.constituants.entrySet())
        {
            System.out.println("La composition de Mars est faite de : "+composition.getKey()+" à "+composition.getValue()+"% \n");
        }*/

        for(Planete planete : galaxie.planetes) {
            System.out.printf( "La planète %s se trouve a %f millions de km du soleil\n", planete.nom, planete.distanceEtoile);
        }



    }

}