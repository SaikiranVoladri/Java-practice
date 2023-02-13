public class DIVIDEANDCONQUER {
    //merge sort
    // public static void mergesort(int arr[], int si, int ei){
    //     //base case
    //     if(si>=ei){
    //         return;
    //     }
    //     int mid= si+(ei-si)/2;

    //     mergesort(arr, si, mid);//left

    //     mergesort(arr, mid+1, ei);// right

    //     merge(arr, si,mid,ei);

    // }
    // public static void merge(int arr[], int si, int mid,int ei){
    //     //temp arr create 

    //     int temp[]= new int[ei-si+1];
    //     int i=si;
    //     int j=mid+1;
    //     int k=0;
    //     while(i<=mid&& j<=ei){
    //         if(arr[i]< arr[j]){
    //             temp[k]=arr[i];
    //             i++;
    //         }else{
    //             temp[k]=arr[j];
    //             j++;
    //         }
    //         k++;   
    //     }
    //     while(i<=mid){
    //         temp[k++]=arr[i++];
    //     }
    //     while(j<=ei){
    //         temp[k++]=arr[j++];
    //     }
    //     //copy 
    //     for(k=0,i=si;k<temp.length;k++,i++){
    //         arr[i]=temp[k];

    //     }
       
    // }

    public static void mergesort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergesort(arr, si, mid);
        mergesort(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[], int si, int mid, int ei){
        int temp[]= new int[ei-si+1];
        int i=si;// left side comparision
        int j=mid+1;//right side comparision
        int k=0;//temp idx

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;k++;
            }else{
                temp[k]=arr[j];
                j++;k++;
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //copy from temp to arr original
        for( k=0,i=si;k<temp.length;k++ ,i++){
            arr[i]=temp[k];
        }


    }

public static void print(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}

public static void quicksort(int arr[], int si, int ei){
    //base case
    if(si>=ei){
        return;
    }
     int pIdx = parition(arr, si,ei);
     quicksort(arr, si, pIdx-1);
     quicksort(arr, pIdx, ei);

}
public static int parition(int arr[], int si, int ei){
    int pivot=arr[ei];

    int i=si-1;
    for(int j=si;j<=ei;j++){
        if(arr[j]<pivot){
            i++;
            int temp=arr[j];
            arr[j]= arr[i];
            arr[i]=temp;
        }
    }
    i++;
   int temp=pivot;
   arr[ei]=arr[i];
   arr[i]=temp;
   return i;

}
public static int search(int arr[], int tar, int si, int ei){
    if(si>ei){
        return -1;
    }
    int mid=(si+ei)/2;

    if(arr[mid]==tar){
        return mid;
    }

    if(si<=arr[mid]){
        if(arr[si]<=tar && tar<=mid){
            return search(arr, tar, si, mid-1);
        }else{
            return  search(arr, tar, mid+1, ei);
        }
    }
    else{
        if(arr[mid]<=tar&& tar<=arr[ei]){
            return search(arr, tar, mid+1, ei);
        }else{
            return search(arr, tar, si, mid-1);
        }
    }


}

    public static void main(String[] args) {
        int arr[]={4,5,6,7,1,2,3};
      int id= search(arr, 1, 0, arr.length-1);
      System.out.println(id);
    }
}
