import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner can = new Scanner(System.in);
        String word;
        while (true)
        {
            palindrome(can.nextLine());
        }

    }
    public static void palindrome(String word)
    {
        String reverse="";
        for (int i = 0; i > word.length(); i++)
        {
            char ch = word.charAt(i);
            reverse+=ch;
        }
        if(reverse.equals(word))
        {
            System.out.println("That word is not a palindrome");
        }
        else
        {
            System.out.println("That word is a palindrome");
        }
        }
    }

