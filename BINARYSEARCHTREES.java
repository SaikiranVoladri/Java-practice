import java.lang.reflect.Array;
import java.util.ArrayList;

public class BINARYSEARCHTREES {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data= data;
            this.left=null;
            this.right=null;
        }
    }

    public static Node insert(Node root, int val){
        if(root==null){
            root=new Node(val);
            return root;
        }

        if(root.data>val){
            root.left=insert(root.left, val);
        }
        else{
            root.right= insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static boolean Search(Node root, int key){
        if(root==null){
            return false;
        }
        if(root.data== key){
            return true;
        }
        if(root.data<key){
            return Search(root.right, key);
        }else{
            return Search(root.left, key);
        }
    }
    public static Node Inordersucc(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static Node delete(Node root, int val){
        if(root.data>val){
            root.left=delete(root.left, val);

        }
        if(root.data<val){
            root.right= delete(root.right, val);
        }
        else{
        if(root.left==null && root.right==null){
            return null;
        }
        if(root.left==null){
            return root.right;
        }else if(root.right==null){
            return root.left;
        }

        //root contains 2 childen inorder succesor

        Node is=Inordersucc(root.right);
        root.data=is.data;
       root.right= delete(root.right,is.data);

    }
    return root;
}

    public static void valuesinK(Node root, int k1, int k2){
            if(root==null){
                return ;
            }
            if(root.data>=k1 && root.data <=k2){
                valuesinK(root.left, k1, k2);
                System.out.print(root.data+" ");
                valuesinK(root.right, k1, k2);
            }
            else if(root.data<k1){
                valuesinK(root.right, k1, k2);
            }
            else{
                valuesinK(root.left, k1, k2);
            }
    }

    public static void printpath(ArrayList<Integer> p){
        for(int i=0;i<p.size();i++){
            System.out.print(p.get(i)+"->");
        }
        System.out.print("null");
        System.out.println();
    }

    public static void printroottoleaf(Node root, ArrayList<Integer> p){
        if(root==null){
            return ;
        }
        p.add(root.data);
        if(root.left==null && root.right==null){
            printpath(p);
        }
        printroottoleaf(root.left, p);
        printroottoleaf(root.right, p);
        p.remove(p.size()-1);
    }

    public static boolean isvalid( Node root, Node min, Node max){
        if(root==null){
            return true;
        }

       if(min!=null && root.data<=min.data){
        return false;
       }
       else if(max!=null && root.data>=max.data){
        return false;
       }

       return isvalid(root.left, min, root) && isvalid(root.right, root, max);
        
    }

    public static Node mirror(Node root){
        if(root==null){
            return null;
        }
        Node ls=mirror(root.left);
        Node rs= mirror(root.right);
        //swap
        root.left=rs;
        root.right=ls;

       
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
    public static void main(String[] args) {
        // int value[]={8,10,5};
        // Node root=null;
        // for(int i=0;i<value.length;i++){
        //    root= insert(root, value[i]);
        // }
        // inorder(root);
        
        //  System.out.println();
        
        // printroottoleaf(root, new ArrayList<>() );
        // System.out.println(isvalid(root, null, null));
        Node root= new Node(8);
        root.left=new Node(5);
        root.right= new Node(10);
        root.left.left= new Node(3);
        root.left.right=new Node(6);
        root.right.right=new Node(11);
        preorder(root);
        mirror(root);
        System.out.println();
        preorder(root);
       
        


    }
}
