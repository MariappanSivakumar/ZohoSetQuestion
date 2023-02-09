
package set5;

public class Perumation {
    
    int max = Integer.MIN_VALUE;
    public boolean isPrime(int n) {
        for(int i=2;i<=n/2;i++){
            if(n%i==0)return false;
        }
        return true;
    }
    
    public void compination(char nums[], int index){
        if(nums.length-1 == index){
            int n = Integer.parseInt(new String(nums));
            if(isPrime(n)){
                max = Math.max(max, n);
            }
            return;
        }
        for(int i=index;i<nums.length;i++) {
            swap(nums, i, index);
            compination(nums, index+1);
            swap(nums, i, index);
        }
    }
    
    public void swap(char nums[], int i, int j){
        char c = nums[i];
        nums[i] = nums[j];
        nums[j] = c;
    }
    public void init() {
        char nums[] = { '4', '6', '1', '9'};
         compination(nums, 0);
         System.out.println("ANSWER IS : "+max);
    }
    public static void main(String ar[]) {
        new Perumation().init();
    }
}
