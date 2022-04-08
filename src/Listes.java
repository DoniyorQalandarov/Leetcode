import java.awt.desktop.ScreenSleepListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listes {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Bir");
        list.add("Ikki");
        list.add("Uch");
        list.add("To'rt");
        list.add("Besh");

//        System.out.println(list.hashCode());
//        System.out.println(list.isEmpty());
//        System.out.println(Arrays.toString(list.toArray()));
//        list.clear();
//        System.out.println(list);
//        System.out.println(list.isEmpty());li
        list.remove(4);
        System.out.println(list);
        list.contains("Besh");
        System.out.println(list);


    }
}
