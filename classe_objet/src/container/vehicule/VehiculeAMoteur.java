package container.vehicule;

public class VehiculeAMoteur {
    Moteur moteur;

    protected VehiculeAMoteur(){ }

    protected VehiculeAMoteur(Moteur mot)
    {
        this.moteur=mot; // this n'est pas obligatoire tant qu'il n'y a pas de propriété possèdant le même nom dans les variables
    }

}
