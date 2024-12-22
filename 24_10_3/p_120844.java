public class p_120844 {
    
    public static void main(String[] args) {
        // int[] numbers = {1,2,3};
        // String direction = "LEFT";

        int[] numbers = {4, 455, 6, 4, -1, 45, 6};
        String direction = "LEFT";
        solution(numbers, direction);

        // 4 455 6 4 -1 45 6
        // 6 4 455 6 4 -1 45 Right
        // 455 6 4 -1 45 6 4 Left
    }
    static int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int dir = direction.startsWith("L") ? 1 : -1;
        int length = numbers.length;
        for(int i = 1; i<length-1;i++) {
            answer[i] = numbers[i+dir];
        }
        if(dir<0) {
            answer[0] = numbers[length-1];
            answer[length-1] = numbers[length-2];
        } else {
            answer[0] = numbers[1];
            answer[length-1] = numbers[0];
        }
        return answer;
    }
}
