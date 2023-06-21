package patternstrategyz.src.concretClass;

import patternstrategyz.src.comportements.combat.*;
import patternstrategyz.src.comportements.soin.*;
import patternstrategyz.src.comportements.deplacement.*;


public abstract class Personnage {
    protected   IEspritCombatif espritCombatif =new Pacifiste();
    protected   IDeplacement deplacement= new Marcher();
    protected   ISoin soin = new AucunSoin();

    public Personnage(){};
    public Personnage(IEspritCombatif espritCombatif, ISoin soin, IDeplacement deplacement) {
            this.espritCombatif = espritCombatif;
            this.soin = soin;
            this.deplacement = deplacement;
    }
    public abstract void afficher();

    public void seDeplace(){
        deplacement.deplace();
    }

    public void combattre(){
        espritCombatif.combat();
    }

    public void soigner(){
        soin.soigne();
    }

    public void setEspritCombatif(IEspritCombatif EC){
        this.espritCombatif=EC;
    }

    public void setDeplacement(IDeplacement dp){
        this.deplacement=dp;
    }

    public void setSoin(ISoin sg){
        this.soin=sg;
    }
}
