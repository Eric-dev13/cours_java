public class Vaisseau {
    int nbPassager;
    String typeVaisseau;
    TypeVaisseau enumTypeVaisseau;

    int blindage; // Représente la capacité de résistance intrinsèque de l'engin aux attaques.
    int resistanceDuBouclier;  // Nombre de minutes de résistance restantes

    void activerBouclier()
    {
        System.out.printf("Activation du bouclier d'un vaisseau de type %s \n",this.typeVaisseau);
    }

    void desactiverBouclier()
    {
        System.out.printf("Désactivation du bouclier d'un vaisseau de type %s \n",this.typeVaisseau);
    }
}
