public class p_120843 {
    
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8};
        int k =4;
        System.out.println(solution(numbers, k));
    }
    // 짝수는 홀수번째 유지

    static int solution(int[] numbers, int k) {
        int totalSize = numbers.length;
        if(totalSize%2 == 0) {
            int index = k%(totalSize/2) != 0 ? 2*(k%(totalSize/2)) : totalSize;
            index-=2;
            return numbers[index];
        } else {
            int index= k%totalSize;
            if(index == 0) return numbers[totalSize-2];
            if(index <= Math.ceil(totalSize/2.0)) {
                index = 2*index-1;
            } else {
                index/=2;
            }
            return numbers[index-1];
        }
    }
}
