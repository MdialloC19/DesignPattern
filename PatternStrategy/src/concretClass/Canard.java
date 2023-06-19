package PatternStrategy.src;

import PatternStrategy.src.comportement.vol.*;
import PatternStrategy.src.comportement.cancan.*;

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
