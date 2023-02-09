package set1;

public class SortBasedOnWeight {

    public int weight(int n){
        int freq = 0;
        if(n%4==0 && n%6==0)freq++;
        if(n%2==0)freq++;
        if((Math.sqrt(n)==Math.round(Math.sqrt(n))))freq++;
        return freq;
    }
    private void init() {
        int numbers[] = {10, 36, 54, 89, 12};
        
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(weight(numbers[i]) > weight(numbers[j])){
                    int temp = numbers[i];
                    numbers[i]= numbers[j];
                    numbers[j]=temp;
                }
            }
        }
        System.out.println(java.util.Arrays.toString(numbers));
    }

    public static void main(String art[]) {
        new SortBasedOnWeight().init();
    }
}
