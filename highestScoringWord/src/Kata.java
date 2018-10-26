import java.util.*;

public class Kata {

    public static String high(String s) {
      Map<String, Integer> scoring = new HashMap();
      
      String[] words = s.split(" ");
      for(int i=0; i<words.length; i++){
        int score = 0;
        for(char c: words[i].toCharArray()){
            score += getScoringCharacter(c);
        }
        scoring.put(words[i], score);   
      }

      String result = null;
      Set<String> keys = scoring.keySet();
      for(String key: keys){
        if(result == null || (scoring.get(key) > scoring.get(result))){
            result = key;
        }
      }
      
      return result;
    }

    public static int getScoringCharacter(char character){
        String alphabet = "abcdefghijklmnñopqrstuvwxyz";
        
        return alphabet.indexOf(character)+1;
    }


    public static void main(String[] args){

       System.out.println(Kata.high("man i need a taxi up to ubud"));

    }

  }