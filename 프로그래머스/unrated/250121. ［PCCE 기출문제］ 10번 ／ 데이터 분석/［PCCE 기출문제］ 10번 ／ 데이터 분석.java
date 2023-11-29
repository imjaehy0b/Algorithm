import java.util.*;
class Solution {
    public List<int[]> solution(int[][] data, String ext, int val_ext, String sort_by) {

//ext와 sort_by가 data의 몇 번째 colum에 있는지 알아야함 -> 순서와 컬럼명을 1:1 매핑해야함 -> Map사용
//기존의 나의 방식은 switch를 사용해서 구분함
        List<int[]> list  = new ArrayList<>();
        Map<String, Integer> col = new HashMap<>();
        col.put("code",0);
        col.put("date",1);
        col.put("maximum",2);
        col.put("remain",3);
        

        //제공받은 값으로 colum의 index 파악
        int extIdx = col.get(ext);
        final int sortIdx = col.get(sort_by);
        
 //data에서 ext 값이 val_ext보다 작은 데이터만 list에 추가
        for(int i=0; i < data.length; i++){
            if(data[i][extIdx]<val_ext){
                list.add(data[i]);
            }
        }


        Collections.sort(list,(o1,o2)
                         ->o1[sortIdx]-o2[sortIdx]);

        return list;
    }
}