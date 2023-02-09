
package set8;

public class SortBasedOnFacter {
    
    public int facterCount(int num){
        int count = 0;
        for(int i=2;i<num/2;i++){
            if(num%i==0)count++;
        }
        return count;
    }
    
    public void init() {
        
        int num[] = {8, 2, 3, 12, 16};
        int dp[] = new int[num.length];
        
        for(int i=0;i<num.length;i++){
            dp[i] = facterCount(num[i]);
        }
        
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(dp[i]<dp[j]){
                    dp[j] = dp[i] + dp[j] - ( dp[i] = dp[j] );
                    num[j] = num[i] + num[j] - ( num[i] = num[j] );
                }
            }
        }
        System.out.println(java.util.Arrays.toString(num));
    }
    
    public static void main(String art[]){
        new SortBasedOnFacter().init();
    }
}
