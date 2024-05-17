package map;

import java.util.Map;
import java.util.TreeMap;

public class Dictionary {
    private Map<String, String> words;

    public Dictionary(){
        this.words = new TreeMap<>();
    }

    public void addWord(String word, String definition){
        words.put(word, definition);
    }

    public void removeWord(String word){
        if(!words.isEmpty()){
            words.remove(word);
        }
    }

    public void displayWords(){

        System.out.println(words);
    }

    public String searchByWord(String word){
        String wordFound = null;
        if(!words.isEmpty()){
            wordFound = words.get(word);
        }
        return wordFound;
    }
}
