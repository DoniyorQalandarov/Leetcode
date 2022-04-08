package leetCodeExamples;

import java.util.Arrays;

public class RunningSumArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(array(new int[]{4, 5, 6})));
    }
    public static int[] array(int[] RunArray) {
        int[] newArray = new int[RunArray.length];
        for (int i = 0; i < RunArray.length; i++) {
            for (int j = 0; j <= i; j++) {
                newArray[i] = newArray[i] + RunArray[j];
            }
        }
        return newArray;
    }
}
