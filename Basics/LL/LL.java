package Basics.LL;

class Node{
      int data;
      Node next;

      Node(int data1 , Node next1){
        this.data = data1;
        this.next = next1;
      }

      Node(int data1){
        this.data=data1;
      }
}




public class LL {

     public static void main(String[] args) {
     
        Node obj = new Node(3, null);
        System.out.println(obj.data);

        Node Obj = new Node(5,null);
        System.out.println(Obj.data);
        
        
    }
 
}

   