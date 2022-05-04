package leetCodeExamples;

import java.util.Arrays;

public class AddTwoNumbers {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(addNumber(new int[]{1, 4, 3}, new int[]{5, 6, 8})));
    }
    public static int[] addNumber(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length];
        for (int i = 0; i < arr1.length;i++) {
            arr[i] = arr1[i] + arr2[i];
        }
        return arr;
    }
}
