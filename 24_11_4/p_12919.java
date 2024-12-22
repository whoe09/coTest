public class p_12919 {
    public static void main(String[] args) {

        String[] seoul = {"Jane", "Kim"};
        System.out.println(solution(seoul));
        
    }

    static String solution(String[] seoul) {
        String target = "Kim";
        for(int i = 0;i<seoul.length;i++) {
            if(seoul[i].equals(target)) {
                return "김서방은 "+(i)+"에 있습니다";
            }
        }
        return "";
    }
}
