
// // public class LinkedList {
// //     public class Node{
// //         int data;
// //         Node next;

// //         public Node(int data){
// //             this.data=data;
// //             this.next=null;
// //         }
// //     }
// //     public static Node head;
// //     public static Node tail;
// //     static int size=0;

// //     public void Addfirst(int data){
// //         // create node 
// //         //n=> head
// //         //head

// //     Node newnode= new Node(data);
// //     size++;
// //     if(head==null){
// //         head=tail=newnode;
// //     }
// //     newnode.next=head;
// //     head=newnode;

// //     }

// //     public void addLast(int data){
       
// //         Node newnode= new Node(data);
// //         size++;
// //         if(tail== null){
// //             head=tail=newnode;
// //         }
// //         tail.next=newnode;
// //         tail=newnode;

// //     }

// //     public void printll(){
// //      Node temp= head;
// //      if(head==null){
// //         System.out.println("no");
// //         return;
// //      }
// //      while(temp!=null){
// //         System.out.print(temp.data+"->");
// //         temp=temp.next;
// //      }
// //      System.out.print("null");
// //      System.out.println();
// //     }

// //     public  void addmiddle(int i, int data){
// //         if(i==0){
// //             Addfirst(data);
// //             return;
// //         }
// //         Node newnode= new Node(data);
// //         size++;
// //         int id=0;
// //         Node temp= head;
// //         while(id<i){
// //             temp=temp.next;
// //             id++;
// //         }
// //         //id=prev
// //         newnode.next=temp.next;
// //         temp.next=newnode;
     
       

// //     }

// //     public int removeFirst(){
// //         if(size==0){
// //             return 0;
// //         }else if(size==1){
// //         int val=head.data;
// //         head= head.next;
// //         size=0;
// //         return val;
            
// //         }
// //         size--;
// //        int val=head.data;
// //         head= head.next;
// //       return val;

// //     }

// //     public int removeLast(){
// //         if(size==0){
// //             System.out.println("empty");
// //             return 0;
// //         }
// //         if(size==1){
// //             int val=tail.data;
// //             head=tail=null;
// //             size=0;
// //             return val;
// //         }

// //         Node prev= head;
// //         for(int i=0;i<size-2;i++){
// //             prev=prev.next;
// //         }
// //         int val= prev.next.data;
// //         prev.next=null;
// //         tail=prev;
// //         size--;
// //         return val;
// //     }

// //     public int search( int key){
// //         //1-2-3-4-5
// //         int i=0;
// //         Node temp=head;
// //         while(temp!=null){
// //             if(temp.data==key){
// //                 return i;
// //             }
// //             else{
// //                 temp=temp.next;
// //                 i++;
// //             }
// //         }
// //         return -1;
// //     }

// //     public int helper(Node head , int key){
// //         if(head==null){
// //             return -1;
// //         }
// //         if(head.data==key){
// //             return 0;
// //         }
// //       int idx= helper(head.next, key);
// //       if(idx==-1){
// //         return -1;
// //       }
// //       return idx+1;
// //     }

// //     public int recursivesearch(int key){
// //         return helper(head,key);
// //     }

// //     public void reverse(){
// //         Node prev=null;
// //         Node curr= head;
// //         Node next;
// //         while(curr!=null){
// //            next=curr.next;
// //            curr.next=prev;
// //            prev=curr;
// //            curr=next;

// //         }
// //         head=prev;

// //     }

// //     public void removenfromend(int n){
// //         int sz=0;
// //         Node temp=head;
// //         while(temp!=null){
// //             temp=temp.next;
// //             sz++;
// //         }
// //         System.out.println(sz);
// //         if(sz==n){
// //             head=head.next;
// //             return;
// //         }

// //         int itorem=sz-n;
// //         Node prev=head;
// //        int i=1;
// //        while(i<itorem){
// //         prev=prev.next;
// //         i++;
// //        }

// //         prev.next=prev.next.next;
// //         return;

// //     }

// //     public Node Findmid(Node head){
// //         Node sp=head;
// //         Node fp=head;

// //         while(fp!=null &&fp.next!= null){
// //             sp=sp.next;
// //             fp=fp.next.next;
// //         }
// //         return sp;
// //     }

// // //     public boolean ispalindrome(){
// // //         if(head==null || head.next==null){
// // //             return true;
// // //         }


// // //         //1 mid calculate

// // //         Node midp= Findmid(head);                
// // //         // reverse 2nd half 3 variables 4 steps
// // //         Node prev= null;
// // //         Node curr=midp;
// // //         Node next;

// // //         while(curr!=null){
// // //             next=curr.next;
// // //             curr.next=prev;
// // //             prev=curr;
// // //             curr=next;

// // //         }
// // //         Node righthead=prev;
// // //         Node lefthead=head;


// // //   while(righthead!=null){
// // //     if(righthead.data!=lefthead.data){
// // //         return false;
// // //     }
// // //     righthead=righthead.next;
// // //     lefthead= lefthead.next;

// // //   }
// // //   return true;


// // //         // lft data== right data or not
// // //     }
  

// // public static boolean isloop(){
// //     Node slow= head;
// //     Node fast=head;
// //     while(fast!=null && fast.next!=null){
// //         slow=slow.next;
// //         fast=fast.next.next;
// //         if(slow == fast){
// //             return true;
// //         }
// //     }
// //     return false;
// // }
// //    public static void main(String args[]){
// //     LinkedList ll= new LinkedList();
// //    ll.addLast(3);
// //    ll.addLast(2);
// //    ll.addLast(2);
// //    ll.addLast(3);
// //    ll.printll();

  
// // //    ll.removeFirst();
// // //    ll.printll();
// // //    System.out.println(ll.size+"=size");
// // //    ll.removeLast();
// // //    ll.printll();
// // //    System.out.println(ll.size+"=size");
// //    //System.out.println(ll.search( 20));
// // //    System.out.println(ll.recursivesearch(1));
// // //   

// // System.out.println(ll.isloop());
// //    }
// // }
// public class LinkedList {
//     static Node head;

//     static class Node {
//         int data;
//         Node next;

//         Node(int d) {
//             data = d;
//             next = null;
//         }
//     }

//     public static void addLast(int new_data) {
//         Node new_node = new Node(new_data);

//         if (head == null) {
//             head = new_node;
//             return;
//         }

//         Node last = head;
//         while (last.next != null) {
//             last = last.next;
//         }
//         last.next = new_node;
//     }

//     public static void printll() {
//         Node n = head;
//         while (n != null) {
//             System.out.print(n.data + " ");
//             n = n.next;
//         }
//     }

//     public static boolean isloop() {
//         Node slow = head;
//         Node fast = head;
//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//             if (slow == fast) {
//                 return true;
//             }
//         }
//         return false;
//     }

//     public static  void removecycle(){
//         Node s=head;
//         Node f=head;
//         boolean cycle=false;
//         while(f!=null && f.next!=null){
//             s=s.next;
//             f=f.next.next;

//             if(s==f){
//                 cycle=true;
//                 break;
//             }
//         }

//         if(cycle==false){
//             return ;
//         }
//         s=head;
//         Node prev=null;
    
//             while(s!=f){
//                 prev=f;
//                 s=s.next;
//                 f=f.next;
//             }

//             prev.next=null;
        

        
//     }

//     public static void main(String[] args) {
//         head = new Node(1);
//     head.next = new Node(2);
//     head.next.next = new Node(3);
//     head.next.next.next = new Node(4);
//     head.next.next.next.next = new Node(5);
//     head.next.next.next.next.next = head.next;

//     // detect and remove the loop
//   System.out.println(  isloop());
//   removecycle();
//   System.out.println( isloop());
//     }
// }
import java.util.*;
class Linkedlist{
    public static void main(String[] args) {
        LinkedList<Integer> ll=  new LinkedList<>();
        ll.add(1);
        ll.add(1);
        ll.add(2);
        ll.add(22);
        System.out.println(ll);
    }
}
