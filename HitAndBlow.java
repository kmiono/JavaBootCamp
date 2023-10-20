import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HitAndBlow {
    public static void main(String[] args) {
        ArrayList<Integer> comList = new ArrayList<>();
        String[] userList = {};
        Scanner scanner = new Scanner(System.in);
        int countNumber = 0;

        comList = addList();
        System.out.println(comList);

        for(int i=0;i<comList.size();i++){
            countNumber += comList.get(i);
        }

        // 数字を当てる処理
        while (true) {
            int i = 0;
            int blowCount = 0;
            int hitCount = 0;
            String userInput = scanner.next();//処理の都合上必ずここで4桁入ってくる
            userList = userInput.split("");

            if(Integer.parseInt(userList[i]) == comList.get(i)){
                blowCount++;
            }

            if(Integer.parseInt(userInput) == countNumber){
                hitCount++;
            }
            //while文の一番最後の処理
            i++;
        }

    }

    public static int numGanerator(){
        Random rand = new Random();
        int num = rand.nextInt(9);

        return num;
    }

    public static ArrayList<Integer> addList(){
        int num = numGanerator();

        ArrayList<Integer> list = new ArrayList<>();

        list.add(num);

        //comListに数字が重ならないよう追加していく処理
        while (true) {
            
            int i=0;
            
            if(!(list.get(i) == num)){
                list.add(num);
            }
            if(list.size() == 4){
                break;
            }
            num = numGanerator();
            i++;
        }
        return(list);
    }
}
