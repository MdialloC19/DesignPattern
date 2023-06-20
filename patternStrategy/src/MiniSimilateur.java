package patternStrategy.src;

import patternStrategy.src.comportement.vol.PropulsionAReaction;
import patternStrategy.src.concretClass.*;


public class MiniSimilateur {

    public static void main(String[] args) {
        //objet colvert!!!
        Canard colvert =new Colvert();
        colvert.effectuerCancan();
        colvert.effectuerVol();

        //objet proto

        Canard proto =new PrototypeCanard();
        proto.effectuerCancan();
        proto.effectuerVol();

        proto.setInstanceComportementVol(new PropulsionAReaction());
        proto.effectuerVol();


    }
    
}
