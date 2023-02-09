
package set6;

public class ArrayRotate {
    public void init() {
        int nums[ ] = {1,2,3,4,5,6,7,8,9};
        for(int i=0;i<5;i++){
            int temp = nums[0];
            for(int j=1;j<nums.length;j++) {
                nums[j-1] = nums[j];
            }
            nums[nums.length-1] = temp;
        }
        System.out.println(java.util.Arrays.toString(nums));
    }
    public static void main(String ar[]){
        new ArrayRotate().init();
    }
}
