
package set4;

public class NumberToWords {
    
    String englishNum[] = {"Zero","One", "Two", "Three","Four","Five","Six","Seven","Eight","Nine"};
    String tens[] = {"", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    public void letterChenge(int number){
        char c[] = (""+number).toCharArray();
        for(char s : c){
            System.out.print(englishNum[s-'0']+" ");
        }
    }
    public void init() {
        System.out.print("\n Enter the number : ");
        int number = new java.util.Scanner(System.in).nextInt();
        letterChenge(number);
    }
    public static void main(String art[]) {
        new NumberToWords().init();
    }
}
