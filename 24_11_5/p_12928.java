public class p_12928 {
    public static void main(String[] args) {
        System.out.println(solution(12));
    }

    static int solution(int n) {
        int answer = n;
        int half = n/2;

        for(int i = 1;i<=half;i++) {
            if(n%i == 0) answer+=i;
        }
        return answer;
    }
    // 1 2 3 4 6 12
    
}
