import java.util.*;
import java.util.List;

public class List1 {
    public static void main(String[] args) {
        String[] mevalar = {"Olma", "Anor", "Bexi", "Shaftoli", "Nok"};
        List<String> list = new ArrayList<>();
        for (String x : mevalar) {
            list.add(x);
        }
        String[] mevalar2 = {"Anor", "Nok"};
        List<String> list1 = new ArrayList<>();
        for (String x : mevalar2) {
            list1.add(x);
        }
        list.addAll(list1);
        royhatKorsatish(list);
        royhatOchirish(list);
        royhatAylantirish(list);
    }
    public static void royhatKorsatish(List<String> toplam) {
        for (String x:toplam)
            System.out.printf("%s, ",x);
        System.out.println();
    }
    public static void royhatOchirish(List<String> toplam) {
        toplam.subList(1,5).clear();
        for (String x:toplam)
        System.out.printf("%s,",x);
        System.out.println();
    }
    public static void royhatAylantirish(List<String> toplam) {
        ListIterator<String> iterator = toplam.listIterator(toplam.size());
        while (iterator.hasPrevious()) {
            System.out.printf("%s, ",iterator.previous());
        }
    }
}