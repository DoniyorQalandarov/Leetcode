public class Jewerlly {
    public static void main(String[] args) {
        System.out.println(stoneAndJewery("aA", "aAAbbbb"));
    }

    public static int stoneAndJewery(String ston, String jewery) {
        int count = 0;
        char[] stons = ston.toCharArray();
        char[] jewerys = jewery.toCharArray();
        for (int i = 0; i < ston.length(); i++) {
            for (int j = 0; j < jewery.length(); j++) {
                if (stons[i] == jewerys[j]) {
                    ++count;
                }
            }
        }
        return count;
    }
}
