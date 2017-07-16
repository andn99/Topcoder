/**
 * Created by NgocAnDo on 3/31/17.
 */
public class ColorfulRoad {
    private static final int  MAX = 100000;
    public int getMin(String road){
        int[] min = new int[road.length()];
        for (int i = 0; i < min.length; i++){
            min[i] = MAX;
        }
        min[0] = 0;
        char[] arr = road.toCharArray();
        for (int i = 0; i < arr.length - 1; i++){
            if(min[i] != MAX) {
                for (int j = i; j < arr.length; j++) {
                    if((arr[i] == 'R' && arr[j] == 'G') || (arr[i] == 'G' && arr[j] == 'B') || (arr[i] == 'B' && arr[j] == 'R')){
                        min[j] = Math.min(min[j], (j-i)*(j-i) + min[i]);
                    }
                }
            }
        }
        if(min[min.length - 1] == MAX)
            return -1;
        return min[min.length - 1];
    }

}
