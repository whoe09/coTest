public class p_12901 {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        System.out.println(solution(a, b));

        
    }

    static String solution(int a, int b) {
        String answer = "";
        // 31 일 : 1,3,5,7,8,10,12
        // 30 일 : 4,6,9,11
        // 29 일 : 2

        // 2016.1.1 = 금요일

        int sum = 0;
        for(int i = 1;i<a-1;i++) {
            if(i==4 || i == 6 || i == 9 || i ==11) {
                sum+=30;
            }else if(i==2) sum+=29;
            else sum+=31;
        }
        sum+=(b+1);
        System.out.println(sum%7);
        String result = "MON";
        switch (sum%7) {
            case 2 -> result="TUE";
            case 3 -> result="WED";
            case 4 -> result="TUE";
            case 5 -> result="FIR";
            case 6 -> result="SAT";
            case 7 -> result="SUN";
        }
        return result;
    }

}
