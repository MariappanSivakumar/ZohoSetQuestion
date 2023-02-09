
package set6;

public class MagicNumber {
    public boolean isMagicNumber(String n1, String n2) {
        char c1[] = n1.toCharArray();
        char c2[] = n2.toCharArray();
        java.util.Arrays.sort(c1);
        java.util.Arrays.sort(c2);
        return java.util.Arrays.equals(c1, c2);
    }
    public void init() {
        for(int i = 1; i<=100000; i++){
            if( isMagicNumber(""+i, (""+i*i*i))){
                System.out.println(i);
            }
        }
    }
    public static void main(String art[]) {
        new MagicNumber().init();
    }
}
