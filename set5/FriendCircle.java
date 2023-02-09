
package set5;

public class FriendCircle {
    
    public void init() {
        java.util.List<String> withFriend = new java.util.ArrayList();
        System.out.print("\nEnter the how many friend : ");
        int n = new java.util.Scanner(System.in).nextInt();
        java.util.List<String> friend = new java.util.LinkedList(); 
        for(int i=0;i<n;i++){
            System.out.print("\nEnter the Friend name : ");
            friend.add(new java.util.Scanner(System.in).nextLine());
            System.out.println("Enter the relative friend");
            int iter = new java.util.Scanner(System.in).nextInt();
            for(int j=0;j<iter;j++){
                System.out.println("Enter the friend one by one");
                String temp = new java.util.Scanner(System.in).nextLine();
                if(!friend.contains(temp)) {
                    withFriend.add(temp);
                }
            }
        }
        System.out.println(withFriend);
    }
    public static void main(String ar[]){
        new FriendCircle().init();
    }
}
