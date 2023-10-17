import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DictionaryManagement dictionaryManagement = new DictionaryManagement();
        dictionaryManagement.insertFromFile("src\\english.txt");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a word (or type 'q' to quit): ");
            String input = scanner.nextLine();
            if(input.equals("insert")) {
                dictionaryManagement.insertFromCommandline();


            }
            if (input.equalsIgnoreCase("q")) {
                break;
            }

            String definition = dictionaryManagement.findDefinition(input);
            System.out.println("Definition: " + definition);
        }

        System.out.println("Goodbye!");
        scanner.close();
    }
}