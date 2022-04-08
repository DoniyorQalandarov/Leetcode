import java.util.ArrayList;
import java.util.Arrays;

public class Fill {
    public static void main(String[] args) {
        int arr[] = {5,8,9,4,6,7,3,1};
        ArrayList<String> list = new ArrayList<>();
        for (int x:arr)
        list.add(String.valueOf(x));
        System.out.println(list);
        System.out.println();
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
