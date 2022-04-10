package leetCodeExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FizzBuss {
    public static void main(String[] args) {
        System.out.println(divid(15));
    }

    public static List<String> divid(int num) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if ( i% 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 5 == 0) {
                list.add("Buss");
            } else if (i % 3 ==0) {
                list.add("Fizz");
            } else
                list.add(String.valueOf(i));
        }
        return list;
    }
}
