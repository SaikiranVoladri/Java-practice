public class TRIE {


    // static class Node{
    //     Node child[]= new Node[26];
    //     boolean eow=false;
    //     Node(){
    //         for(int i=0;i<26;i++){
    //             child[i]=null;
    //         }
    //     }
    //  }
    //  public static Node root= new Node();

    //  public static void insert(String str){
    //     Node curr=root;
    //     for(int l=0;l<str.length();l++){
    //         int idx=str.charAt(l)-'a';
    //         if(curr.child[idx]==null){
    //             curr.child[idx]=new Node();
    //         }
    //         curr=curr.child[idx];
        
    //     }
    //      curr.eow=true;
    //  }


    //  public static boolean search(String key){
    //    Node curr=root;
    //    for(int i=0;i<key.length();i++){
    //     int id=key.charAt(i)-'a';
    //     if(curr.child[id]==null){
    //         return false;
    //     }
    //     curr=curr.child[id];
    //    }
    //    return curr.eow==true;
    //  }

    //  public static boolean wordbreak(String keyy){
    //     if(keyy.length()==0){
    //         return true;
    //     }

    //     for(int i=1;i<=keyy.length();i++){
    //         if(search(keyy.substring(0, i)) && wordbreak(keyy.substring(i))){
    //             return true;
    //         }
    //     }
    //     return false;
    //  }

        static class Node{
            Node child[]= new Node[26];
            int freq;
            boolean eow=false;

            Node(){
                for(int i=0;i<26;i++){
                    child[i]=null;
                }
                freq=1;
            }
        }
        public static Node root=new Node();
        public static void insert(String str){
            Node curr= root;
            for(int i=0;i<str.length();i++){
                int id= str.charAt(i)-'a';
                if(curr.child[id]==null){
                    curr.child[id]=new Node();
                }else {
                    curr.child[id].freq++;
                }
                curr=curr.child[id];
            }
            curr.eow=true;
        }

        public static void search(Node root, String ans){
            if(root==null){
                return ;
            }
            if(root.freq==1){
                System.out.println(ans);
                return;
            }

            for(int i=0;i<root.child.length;i++){
                if(root.child[i]!=null){
                    search(root.child[i], ans+(char)(i+'a'));
                }
            }
        }

        public static boolean iscontain(String key){
            Node curr=root;
            for(int i=0;i<key.length();i++){
                int idx=key.charAt(i)-'a';
                if(curr.child[idx]==null){
                    return false;
                }
                curr=curr.child[idx];
            }
            return true;
        }

        public static int countNode(Node root){
            if(root==null){
                return 0;
            }
            int count=0;
            Node curr= root;
            for(int i=0;i<26;i++){
                if(curr.child[i]!=null){
                    count+=countNode(curr.child[i]);
                }
            }
            return count+1;
        }
        public static String ans="";
        public static void longest(Node root, StringBuilder temp){
            if(root==null){
                return;
            }
            for(int i=0;i<26;i++){
                char ch= (char)(i+'a');
                if(root.child[i]!=null && root.child[i].eow==true){
                    temp.append(ch);
                
                if(temp.length()>ans.length()){
                    ans=temp.toString();
                }
                //recursion
                longest(root.child[i], temp);
                 temp.deleteCharAt(temp.length()-1);//backtract
              }
            }
            
        }
    public static void main(String args[]){
        String str[]={"a","ap","app","appl","apply","apple"};
        for(int i=0;i<str.length;i++){
            insert(str[i]);
        }
        longest(root, new StringBuilder(""));
        System.out.println(ans);

        // String str="apple";
        // for(int i=0;i<str.length();i++){
        //     String suffix = str.substring(i);
        //     insert(suffix);
        // }
        // System.out.println(countNode(root));


        // String str[]={"thees","there","a","their","theep","apple"};

        // for(int i=0;i<str.length;i++){
        //     insert(str[i]);
        // }
        // System.out.println(iscontain("app"));
     
    }
    
}
