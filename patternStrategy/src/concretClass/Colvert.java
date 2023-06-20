package patternStrategy.src.concretClass;

import patternStrategy.src.comportement.cancaner.Cancan;
import patternStrategy.src.comportement.vol.VolerAvecDesAiles;

public class Colvert extends Canard{

    public Colvert(){
        comportementCancan= new Cancan();
        comportementVol=new VolerAvecDesAiles();
    }

    public void afficher(){
        System.out.println("Je suis un Colvert");
    }
}
