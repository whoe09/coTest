public class p_12931 {
    public static void main(String[] args) {
        int n = 987;
        System.out.println(solution(n));
    }

    static int solution(int n) {
        int answer = 0;
        int maxLength = (n+"").length();
        for(;maxLength>=0;maxLength--) {
            int target = (int)Math.pow(10, maxLength);
            answer += n/target;
            n%=target;
        }

        // while(true){
        //     answer+=n%10;
        //     if(n<10)
        //         break;

        //     n=n/10;
        // }
        return answer;
    }
}
