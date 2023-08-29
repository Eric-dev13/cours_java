package container.vehicule.marin.bateau;

public class Bateau implements Amarable, Comparable{

    public Integer getMasse() {
        return masse;
    }

    public void setMasse(Integer masse) {
        this.masse = masse;
    }

    public Integer masse;

    public Bateau(){

    }

    public Bateau(Integer masse){
        this.masse = masse;
    }

    @Override
    public int nbCordes(float ratio, int vent){

        int nbC = (int)(masse +ratio) + (vent/100);

        return nbC;
    }

    @Override
    public int compareTo(Object o) {
        Bateau bateau = (Bateau)o;
        if (this.hashCode() != bateau.hashCode()){
            return -1;

        }
        return Integer.compare(this.masse, bateau.masse);
        // return this.masse.compareTo(bateau.masse);
    }
}
