public class p_12912 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        System.out.println(solution2(a, b));
    }

    static long solution(int a,int b) {
        // 양의 정수만 되는것..
        if(a==b) return a;

        int max = b;
        int min = a;
        if(a>b) {
            max = a;
            min = b;
        }

        return (max*(max+1))/2 - (min*(min-1))/2;
    }

    static long solution2(int a,int b) {
        long answer = 0;
        if(a==b) return a;

        int max = b;
        int min = a;
        if(a>b) {
            max = a;
            min = b;
        }

        for(int i = min;i<=max;i++) {
            answer+=i;
        }
        return answer;
    }
}
