public abstract class Vaisseau {
    int nbPassager;
    // String typeVaisseau;
    TypeVaisseau type;
    int tonnageMax;
    int tonnageActuel;

    Vaisseau(){}

    Vaisseau(TypeVaisseau typeVaisseau){
        this.type = typeVaisseau;
    }

    Vaisseau(TypeVaisseau type, int nbPassagers) {
        this.type = type;
        this.nbPassager = nbPassagers;

        if (nbPassagers >= 12) {
            if (type.nom.equalsIgnoreCase("fregate")) {

                if (nbPassagers >= 25) {

                    tonnageMax = 50;
                } else {
                    tonnageMax = nbPassagers * 2;
                }

            } else if (type.nom.equalsIgnoreCase("croiseur")) {
                if (nbPassagers >= 50) {

                    tonnageMax = 100;
                } else {
                    tonnageMax = nbPassagers * 2;
                }

            } else if (type.nom.equalsIgnoreCase("cargo")) {
                tonnageMax = 500;

            } else if (type.nom.equalsIgnoreCase("vaisseau-monde")) {
                tonnageMax = 2000;
            }
        }
    }

    int blindage; // Représente la capacité de résistance intrinsèque de l'engin aux attaques.
    int resistanceDuBouclier;  // Nombre de minutes de résistance restantes

    void activerBouclier()
    {
        System.out.printf("Activation du bouclier d'un vaisseau de type %s \n",this.type);
    }

    void desactiverBouclier()
    {
        System.out.printf("Désactivation du bouclier d'un vaisseau de type %s \n",this.type);
    }

    abstract void emporterCargaison(int tonnage);

}
