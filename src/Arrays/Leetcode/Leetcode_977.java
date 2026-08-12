package Arrays.Leetcode;

import java.util.Scanner;

public class Leetcode_977 {
    public static int[] sq(int arr[]) {
        int[] result= new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i] * arr[i];
        }
        return result;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size :- ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Element :- ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
          int result[]=sq(arr);
        for (int i = 0; i < size; i++) {
            System.out.println("sq of elements "+i+" are :- " +result[i]);

        }
    }
}
