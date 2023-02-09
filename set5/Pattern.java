
package set5;

public class Pattern {
    public void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public void pattern2(int n){
        int odd = 1;
        int even = 2;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(i%2==0){
                    System.out.print(odd+" ");
                    odd+=2;
                } else {
                    System.out.print(even+" ");
                    even+=2;
                }
            }
            System.out.println();
        }
    }
    public void init(){
        pattern1(5);
        pattern2(5);
    }
    public static void main(String ar[]){
        new Pattern().init();
    }
}
