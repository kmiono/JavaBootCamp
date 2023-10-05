import java.util.Random;
import java.util.Scanner;

public class TrampGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int suit = rand.nextInt(3);
        int rank = rand.nextInt(12);
        String[] suitArray = {"ハート","ダイヤ","スペード","クローバー"};
        String[] rankArray = {"","A","2","3","4","5","6","7","8","9","J","Q","K"};

        System.out.println("トランプを選んだよ");
        System.out.println("トランプの図柄を当ててね");
        System.out.println("0:ハート");
        System.out.println("1:ダイヤ");
        System.out.println("2:スペード");
        System.out.println("3:クローバー");

        while (true) {
            int inputSuit = scanner.nextInt();
            if(inputSuit == suit){
                System.out.println("正解！図柄は"+suitArray[suit]+"だよ");
                System.out.println("次は数字を当ててね");
                break;
            }else if(inputSuit >= 4){
                System.out.println("0～3で入力してね");
            }else{
                System.out.println("残念！"+suitArray[inputSuit]+"じゃないよ");
            }
        }
        while (true) {
            System.out.println("どれだと思う？　数字で入力してね");
            int inputRank = scanner.nextInt();
            if(rankArray[inputRank] == rankArray[rank+1]){
                System.out.println("正解！"+suitArray[suit]+"の"+rankArray[rank+1]+"だよ");
                break;
            }else{
                System.out.println("残念！"+rankArray[inputRank]+"じゃないよ");
            
            }
        }
    }
}
