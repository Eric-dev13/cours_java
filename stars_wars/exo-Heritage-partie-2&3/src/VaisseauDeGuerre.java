public class VaisseauDeGuerre extends Vaisseau {
    boolean armeActive = true;
    void attaque(Vaisseau cible, String arme,int duree) {
        if(armeActive) {
            System.out.printf("Un vaisseau de type %s attaque un vaisseau de type %s en utilisant l'arme %s pendant %d minutes.\n", this.typeVaisseau,cible.typeVaisseau,arme, duree);

            cible.resistanceDuBouclier = 0;
            cible.blindage = cible.blindage/2;

        } else {
            System.out.println("Impossible d'attaquer car bouclier activé ! ");
        }

        /*System.out.println("Durée de protection résiduelle du bouclier: " + vaisseau_Monde.resistanceDuBouclier);
        System.out.println("Valeur du blindage du " + vaisseau_Monde.typeVaisseau + " " + vaisseau_Monde.blindage + " mn");*/
    }

    void activerBouclier(){
        // Désactiver l'armement du Vaisseau
        armeActive =false;
    }

    void desactiverBouclier(){
        // Activer l'armement du Vaisseau
        armeActive =true;
    }

}
