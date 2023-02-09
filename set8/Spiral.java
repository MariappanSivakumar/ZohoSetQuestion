
package set8;

public class Spiral {
    
    public void init() {
        System.out.print("\bEnter the Number ... : ");
        int n = new java.util.Scanner(System.in).nextInt();
        int freq = n;
        int num = n;
        n=n*2-1;
        for (int i = 0; i < n; i++) {
            int non = num;
            boolean flag = false;
            for (int j = 0; j < n; j++) {
                if((i <= j && j<=n-i-1) || (j>=n-i-1 && j<=i)){
                    System.out.print(" "+freq);
                    if(!flag){
                        non++;
                        flag = !flag;
                    }
                } else {
                    System.out.print(" "+(flag == false ? non-- : non++));
                }
            }
            freq = i<n/2 ? freq-1 : freq+1;
            System.out.println();
        }
    }
    
    public static void main(String ar[]) {
        new Spiral().init();
    }
}
