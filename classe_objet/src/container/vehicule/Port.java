package container.vehicule;

import container.vehicule.marin.bateau.Amarable;

public class Port {

    int nbPlace;

    public Port(int nbPlace)
    {
        this.nbPlace=nbPlace;
    }

    public void acceuillirEngin(Amarable engin)
    {
        nbPlace-=engin.nbCordes(1.5F,100);
        if (nbPlace>=0){
            System.out.println("Super on vous attends avec " + engin.nbCordes(1.5F,100) + " cordes");
        } else {
            System.out.println("Navré, nous n'avons pas assez de place pour vous acceuillir");
        }
    }
}
