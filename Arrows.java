/**
 * Created by NgocAnDo on 3/4/17.
 */
public class Arrows {
    public  int longestArrow(String s){
        int maxLen = -1;
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '<'){
                int len = 1;
                if(i < s.length() - 1){
                    char nextC = s.charAt(i+1);
                    if(nextC != '<' && nextC != '>'){
                        len ++;
                        for (int j = i + 2; j < s.length(); j++){
                            if(nextC == s.charAt(j)){
                                len++;
                            }else{
                                break;
                            }
                        }
                    }
                }
                if(len > maxLen)
                    maxLen = len;

            }else if(c == '>'){
                int len = 1;
                if(i > 0){
                    char nextC = s.charAt(i-1);
                    if(nextC != '<' && nextC != '>'){
                        len ++;
                        for (int j = i - 2; j >= 0 ; j--){
                            if(nextC == s.charAt(j)){
                                len++;
                            }else{
                                break;
                            }
                        }
                    }
                }
                if(len > maxLen)
                    maxLen = len;
            }
        }
        return maxLen;
    }
}
