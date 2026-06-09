package Basics.DoubleLL;

class Node{
    int data;
    Node next ;
    Node prev ;

    Node (int data1 ,Node next1 ,Node preq1){
      this.data = data1;
      this.next = next1;
      this.prev = preq1;
    }

    Node (int data1 ){
        this.data = data1;
        this.next = null;
        this.prev = null;
    }
}
public class InsertionDLL {
    
      public static Node arr2DLL(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;

        for(int i = 1 ; i<arr.length ; i++){
            Node temp = new Node(arr[i],null,prev);
            prev.next = temp;
            prev=temp;
        }

        return head;
    }

    public static void print(Node head){
        while(head!=null){
            System.out.print (head.data + " < == > " + (head.next==null? "null " : " "));
            head=head.next;
        }

    }

    public static Node insertHead(Node head , int ele){

        Node el = new Node(ele);
        el.next = head;
        head.prev = el;
        return el;
    }

    public static Node insertTail(Node head , int ele){
        Node temp = head ;

        while(temp.next != null){
            temp = temp.next;
        }

        Node el = new Node(ele);
        temp.next = el;
        return head;
    }

       public static Node insertBeforeTail(Node head , int ele){
      
        Node temp = head ; 

        while(temp.next!= null){
           temp=temp.next;
        }
        Node el = new Node(ele);
        el.prev = temp.prev;
        el.next = temp;
        temp.prev.next = el;
        temp.prev = el;

        return head ;
        
    }

    public static Node insertAtKthNode (Node head , int ele , int k ){

        int cnt = 0 ; 
        Node temp = head ; 

        if(k == 1 ){
            Node result = insertHead(head , ele);
            return result ;
        }


        while(temp!= null){
            cnt++;

            if(cnt == k ){
                break ; 
            }
            temp = temp.next ; 
        }
        Node el = new Node(ele);
        Node back = temp.prev;

        back.next = el;
        el.next = temp;
        temp.prev=el;
        el.prev = back;

        return head;
    }


    public static Node InsertBeforeNode(Node head ,int ele, int data){
      
        Node temp = head ; 

        while(temp.next != null){
            if(temp.data == data){
                break;
            }
            temp = temp.next ;
        }

        Node el = new Node(ele,temp,temp.prev);
        temp.prev.next = el;
        temp.prev = el;

        return head;


    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        Node result = arr2DLL(arr);
        Node result1 = InsertBeforeNode(result, 26 ,4);
        print(result1);
    }

}
