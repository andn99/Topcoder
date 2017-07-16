/**
 * Created by tienphamthuy on 3/1/17.
 */
public class Soccer {
    public int maxPoints(int[] wins, int[] ties){
        int maxP = 0;
        for (int i = 0; i< wins.length; i++){
            int p = wins[i]*3 + ties[i]*1;
            if(maxP < p)
                maxP = p;
        }
        return maxP;
    }
}
