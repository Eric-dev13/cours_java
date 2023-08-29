public enum TypeVaisseau {
    CHASSEUR("chasseur"),
    FREGATE("fregate"),
    CROISEUR("croiseur"),
    CARGO("cargo"),
    VAISSEAU_MONDE("vaisseau-monde");

    String nom;

    TypeVaisseau(String nomTypeVaisseau){
        this.nom = nomTypeVaisseau;
    }

}
