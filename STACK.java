import java.util.*;

class STACK{
    // static class Node{
    //     int data;
    //     Node next;
    //     Node(int data){
    //         this.data=data;
    //         this.next=null;
    //     }
    //  }
      

    // static class stack{
    //     static Node head=null;
       

    //    //isempty
    //    public static boolean isempty(){
    //     return head==null;
    //    }

    //    //push
    //    public static void push(int data){
    //     Node newNode =new Node(data);
    //     if(isempty()){
    //         head=newNode;
    //         return;
    //     }
    //     newNode.next=head;
    //     head=newNode;

    //    }//pop()
    //    public static int pop(){
    //     if(isempty()){
    //         return -1;
    //     }
    //     int top= head.data;
    //     head= head.next;
    //     return top;

    //    }

    //    //peek
    //    public static int peek(){
    //     if(isempty()){
    //         return -1;
    //     }
    //     return head.data;
    //    }

    // //     //empty
    // //     public static boolean isEmpty(){
    // //         return al.size()==0;
    // //     }
    // //     //push
    // //     public static void push(int data){
    // //         al.add(data);

    // //     }
    // //     //pop

    // //     public static int pop(){
    // //         //store 
    // //         if(isEmpty()){
    // //             return -1;
    // //         }
    // //         int top= al.get(al.size()-1);
    // //         al.remove(al.size()-1);

    // //         //return
    // //         return top;
    // //     }
    // //     //peek

    // //     public static int peek(){
    // //         if(isEmpty()){
    // //             return -1;
    // //         }
    // //         return al.get(al.size()-1);
    // //     }

    // //     public static void print(){
           
    // //     }
        
    // // }
    // }


    

    public static String reverse( Stack<Character> s,String str){

        int idx=0;
        while(idx<str.length()){
        char curr= str.charAt(idx);
         s.push(curr);
         idx++;
        }

        //reverse
        StringBuilder sb= new StringBuilder("");
        while(!s.isEmpty()){
            char curr=s.pop();
            sb.append(curr);

        }
        return sb.toString();

    }
    public static void pushAtbottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top= s.pop();
        pushAtbottom(s, data);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s ){

        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverse(s);
        pushAtbottom(s, top);


    }
    public static void print(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    public static void stokspan(int stocks[], int span[]){
        Stack <Integer> s= new Stack<>();
        span[0]=1;
        s.push(0);
        for(int i=1;i<stocks.length;i++){
            int curr=stocks[i];
            while(!s.isEmpty() && curr>stocks[s.peek()]){
                s.pop();
            }

            if(s.isEmpty()){
                span[i]=i+1;
            }
            else{
                int prev= s.peek();
                span[i]=i-prev;
            }
        
        s.push(i);
        }
    }

    public static void main(String[] args) {
   int stocks[]={100,80,60,70,85,100};
   int span[]=new int[stocks.length];
   stokspan(stocks, span);
    
        for(int i=0;i<span.length;i++){
            System.out.println(span[i]);
        }
    
    }
}