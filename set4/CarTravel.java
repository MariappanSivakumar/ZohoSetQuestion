
package set4;

public class CarTravel {
    public void init() {
        System.out.print("\n Enter the litre petrol in the car : ");
        int carpetrol = new java.util.Scanner(System.in).nextInt();
        System.out.print("\n Enter the distance...:");
        int distance[] = new int[3];
        for(int i = 0;i<3;i++){
            distance[i] = new java.util.Scanner(System.in).nextInt();
        }
        System.out.print("\n Enter the petrol...:");
        int petrol[] = new int[3];
        for(int i = 0;i<3;i++){
            petrol[i] = new java.util.Scanner(System.in).nextInt();
        }
        
        for(int i=0;i<3;i++){
            carpetrol -= distance[i];
            if(carpetrol<0){
                System.out.println("Sorry Out of Fuel");
                break;
            }
            carpetrol += petrol[i];
        }
        System.out.println("Car Have Remaing Petrol : "+carpetrol);
    }
    public static void main(String art[]) {
        new CarTravel().init();
    }
}
