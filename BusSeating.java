/**
 * Created by NgocAnDo on 3/4/17.
 */
public class BusSeating {
    public double getArrangement(String leftRow, String rightRow){
        double distance = 9999;
        String seats = leftRow + rightRow;

        for (int i = 0; i < seats.length(); i++){
            for (int j = 0; j < seats.length(); j++){
                for ( int k = 0; k < seats.length(); k++){
                    if(i != j && j != k && k != i){
                        if(seats.charAt(i) != 'X' && seats.charAt(j) != 'X' && seats.charAt(k) != 'X'){
                            double d = getDistance(i,j) + getDistance(j,k) + getDistance(k,i);
                            if(distance > d)
                                distance = d;
                        }
                    }
                }
            }
        }
        return distance;
    }

    private double getDistance(int p1, int p2){
        int px1 = 0;
        int py1 = 0;
        int px2 = 0;
        int py2 = 0;
        if(p1 < 10){
            px1 = 0;
            py1 = p1;
        }else{
            px1 = 2;
            py1 = p1 - 10;
        }

        if(p2 < 10){
            px2 = 0;
            py2 = p2;
        }else{
            px2 = 2;
            py2 = p2 - 10;
        }
        return Math.sqrt((px1 - px2)*(px1 - px2) + (py1 - py2)*(py1-py2));
    }

}
