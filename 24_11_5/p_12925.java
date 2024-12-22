public class p_12925 {
    public static void main(String[] args) {
        String s = "1234";
        System.out.println(solution(s));
    }

    static int solution(String s) {
        int answer = 0;
        for(int i = s.length()-1,j=0;i>=0;i--,j++) {
            switch (s.charAt(i)) {
                case '-':
                    answer*=-1;
                    break;
                case '+':
                    ;
                    break;
                default:
                    answer+=(s.charAt(i)-'0')*Math.pow(10, j);
                    break;
            }
        }
        return answer;
    }
}
