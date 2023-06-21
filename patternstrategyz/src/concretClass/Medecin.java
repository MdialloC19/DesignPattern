package patternstrategyz.src.concretClass;

import patternstrategyz.src.comportements.combat.IEspritCombatif;
import patternstrategyz.src.comportements.deplacement.IDeplacement;
import patternstrategyz.src.comportements.soin.ISoin;
import patternstrategyz.src.comportements.soin.PremierSoin;

public class Medecin extends Personnage{

    public Medecin (){
        this.soin=new PremierSoin();
    }

    public Medecin(IEspritCombatif espritCombatif, ISoin soin, IDeplacement deplacement) {
           super(espritCombatif, soin,deplacement);
    }
    
    public void afficher(){
        System.out.println("Je suis un Medecin");
    }

    
}
