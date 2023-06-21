package patternstrategyz.src.concretClass;

import patternstrategyz.src.comportements.combat.*;

public class Guerrier extends Personnage {

    public Guerrier() {
        this.espritCombatif=new CombatPistolet();
    }
    public void afficher(){
        System.out.println("Je suis un Guerrier");
    }

    
}
