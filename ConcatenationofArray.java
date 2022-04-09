package leetCodeExamples;

import java.util.Arrays;

public class ConcatenationofArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getConcatination(new int[]{1, 2, 2, 1})));
    }
    public static int[] getConcatination(int []array ) {
        int newArray[] = new int[array.length*2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
            newArray[i + array.length] = array[i];
        }
        return newArray;
    }
}
