package patternstrategyz.src.concretClass;

import patternstrategyz.src.comportements.combat.*;
import patternstrategyz.src.comportements.soin.*;
import patternstrategyz.src.comportements.deplacement.*;


public abstract class Personnage {
    IEspritCombatif combat =new Pacifiste();
    IDeplacement deplacement= new Marcher();
    ISoin soin = new AucunSoin();

    public abstract void afficher();

    public void seDeplace(){
        deplacement.deplace();
    }

    public void combattre(){
        combat.combat();
    }

    public void soigner(){
        soin.soigne();
    }

    public void setEspritCombatif(IEspritCombatif EC){
        this.combat=EC;
    }

    public void setDeplacement(IDeplacement dp){
        this.deplacement=dp;
    }

    public void setSoin(ISoin sg){
        this.soin=sg;
    }
}
