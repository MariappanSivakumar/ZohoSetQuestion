
package set3;

public class XPattern {
    
    // Note the This algorithms only works for odd number length of words
    // Time Complexcity O(n*n)
    // Space Complexcity O(1)
    
    public void OnSquare(){
        char word[] = "ABCDEFG".toCharArray();
        for(int i =0;i<word.length;i++){
            for(int j=0;j<word.length;j++){
                if(i==j || j==word.length-i-1){
                    System.out.print(word[i]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    // Time Complexcity O(n)
    // Space Complexcity O(n*n)
    public void On(){
        char word[] = "ABCDEFG".toCharArray();
        int leng = word.length;
        char dp[][] = new char[leng][leng];
        for(int i=0;i<word.length;i++){
            dp[i][i] = word[i];
            dp[i][leng-i-1] = word[leng-i-1];
            System.out.println(java.util.Arrays.toString(dp[i]));
        }
    }
    public void init(){
        OnSquare();
        On();
    }
    public static void main(String art[]){
        new XPattern().init();
    }
}
