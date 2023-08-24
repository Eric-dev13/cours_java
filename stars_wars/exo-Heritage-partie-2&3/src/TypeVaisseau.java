public enum TypeVaisseau {
    CHASSEUR("CHASSEUR"),
    FREGATE("FREGATE"),
    CROISEUR("CROISEUR"),
    CARGO("CARGO"),
    VAISSEAU_MONDE("VAISSEAU_MONDE");

    String nomTypeVaisseau;

    TypeVaisseau(String nomTypeVaisseau){
        this.nomTypeVaisseau = nomTypeVaisseau;
    }

}
