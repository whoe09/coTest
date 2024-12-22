public class p_12916 {
    public static void main(String[] args) {
        String s ="pPoooyY";
        System.out.println(solution(s));
    }

    static boolean solution(String s) {
        int sum = 0;
        for(Character c : s.toCharArray()) {
            if(c == 'p' || c == 'P') sum++;
            else if(c=='y' || c=='Y') sum--;
        }

        return (sum == 0);
    }
}
