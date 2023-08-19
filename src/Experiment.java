import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Collections.sort;

class Pair implements Comparable<Pair>{
    private  int s, e;
    Pair(int s, int e){
        this.s = s;
        this.e = e;
    }
    int getStartTime(){
        return s;
    }
    int getEndTime(){
        return e;
    }

    @Override
    public int compareTo(Pair p){
        return Math.abs(this.s - this.e) - Math.abs(p.s - p.e);
    }
}

public class Experiment {

    public static int maxMeetings(int[] start, int[] end, int n) {
        List<Pair> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new Pair(start[i], end[i]));
        }
        sort(arr);
        int count = 1;
        int prevS = arr.get(0).getStartTime(), prevE = arr.get(0).getEndTime();
        for (int i = 1; i < n; i++) {
            if (arr.get(i).getStartTime() >= prevE) {
                ++count;
                prevS = arr.get(i).getStartTime();
                prevE = arr.get(i).getEndTime();
            }
        }
        return count;
    }
}
