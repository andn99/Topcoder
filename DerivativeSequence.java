import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by NgocAnDo on 3/21/17.
 */
public class DerivativeSequence {
    public int[] derSeq(int[] a, int n){
        if(n == 0)
            return a;
        int[] tmp = new int[a.length - 1];
        for (int i = 1; i< a.length;i++){
            tmp[i - 1] = a[i] - a[i-1];
        }
        n--;
        return derSeq(tmp, n);
    }

}
