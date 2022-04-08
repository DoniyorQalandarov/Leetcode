package leetCodeExamples;

public class Polindrom {
    public static void main(String[] args) {
        System.out.println(booleanx(120));
    }

    public static boolean booleanx(int x) {
        if (x < 0) {
            return false;
        }
        int z = x;
        int qoldiq = 0;
        while (x > 0) {
            qoldiq = qoldiq * 10 + x % 10;//q1=1,q2=12,q3=121
            x = x / 10;
        }
        return qoldiq == z;
    }
}

