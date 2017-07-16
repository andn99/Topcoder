import java.util.ArrayList;
import java.util.List;

/**
 * Created by NgocAnDo on 3/2/17.
 */
public class InterestingDigits {
    public int[] digits(int base){
        List<Integer> interestings = new ArrayList<Integer>();
        int limit = base*base*base;
        for (int i = 2; i < base; i++){
            if(isInteresting(i, base))
                interestings.add(i);
        }
        int[] list = new int[interestings.size()];
        for (int i = 0; i < interestings.size(); i++)
            list[i] = interestings.get(i);
        return list;
    }

    public boolean isInteresting(int digit, int base){
        for (int d = digit; d < base*base*base; d += digit){
            int sum = 0;
            int n = d;
            while (n > 0){
                sum += n%base;
                n = n/base;
            }
            if(sum%digit != 0)
                return false;
        }
        return true;
    }
}
