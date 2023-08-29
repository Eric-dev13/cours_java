public class VaisseauDeGuerre extends Vaisseau {
    boolean armeActive = true;

    VaisseauDeGuerre(){
    }

    VaisseauDeGuerre(TypeVaisseau type, int nbPassagers) {
        super(type,nbPassagers);
    }

    void attaque(Vaisseau cible, String arme,int duree) {
        if(armeActive) {
            System.out.printf("Un vaisseau de type %s attaque un vaisseau de type %s en utilisant l'arme %s pendant %d minutes.\n", this.type.nom,cible.type.nom
                    ,arme, duree);

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

    // Vaisseaux de guerre
    // 1 personne = 2 tonnes
    // si typeVaisseau chasseur = tonnageMax =  0
    // sinon calcul switch avec fregate max 50 tonnes 25 pers max, et croiseurs max 100 tonnes ou 50 pers max.

    // si le nombre de passagers est insuffisant, tout est rejeté.
    void emporterCargaison(int tonnageDemande){
        // quantite refusée
        int rejet = 0;

        if(this.type.nom.equalsIgnoreCase("chasseur") || this.nbPassager < 12){
            rejet = tonnageDemande;
        } else {
            int tonnageAcceptable = this.tonnageMax - this.tonnageActuel;
            if(tonnageDemande >= tonnageAcceptable){
                rejet = tonnageDemande - tonnageAcceptable;
                tonnageActuel = tonnageMax;
            } else {
                tonnageActuel += tonnageDemande;
            }
        }
        System.out.println("Un vaisseau de type " + this.type.nom + " souhaite emporter une cargaison de " + tonnageDemande + " tonnes et " +  rejet + " tonnes ont été rejeté. A présent son chargement en soute est de " + this.tonnageActuel + "  tonnes pour un tonnage maximum de  " +  this.tonnageMax +  " accepté");
    }

}
