public class StringsCompressor {
    
    public static void main(String[] args) {
        String text = encode("AAAAABBBBBBBBBBCDDDDDDDDDEEFFFFFG");
        System.out.println(text);
    }
    
    public static String encode(String str){
        String[] divideString = str.split("");
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countE = 0;
        int countF = 0;
        int countG = 0;

        for(int i =0;i<divideString.length;i++){
            switch (divideString[i]) {
                case "A":
                    countA++;
                    break;
                case "B":
                countB++;
                break;
            case "C":
                countC++;
                break;
                case "D":
                countD++;
                break;
                case "E":
                countE++;
                break;
                case "F":
                countF++;
                break;
                case "G":
                countG++;
                break;
                default:
                    break;
            }
        }

        return "A"+countA+"B"+countB+"C"+countC+"D"+countD+"E"+countE+"F"+countF+"G"+countG;
    }
}

