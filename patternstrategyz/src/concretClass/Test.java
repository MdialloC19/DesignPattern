package patternstrategyz.src.concretClass;

public class Test {
    public static void main(String[] args) {
        Personnage[] tPers = {new Guerrier(), new Civils(), new Medecin()};
            for(int i = 0; i < tPers.length; i++){
                System.out.println("\nInstance de " +tPers[i].getClass().getName());
                System.out.println("*****************************************");
                tPers[i].combattre();
                tPers[i].seDeplace();
                tPers[i].soigner();
            }
    }
    
}


