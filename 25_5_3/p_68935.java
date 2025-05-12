public class p_68935 {
    public static void main(String[] args) {
        int n = 43046721;
        solution(n);
    }
    static int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        while (true) { 
            if(n<3) {
                sb.append(n);
                break;
            }
            sb.append(n%3);
            n/=3;           
        }
        System.out.println(sb.toString());
        for(int i=0,j=sb.length()-1;i<sb.length();i++,j--) {
            int target = sb.charAt(i)-'0';
            if(target>0) {
                // System.out.printf("target : %d, j valud: %d,  add point : %d\n",target,j,(int)Math.pow(3, j)*target);
                answer+=(int)Math.pow(3, j)*target;
            }
        }
        System.out.println(answer);

        return answer;
    }
}
