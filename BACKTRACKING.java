
// public class BACKTRACKING {
// //     public static void printarr(int arr[], int i, int val){
//        //base case
// //         if(i==arr.length){
// //         print(arr);
// //         return;}
// //         //storing in array
// //         arr[i]=val;
// //         printarr(arr, i+1, val+1);
// //         arr[i]=arr[i]-1;


// //    }

// //    public static void print(int arr[]){
// //     for(int i=0;i<arr.length;i++){
// //         System.out.print(arr[i]+" ");
        
// //     }System.out.println();
// //    }

// //    public static void permutation(String str, int i, String ans){
// //     if(i==str.length()){
// //         if(ans.length()==0){
// //             System.out.println("null");
// //         }else{
// //             System.out.println(ans);
// //         }
// //     return;
// //     }
// //     //yes vali condition 
// //     permutation(str, i+1, ans+str.charAt(i));
// //     permutation(str, i+1, ans);

// //    }

// //    public static void combination(String str, String ans){
// //     //base case
// //     if(str.length()==0){
// //         System.out.println(ans);
// //         return;
// //     }

// //     //recursion
// //     for(int i=0;i<str.length();i++){
// //     char cur= str.charAt(i);

// //     String newstr= (str.substring(0, i)+str.substring(i+1));
// //     combination(newstr, ans+cur);

// //     }
// //    }

// //    public static void combinations(String str, String ans){
// //     // base case
// //     if(str.length()==0){
// //         System.out.println(ans);
// //         System.out.println(".");
// //         return;
// //     }

// //     //kaam
// //     for(int i=0;i<str.length();i++){
// //         char cur= str.charAt(i);
// //         String newstr= str.substring(0, i)+str.substring(i+1);
// //         combination(newstr, ans+cur);

// //     }
// //     }

// // //    public static void Nqueen(char board[][],int row){
// // //     //base case
// // //     if(row==board.length){
// // //         printA(board);
// // //         return;
// // //     }
// // //     for(int j=0;j<board.length;j++){
// // //         board[row][j]='Q';
// // //         Nqueen(board, row+1);
// // //         board[row][j]='X';//backtracking step
// // //     }


// // //    }
// // //    public static void printA(char board[][]){
// // //         for(int i=0;i<board.length;i++){
// // //             for(int j=0;j<board.length;j++){
// // //                 System.out.print(board[i][j]+" ");
// // //             }
// // //             System.out.println();
            
// // //         }System.out.println("-----------------");
// // //    }
// // //    public static boolean isSafe(char arr[][], int row, int col){
// // //     //up
// // //     for(int i=row-1,j=col;i>=0&&j>=0;i--){
// // //         if(arr[i][j]=='Q'){
// // //             return false;
// // //         }
// // //     }
// // //     //diag ledt

// // //     for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
// // //         if(arr[i][j]=='Q'){
// // //             return false;
// // //         }
// // //     }

// // //     //diag right

// // //     for(int i=row-1,j=col+1;i>=0&&j<arr.length;i--,j++){
// // //         if(arr[i][j]=='Q'){
// // //             return false;
// // //         }
// // //     }
// // //     return true;

// // //    }

// // //    public static void Nqueen(char arr[][], int row){
// // //         //basecase
// // //         int count=0;
// // //         if(row==arr.length){
// // //             printA(arr);
// // //             return;
           
// // //         }
        

// // //         for(int j=0;j<arr.length;j++){
// // //             if(isSafe(arr,row,j)){
// // //             arr[row][j]='Q';
// // //             Nqueen(arr, row+1);
// // //             arr[row][j]='O';
// // //             }
// // //         }

// // //    }
// //   public static boolean isSafe(char arr[][] ,int row, int col){
// //     //three cases
// //     //up
// //     for(int i=row-1,j=col;i>=0&&j>=0;i--){
// //         if(arr[i][j]=='Q'){
// //         return false;}
// //     }
// //     //dL
// //     for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
// //         if(arr[i][j]=='Q'){
// //             return false;}
// //     }
// //     //dR
// //     for(int i=row-1,j=col+1;i>=0&&j<arr.length;i--,j++){
// //         if(arr[i][j]=='Q'){
// //             return false;}
// //     }

// //     return true;
// //     }
// //  public static boolean Nqueen(char arr[][], int row){
// //     if(row==arr.length){
// //         printA(arr);
// //         count++;
// //         return true;
// //     }
// //     //recursion
// //     for(int j=0;j<arr.length;j++){
// //         if(isSafe(arr,row,j)){
// //             arr[row][j]='Q';
// //             if(Nqueen(arr, row+1)){
// //             return true; }
// //             arr[row][j]='x'; 
// //         }
    
// //     }
// //     return false;
// //  }
// //  public static void printA(char arr[][]){
// //     for(int i=0;i<arr.length;i++){
// //         for(int j=0;j<arr.length;j++){
// //             System.out.print(arr[i][j]+" ");
// //         }
// //         System.out.println();
// //     }
// //     System.out.println("--------------------------");
// //  }

// //  static int count=0;


// //  public static int Grid(int i, int j, int n, int m){
// //     //base case
// //     if(i==n-1 && j==m-1){
// //         return 1;
// //     }else if(i==n||j==n){
// //         return 0;
// //     }
// //     int w1= Grid(i+1, j, n, m);
// //     int w2=Grid(i, j+1, n, m);
// //     return w1+w2;

// //  }

// //  public static int tot(int n){
// //   if(n==0){
// //     return 1;
// //   }
// //   int fac= n*tot(n-1);
// //   return fac;

// //  }

// //  public static int totalways(int n, int m){
// //     int nm1=tot(n-1+m-1);
    
// //     int nm11 =tot(n-1)*tot(m-1);
    
// //     return nm1/nm11;

// //  }
//  public static boolean sudoku(int arr[][],int row , int col){
//     if(row==9){
//         return true;
//     }

//     int nextr=row; int nextc=col+1;
//     if(col+1==9){
//         nextr=row+1;
//         nextc=0;
//     }
//     if(arr[row][col]!=0){
//         return sudoku(arr, nextr, nextc);
//     }
//     for(int digit=1;digit<=9;digit++){
//         if(isSafe(arr,row,col,digit)){
//             arr[row][col]=digit;
        
//         if(sudoku(arr, nextr, nextc)){
//             return true;
//         }
//         arr[row][col]=0;
//     }}
//     return false;

//  }
//     public static  boolean isSafe(int arr[][], int row, int col, int digit){
//     //col
//     for(int i=0;i<=8;i++){
//         if(arr[i][col] == digit){
//             return false;
//         }
//       }

//       for(int j=0;j<=8;j++){
//         if(arr[row][j]== digit){
//             return false;
//         }
//       }

//       int sr=(row/3)*3;
//       int sc=(col/3)*3;
//       for(int i=sr;i<sr+3;i++){
//         for(int j=sc;j<sc+3;j++){
//             if(arr[i][j]==digit){
//                 return false;
//             }
//         }
//       }
//       return true;

//     }


//     public static void print(int arr[][]){
//         for(int i=0;i<9;i++){
//             for(int j=0;j<9;j++){
//             System.out.print(arr[i][j]+" ");
//         }
//         System.out.println();
//     }
//     }

//     public static void main(String args[]){
      
//     int arr[][]={{0,0,8,0,0,0,0,0,0},
//     {4,9,0,1,5,7,0,0,2},
//     {0,0,3,0,0,4,1,9,0},
//     {1,8,5,0,6,0,0,2,0},
//     {0,0,0,0,2,0,0,6,0},
//     {9,6,0,4,0,5,3,0,0},
//     {0,3,0,0,7,2,0,0,4},
//     {0,4,9,0,3,0,0,5,7},
//     {8,2,7,0,0,9,0,1,3}
// };

//     if(sudoku(arr, 0, 0)){
//         print(arr);
//     }else{
//       System.out.println("no");
//     }

//     }
// }
