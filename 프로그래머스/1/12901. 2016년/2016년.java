import java.time.*;
import java.time.format.*;
import java.util.*;

class Solution {
    public String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016, a, b);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        
        return String.valueOf(dayOfWeek).substring(0,3);
    }
}