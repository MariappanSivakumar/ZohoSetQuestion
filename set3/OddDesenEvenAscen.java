
package set3;

public class OddDesenEvenAscen {
    
    public void init() {
        
        int nums[] = {1,2,3,4,5,6,7,8,9};
        
        for(int i=0;i<nums.length;i+=2){
            for(int j=i+1;j<nums.length;j+=2){
                
                if(j+1<nums.length && nums[i] < nums[j+1]){
                    nums[j+1] = nums[i] + nums[j+1] - (nums[i] = nums[j+1]);
                }
                
                if(i+1 < nums.length && nums[i+1] > nums[j]){
                    nums[j] = nums[i+1] + nums[j] - (nums[i+1] = nums[j]);
                }
            }
        }
        System.out.println(java.util.Arrays.toString(nums));
    }
    
    public static void main(String art[]) {
        new OddDesenEvenAscen().init();
    }
}
