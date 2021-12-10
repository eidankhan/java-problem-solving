package string;

import java.util.HashMap;
import java.util.Map;

public class StringManipulation {
    public static void main(String[] args){
        StringManipulation stringManipulation = new StringManipulation();
        stringManipulation.findFrequenceyOfCharacter("implement the logic you need here");
    }
    public void findFrequenceyOfCharacter(String text){
        text = text.replaceAll(" ", "").toLowerCase();
        Map<Character, Integer> frequencies = new HashMap<>();
        for(int x=0; x<text.length(); x++){
            int counter = 1;
            for(int y=x+1; y<text.length(); y++){
                if(text.charAt(x) == text.charAt(y)){
                    ++counter;
                }
            }
            if(!frequencies.containsKey(text.charAt(x))){
                frequencies.put(text.charAt(x), counter);
            }

        }
        for (Map.Entry<Character,Integer> entry : frequencies.entrySet())
            System.out.println(entry.getKey() +":"+ entry.getValue());
    }
}
