package Arrays.Logical_Building;

import java.util.Scanner;

public class MaxElement {

    public static int maxx(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void display(int[] arr) {
        System.out.println("Maximum Element = " + maxx(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Size Of Array :- ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter Elements Of Array :- ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        display(arr);
    }
}