public class RECURSION {

    // public static void recDec(int n){
    //     if(n==1){
    //         System.out.print(n+" ");
    //         return;
    //     }
    //     System.out.print(n+"-");
    //     recDec(n-1);
    // }
    public static void printInc(int n){
        //base case
        System.out.println(n+" ");
        if(n==10){
            return;
        }
        printInc(n+1);
    }
    public static void inc(int n){
        //base case
        if(n==1){
            System.out.println(n);
            return;
        }
        inc(n-1);
        System.out.println(n);
    }

    public static int factorial(int n){
        //base case
        if(n==0){
            return 1 ;
        }
        int nm1=factorial(n-1);
        int nf=n*nm1;
        return nf;
        


    }
    public static int summ(int n){
        //bc
        if(n==0){
            return 0;
        }
        int fnm1 =summ(n-1);
        int fnsum= n+fnm1;
        return fnsum;
    }

    public static int fibo(int n){
        // base
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }

       int  finm1=fibo(n-1);
       int fnm2= fibo(n-2);
       int fn=finm1+fnm2;
       return fn;

    }

    public static boolean issorted(int arr[],int si){
        //base case
        if(si==arr.length-1){
            return  true;
        }

        if(arr[si]>arr[si+1]){
            return false;
        }
        return issorted(arr, si+1);
    }
    public static int occ(int arr[], int key, int i){
        //base case
        if(i==arr.length){
            return -1;
        }
        
        if(arr[i]==key){
            return i;
        }
       return  occ(arr, key,i+1);
    }
    public static int lastocc(int arr[], int key , int i){
        // if(i==arr.length){
        //     return -1;
        // }
        // int isfound= lastocc(arr, key, i+1);
        // if(isfound==-1&& arr[i]==key){
        //     return i;
        // }
        // return isfound;
        
        if(arr[i]==key){
            return i;
        }
        if(i==0){
            return -1;
        }
       return lastocc(arr, key, i-1);

    }

    public static int power(int x,int n){
        if( n==0){
            return 1;
        }
        int nm1=power(x, n-1);
        return x*nm1;
    }
    public static int optimizedpower(int x, int n){
    //     if(n==0){
    //         return 1;
    //     }
    //     if(n%2==0){
    //         return optimizedpower(x, n/2)*optimizedpower(x, n/2);
    //     }
    //     return x* optimizedpower(x, n/2)*optimizedpower(x, n/2);
    // }
  
        if(n==0){
            return 1;

        }
        int hf=optimizedpower(x, n/2);
        int hfsq= hf*hf;

        if(n%2!=0){
            hfsq=x*hfsq;
        }
        return hfsq;
    }

    public static int tiles(int n){
        if(n==0||n==1){
            return 1;
        }
        int v=tiles(n-1);
        int h=tiles(n-2);
        int t=v+h;
        return t;
    }
    public static void dupremove(String str, int i, StringBuilder newstr, boolean arr[]){
        //base case
        if(i==str.length()){
            System.out.println(newstr);
            return;
        }
        char curch= str.charAt(i);
        if(arr[curch-'a']==true){
            dupremove(str, i+1, newstr, arr);
        }
        else{
            arr[curch-'a']=true;
            dupremove(str, i+1, newstr.append(curch), arr);
        }
    }
    public static int friendspairing(int n){
        //base case
        if(n==1||n==0){
            return n;
        }
        int nm1= factorial(n-1);
        int nm2=(n-1)*friendspairing(n-2);
        return nm1+nm2;
        
    }
    public static void  binary(int n, int lp, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        binary(n-1, 0, str+"0");
        if(lp==0){
            binary(n-1, 1, str+"1");
        }
    }
    public static void printocc(int key,int i, int arr[]){
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.println(i);
        }
        printocc(key, i+1, arr);
    }

  

    
    public static void main(String[] args) {
        int arr[]={1,3,5,6,5,4,5};
      printocc(5, 0, arr);
    }
}
