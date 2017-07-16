/**
 * Created by NgocAnDo on 3/20/17.
 */
public class LotteryTicket {
    public String buy(int price, int b1, int b2, int b3, int b4){
        if(canBuy(price, new int[]{b1, b2, b3, b4}))
            return "POSSIBLE";
        return "IMPOSSIBLE";
    }

    boolean canBuy(int price, int[] demonations){
        if(price == 0)
            return true;
        if(price < 0 || demonations.length == 0)
            return false;
        int[] demos = new int[demonations.length - 1];
        for (int i = 1; i < demonations.length; i++)
            demos[i-1] = demonations[i];
        return canBuy(price - demonations[0], demos) || canBuy(price, demos);
    }
}
