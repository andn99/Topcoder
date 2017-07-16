import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by NgocAnDo on 3/4/17.
 */
public class HowManyBirthdays {
    public String[] getList(String[] friends, String today){
        String[] dayStr = today.split(" ");
        Integer day = Integer.parseInt(dayStr[0]);
        Integer month = Integer.parseInt(dayStr[1]);
        ArrayList<String> bdList = new ArrayList<String>();
        for (String str: friends) {
            String[] friendInfo = str.split(" ");
            String name = friendInfo[0];
            Integer fday = Integer.parseInt(friendInfo[1]);
            Integer fmonth = Integer.parseInt(friendInfo[2]);
            if(fday == day && fmonth == month){
                bdList.add(name);
            }
        }
        Collections.sort(bdList);
        String[] results = new String[bdList.size()];
        for (int i = 0; i < bdList.size(); i++){
            results[i] = bdList.get(i);
        }
        return results;
    }
}
