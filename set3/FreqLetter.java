
package set3;

public class FreqLetter {
    
    public boolean isAlpha(char c){
        return c>='a' && c<='z' || c>='A' && c<='Z' || c==' '; 
    }
    public void init(){
        String word = "a1b1c1 ";
        String num = "";
        char letter = ' ';
        for(int i=0;i<word.length();i++){
            if(isAlpha(word.charAt(i))){
                if(!num.equals("")){
                    for(int j=0;j<Integer.parseInt(num);j++){
                        System.out.print(letter);
                    }
                }
                letter = word.charAt(i);
                num="";
            } else {
                num += word.charAt(i);
            }
        }
    }
    public static void main(String art[]){
        new FreqLetter().init();
    }
}
