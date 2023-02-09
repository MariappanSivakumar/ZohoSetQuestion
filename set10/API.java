package set10;

class Frequency {
    public static java.util.Map<Integer,Integer> map = new java.util.HashMap();
    public Frequency(int key){
        map.put(key, map.getOrDefault(key, 0)+1);
    }
}

public class API {
    Frequency fre;
    public void init() {
        for(int i=0;i<7;i++) {
            fre = new Frequency(new java.util.Scanner(System.in).nextInt());
        }
        System.out.println(fre.map);
    }
    public static void main(String ar[]) {
        new API().init();
    }
}
