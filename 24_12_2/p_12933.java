import java.util.Arrays;

public class p_12933 {
    
    public static void main(String[] args) {
        long n = 118300;
        System.out.println(solution(n));
    }

    static long solution(long n) {
       String[] list = String.valueOf(n).split("");
       Arrays.sort(list);

       StringBuilder sb = new StringBuilder();
       for(String aList : list) {
        sb.append(aList);
       }
       return Long.parseLong(sb.reverse().toString());
       
    }

    // static long solution(long n) {
    //     String tempN = n+"";
    //     StringBuilder sb = new StringBuilder();
    //     for(int i=9;i>=0;i--) {
    //         int org = tempN.length();
    //         int target = org - tempN.replaceAll(i+"", "").length();
    //         sb.append((i+"").repeat(target));
    //     }
    //     return Long.parseLong(sb.toString());
    // }
}
