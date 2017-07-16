/**
 * Created by Ngoc An Do on 2/27/17.
 */
public class AimToTen {
    public static int need(int[] marks){
        int len = marks.length;
        double sum = 0;
        double avg = 0;

        for (int i = 0; i < len; i++){
            sum += marks[i];
        }
        avg = sum*1.0/len;
        if(avg >= 9.5)
            return 0;

        int num = 0;
        while (avg < 9.5){
            num ++;
            sum += 10;
            avg = sum*1.0/(len+num);
        }
        return num;
    }
}
