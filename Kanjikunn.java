public class Kanjikunn {
    public static void main(String[] args) {
        int totalPrice = 12000;
        int numberOfMale = 3;
        int numberOfFemale = 3;

        int warikan = totalPrice / (numberOfMale+numberOfFemale);
        System.out.println("男性："+warikan+"円");
        System.out.println("女性："+warikan+"円");
    }
}
