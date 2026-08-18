package Arrays.Logical_Building;

import java.util.Scanner;

public class VowelConsonent {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s= sc.nextLine();
        char ch;
        int countvowel=0;
        int countconso=0;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                countvowel++;
            }else if (ch==' '){
            }else{
                countconso++;
            }
        }
        System.out.println("No of Vowels are : " + countvowel +" and Consonent are : "+countconso);
    }
}
