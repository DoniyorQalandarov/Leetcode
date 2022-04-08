package leetCodeExamples;

public class IpAddress {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("Hello.."));
    }
    public static String defangIPaddr(String address) {
        String newAddress = "";
        for(int i = 0; i < address.length(); i++){
            newAddress = address.replace(".","[.]");
        }
        return newAddress;
    }
}
}
