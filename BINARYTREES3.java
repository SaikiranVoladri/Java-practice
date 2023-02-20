import java.util.ArrayList;

public class BINARYTREES3 {


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

   public static void nthorder(Node root, int level, int k){

    if(root==null){
        return ;
    }
    if(level==k){
        System.out.print(root.data);
        return;
    }
    nthorder(root.left, level+1, k);
    nthorder(root.right, level+1, k);

   }

    public static boolean getpath(Node root, int n, ArrayList<Node> path){
        if(root==null){
            return false;
        }
    path.add(root);
    if(root.data==n){
        return true;
    }
     boolean leftpath=getpath(root.left, n, path);
     boolean rightpath=getpath(root.right, n, path);

    if(leftpath ||rightpath){
        return true;
    }
    path.remove(path.size()-1);
    return false;
    }

   public static Node lowestansester(Node root, int n1, int n2){
      ArrayList<Node> path1= new ArrayList<>();
      ArrayList<Node> path2= new ArrayList<>();
      getpath(root,n1,path1);
      getpath(root,n2,path2);
        int i=0;
      for(  ;i<path1.size()&&i<path2.size();i++){
        if(path1.get(i)!=path2.get(i)){
            break;
        }
      }
      Node lca = path1.get(i-1);
      return lca;
   }

   public static Node lca2(Node root, int n1, int n2){
     if(root==null || root.data==n1|| root.data==n2){
        return root;
     }
     Node leftlca= lca2(root.left, n1, n2);
     Node rightlca= lca2(root.right, n1, n2);
     if(leftlca==null){
        return rightlca;
     }
     if(rightlca==null){
        return leftlca;
     }
    
     return root;}
    
     public static int Dis(Node root, int n){
       if(root==null){
        return -1;

       }
       if(root.data==n){
        return 0;
       }
       int l= Dis(root.left, n);
       int r= Dis(root.right,n);
       if(r==-1 && l==-1){
        return -1;
       }
       if(l==-1){
        return r+1;
       }
       else{
        return l+1;
       }
      

     }
   
     public static int kthansester(Node root, int n , int k){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
       int l= kthansester(root.left, n, k);
       int r= kthansester(root.right, n, k);

        if(l==-1 && r==-1){
            return -1;
        }
        int max= Math.max(l,r);
        if(max+1==k){
            System.out.println(root.data);
        }
        return max+1;

     }
   public static  int minDist(Node root, int n1, int n2){
            Node lca= lca2(root, n1, n2);
            int dist1= Dis(lca, n1);
            int dist2= Dis(lca,n2);

            return dist1+dist2;
   }

   public static int transform(Node root){
     if(root==null){
        return 0;
     }
     int leftchild= transform(root.left);
     int rightchild=transform(root.right);

     int data= root.data;

     int nl= root.left==null?0:root.left.data;
     int nr=root.right==null?0:root.right.data;
     root.data= leftchild+nl+rightchild+nr;
     return data;
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
        
        
        Node root= new Node(1);
        root.left=new Node(2);
        root.right= new Node(3);
        root.left.left= new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        
        transform(root);
        preorder(root);
    }
    
}
