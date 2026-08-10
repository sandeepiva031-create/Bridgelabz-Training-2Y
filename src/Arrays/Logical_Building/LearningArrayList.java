package Arrays.Logical_Building;

import java.util.ArrayList;

public class LearningArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(0, 5);
        list.add(1, 7);
        list.add(2, 8);
        list.add(3, 6);

        int[] arr = new int[4];

        for (int j = 0; j < arr.length; j++) {
            arr[j] = list.get(j);
            System.out.println(arr[j]);
        }
    }
}