/**
 * Created by Ngoc An Do on 2/27/17.
 */
public class FunnyFence {
    public static int getLength(String s){
        if(s == null || s.isEmpty())
            return 0;
        if(s.length() == 1)
            return 1;
        int len = 1;
        int maxLen = 1;
        for (int i = 0; i < s.length()-1; i++){
            char c = s.charAt(i+1);
            if(c != s.charAt(i)){
                len++;
                if(maxLen < len)
                    maxLen = len;
            }else {
                len = 1;
            }
        }
        return maxLen;
    }
}
