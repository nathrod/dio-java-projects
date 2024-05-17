package map;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    private String text;
    private String[] words;
    private Map<String, Integer> wordsCount;

    public WordCount(){
        wordsCount = new HashMap<>();
    }

    public void addText(String text){
        this.text = text;
        words = text.split("\\s+");
        for(String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "");
            if(!word.isEmpty()){
                if(wordsCount.containsKey(word)){
                    wordsCount.put(word, wordsCount.get(word)+1);
                }else{
                    wordsCount.put(word,1);
                }
            }
        }
    }

    //Percorrer a string e ir adicionando as palavras ao meu map e somando um ao seu count
    public void displayWordCount(){
        System.out.println("Word Count:");
        for (Map.Entry<String, Integer> entry : wordsCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void findMostFrequentWord(){
        String mostFrequentWord = null;
        int maxCount = Integer.MIN_VALUE;

        for(Map.Entry<String,Integer> entry : wordsCount.entrySet()){
            String word = entry.getKey();
            int count = entry.getValue();

            if(count>maxCount){
                maxCount = count;
                mostFrequentWord = word;
            }
        }

        if(mostFrequentWord != null){
            System.out.println("Most frequent word: " + mostFrequentWord + ", Count: " + maxCount);
        }else{
            System.out.println("No words found.");
        }
    }
}





















