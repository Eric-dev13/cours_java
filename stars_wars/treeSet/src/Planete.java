public class Planete implements Comparable<Planete> {
    String nom;
    // String matiere;
    Long diametre;
    Atmosphere atmosphere;
    static int nbPlanetesDecouvertes = 0;
    float distanceSoleil;
    float distanceEtoile; // Pour ordonner automatiquement les planètes

    Planete(){
        nbPlanetesDecouvertes++;
        this.atmosphere = new Atmosphere();
    }

    Planete(String nom){
        this();
        this.nom = nom;
    }

    void rotation(){
        System.out.printf("Je suis la planète %s et je tourne sur moi-même.\n", this.nom);
    }

    void revolution(){
        System.out.printf("Je suis la planète %s et je tourne autour de mon étoile.\n", this.nom);
    }

    @Override
    public int compareTo(Planete otherPlanete) {
        return Float.compare(this.distanceEtoile,otherPlanete.distanceEtoile);
    }

    /*@Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;7

        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return 31 * name.hashCode() + age;
    }*/

}

