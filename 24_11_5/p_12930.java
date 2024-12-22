
public class p_12930 {
    public static void main(String[] args) {
        // String s = "TRy HElLo  WORLD";
        String s = "  TRy HElLo  WORLD ";
        System.out.println(solution(s));
    }

    static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();) {
            if(s.charAt(i)==' ') {
                sb.append(" ");
                i++;
            }
            else {
                int j = 0;
                while(true) {
                    if(i+j>=s.length()) break;
                    Character target = s.charAt(i+j);
                    if(target == ' ') break;
                    if(j%2==0) sb.append(Character.toUpperCase(target));
                    else sb.append(Character.toLowerCase(target));
                    j++;                   
                }
                i+=j;
            }
        }
        return sb.toString();
    }

    // static String solution(String s) {
    //     String[] dump = s.split(" ");
    //     for(String t : dump) {
    //         System.out.println(t);
    //     }
    //     StringBuilder sb = new StringBuilder();
    //     for (int i = 0;i<dump.length;i++) {
    //         String target = dump[i];
    //         if(target.length()==0) {
    //             sb.append(" ");
    //         } else {
    //             for(int j =0;j<target.length();j++) {
    //                 Character c = target.charAt(j);
    //                 if (j%2==0) c= Character.toUpperCase(c);
    //                 else c= Character.toLowerCase(c);
    //                 sb.append(c);
    //             }
    //             if(i+1 != dump.length) sb.append(" ");
    //         }
    //     }
    //     return sb.toString();
    // }
        
}
