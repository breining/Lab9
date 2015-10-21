package palindrome;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author breining
 * @version 10/20/2015
 */
public class Palindrome {

    Stack<String> s1;
    Stack<String> s2;

    public Palindrome() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    /**
     *
     * @param string
     * @return boolean
     * Pop first stack and push into a new stack. Compare the
     * two stacks using equals traversal.
     */
    public boolean isPalindrome(String string) {
        
        for (int i = 0; i < string.length(); i++) {
            s1.push(Character.toString(string.charAt(i)));
        }
        for (int j = string.length() - 1; j >= 0; j--) {
            s2.push(Character.toString(string.charAt(j)));
        }

        while (!s1.empty() && !s2.empty()) {
            for (int i = 0; i < string.length(); i++) {
                if (s1.pop().equals(s2.pop())) {
                    System.out.println("This is a palindrome.");
                    return true;
                } else {
                    System.out.println("This is not a palindrome.");
                    return false;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String string = keyboard.nextLine();
        Palindrome test = new Palindrome();
        test.isPalindrome(string);
        
    }

}
