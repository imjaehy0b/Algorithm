import java.util.*;
import java.math.*;
class Solution {
    public int solution(int balls, int share) {
//         표준 계산식 사용시 오버플로우 발생.        
//         int n = 1;
//         int nm = 1;
//         for(int i=1; i<=balls-share; i++){
//             nm*=i;
//         }
//         for(int i=1; i<=balls; i++){
//             if(i>share){
//                 n*=i;
//             }
//         }
//         answer=  n/nm;
        BigInteger answer = BigInteger.ONE;
        BigInteger n = BigInteger.ONE;
        BigInteger nm = BigInteger.ONE;
        
        for(int i=1; i<=balls-share; i++){
            nm = nm.multiply(BigInteger.valueOf(i));
        }
        
        for(int i=1; i<=balls; i++){
            if(i>share){
                n = n.multiply(BigInteger.valueOf(i));
            }
        }
        
        answer = n.divide(nm);
        
        return answer.intValue();
    }
}