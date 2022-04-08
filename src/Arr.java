import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(massiv(new int[]{4, 0, 0, 5, 4})));
    }

    public static int[] massiv(int nums[]) {
        int arr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == 0) {
                    arr[i] = nums[nums.length-1];
                }
            }
        }
        return arr;
    }
}
