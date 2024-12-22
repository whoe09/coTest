public class p_12947 {
    public static void main(String[] args) {
        int x = 12;
        solution(x);
        
    }

    static boolean solution(int x) {
        int answer = 0;
        int orgx = x;
        while(true){
            answer+=x%10;
            if(x<10)
                break;
            x=x/10;
        }
        System.out.println(orgx%answer);
        return x%answer == 0;
    }
}
