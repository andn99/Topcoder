/**
 * Created by NgocAnDo on 3/21/17.
 */
public class Truckloads {
    public int numTrucks(int numCrates, int loadSize){
        int count = 0;
        if(numCrates <= loadSize)
            count++;
        else{
            count += numTrucks(numCrates/2, loadSize);
            count += numTrucks(numCrates/2 + numCrates%2, loadSize);
        }
        return count;
    }

}
