package Arrays.Logical_Building;

import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s= sc.nextLine();

        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(ch!=' '){
                int count=0;
                for(int j=0;j<s.length();j++){
                    if(ch==s.charAt(j)){
                        count++;
                    }
                }
                System.out.println(ch+" = "+count);
            }
        }
    }
}
