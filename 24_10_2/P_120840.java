public class P_120840 {
    public static void main(String[] args) {
        System.out.println(solution(30,10));

        // 30 29 28 ... 16 (15 14 ..)
        // 15 14 13 ... (15 14 13)
    }

    static int solution(int balls, int share) {
        if(balls == share) return 1;
        int result = 1;
        share = balls-share > share ? balls-share : share;
        int[] bottoms = new int[share];
        for(int i = 0;i<bottoms.length;i++) {
            bottoms[i]=i+1;
        }
        for(int i = balls;i>share;i--) {
            // result *= i;
            int temp = i;
            for(int j = 0;j<bottoms.length;j++) {
                if(bottoms[j] != 0 && i%bottoms[j] == 0) {
                    temp/=bottoms[j];
                    // result/=bottoms[j];
                    bottoms[j] = 0;
                    break;
                }
            }
            result *= temp;
        }
        return result;
    }
}
