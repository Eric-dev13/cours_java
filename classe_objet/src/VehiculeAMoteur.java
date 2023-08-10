public class VehiculeAMoteur {
    Moteur moteur;

    VehiculeAMoteur(){ }

    VehiculeAMoteur(Moteur mot)
    {
        this.moteur=mot; // this n'est pas obligatoire tant qu'il n'y a pas de propriété possèdant le même nom dans les variables
    }

}
