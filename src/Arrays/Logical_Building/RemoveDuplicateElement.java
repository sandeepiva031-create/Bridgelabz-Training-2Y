package Arrays.Logical_Building;

import java.util.Scanner;

public class RemoveDuplicateElement {
    public static void remove(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1 ;j < arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
    }
    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array :- ");
        int size=sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter Element of Array :- ");
        for(int i=0;i<arr.length;i++){

            arr[i]=sc.nextInt();
        }
        System.out.println("Original Array :- ");
        display(arr);
        remove(arr);
        System.out.println("Non-Duplicate Array ;- ");
        display(arr);
    }
}
