package Arrays.Logical_Building;

public class ReverseString {
    static void main(String[] args) {
        String s = "Hellow World";
        String rev = "";
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            rev = ch + rev;
        }
        System.out.println(rev);
    }
}
