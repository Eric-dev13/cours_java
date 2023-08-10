public class Port {

    int nbPlace;

    Port(int nbPlace)
    {
        this.nbPlace=nbPlace;
    }

    void acceuillirEngin(Amarable engin)
    {
        nbPlace-=engin.nbCordes(1.5F,100);
        if (nbPlace>=0){
            System.out.println("Super on vous attends avec " + engin.nbCordes(1.5F,100) + " cordes");
        } else {
            System.out.println("Navré, nous n'avons pas assez de place pour vous acceuillir");
        }
    }
}
