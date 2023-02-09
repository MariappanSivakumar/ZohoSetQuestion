
package set8;

public class AlternateSort {
    public void init() {
        int nums[] = {1,2,3,4,5,6,7};
        for(int i=0;i<nums.length;i+=2){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] < nums[j]){
                    nums[j] = nums[i] + nums[j] - (nums[i] = nums[j]);
                }
                if(nums[i+1] > nums[j]){
                    nums[j] = nums[i+1] + nums[j] - (nums[i+1] = nums[j]);
                }
            }
        }
        System.out.println(java.util.Arrays.toString(nums));
    }
    public static void main(String art[]){
        new AlternateSort().init();
    }
}
