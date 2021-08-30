package myArrays.displayArrayValuesInReverse;

import java.util.Scanner;

public class DisplayArrayValuesInReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = in.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the values");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Array values in reverse are displayed below:");
        for(int i=arr.length-1;i>=0;i--)
            System.out.println(arr[i]);
    }
}
