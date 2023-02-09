
package set7;

public class SortDate {
    public int fillter(String date){
        String result = "";
        String temp = "";
        for(int i=0;i<date.length();i++){
            if(date.charAt(i)=='/'){
               result = temp + result;
               temp = "";
            } else {
                temp += date.charAt(i);
            }
        }
        return Integer.parseInt(result);
    }
    public void init() {
        
        String date[] = {"10/03/2000", "15/07/2001", "09/01/2001", "10/10/2000"};
        
        for(int i=0;i<date.length;i++){
            for(int j=i+1;j<date.length;j++){
                if(fillter(date[i]+"/") > fillter(date[j]+"/")){
                     String temp = date[i];
                     date[i] = date[j];
                     date[j] = temp;
                }
            }
        }
        System.out.println(java.util.Arrays.toString(date));
    }
    static public void main(String art[]) {
        new SortDate().init();
    }
}
