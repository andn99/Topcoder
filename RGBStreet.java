/**
 * Created by NgocAnDo on 4/1/17.
 */
public class RGBStreet {
    private static final int MAX = 100000;
    public int estimateCost(String[] houses){
        int[][] costs = new int[houses.length][3];
        for (int i = 1; i < houses.length; i++){
            for (int j = 0; j < 3 ; j++)
                costs[i][j] = MAX;
        }
        String[] val = houses[0].split(" ");
        for (int i = 0; i < 3; i++){
            costs[0][i] = Integer.valueOf(val[i]);
        }

        for (int i = 1; i < houses.length; i++){
            val = houses[i].split(" ");
            for (int j = 0; j < 3; j ++){
                for (int k = 0; k < 3; k++){
                    if(j != k){
                        costs[i][j] = Math.min(costs[i][j], Integer.valueOf(val[j]) + costs[i-1][k]);
                    }
                }
            }
        }
        int min = MAX;
        for (int i = 0; i < 3; i++){
            if(costs[houses.length - 1][i] < min)
                min = costs[houses.length - 1][i];
        }

        return min;
    }
}
