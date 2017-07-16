/**
 * Created by NgocAnDo on 3/4/17.
 */
public class RosePetals {
    public int getScore(int[] dice){
        int petal = 0;
        for (int i = 0; i< 5; i++){
            switch (dice[i]){
                case 1:
                case 2:
                case 4:
                case 6:
                    break;
                case 3:
                    petal += 2;
                    break;
                case 5:
                    petal += 4;
                    break;
            }
        }
        return petal;
    }
}
