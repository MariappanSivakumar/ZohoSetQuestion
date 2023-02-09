package set4;

public class XOPattern {

    public void init() {

        System.out.print("M = ");
        int m = new java.util.Scanner(System.in).nextInt();
        System.out.print("N = ");
        int n = new java.util.Scanner(System.in).nextInt();


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if((i <= j && j<=n-i-1) || (j>=n-i-1 && j<=i)){
                    System.out.print(i%2==0 ? "X " : "O ");
                } else {
                    System.out.print(j%2==0 ? "X " : "O ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String ar[]) {
        new XOPattern().init();
    }
}
