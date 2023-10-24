public class Kanjikunn {
    public static void main(String[] args) {
        final int gentlemanlyPayment = 500;
        final int totalPrice = 12000;
        int numberOfMale = 3;
        int numberOfFemale = 3;
        int malePrice = 0;
        int femalePrice = 0;
        

        int warikanPrice = totalPrice / (numberOfMale+numberOfFemale);
        malePrice = warikanPrice + gentlemanlyPayment;
        femalePrice = warikanPrice - gentlemanlyPayment;
        System.out.println("男性："+malePrice+"円");
        System.out.println("女性："+femalePrice+"円");
    }
}
