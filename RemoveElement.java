package leetCodeExamples;

public class RemoveElement {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{5,1,2,5,6,4},6));

        }
    public static int removeElement(int[] nums, int val) {

        int k = 0;
        for(int i=0;i<nums.length;i++){

            if(nums[i]!=val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
