
package set7;

public class CyclicNumber {
    public boolean isCyclic(int n1, int n2){
        char c1[] = (""+n1).toCharArray();
        char c2[] = (""+n2).toCharArray();
        java.util.Arrays.sort(c1);
        java.util.Arrays.sort(c2);
        return java.util.Arrays.equals(c1, c2);
    }
    public void init() {
        for(int i=1;i<=10000000;i++){
            if(isCyclic(i,i*2)){
                System.out.println(i);
            }
        }
    }
    public static void main(String ar[]){
        new CyclicNumber().init();
    }
}
