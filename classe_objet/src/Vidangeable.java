
// Devissable et Revissable sont des interfaces drapeaux : Elles sont vides et servent juste à indiquer des étapes possibles ( un peu comme un mode d'emploi )
public interface Vidangeable extends Devissable, Revissable {
    public void vidanger();
}
