package container.vehicule.terrestre.voiture;

public enum TypeBoiteVitesse {
    AUTO("boite automatique"),
    SEMI_AUTO("boite semi automatique"),
    MANUELLE("manuelle");
    public final String nomTypeBoite;

    private TypeBoiteVitesse(String nomTypeBoite)
    {
        this.nomTypeBoite=nomTypeBoite;
    }
}
