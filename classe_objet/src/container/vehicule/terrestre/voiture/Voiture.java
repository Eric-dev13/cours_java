package container.vehicule.terrestre.voiture;

import container.humain.Passager;
import container.vehicule.Moteur;
import container.vehicule.VehiculeAMoteur;
import container.vehicule.Vidangeable;
import container.vehicule.terrestre.voiture.TypeBoiteVitesse;

/**
 * classe de voiture
 * Ajouter vos commentaires
 */
public class Voiture extends VehiculeAMoteur implements Vidangeable {

    public int nbPortes;
    public String couleur;
    public String modele;
    boolean boite;
    public TypeBoiteVitesse boiteVitesse;
    int vitesse = 0 ;
    int nbPlaces;
    private String immatriculation;

    // Constructeur par défaut
    public Voiture()
    {
        super();
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

    /**
     * Constructeur pour objet avec seulement porte et couleur valorisé
     * @param couleur
     * @param nbPortes
     */
    public Voiture(String couleur, int nbPortes)
    {
        super();
        this.couleur = couleur;
    this.nbPortes = nbPortes;
    }

    public void klaxonner()
    {
        System.out.println("tut tut !!!");
    }

    // Plusieurs méthode avec le meme nom dit surchargées
    void accelerer() {
        System.out.println("Mon véhicule accélère");
    }

    public void accelerer(int acceleration) {
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

    public void transporter(Passager passager, String villeDeDepart, String villeArrivee, String... villesEtapes)
    {
        System.out.println(passager.prenom+" voyage avec moi de "+villeDeDepart+" jusqu'a "+villeArrivee);
        System.out.println("Nous passerons par : ");
        for (int i = 0; i < villesEtapes.length ; i++)
        {
            System.out.println(villesEtapes[i]);
        }
    }


    public void immatriculer(String numero) throws ExecptionInvalidFormat, ExceptionNotNull
    {
        if(numero.length()!=7)
        {
            throw new ExecptionInvalidFormat("Problèmes immatriculation");
        }

        if(numero.isBlank()){
            throw new ExceptionNotNull("Faut remplir quelque chose");
        }

    }
}
