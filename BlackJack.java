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
        Random rand = new Random();
        try (Scanner scanner = new Scanner(System.in)) {
            int comCard1 = rand.nextInt(12)+1;//COMに配られるカード1枚目
            int comCard2 = rand.nextInt(12)+1;//COMに配られるカード2枚目
            //対決前COMに配られるカード2枚目
            int comTotal = comCard1+comCard2;


            int userCard1 = rand.nextInt(12)+1;//プレイヤーに配られるカード1枚目
            int userCard2 = rand.nextInt(12)+1;//プレイヤーに配られるカード1枚目
            int userTotal = userCard1+userCard2;
            

            String[] trampSuit = {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"};

            System.out.println("あなたに「"+trampSuit[userCard1]+"」が配られました。");
            System.out.println("ディーラーに「"+trampSuit[comCard1]+"」が配られました。");
            System.out.println("あなたに「"+trampSuit[userCard2]+"」が配られました。");
            System.out.println("ディーラーに「"+trampSuit[comCard2]+"」が配られました。");

            System.out.println("ディーラーの合計は "+comTotal+" です。");
            System.out.println("現在の合計は "+userTotal+" です。");

            while (true) {
                
                int userBetCard = 0;

                System.out.println("もう１枚カードを引きますか？(Y/N)：");
                final String bet = scanner.next();
                if(bet.equals("Y")){
                    userBetCard = rand.nextInt(12)+1;
                    System.out.println("あなたに「"+trampSuit[userBetCard-1]+"」が配られました。");
                    userTotal += userBetCard;
                    System.out.println("現在の合計は "+userTotal+" です。");
                }else{
                    break;
                }
                
            }

            //17以下の場合ディーラーは必ずカードを引く
            while (true) {
                int comBetCard = 0;
                if(comTotal <= 17){
                    comBetCard = rand.nextInt(12)+1;
                    System.out.println("ディーラーに「"+trampSuit[comBetCard]+"」が配られました。");
                    comTotal += comBetCard;
                    System.out.println("ディーラーの合計は "+comTotal+" です。");
                }else{
                    break;
                }
            }

            //勝敗判定
            if(userTotal > comTotal){
                System.out.println("あなたの勝ちです。");
            }
            //21を越えた場合はバースト（失格）する
            else if(userTotal > 21){
                System.out.println("バーストしたため、あなたの負けです。");
            }else if(comTotal > 21){
                System.out.println("ディーラーがバーストしたため、あなたの勝ちです。");
            }else if(comTotal > 21 && userTotal > 21){
                System.out.println("双方バーストのため、ノーコンテストです。");
            }else if(comTotal == userTotal){
                System.out.println("双方同値のため、ノーコンテストです。");
            }
            else if(comTotal > userTotal){
                System.out.println("あなたの負けです。");
            }
        }

    }
}