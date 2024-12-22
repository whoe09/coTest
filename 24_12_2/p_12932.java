




public class p_12932 {
    public static void main(String[] args) {

        long n = 10000000000L;
        solution(n);
        
    }

    static long[] solution(long n) {
        long[] answer = new long[(n+"").length()];

        int i =0;
        while(true){
            answer[i] = n%10;
            // System.out.println(answer[i]);
            i++;
            if(n<10)
                break;
            n=n/10;
        }
        return answer;
    }
}
