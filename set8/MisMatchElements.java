
package set8;

public class MisMatchElements {
    public void init() {
        char c1[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
        char c2[] = { 'a', 'b', 'd', 'e', 'e', 'g', 'g', 'i', 'i'};
        
        for(int i=0;i<c1.length;i++) {
            if( c1[i] != c2[i]) {
                System.out.print(c1[i]+""+c2[i]+" ");
            }
        }
        System.out.println();
    }
    public static void main(String ar[]){
        new MisMatchElements().init();
    }
}
