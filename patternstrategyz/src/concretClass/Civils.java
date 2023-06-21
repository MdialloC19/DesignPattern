package patternstrategyz.src.concretClass;

import patternstrategyz.src.comportements.combat.*;
import patternstrategyz.src.comportements.soin.*;
import patternstrategyz.src.comportements.deplacement.*;

public class Civils extends Personnage {
    public Civils() {}

    public Civils(IEspritCombatif espritCombatif, ISoin soin, IDeplacement deplacement) {
           super(espritCombatif, soin,deplacement);
    }
    public void afficher(){
        System.out.println("Je suis un CIVIL");
    }

    
}
