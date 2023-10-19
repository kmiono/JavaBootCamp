import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HitAndBlow {
    public static void main(String[] args) {
        int num = numGanerator();

        List<Integer> comList = new ArrayList<>();

        comList.add(num);

        //comListに数字が重ならないよう追加していく処理
        while (true) {
            
            int i=0;
            
            if(!(comList.get(i) == num)){
                comList.add(num);
            }
            System.out.println(comList.get(i));
            if(comList.size() == 4){
                break;
            }
            num = numGanerator();
        }

        

    }

    public static int numGanerator(){
        Random rand = new Random();
        int num = rand.nextInt(9);

        return num;
    }
}
