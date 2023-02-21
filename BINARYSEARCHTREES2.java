import java.util.*;
class BINARYSEARCHTREES2{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }

    public static Node balencedbst( int arr[], int si, int ei ){
        if(si>ei){
            return null;
        }
        int mid= (si+ei)/2;
        Node root= new Node(arr[mid]);
        root.left=balencedbst(arr, si, mid-1);
        root.right= balencedbst(arr, mid+1, ei);

        return root;        
      
    }

    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    // public static void inorder(Node root,ArrayList<Integer> al){
    //     if(root==null){
    //         return;
    //     }
       
    //     inorder(root.left,al);
    //     al.add(root.data);
    //     inorder(root.right,al);
    // }
    // public static Node balanced(ArrayList<Integer> al, int si, int ei){
    //     if(si>ei){
    //         return null;
    //     }
    //     int mid=(si+ei)/2;
    //     Node root=new Node(al.get(mid));
    //     root.left=balanced(al, si, mid-1);
    //     root.right=balanced(al, mid+1, ei);
    //     return root;
    // }
    // public static Node minBST(Node root){
    //     // inorder
    //     ArrayList<Integer> al=new ArrayList<>();
    //     inorder(root,al);
    //     //build
    //     root=balanced(al,0,al.size()-1);
    //     return root;
    // }

    public static void inorder(Node root, ArrayList<Integer> al){
        if(root==null){
            return;
        }
        inorder(root.left, al);
        al.add(root.data);
        inorder(root.right, al);
    }
    public static Node build(ArrayList<Integer> al, int si, int ei){
        if(si>ei){
            return null;
        }
        int mid= (si+ei)/2;
        Node root= new Node(al.get(mid));
        root.left= build(al, si, mid-1);
        root.right=build(al, mid+1, ei);
        return root;
    }
    public static Node minBSt(Node root){
        //inorder
        ArrayList<Integer> al = new ArrayList<>();
        inorder(root, al);
        // build tree
        root= build(al, 0, al.size()-1);
        return root;
    }


    static class info{
        boolean isBST;
        int size;
        int min;
        int max;
        info(Boolean isBST, int size, int min, int max){
            this.isBST= isBST;
            this.size=size;
            this.min=min;
            this.max= max;

        }
       
    }
    
    // public static info higestbst(Node root){
    //     //4 case
    //     if(root==null){
    //         return new info(true, 0,Integer.MAX_VALUE, Integer.MIN_VALUE);
    //     }
       
    //     info leftside= higestbst(root.left);
    //     info rightside= higestbst(root.right);
    //      int size= leftside.size+rightside.size+1;
    //      int min= Math.min(root.data, Math.min(leftside.min,rightside.min));
    //      int max= Math.max(root.data,Math.max(leftside.max,rightside.max));
    //     if(root.data<=leftside.max  || root.data>=rightside.min  ){
    //         return new info(false, size, min, max);
    //     }

    //   if(leftside.isBST && rightside.isBST){
    //     maxSize= Math.max(size, maxSize);
    //     return  new info( true,size,min,max);
    //    }

    //     return new info(false, size, min, max);
        

    // }
    static int maxSize=0;
    public static info tree(Node root ){
        if(root==null){
            return new info(true, 0,Integer.MAX_VALUE, Integer.MIN_VALUE);

        }
        info ls= tree(root.left);
        info rs = tree(root.right);
        int size= ls.size+rs.size+1;
        int max= Math.max(root.data, Math.max(ls.max, rs.max));
        int min= Math.min(root.data, Math.min(ls.min, rs.min));

        if(root.data <=ls.max || root.data >= rs.min){
            return new info(false, size, min, max);

        }
        if(ls.isBST && rs.isBST){
            maxSize = Math.max(size, maxSize);
            return new info(true, size, min, max);
        }

        return new info(false, size, min, max);

    }

    public static void inor(ArrayList<Integer> al, Node root){
        if(root==null){
            return ;
        }
        inor(al, root.left);
        al.add(root.data);
        inor(al, root.right);
    }


    public static Node buildTree(ArrayList<Integer> finals,int si, int ei ){

        if(si>ei){
            return null;
        }
        int mid= (si+ei)/2;
        Node root= new Node(finals.get(mid));
        root.left=buildTree(finals, si, mid-1);
        root.right= buildTree(finals, mid+1, ei);

        return root;
    }
    public static Node merge(Node root, Node root1){
        //inorder r1
        //inorder r2
        // merge r1 r2
        //build bst
        ArrayList<Integer>a1= new ArrayList<>();
        inor(a1, root);
        ArrayList<Integer> a2= new ArrayList<>();
        inor(a2, root1);

        ArrayList <Integer> finalarr= new ArrayList<>();

        int i=0;int j=0;
        while(i<a1.size() && j<a2.size()){
            if(a1.get(i)<=a2.get(j)){
                finalarr.add(a1.get(i));
                i++;
            }  
            else{
                finalarr.add(a2.get(j));
                j++;
            }      
        }
        while(i<a1.size()){
            finalarr.add(a1.get(i));
            i++;
        }

        while(j<a2.size()){
            finalarr.add(a2.get(j));
            j++;
        }
    root= buildTree(finalarr, 0, finalarr.size()-1);
    return root;

    }




    public static void main(String[] args) {
    
    //    int arr[]={3,5,6,8,10,11,12};
    //   Node root= balencedbst(arr, 0, arr.length-1);
      
      
        // Node root= new Node(50);
        // root.left=new Node(30);
        // root.left.left= new Node(5);
        // root.left.right=new Node(20);
        
        // root.right= new Node(60);
        // root.right.left= new Node(45);
        // root.right.right=new Node(70);
        // root.right.right.left=new Node(65);
        // root.right.right.right=new Node(80);
        // //  root= minBSt(root);
        // info i= tree(root);
        // System.out.println(maxSize);

        Node root= new Node(2);
        root.left=new Node(1);
        root.right= new Node(4);

        Node root1= new Node(9);
        root1.left=new Node(3);
        root1.right= new Node(12);

       Node rootd= merge(root, root1);
         preorder(rootd);
       
    }

}