/**
 * Created by NgocAnDo on 3/21/17.
 */
public class SortingSubsets {
    public int getMinimalSize(int[] a){
        int pick = 0;
        for (int i = 0; i < a.length; i++){
            int smaller = 0;
            int bigger = 0;
            for (int j = 0; j < a.length; j++){
                if(a[j] < a[i])
                    smaller++;
                if(a[j] > a[i])
                    bigger++;
            }
            if(i < smaller || i > (a.length - bigger - 1))
                pick++;
        }
        return pick;
    }

}
