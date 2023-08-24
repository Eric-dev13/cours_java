public abstract class Vaisseau {
    int nbPassager;
    String typeVaisseau;
    TypeVaisseau enumTypeVaisseau;

    int tonnageMax;
    int tonnageActuel;

    Vaisseau(){}

    Vaisseau(String type, int nbPassagers) {
        this.typeVaisseau = type;
        this.nbPassager = nbPassagers;

        if (nbPassagers >= 12) {
            if (type.equalsIgnoreCase("fregate")) {

                if (nbPassagers >= 25) {

                    tonnageMax = 50;
                } else {
                    tonnageMax = nbPassagers * 2;
                }

            } else if (type.equalsIgnoreCase("croiseur")) {
                if (nbPassagers >= 50) {

                    tonnageMax = 100;
                } else {
                    tonnageMax = nbPassagers * 2;
                }

            } else if (type.equalsIgnoreCase("cargo")) {
                tonnageMax = 500;

            } else if (type.equalsIgnoreCase("vaisseau-monde")) {
                tonnageMax = 2000;
            }
        }
    }

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

    abstract void emporterCargaison(int tonnage);

}
