package container;

import java.util.Objects;

public class Carre implements Comparable {
    //long cote;
    Long cote;

    Carre(long cote)
    {
        this.cote=cote;
    }

    @Override
    public int compareTo(Object o) {
        Carre carre = (Carre)o;
        return this.cote.compareTo(carre.cote);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carre carre = (Carre) o;
        return Objects.equals(cote, carre.cote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cote);
    }

    /*

    @Override
    public int compareTo(Object o) {
        if(o instanceof Carre) {
           Carre carreCompare = (Carre) o;
           if(this.cote==carreCompare.cote){
               return 0;
           }
           if(this.cote > carreCompare.cote){
               return 1;
           } else {
               return -1;
           }
        }
        return 0;
    }
    */
}
