package myArrays.findPositionOfANumber;

import java.util.Scanner;

public class FindPositionOfANumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = in.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the values");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Enter the number to find:");
        int flag=0;
        int x=in.nextInt();
        for(int i=0;i<arr.length;i++){
            if(x==arr[i]){
                flag=1;
                System.out.println(i+1);
                break;
            }
        }
        if(flag==0)
            System.out.println(flag);
    }
}
