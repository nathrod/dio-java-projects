package set;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordsSet {
    private Set<String> uniqueWords;

    public UniqueWordsSet(){
        uniqueWords = new HashSet<>();
    }

    public void addWord(String word){
        uniqueWords.add(word);
    }

    public void removeWord(String word){
        String wordToRemove = null;
        for(String words : uniqueWords){
            if(words.equalsIgnoreCase(word)){
                wordToRemove = words;
                break;
            }
        }
        uniqueWords.remove(wordToRemove);
    }

    public void checkWord(String word){
        boolean found = false;
        for(String words : uniqueWords){
            if(words.equalsIgnoreCase(word)) {
                found = true;
                break;
            }
        }

        if(found){
            System.out.println(word + " is present in the set.");
        }else{
            System.out.println(word + " doesn't exist in the set.");
        }
    }

    public void displayUniqueWords(){
        System.out.println(uniqueWords);
    }
}
