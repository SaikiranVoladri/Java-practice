import java.util.*;
import java.util.LinkedList;


public class QUEUE {

    static class queue{
        static Stack<Integer> s1= new Stack<>();
        static Stack<Integer> s2= new Stack<>();

//isempty
        static boolean isEmpty(){
            return s1.isEmpty();
        }
        //add
        static void add(int data){
           
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }

        }

        static int remove(){
            if(s1.isEmpty()){
                return -1;
            }
           return  s1.pop();
        }


        static int peek(){
            if(s1.isEmpty()){
                return -1;
            }
            return s1.peek();
        }
    }

    static class stack{
        static Queue<Integer> q1= new LinkedList<>();
        static Queue<Integer> q2= new LinkedList<>();

        //isempty
        static boolean isEmpty(){
            return q1.isEmpty()&& q2.isEmpty();
        }
        //push
        static void push(int data){
            if(!q1.isEmpty()){
                q1.add(data);
            }
            else{
                q2.add(data);

            }
        }

        //pop()
        static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=-1;
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top=q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            }
            else{
                while(!q2.isEmpty()){
                    top=q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }
        static int peek(){
            if(isEmpty()){
                return -1;
            }
            int top=-1;
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top=q1.remove();
                    q2.add(top);
                }
            }
            else{
                while(!q2.isEmpty()){
                    top=q2.remove();
                    q1.add(top);
                }
            }
            return top;
        }
        

    }

    static class queu{
       static int arr[];
        static int size;
        static int rear;
        static int front;

        queu(int n){
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;
        }
        static boolean isfull(){
            return rear+1%size==front;
        }
        //isempty
        static boolean isEmpty(){
            return rear==-1 &&front==-1;
        }
       public static void add(int data){
            if(isfull()){
                //full
                return ;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        static int remove(){
            if(isEmpty()){
                return -1;
            }
            int result=arr[front];
            if(rear==front){
               rear=front=-1;
            }else{
            
            front=(front+1)%size;
            }
            return result;
            
        }
      public  static int peek(){
            if(isEmpty()){
                return -1;
            }
          
            return arr[front];
           
        }



    }

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }}
        static Node head=null;
        static Node tail=null;

        static boolean isempty(){
            return head==null &&tail==null;
        }

        //add
        public static void add(int data){
            Node newnode = new Node(data);
            if(head==null){
                head=tail=newnode;
                return;
            }
            tail.next=newnode;
            newnode=tail;

        }
        //remove
        public static int remove(){
            if(isempty()){
                return -1;
            }
            int temp=head.data;
            if(tail==head){
                tail=head=null;
            }else{
            head=head.next;}
            return temp;

        }
        //peek
        public static int peek(){

            if(isempty()){
                return -1;
            }
            return head.data;
           
        }


        public static void nonduplicate(String str){

            int arr[]= new int[26];
            Queue<Character> q= new LinkedList<>();
            for(int i=0;i<str.length();i++){
                char curr= str.charAt(i);
                q.add(curr);
                arr[curr-'a']++;
            
            while(!q.isEmpty() && arr[q.peek()-'a']>1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.println("-1"+" ");
            }else{
                System.out.println(q.peek()+" ");
            }
            
        }
        }
        public static void interleave(Queue<Integer> q){
            Queue<Integer> q2= new LinkedList<>();
           int size= q.size();
           for(int i=0;i<size/2;i++){
            q2.add(q.remove());
           }
           while(!q2.isEmpty()){
            q.add(q2.remove());
            q.add(q.remove());
           }
        }
    public static void reverse(Queue<Integer> q){
        Stack<Integer> s= new Stack<>();
        int size=q.size();
        for(int i=0;i<size;i++){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            System.out.print(s.pop());
        }
    }

    static class Stacks{
        static Deque<Integer> dq= new LinkedList<>();

        public static void push(int data){
            dq.add(data);
        }
        public static int remove(){
        return dq.removeFirst(); 
        }
        public static int peek(){
            // return dq.peekLast();
            return dq.peekFirst();
        }
    }
    public static void main(String[] args) {
       Stacks q= new Stacks();
       q.push(1);
       q.push(2);
        q.push(6);
System.out.println(q.remove());
System.out.println(q.peek());
     
}
}
