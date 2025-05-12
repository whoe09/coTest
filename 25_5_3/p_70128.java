public class p_70128 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b= {-3,-1,0,2};
        solution(a, b);
        
    }

    static int solution(int[]a, int[]b) {
        int answer = 0;
        for(int i = 0;i<a.length;i++) {
            if(a[i] != 0 && b[i] != 0) {
                answer+=(a[i]*b[i]);
            }
        }
        System.out.println(answer);
        return answer;
    }
}
