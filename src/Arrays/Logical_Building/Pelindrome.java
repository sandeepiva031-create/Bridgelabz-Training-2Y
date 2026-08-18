package Arrays.Logical_Building;

import java.util.Scanner;

public class Pelindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        String rev = "";

        for (int i = 0; i < s.length(); i++) {
            rev = s.charAt(i) + rev;
        }

        if (s.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}