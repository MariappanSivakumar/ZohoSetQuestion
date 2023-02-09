
package set3;

public class IndexOf {
    public int indexOf(String word, String search){
        
        int leng = search.length();
        
        for(int i=0;i<word.length();i++){
            if(word.charAt(i) == search.charAt(0) && i+leng < word.length()){
                if(search.equals(word.substring(i, i+leng))) return i;
            }
        }
        return -1;
    }
    public void init() {
        String word = "testing12";
        String search = "1234";
        System.out.println(indexOf(word, search));
    }
    public static void main(String ar[]){
        new IndexOf().init();
    }
}
