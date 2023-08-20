public enum TypeBoiteVitesse {
    AUTO("boite automatique"),
    SEMI_AUTO("boite semi automatique"),
    MANUELLE("manuelle");
    final String nomTypeBoite;

    private TypeBoiteVitesse(String nomTypeBoite)
    {
        this.nomTypeBoite=nomTypeBoite;
    }
}
