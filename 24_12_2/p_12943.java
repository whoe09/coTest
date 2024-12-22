public class p_12943 {
    public static void main(String[] args) {
        int num = 6;
        // solution(num);

        // String str = "aaabbcccd";
        // String str = "abcd";
        // String str = "aaa";
        String str = "aksdmklnvklankkknasdiofnnn";
        solution2(str);

        
    }
    static long solution(int num) {
        return collatz(num, 0);
    }

    static void solution2(String str) {
        // aaabbcccd
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<str.length();) {
            Character target = str.charAt(i);
            int cnt = 0;
            sb.append(target);
            for(int j = i;j<str.length();j++) {
                if(str.charAt(j) != target) break;
                cnt++;
            }
            if(cnt>1) sb.append(cnt);
            i+=cnt;
        }
        System.out.println(sb.toString());
    }

    static void solution3(String str) {
        for(int i = 0;i<str.length();i++) {
            
        }

    }

    static long collatz(long num,int cnt) {
        if (num ==1) return cnt;
        if(cnt>=500) return -1;
        if(num%2==0) {
            return collatz(num/2,cnt+=1);
        } else {
            return collatz(num*3+1,cnt+=1);
        }
    }
}
