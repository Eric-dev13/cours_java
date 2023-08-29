import java.util.HashMap;
import java.util.Map;

public class Atmosphere {

    float hydrogene;
    float methane;
    float azote;
    float hélium;
    float argon;
    float co2;
    float sodium;

    // La clé de la Map sera le symbole chimique du gaz, la valeur sera le numérique flottant (Float ).
    Map<String, Float> constituants = new HashMap<>();

}
