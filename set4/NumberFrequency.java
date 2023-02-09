
package set4;

public class NumberFrequency {
    
    public void init(){
        System.out.print("\nEnter the Number...:");
        int iter = new java.util.Scanner(System.in).nextInt();
        String value = "1 ";
        for(int i=0;i<iter;i++){
            System.out.println(value);
            int count = 1;
            String temp = "";
            char val[] = value.toCharArray();
            for(int j=1;j<=val.length-1;j++){
                if(value.charAt(j) == value.charAt(j-1)){
                    count++;
                } else {
                    temp += count+""+value.charAt(j-1);
                    count = 1;
                }
            }
            value = temp+" ";
        }
    }
    public static void main(String art[]) {
        new NumberFrequency().init();
    }
}
