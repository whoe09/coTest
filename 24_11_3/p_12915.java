
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p_12915 {
    public static void main(String[] args) {
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;
        solution(strings, n);
        
    
    }

    static String[] solution(String[] strings, int n) {
        Map<Character,List<String>> map = new HashMap<>();

        for(String s : strings) {
            Character c = s.charAt(n);
            if(map.get(c) == null) {
                List<String> newList = new ArrayList<>();
                newList.add(s);
                map.put(c, newList);
            }
            else {map.get(c).add(s);}
            
        }

        List<Character> mapByKey = new ArrayList<>(map.keySet());
        Collections.sort(mapByKey);

        List<String> result = new ArrayList<>();
        for(Character c : mapByKey) {
            Collections.sort(map.get(c));
            result.addAll(map.get(c));
        }
        return result.stream().toArray(String[]::new);
    }
}
