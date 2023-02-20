import java.util.*;
import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;
public class BINARYTREES2 {
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

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        int th= Math.max(lh,rh)+1;
        return th;

    }

    public static int daimeters(Node root){
       if(root==null){
        return 0;
       }

       int ld=daimeters(root.left);
       int rd=daimeters(root.right);
       int lh= height(root.left);
       int rh=height(root.right);
       int selfdiam=lh+rh+1;
       return Math.max(selfdiam,Math.max(rd,ld));

    }

    // public static boolean isIdentical(Node root1, Node root2){
    //     if(root1==null&& root2==null){
    //         return true;
    //     }else if(root1==null || root2==null || root1.data!=root2.data){
    //         return false;
    //     }
    //     if(!isIdentical(root1.left, root2.left)){
    //         return false;
    //     }
    //     else if(!isIdentical(root1.right, root2.right)){
    //         return false;
    //     }

    //     return true;
    // }

    // public static boolean subtree(Node root, Node subroot){
    //     if(root==null){
    //         return false;
    //     }
    //     if(root.data==subroot.data){
    //         if(isIdentical(root,subroot)){
    //             return true;
    //         }
    //     }
    //     return subtree(root.left, subroot) || subtree(root.right, subroot);

    // }

    public static boolean isidentical(Node root1, Node root2){
        if(root1==null && root2==null){
            return true;
        }
        else if(root1==null || root2==null|| root1.data!=root2.data){
            return false;
        }

        if(!isidentical(root1.left, root2.left)){
            return false;
        }
        if(!isidentical(root1.right, root2.right)){
            return false;
        }

        return true;

    }

    public static boolean subtree(Node root, Node subroot){
        if(root==null){
            return false;
        }
        if(root.data==subroot.data){

        if(isidentical(root,subroot)){
            return true;
        }
     }
        return  subtree(root.left, subroot) || subtree(root.right, subroot);

    }

    // static class info{
    //     Node node;
    //     int hd;
    //     info( Node n ,int h ){
    //         this.node=n;
    //         this.hd=h;
    //     }
    // }
    // public static void TopView(Node root){
    //     //queue create

    //     Queue<info> q= new LinkedList<>();
    //     // hash map create
    //     HashMap<Integer,Node> hm= new HashMap<>();
    //     // traversal level order 
    //     int max=0,min=0;
    //     q.add(new info( root,0));
    //     q.add(null);

    //     while(!q.isEmpty()){
    //         info curr = q.remove();
    //         if(curr==null){
    //             if(q.isEmpty()){
    //                 break;
    //             }
    //             else{
    //                 q.add(null);
    //             }
    //         }
    //         else{
    //             if(!hm.containsKey(curr.hd)){
    //                 hm.put(curr.hd,curr.node);
    //             }
    
    //             if(curr.node.left!=null){
    //                 q.add(new info(curr.node.left,curr.hd-1));
    //                 min= Math.min(min,curr.hd-1);
    //             }
    
    //             if(curr.node.right !=null){
    //                 q.add(new info(curr.node.right,curr.hd+1));
    //                 max=Math.max(max,curr.hd+1);
    //             }
    //         }
    //     }
    //     for(int i=min;i<=max;i++){
    //         System.out.println(hm.get(i).data);
    //     }


    // }

    static class info{
        Node node;
        int hd;
        info(Node node, int hd){
            this.node= node;
            this.hd= hd;
        }
    }

    public static void TopView(Node root){
        Queue<info> q= new LinkedList<>();
        HashMap<Integer, Node> hm= new HashMap<>();
        int max=0,min=0;

        q.add(new info(root, 0));
        q.add(null);

        while(!q.isEmpty()){
            info curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }
            else{
                if(!hm.containsKey(curr.hd)){
                    hm.put(curr.hd,curr.node);
                }
                if(curr.node.left!=null){
                    q.add(new info(curr.node.left, curr.hd-1));
                    min=Math.min(min, curr.hd-1);
                }
                if(curr.node.right!=null){
                    q.add(new info(curr.node.right, curr.hd+1));
                    max=Math.max(max, curr.hd+1);
                }
            }
        }
        for(int i=min;i<=max;i++){
            System.out.println(hm.get(i).data);
        }


    }
    public static void main(String[] args) {
        
        Node root= new Node(1);
        root.left=new Node(2);
        root.right= new Node(3);
        root.left.left= new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        TopView(root);

    //     Node subroot= new Node(2);
    //     subroot.left=new Node(4);
    //     subroot.right= new Node(5);

    //    System.out.println( subtree(root, subroot));

        
        
    }
}
