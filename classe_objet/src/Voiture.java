public class Voiture extends VehiculeAMoteur implements Vidangeable{

    int nbPortes;
    String couleur;
    String modele;
    boolean boite;
    TypeBoiteVitesse boiteVitesse;
    int vitesse = 0 ;
    int nbPlaces;


    // Constructeur par défaut
    Voiture()
    {
        System.out.println("Ici on construit une voiture sans moteur");
        this.nbPlaces=5;
    }

    Voiture(Moteur moteur)
    {
        super(moteur); // le moteur est instancié via la classe parente.
        System.out.println("Ici on construit une voiture avec un moteur");
    }

    Voiture(String modele)
    {
        this(); // Rapelle le constructeur par défaut sans argument
        this.modele=modele;
    }

//    Voiture(String couleur, int nbPortes)
//    {
//
//    }

    void klaxonner()
    {
        System.out.println("tut tut !!!");
    }

    // Plusieurs méthode avec le meme nom dit surchargées
    void accelerer() {
        System.out.println("Mon véhicule accélère");
    }

    void accelerer(int acceleration) {
        vitesse+=acceleration;
        System.out.println("Mon véhicule accélère de " + acceleration + " km/h et roule à présent à " + vitesse + "km/h");
    }

    @Override
    public void vidanger() {
        System.out.println("Dévisser le bouchons etc ...");
    }

//    void transporter(Passager passager, String villeDeDepart, String villeArrivee,String[] villesEtapes )
//    {
//        System.out.println(passager.prenom+" voyage avec moi de "+villeDeDepart+" jusqu'a "+villesEtapes[0]+" pour "+" mon trajet à "+villeArrivee);
//    }

    void transporter(Passager passager, String villeDeDepart, String villeArrivee, String... villesEtapes )
    {
        System.out.println(passager.prenom+" voyage avec moi de "+villeDeDepart+" jusqu'a "+villeArrivee);
        System.out.println("Nous passerons par : ");
        for (int i = 0; i < villesEtapes.length ; i++)
        {
            System.out.println(villesEtapes[i]);
        }
    }


}
