public class p_12934 {
    public static void main(String[] args) {
        long n = 121;
        System.out.println(solution(n));
    }
    static long solution(long n) {
        double temp = Math.sqrt(n);
        if(temp - (long)temp == 0) return (long)Math.pow(temp+1, 2);
        return -1;

    }
}
