import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {
    private HashMap<String, String> map;
    public Dictionary() {
        this.map = new HashMap<>();
    }

    public void addWord(String word_target, String word_explain) {
        map.put(word_target, word_explain);
    }

    public String getExplain(String word_target) {
        return map.get(word_target);
    }

    public String findDefinition(String word_target) {
        if(map.containsKey(word_target)) {
            return getExplain(word_target);
        }
        return "404 - NOT FOUND \n";
    }

}
