import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DictionaryManagement extends Dictionary {

    public void insertFromCommandline() {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String[] rows = line.split(",");
        String word_target = rows[0];
        String word_explain = rows[1];
        addWord(word_target, word_explain);
    }

    public void insertFromFile(String filePath) {
        String line = "";
        String split = ",";
        try {
            BufferedReader br = new BufferedReader(new FileReader("src\\english.txt"));
            while ((line = br.readLine()) != null) {
                String[] row = line.split(split);
                super.addWord(row[0], row[1]);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // Thêm các từ vào từ điển
        super.addWord("hello", "Xin chào.");
        super.addWord("java", "phim nhật.");

    }

    public void insertFromDatabase()


}
