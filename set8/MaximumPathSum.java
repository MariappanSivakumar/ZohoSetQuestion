
package set8;

public class MaximumPathSum {
    public void init() {
        int nums[][] = {
            {
                15, 25, 30
            },
            {
                45, 25, 1000
            }, 
            {
                70, 75, 10
            }
        };
        
       for(int i=1;i<nums.length;i++){
           nums[0][i] += nums[0][i-1];
           nums[i][0] += nums[i-1][0];
       }
       for(int i=1;i<nums.length;i++) {
           for(int j=1;j<nums.length;j++){
               if(nums[i][j]+nums[i-1][j] < nums[i][j-1]+nums[i][j]){
                   nums[i][j] += nums[i][j-1];
               } else {
                   nums[i][j] += nums[i-1][j];
               }
           }
       }
       System.out.println(nums[nums.length-1][nums.length-1]);
    }
   public static void main(String ar[]) {
       new MaximumPathSum().init();
   } 
}
