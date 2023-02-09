package set1;

public class SearchWord {
    
    int left,right;
    int l,r;
    boolean flag;
    java.util.Set<String> with = new java.util.LinkedHashSet();
    public void search(char word[][], int i, int j, int index, String searchWord){
        
        if(index == searchWord.length()){
            with.add("Start With <"+left+","+right+"> \nEnd With <"+l+","+r+">");
            return;
        }
        
        if(i<0 || j<0 || i>=word.length || j>=word[i].length || word[i][j]!=searchWord.charAt(index))return;
        
        l=i;r=j;
        search(word, i+1, j, index+1, searchWord);
        search(word, i-1, j, index+1, searchWord);
        search(word, i, j+1, index+1, searchWord);
        search(word, i, j-1, index+1, searchWord);
    }
    public void init() {
        char word[][] = {{'w', 'e', 'L', 'C', 'O'},
        {'M', 'E', 'T', 'O', 'O'},
        {'O', 'H', 'O', 'C', 'O'},
        {'O', 'P', 'O', 'R', 'A'},
        {'T', 'O', 'O', 'n'}};
        
        String searchWord = "TOO";
        for(int i=0;i<word.length;i++){
            for(int j=0;j<word[i].length;j++){
                if(word[i][j] == searchWord.charAt(0)){
                    left = i;right=j;
                    search( word, i, j, 0, searchWord);
                }
            }
        }
        for(String s : with){
            System.out.println(s);
        }
    }

    public static void main(String art[]) {
        new SearchWord().init();
    }
}
