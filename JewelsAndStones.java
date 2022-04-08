package leetCodeExamples;

public class JewelsAndStones {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("ZZ","Zz"));
    }
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        char[] jewelChar = jewels.toCharArray();
        char[] stonesChar = stones.toCharArray();
        for(int i = 0; i < jewelChar.length;i++) {
            for(int j = 0; j < stonesChar.length;j++) {
                if(stonesChar[j] == jewelChar[i]) {
                    ++ count;
                }
            }
        }
        return count;
    }
}
