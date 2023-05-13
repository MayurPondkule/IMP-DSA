
//time complexity
// worst n2  due to sorted array already or decending order pivot is smallest or greatest elemrnt
// avg nlogn

// if ang case and want memory low use Quick sort
//merge sort when extra memory

import java.util.Scanner;

public class Quicksort{
    public static int partition(int arr[] ,int low,int high){
        int pivot =arr[high];
        int i=low-1;
        for(int j=low ;j<high;j++){

            if(arr[j] < pivot){
                i++;
                //swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
            
        }
        i++;
        int temp = arr[i];
        arr[i]=arr[high];
        arr[high]=temp;

        return i; //pivot index

    }

    public static void quick(int arr[],int low ,int high){
        if(low<high){
            int pidx =partition(arr,low,high);

            quick(arr, low, pidx-1);
            quick(arr, pidx+1, high);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("size of array");
        int n=sc.nextInt();
        int[] arr =new int[n];

        System.err.println("enter array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        quick(arr,0,n-1);

        //print
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");            
        }

        
    }
}