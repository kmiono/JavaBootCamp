package instance_practice;

import java.util.Random;

public class NumberAdder {
    public static void main(String[] args) {
        Random rand = new Random();
        while (true) {
            
            int HP = rand.nextInt(9);

            System.out.print("HP =>" + HP+":");
            if(isDead(HP)){
                System.out.println("死んでます");
                break;
            }else{
                System.out.println("生きてます");
            }
        }
        
    }

    static boolean isDead (int HP){
        if(HP == 0){
            return true;
        }else{
            return false;
        }
        
    }
}
