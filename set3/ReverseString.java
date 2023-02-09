
package set3;

public class ReverseString {
    
    public void reverse(String word[], int index){
        if(index == word.length)return;
        reverse(word, index+1);
        System.out.print(word[index]+" ");
    }
    
    public void init(){
        String word[] = {"One","Two","Three","Four","Five"};
        reverse(word, 0);
    }
    
    public static void main(String art[]) {
        new ReverseString().init();
    }
}
