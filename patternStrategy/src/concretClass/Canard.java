package patternStrategy.src.concretClass;

import patternStrategy.src.comportement.cancaner.*;
import patternStrategy.src.comportement.vol.*;

public abstract class Canard {
   
    IComportementVol comportementVol;
    IComportementCancan comportementCancan;
    public Canard(){

    }

    public abstract void afficher();

    public void effectuerVol(){
        comportementVol.voler();
    }

    public void effectuerCancan(){
        comportementCancan.cancaner();
    }

    public void nager(){
        System.out.println("Tous les canards flottent, même les leurres!");
    }
}
