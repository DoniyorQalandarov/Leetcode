import java.util.Scanner;

public class StringsExam {
    public static void main(String[] args) {
        String s = "Salom";
        System.out.println(s);//1-obekt

        System.out.println(s.concat(" dunyo"));//2-obekt
        StringBuilder sb = new StringBuilder("Salom");
        sb.append(" dunyo");
    }
}
