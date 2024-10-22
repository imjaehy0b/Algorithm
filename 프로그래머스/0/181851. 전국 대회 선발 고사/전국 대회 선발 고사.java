import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int idx = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(boolean b : attendance){
            if(b) map.put(rank[idx],idx);
            idx++;
        }
        
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        
        int a = map.get(list.get(0));
        int b = map.get(list.get(1));
        int c = map.get(list.get(2));        
        
        
        return 10000*a+100*b+c;
    }
}