import java.util.HashSet;
import java.util.Set;

/**
 * Created by NgocAnDo on 3/21/17.
 */
public class EightRooks {
    public String isCorrect(String[] board){
        Set<Integer> rows = new HashSet<Integer>();
        Set<Integer> cols = new HashSet<Integer>();
        int count = 0;
        for (int i = 0; i< board.length; i++){
            for (int j = 0; j < board[i].length(); j++){
                if(board[i].charAt(j) == 'R'){
                    if(rows.contains(i) || cols.contains(j))
                        return "Incorrect";
                    rows.add(i);
                    cols.add(j);
                    count++;
                }
            }
        }
        if(count < 8)
            return "Incorrect";
        return "Correct";
    }
}
