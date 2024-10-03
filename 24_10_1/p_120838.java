
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p_120838 {
    public static void main(String[] args) {

        String letter = ".... . .-.. .-.. ---";
        solution(letter);
        
    }

    static String solution(String letter) {
        List<String> morseLetter = Arrays.asList(new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."});   
        Map<String,Character> morseMap = new HashMap<>(26);
        for(int i = 0;i<morseLetter.size();i++) {
            morseMap.put(morseLetter.get(i), (char)(i+97));
        }
        StringBuilder sb = new StringBuilder();
        for(String code : letter.split(" ")) {
            sb.append(morseMap.get(code));
        }
        return sb.toString();
    }
}
