import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) throws Exception{
    System.out.println("数字を当ててみてね。");
    System.out.println("答えられるのは5回までだよ");
    Random rand = new Random();
    try (Scanner scanner = new Scanner(System.in)) {
        int num = rand.nextInt(99);
        //System.out.println(num);
        int count = 5;
        int loseFlag = 0;

        for(int i = 0; 5 > i ;i++){
            
            int input = scanner.nextInt();
            if(count != loseFlag){
                if(num > input){
                    System.out.println("残念、もっと大きい数だよ");
                    count--;
                    
                }else if(input > num){
                    System.out.println("残念、もっと小さい数だよ");
                    count--;
                    
                }else{
                    System.out.printf("すごい!　%d回で当てられちゃった",count);
                    break;
                }
        }
        }
        if(count == loseFlag){
            System.out.printf("残念、正解は%dでした",num);
        }
    }

}
}

