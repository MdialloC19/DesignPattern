package Singleton;
public class Main {

    public static void main(String []args ){
        President president1= President.getInstance("Macky", "Macky@@@@123455"); 
        President president2= President.getInstance("Mac", "y@@@@123455"); 

        System.out.println(president1);
        System.out.println(president2);
    }
    
}
