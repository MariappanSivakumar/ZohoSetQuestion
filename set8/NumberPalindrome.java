
package set8;

public class NumberPalindrome {
    
    String str1;
    String str2;
    public void isPalin(int n) {
        if(n==0)return;
        str1 += n%2==0 ? '0' : '1';
        isPalin(n>>1);
        str2 += n%2==0 ? '0' : '1';
    }
    public void init() {
        for(int i=1;i<100;i++){
            str1 = "";str2 = "";
            isPalin(i);
            if(str1.equals(str2)){
                System.out.println(str1+" "+str2);
                System.out.println(i);
            }
        }
    }
    
    public static void main(String ar[]) {
        new NumberPalindrome().init();
    }
}
