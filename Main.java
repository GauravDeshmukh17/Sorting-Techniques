// BUBBLE SORT

import java.util.*;

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
}

//-----------------------------------------------------------------------------------------------------------

