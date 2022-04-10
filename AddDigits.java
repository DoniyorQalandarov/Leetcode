package leetCodeExamples;

public class AddDigits {
    public static void main(String[] args) {
        System.out.println(digit(9));
    }

    public static int digit(int num) {
        int natija;
        int qoldiq;
        int raqam1;
        int raqam2;
        if (num % 9 == 0) {
            raqam1 = num / 10;
            raqam2 = num % 10;
            qoldiq = raqam1 + raqam2;
            natija = qoldiq / 2;
        } else {
            return num % 9;
        }
        return natija;
    }
}
