
package set8;

public class SubString {
    
    java.util.List<String> list = new java.util.ArrayList();
    
    public void substr(String arr[], int index) {
        if(index == arr.length){
            System.out.println(list);
            return;
        }
        
        list.add(arr[index]);
        substr(arr, index+1);
        list.remove(list.size()-1);
        substr(arr, index+1);
    }
    public void init() {
        String arr[] = {"Hello","Sivarajavel", "Welcome", "To", "World"};
        substr(arr,0);
    }
    public static void main(String art[]) {
        new SubString().init();
    }
}
