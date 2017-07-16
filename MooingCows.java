/**
 * Created by NgocAnDo on 3/4/17.
 */
public class MooingCows {
    int dissatisfaction(String[] farmland){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < farmland.length; i++){
            String squares = farmland[i];
            for (int j = 0; j < squares.length(); j++){
                char cow = squares.charAt(j);
                if(cow == 'C'){
                    int totalDis = 0;
                    for (int x = 0; x < farmland.length; x++) {
                        String checkLand = farmland[x];
                        for (int y = 0; y < checkLand.length(); y++){
                            char checkCow = checkLand.charAt(y);
                            if(checkCow == 'C'){
                                int dis = (x - i)*(x - i) + (y - j) * (y - j);
                                totalDis += dis;
                            }
                        }
                    }
                    if(totalDis < min)
                        min = totalDis;
                }
            }
        }
        return min;
    }
}
