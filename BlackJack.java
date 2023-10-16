import java.util.Random;
import java.util.Scanner;

/**
 * BlackJack
 */
public class BlackJack {

    /**
     * @param args
     */
    public static void main(String[] args) {
         
        try (Scanner scanner = new Scanner(System.in)) {


            int comCard1 = cardGanerator();//COMに配られるカード1枚目
            int comCard2 = cardGanerator();//COMに配られるカード2枚目

            int comTotal = comCard1+comCard2;


            int userCard1 = cardGanerator();//プレイヤーに配られるカード1枚目
            int userCard2 = cardGanerator();//プレイヤーに配られるカード1枚目

            int userTotal = userCard1+userCard2;
            

            String[] trampSuit = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

            System.out.println("あなたに「"+trampSuit[userCard1-1]+"」が配られました。");
            System.out.println("ディーラーに「"+trampSuit[comCard1-1]+"」が配られました。");
            System.out.println("あなたに「"+trampSuit[userCard2-1]+"」が配られました。");
            System.out.println("ディーラーに「"+trampSuit[comCard2-1]+"」が配られました。");

            System.out.println("ディーラーの合計は "+comTotal+" です。");
            System.out.println("現在の合計は "+userTotal+" です。");

            while (true) {
                
                int userBetCard = 0;

                System.out.println("もう１枚カードを引きますか？(Y/N)：");
                final String bet = scanner.next();
                if(bet.equals("Y")){
                    userBetCard = cardGanerator();
                    System.out.println("あなたに「"+trampSuit[userBetCard-1]+"」が配られました。");
                    userTotal += userBetCard;
                    System.out.println("現在の合計は "+userTotal+" です。");
                    // バースト(21以上の失格)の時
                    if(userTotal > 21){
                        System.out.println("バーストしたため、あなたの負けです。");
                        // 処理終了
                        return;
                    }
                }else{
                    break;
                }
                
            }

            //17以下の場合ディーラーは必ずカードを引く
            while (true) {
                int comBetCard = 0;
                if(comTotal <= 17){
                    comBetCard = cardGanerator();
                    System.out.println("ディーラーに「"+trampSuit[comBetCard]+"」が配られました。");
                    comTotal += comBetCard;
                    System.out.println("ディーラーの合計は "+comTotal+" です。");
                    // バースト(21以上の失格)の時
                    if(comTotal > 21){
                        System.out.println("ディーラーがバーストしたため、あなたの勝ちです。");
                        // 処理終了
                        return;
                    }
                }else{
                    break;
                }
            }

            //勝敗判定
            // 処理順：普通に勝った時＞引き分けの時＞普通に負けたとき
            if(userTotal > comTotal){
                System.out.println("あなたの勝ちです。");
            }else if(comTotal == userTotal){
                System.out.println("双方同値のため、ノーコンテストです。");
            }
            else if(comTotal > userTotal){
                System.out.println("あなたの負けです。");
            }
        }

    }

    public static int cardGanerator(){
        Random rand = new Random();
        int card = rand.nextInt(12)+1;

        //J、Q、Kは統一で10とする（Aは1とする）
            if(card == 11 || card == 12 || card == 13){
                card = 10;
            }

        return card;
    }

}

/**
 * コインをかける場合の処理
 * 
 * 
 * int userCoin = 100;
 * 
 * 引き分けの状態も判定する必要があるためint型
 * int winFlag = 0; 
 * 
 * 0になったらゲーム終わる
 * while(userCoin != 0){
 * 上記ゲーム処理
 *   コインの変動
            if(winFlag == 1){
                userCoin += 30;
                System.out.println("あなたのコインは "+userCoin+" です。");
            }else if(winFlag == 2){
                userCoin += 20;
                System.out.println("あなたのコインは "+userCoin+" です。");
            }else if(winFlag == 0){
                userCoin -= 10;
                System.out.println("あなたのコインは "+userCoin+" です。");
            }
            }
 * }
 * 
 */