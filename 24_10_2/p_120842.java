public class p_120842 {
    public static void main(String[] args) {
        int[] num_list = {100, 95, 2, 4, 5, 6, 18, 33, 948};
        int n = 3;
        solution(num_list, n);        
    }

    static int[][] solution(int[] num_list, int n) {
        int row = num_list.length/n;
        int[][] answer = new int[row][n];

        for(int i = 0,k=0;i<row;i++) {
            for(int j = 0;j<n;j++) {
                answer[i][j] = num_list[k++];
            }
        }
        return answer;
    }
}
