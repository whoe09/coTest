public class p_12940 {
    public static void main(String[] args) {

        int n = 2;
        int m = 5;
        solution(n, m);
        
    }

    static int[] solution(int n, int m) {
        int[] answer = new int[2];
        if(n==m) {
            answer[0] = n;
            answer[1] = n;
            return answer;
        } else {
            // 유클리드 호제법법
            int temp = 1;
            int max = n;
            int min = m;
            if(n<m) {
                max = m;
                min = n;
            }
            while(min!=0) {
                temp = min;
                min = max%min;
                max = temp;
            }
            answer[0]=temp;
            answer[1] = n*m/temp;
            return answer;
        }

        
    }
}
