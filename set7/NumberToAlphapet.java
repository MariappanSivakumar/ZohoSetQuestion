
package set7;

public class NumberToAlphapet {
    
    public boolean isValid(String s){
        return Integer.parseInt(s) >= 1 && Integer.parseInt(s) <= 26;
    }
    
    String alphapet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    public void comp(String nums, int index, java.util.List<String> list){
        if(index == nums.length()){
            list.forEach((i) -> {
                System.out.print(alphapet.charAt(Integer.parseInt(i)-1));
            });
            System.out.println(" "+list);
            return;
        }
        for(int i=index;i<nums.length();i++){
            if(isValid(nums.substring(index,i+1))){
                list.add(nums.substring(index, i+1));
                comp(nums, i+1, list);
                list.remove(list.size()-1);
            }
        }
    }
    
    public void init(){
        String nums = "129";
        comp(nums, 0, new java.util.ArrayList());
    }
    
    public static void main(String ar[]){
        new NumberToAlphapet().init();
    }
}
