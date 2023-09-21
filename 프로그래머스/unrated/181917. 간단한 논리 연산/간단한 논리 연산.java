class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        //∨ = OR , ∧ = AND
        boolean or = (x1 || x2);
        boolean or2 = (x3 || x4);
        boolean and = or && or2;
        boolean answer = and;
        
        return answer;
    }
}