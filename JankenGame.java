import java.util.Random;
import java.util.Scanner;

public class JankenGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int comHand = rand.nextInt(3);//COMの手。0~3の中でランダム生成
        String[] handCase = {"グー","チョキ","パー"};
        boolean aikoFlag = false;

        System.out.println("じゃんけん勝負");
        System.out.println("グーチョキパーを数字で入力してね");
        System.out.println("0:グー");
        System.out.println("1:チョキ");
        System.out.println("2:パー");

        while (true) { //勝つまで回る
            int userHand = scanner.nextInt();//入力値

            //相子の回数が0以上の時「あいこで」メッセージを表示」
            if(!aikoFlag){ 
            System.out.println("最初はぐー、じゃんけん：");
            }else{
                System.out.println("あいこで：");
            }

                
                    if(userHand == comHand){
                        System.out.println(handCase[comHand]+"(COM)と"+handCase[userHand]+"(Player)で…");
                        System.out.println("あいこだよ！");
                        aikoFlag = true;
                    }else if(userHand == 0 && comHand == 2 || userHand == 1 && comHand == 0 || userHand == 2 && comHand == 1){//ユーザーが負ける場合
                        System.out.println(handCase[comHand]+"(COM)と"+handCase[userHand]+"(Player)で…");
                        System.out.println("あなたの負け");
                        aikoFlag = false;
                        break;//ゲーム終了
                    }else if(userHand == 0 && comHand == 1 || userHand == 1 && comHand == 2 || userHand == 2 && comHand == 0){//ユーザーが勝つ場合
                        System.out.println(handCase[comHand]+"(COM)と"+handCase[userHand]+"(Player)で…");
                        System.out.println("あなたの勝ち");
                        aikoFlag = false;
                        break;//ゲーム終了
                    }else if(userHand >= 3){
                        System.out.println("0~2で入力してね");//エラー対処
                
            }
        }
    }
}
