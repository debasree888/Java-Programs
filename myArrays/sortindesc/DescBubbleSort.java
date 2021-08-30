package myArrays.sortindesc;

import java.util.Scanner;

public class DescBubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = in.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the values");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int temp;
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println("Sorted array values in desc order:");
        for(int x=arr.length-1;x>=0;x--)
            System.out.println(arr[x]);
    }

}
