
package set3;

public class MergeSortedArray {
    
    class Node {
        Node node;
        int val;
        public Node(Node node, int val){
            this.node = node;
            this.val = val;
        }
    }
    
    public void println(Node n){
        if(n==null)return;
        println(n.node);
        System.out.print(n.val+" ");
    }
    
    Node store; 
    public void init(){
        int arr1[] = {2,4,5,6,7,9,10,13};
        int arr2[] = {2,3,4,5,6,7,8,9,11,15};
        
        int l = 0;
        int r = 0;
        while(l<arr1.length && r<arr2.length){
            if(arr1[l] == arr2[r]){
                store = new Node( store, arr1[l]);
                l = l<arr1.length ? l+1 : l; r = r<arr2.length ? r+1 : r; 
            } else if(arr1[l] < arr2[r]) {
                store = new Node(store, arr1[l]);
                l = l<arr1.length ? l+1 : l; 
            } else {
                store = new Node(store,arr2[r]);
                r = r<arr2.length ? r+1 : r;
            }
        }
        while(l!=arr1.length){
            store = new Node(store, arr1[l++]);
        }
        while(r!=arr2.length){
            store = new Node(store, arr2[r++]);
        }
        println(store);
    }
    
    public static void main(String art[]){
        new MergeSortedArray().init();
    }
}
