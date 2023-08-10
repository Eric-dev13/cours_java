public class Bateau implements Amarable{

    int masse;

    @Override
    public int nbCordes(float ratio, int vent){

        int nbC = (int)(masse +ratio) + (vent/100);

        return nbC;
    }
}
