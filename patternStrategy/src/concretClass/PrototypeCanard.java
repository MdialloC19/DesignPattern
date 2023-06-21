package patternStrategy.src.concretClass;

import patternStrategy.src.comportement.cancaner.Cancan;
import patternStrategy.src.comportement.vol.NePasVoler;

public class PrototypeCanard  extends Canard {

    public PrototypeCanard(){
        comportementCancan= new Cancan();
        comportementVol=new NePasVoler();
    }

    public void afficher(){
        System.out.println("Je suis un prototype de Caanrd");
    
    }
}
