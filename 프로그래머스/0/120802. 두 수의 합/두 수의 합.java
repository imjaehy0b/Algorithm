import java.util.stream.*;  // Add this import

class Solution {
    public int solution(int num1, int num2) {
        return IntStream.of(num1,num2).sum();
    }
}