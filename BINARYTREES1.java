
import java.util.*;
import java.util.LinkedList;
public class BINARYTREES1 {


//    static class Node{
//         int data;
//         Node left;
//         Node right;

//         Node(int data){
//             this.data=data;
//             this.left=null;
//             this.right=null;
//         }    
//     }
//     static class Binarytree{
//         static int idx=-1;
//         public static Node bulidTree(int node[]){
//             idx++;
//             if(node[idx] == -1)
//             {
//                 return null;

//             }
//             Node newNode = new Node(node[idx]);
//             newNode.left=bulidTree(node);
//             newNode.right= bulidTree(node);
//             return newNode;

//         }

//         public static void preorder(Node root){
//             if(root==null){
//                 System.out.print(root+" ");
//                 return;
//             }
//             System.out.print(root.data +" ");
//             preorder(root.left);
//             preorder(root.right);
//         }
    

//     public static void inorder(Node root){
//         if(root==null){
//             return;
//         }
//         inorder(root.left);
//         System.out.print(root.data+" ");
//         inorder(root.right);
//     }

//     public static void postorder(Node root){
//         if(root==null){
//             return;
//         }
//         postorder(root.left);
//         postorder(root.right);
//         System.out.print(root.data+".");
//     }

//     public static void levelorder(Node root){
//         if(root==null){
//             return;
//         }
//         Queue<Node> q= new LinkedList<>();
//         q.add(root);
//         q.add(null);
//         while(!q.isEmpty()){
//             Node currNode=q.remove();
//             if(currNode==null){
//                 System.out.println();
//                 if(q.isEmpty()){
//                     break;
//                 }else{
//                     q.add(null);
//                 }
//             }
//             else{
//                 System.out.print(currNode.data+" ");
//                 if(currNode.left!=null){
//                     q.add(currNode.left);
//                 }
//                 if(currNode.right !=null){
//                     q.add(currNode.right);
//                 }
//             }
//         }

//     }


//     }

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }

    public static int height(Node root){
        if(root==null){
            return 0;
        }

        int lh= height(root.left);
        int rh=height(root.right);
        int height= Math.max(lh, rh)+1;
        return height;



    }
    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }
        int lh=countNodes(root.left);
        int rh=countNodes(root.right);
        int totalnodes = lh+rh+1;
        return totalnodes;
    }

    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int ls=sum(root.left);
        int rs= sum(root.right);
        return ls+rs + root.data;
    }

    
    public static void main(String[] args) {
        // int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // Binarytree tree= new Binarytree();
        // Node root=tree.bulidTree(node);
        // // tree.inorder(root);
        // //    tree.inorder(root);
        // // tree.postorder(root);
        // tree.levelorder(root);

        Node root= new Node(1);
        root.left=new Node(2);
        root.right= new Node(3);
        root.left.left= new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        // root.right.right= new Node(7);

        System.out.println(sum(root));
    }
    
}
