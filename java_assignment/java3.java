import java.util.Scanner;

class CheckPanagram {

    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase(); // Convert input to lowercase for case-insensitivity

        boolean[] isAlphabetPresent = new boolean[26]; // Array to track alphabet presence

        // Iterate through the input and mark each letter as present
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z') {
                isAlphabetPresent[c - 'a'] = true;
            }
        }

        // Check if all alphabet letters are present
        boolean isPangram = true;
        for (boolean isPresent : isAlphabetPresent) {
            if (!isPresent) {
                isPangram = false;
                break;
            }
        }

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }

    }
    
}
