public class p_120839 {
    public static void main(String[] args) {
        System.out.println(solution("205"));
    }

    static String solution(String rsp) {
        StringBuffer sb = new StringBuffer();
        for (Character c : rsp.toCharArray()) {
            switch (c) {
                case '0' -> sb.append(5);
                case '2' -> sb.append(0);
                default -> sb.append(2);
            }            
        }
        return sb.toString();
    }
}
