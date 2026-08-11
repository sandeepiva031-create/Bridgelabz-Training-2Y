package Arrays.Leetcode;

import java.util.ArrayList;
import java.util.Scanner;

public class Leetcode_1389 {

    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < index.length; i++) {
            list.add(index[i], nums[i]);
        }

        int target[] = new int[nums.length];

        for (int i = 0; i < target.length; i++) {
            target[i] = list.get(i);
        }

        return target;
    }

    static void display(int target[]) {
        for (int i = 0; i < target.length; i++) {
            System.out.print(target[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int size = sc.nextInt();

        int index[] = new int[size];
        System.out.println("Enter elements of index:");
        for (int i = 0; i < size; i++) {
            index[i] = sc.nextInt();
        }

        int nums[] = new int[size];
        System.out.println("Enter elements of nums:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        int target[] = createTargetArray(nums, index);

        System.out.println("Target Array:");
        display(target);
    }
}