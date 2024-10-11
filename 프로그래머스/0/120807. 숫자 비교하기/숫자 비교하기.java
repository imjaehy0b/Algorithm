import java.util.stream.*;
class Solution {
    public int solution(int num1, int num2) {
        return IntStream.of(num1,num2)
                .distinct()
                .count() == 1 ? 1 : -1;
    }
}