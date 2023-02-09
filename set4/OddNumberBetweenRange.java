
package set4;

import java.util.Scanner;

public class OddNumberBetweenRange {
    
    public void init(){    
        System.out.print("\nEnter the Starting Value : ");
        int start = new Scanner(System.in).nextInt();
        System.out.print("\nEnter the Ending Value : ");
        int end   = new Scanner(System.in).nextInt();
        
        start = start%2 ==0 ? start+1 : start;
        
        for(int i=start;i<=end;i+=2){
            System.out.print(i+" ");
        }
    }
    public static void main(String art[]){
        new OddNumberBetweenRange().init();
    }
}
