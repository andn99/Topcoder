/**
 * Created by tienphamthuy on 3/1/17.
 */
public class CheckFunction {
    public int newFunction(String code){
        int count = 0;
        for (int i = 0; i < code.length(); i++){
            if(code.charAt(i) == '0'){
                count += 6;
            }else if(code.charAt(i) == '1'){
                count += 2;
            } else if(code.charAt(i) == '2'){
                count += 5;
            } else if(code.charAt(i) == '3'){
                count += 5;
            }else if(code.charAt(i) == '4'){
                count += 4;
            }else if(code.charAt(i) == '5'){
                count += 5;
            }else if(code.charAt(i) == '6'){
                count += 6;
            }else if(code.charAt(i) == '7'){
                count += 3;
            }else if(code.charAt(i) == '8'){
                count += 7;
            }else if(code.charAt(i) == '9'){
                count += 6;
            }
        }
        return count;
    }
}
