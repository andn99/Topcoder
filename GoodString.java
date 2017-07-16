import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by NgocAnDo on 3/27/17.
 */
public class GoodString {
    public String isGood(String s){
        Pattern pat = Pattern.compile("ab");
        Matcher action = pat.matcher(s);
        StringBuffer sb = new StringBuffer(s.length());
        while (action.find()) {
            String text = action.group(0);
            s = action.replaceAll("");
            action = pat.matcher(s);
        }
        //action.appendTail(sb);
        if(s.isEmpty())
            return "Good";
        return "Bad";
    }
}
