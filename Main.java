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

/*import java.util.*;

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
}*/

//----------------------------------------------------------------------------------------------------------

// SORT 01

/*import java.util.*;

public class Main{

    public static int[] sort01(int[] arr){

        int i=0 , j=arr.length-1;

        while(i<j){

            if(arr[i]==arr[j]){
                if(arr[i]==0){
                    i++;
                }
                else{
                    j--;
                }
            }
            else{
                if(arr[i]==0){
                    i++;
                    j--;
                }
                else{
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    i++;
                    j--;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        sort01(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}*/

//----------------------------------------------------------------------------------------------------------

// SORT 01 (METHOD II)

/*import java.util.*;

public class Main{
    public static int[] sort01(int[] arr){

        int i=0,j=0;
        while(i!=arr.length){
            if(arr[i]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
            }
            else{
                i++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        sort01(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}*/

//----------------------------------------------------------------------------------------------------------

// QUICK SORT

/*import java.util.Scanner;

public class Main{

    public static void quickSort(int[] arr,int pivot,int low,int high){

        if(low==high){
            return;
        }
        if(low>high){
            return;
        }
        pivot=arr[high];
        int i=low;
        int j=low;

        while(i<=high){
            if(arr[i]<=pivot){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
                j++;
            }
            else{
                i++;
            }
        }

        quickSort(arr,pivot,0,j-2);
        quickSort(arr,pivot,j,high);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        quickSort(arr,arr[n-1],0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}*/

//----------------------------------------------------------------------------------------------------------

// QUICK SELECT
// K th smallest element

import java.util.Scanner;

public class Main{
    public static void quickSelect(int low,int high,int pivotIdx,int[] arr,int k){
        if(pivotIdx==k-1){
            System.out.println(arr[pivotIdx]);
            return;
        }
        int i=low;
        int j=low;
        int pivot=arr[high];

        while(i<=high){
            if(arr[i]<=pivot){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
            }
            else{
                i++;
            }
        }

        pivotIdx=j-1;
        if(pivotIdx>k){
            high=pivotIdx-1;
        }
        else{
            low=pivotIdx+1;
        }

        quickSelect(low,high,pivotIdx,arr,k);
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int k= scn.nextInt();

        quickSelect(0,n-1,n-1,arr,k);
    }
}



