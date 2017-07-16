/**
 * Created by tienphamthuy on 3/1/17.
 */
public class Bits {
    public int minBits(int n){
        int bit = 0;
        int val = 1;
        while (val <= n){
            bit++;
            val = val*2;
        }
        return bit;
    }
}
