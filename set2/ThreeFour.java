
package set2;

public class ThreeFour {
    public void println(int nums[]){
        for(int i : nums){
            System.out.print(i==1 ? '4' : '3');
        }
        System.out.println();
    }
    public void interChenge(int num[]){
        for(int i=num.length-1;i>=0;i--){
            if(num[i] == 2){
                num[i] = 0;
                if(i>0)num[i-1]++;
            }
        }
    }
    public void compination(int n){
        int num[] = new int[n];
        int iter = 2<<n-1;
        for(int i=0;i<iter;i++){
            println(num);
            if(num[num.length-1]++==1){
                interChenge(num);
            }
        }
    }
    public void init(){
        for(int i=1;i<=5;i++){
            compination(i);
        }
    }
    public static void main(String ar[]){
        new ThreeFour().init();
    }
}
