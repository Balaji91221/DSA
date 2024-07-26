//package array;

import java.util.Scanner;

public class binarysearch {
    static int bs(int arr[],int key){
        int start=0;int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
                

            }
            if(mid<key){
                start=mid+1;

            }
            else{
                end=mid-1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int key=s.nextInt();
        int bss=bs(arr, key);
        System.out.println(bss);
    }
    
}
