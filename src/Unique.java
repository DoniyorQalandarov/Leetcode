import java.util.HashMap;

public class Unique{
    public static void main(String[] args) {
        HashMap<Integer,String> kalit  = new HashMap<>();
        kalit.put(1,"Bir");
        kalit.put(2,"Ikki");
        kalit.put(3,"Uch");
        kalit.put(4,"To'rt");
        kalit.put(4,"Four");
        System.out.println(kalit);
        HashMap<String,Integer> sinf = new HashMap<>();
        sinf.put("Bir",1);
        sinf.put("Ikki",2);
        sinf.put("Uch",3);
        sinf.put("Uch",3);
        System.out.println(sinf);
        System.out.println(sinf.values());
    }
}
