import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        String userString;
        String palindromeTest = "";
        
        System.out.print("Enter some text, the program will tell you if your text is" +
                         " Palindromic.");
        userString = keyboard.nextLine();
        
        StringBuilder palindromeBuilder = new StringBuilder(userString).reverse();
        palindromeTest = palindromeBuilder.toString();
        
        /*
        for (int count = userString.length()-1; count > -1; count--) {
            palindromeTest += userString.charAt(count);
        }
        */
        
        if (userString.equalsIgnoreCase(palindromeTest)) {
            System.out.println(userString + " is a Palindrome of " + palindromeTest);
        }
        else {
            System.out.println(userString + " is not a Palindrome of " + palindromeTest);
        }
    }
}