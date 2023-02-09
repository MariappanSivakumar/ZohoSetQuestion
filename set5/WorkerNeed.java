package set5;

public class WorkerNeed {

    public void init() {
        double nums[][] = {
            {12.30, 1.30},
            {12.00, 1.00},
            {16.00, 17.00}
        };
        
        int count = 1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[j][0] <= nums[i][0] && nums[i][0] <= nums[j][1]) || (nums[j][0] <= nums[i][1] && nums[i][1] <= nums[j][1]))count++; 
            }
        }
        
        System.out.println("Worker Need : "+count);
    }

    public static void main(String ar[]) {
        new WorkerNeed().init();
    }
}
