// BUBBLE SORT

/*import java.util.*;

public class Main{

    public static int[] bubbleSort(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        int[] bs=bubbleSort(arr);
        for(int i=0;i<bs.length;i++){
            System.out.print(bs[i]+" ");
        }
    }
}*/

//-----------------------------------------------------------------------------------------------------------

// SELECTION SORT

/*import java.util.*;

public class Main{

    public static int[] selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        return arr;
    }

    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        selectionSort(arr);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}*/

//-----------------------------------------------------------------------------------------------------

//MERGE SORTED ARRAYS

/*import java.util.*;

public class Main{

    public static int[] mergeSortedArray(int[] arr1,int[] arr2){
        int start1=0;
        int start2=0;
        int i=0;
        int[] newArray=new int[arr1.length+arr2.length];

        while(i<arr1.length+arr2.length){
            if(start1<arr1.length && start2<arr2.length){
                if(arr1[start1]>arr2[start2]){
                    newArray[i]=arr2[start2];
                    start2++;
                }
                else{
                    newArray[i]=arr1[start1];
                    start1++;
                }
            }
            else{
                if(start1<arr1.length){
                    newArray[i]=arr1[start1];
                    start1++;
                }
                else{
                    newArray[i]=arr2[start2];
                    start2++;
                }
            }
            i++;
        }
        return newArray;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int m=scn.nextInt();
        int[] arr1=new int[m];
        for(int i=0;i<m;i++){
            arr1[i]=scn.nextInt();
        }
        int n=scn.nextInt();
        int[] arr2=new int[n];
        for(int i=0;i<n;i++){
            arr2[i]=scn.nextInt();
        }

        int[] msr=mergeSortedArray(arr1,arr2);
        for(int i=0;i<msr.length;i++){
            System.out.print(msr[i]+" ");
        }

    }
}*/

//----------------------------------------------------------------------------------------------------------

// MERGE SORT

import java.util.*;

public class Main{

    public static int[] mergeSortedArray(int[] arr1, int[] arr2){
        int start1=0;
        int start2=0;
        int i=0;
        int[] newArray=new int[arr1.length+arr2.length];

        while(i<arr1.length+arr2.length){
            if(start1<arr1.length && start2<arr2.length){
                if(arr1[start1]>arr2[start2]){
                    newArray[i]=arr2[start2];
                    start2++;
                }
                else{
                    newArray[i]=arr1[start1];
                    start1++;
                }
            }
            else{
                if(start1<arr1.length){
                    newArray[i]=arr1[start1];
                    start1++;
                }
                else{
                    newArray[i]=arr2[start2];
                    start2++;
                }
            }
            i++;
        }
        return newArray;
    }

    public static int[] mergeSort(int[] arr,int low,int high){
        if(low==high){
            int[] ans=new int[1];
            ans[0]=arr[low];
            return ans;
        }
        int mid=(low+high)/2;

        int[] arr1=mergeSort(arr,low,mid);
        int[] arr2=mergeSort(arr,mid+1,high);

        int[] ans=mergeSortedArray(arr1,arr2);
        return ans;
    }

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        int[]ms=mergeSort(arr,0,n-1);
        for(int i=0;i<ms.length;i++){
            System.out.print(ms[i]+" ");
        }
    }
}


