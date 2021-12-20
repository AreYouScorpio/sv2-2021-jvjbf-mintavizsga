package algorithms;

import java.util.ArrayList;
import java.util.List;

public class Sentences {

    private List<String> sentences = new ArrayList<>();

    public List<String> getSentences() {
        return sentences;
    }

    public List<String> addSentence(String sentence){
        char[] chars = sentence.toCharArray();
        char firstChar = chars[0];
        char lastChar = chars[chars.length-1];
        if (!(firstChar>='A' & firstChar<='Z')) {
            throw new IllegalArgumentException("Sentence must start with capital!");
        }
        else if (!(lastChar=='.' || lastChar=='?' || lastChar=='!')) {
            throw new IllegalArgumentException("Sentence must end with ending mark!");
        }
        sentences.add(sentence);
        return sentences;
    }

    public String findLongestSentence(){
        if (sentences.size()<1) throw new IllegalStateException("Empty list.");
        int max=0;
        String maxWord="";
        for (int i=0; i<sentences.size();i++){
            if (sentences.get(i).length()>max){
                max=sentences.get(i).length();
                maxWord=sentences.get(i);
            }
        }
        return maxWord;
    }
}
