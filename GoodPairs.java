package interfaces;

public class GoodPairs {
    public static void main(String[] args) {
        System.out.println(numIdenticalPairs(new int[]{1,2,2,1,1,3,4,3}));
    }
    public static int numIdenticalPairs(int[] nums) {
        int couple = 0;
        for(int i = 0;i < nums.length;i++) {
            for(int j = i + 1;j < nums.length;j++) {
                if(nums[i]==nums[j]) {
                    couple++;
                }
            }
        }
        return couple;
    }
}
