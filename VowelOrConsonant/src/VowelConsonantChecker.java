import javax.swing.JOptionPane;

public class VowelConsonantChecker {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog(null, "Enter a character:");

        if (input != null && input.length() == 1) {
            char ch = input.charAt(0);

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                if (isVowel(ch)) {
                    JOptionPane.showMessageDialog(null, ch + " is a vowel.");
                } else {
                    JOptionPane.showMessageDialog(null, ch + " is a consonant.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter an alphabet.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a single character.");
        }
    }

    public static boolean isVowel(char ch) {

        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        for (int i = 0; i < vowels.length; i++) {
            if (ch == vowels[i]) {
                return true;
            }
        }
        return false;
    }
}