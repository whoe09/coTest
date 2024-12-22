public class p_12918 {

    public static void main(String[] args) {
        String s= "1234";
        System.out.println(solution(s));
        
    }

    static boolean solution(String s) {
        boolean answer = true;
        if(!(s.length() == 4 || s.length() == 6)) return false;
        for(Character c : s.toCharArray()) {
            int test = c -'0';
            if(test<0 || test>9) return false;
        }
        return answer;
    }

    static boolean solution_best(String s) {
        if(!(s.length() == 4 || s.length() == 6)) return false;
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
}
