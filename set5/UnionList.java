
package set5;

public class UnionList {
    class LinkedNode {
        int value;
        LinkedNode linkedNode;
        public LinkedNode(int value, LinkedNode linkedNode){
            this.value = value;
            this.linkedNode = linkedNode;
        }
    }
    
    
    LinkedNode first;
    LinkedNode second;
    
    
    public boolean containsOf(LinkedNode node, int val) {
        if(node == null) {
           return false;
        }
        if(node.value == val)return true;
        return containsOf(node.linkedNode, val);
    }
    LinkedNode union;
    LinkedNode intersect;
    LinkedNode expect;
    public void union(LinkedNode node, boolean state) {
        if(node == null)return;
        union(node.linkedNode, state);
        if(!containsOf(union, node.value)){
            union = new LinkedNode(node.value, union);
        } else {
            intersect = new LinkedNode(node.value, intersect);
        }
        if(state){
            if(node.value%2!=0){
                expect = new LinkedNode(node.value, expect);
            }
        } else {
            if(node.value%2==0){
                expect = new LinkedNode(node.value, expect);
            }
        }
    }
    
    public void println(LinkedNode node){
        if(node == null)return;
        println(node.linkedNode);
        System.out.print(node.value+" ");
    }
    
    public void init(){
        int a1[] = new int[]{1,3,4,5,6,8,9};
        int a2[] = new int[]{1,5,8,9,2};
        
        for(int i : a1){
            first = new LinkedNode(i, first);
        }
        for(int i : a2){
            second = new LinkedNode(i, second);
        }
        System.out.print("\nUNION : "); union(first, true); union(second, false);println(union);
        System.out.print("\nIntercept : ");println(intersect);
        System.out.print("\nExpect : ");println(expect);
    }
    public static void main(String art[]) {
        UnionList unionLObj = new UnionList();
        unionLObj.init();
    }
}
