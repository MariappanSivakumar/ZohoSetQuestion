
package set8;

public class GrandChild {
    public void child(String generation[][], int count, String father){
        
        for (String[] generation1 : generation) {
            if (generation1[1].equals(father)) {
                child(generation, count+1, generation1[0]);
                if(count == 2){
                    System.out.println(generation1[0]);
                }
            }
        }
    }
    public void init(){
        String generation[][] = {
            {"luke", "shaw"},
            {"wayne","rooney"},
            {"rooney","ronaldo"},
            {"shaw","rooney"}
        };
        child(generation, 1, "rooney");
    }
    
    public static void main(String art[]){
        new GrandChild().init();
    }
}
