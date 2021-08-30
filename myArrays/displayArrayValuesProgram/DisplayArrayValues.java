//Write a java program to create an array of size ‘n’
// and accepts ‘n’ number of integers from the user
// and display all the values from an array

package myArrays.displayArrayValuesProgram;

import java.util.Scanner;

public class DisplayArrayValues {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = in.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the values");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("The values you entered are:");
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
}
