import java.nio.file.FileStore;
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


    public static void nextGreater(int arr[], int nextArr[]){
        Stack<Integer> s= new Stack<>();
       
        
        for(int i=arr.length-1;i>=0;i--)    {
           
            while(!s.isEmpty() && arr[i]>= arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nextArr[i]=-1;
            }
            else{
                nextArr[i]=arr[s.peek()];
            }
            s.push(i);
        }
    }

public static boolean isvalid(String str){
    Stack<Character> s= new Stack<>();
    for(int i=0;i<str.length();i++){
        char curr=str.charAt(i);
        if(curr=='('||curr =='['|| curr=='{'){
            s.push(curr);
        }
        else{
            if(s.isEmpty()){
                return false;
            }
            if(s.peek()=='(' && curr==')' || s.peek()=='[' && curr==']' || s.peek()=='{'&& curr=='}'){
                s.pop();
            }else{
                return false;
            }
        }

    }
    if(s.isEmpty()){
        return true;
    }
    else{
        return false;
    }
}
public static  boolean duplicate(String str){
   Stack <Character> s= new Stack<>();
    for(int i=0;i<str.length();i++){
        char c= str.charAt(i);

        if(c==')'){
            if(s.isEmpty()){
                return false;
            }
            int count=0;
            while(s.peek()!='('){
                count++;
                s.pop();
            }
            if(count<1){
                return true;
            }
            s.pop();
        }
       else{
        s.push(c);
       }
    }
    return false;
}

public static void max(int arr[]){
    int[]nsl=new int[arr.length];
    int []nsr= new int [arr.length];
    Stack <Integer> s= new Stack<>();
    int max=0;
    // nsl
  for(int i=0;i<arr.length;i++){
        while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){
            s.pop();
        }
        if(s.isEmpty()){
            nsl[i]=-1;
        }
        else{
            nsl[i]=s.peek();
        }
        s.push(i);

  }
  for(int i=arr.length-1;i>=0;i--){
    while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){
        s.pop();
    }
    if(s.isEmpty()){
        nsr[i]=arr.length;
    }
    else{
        nsr[i]=s.peek();
    }
    s.push(i);

}


    //area
    for(int i=0;i<arr.length;i++){
     int h=arr[i];
     int w=nsr[i]-nsl[i]-1;
     int tot=h*w;
     max= Math.max(max,tot);

    }

    System.out.println("max"+max);
}

    public static void main(String[] args) {
 int arr[]= {2,1,5,6,2,3};
 max(arr);
    
    }
}
