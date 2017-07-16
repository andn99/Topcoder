public class FriendlySequences{
//Test edit file and the pull
    public static int count(int[] array){
        if(array.length <= 1)
            return 0;
        int count = 0;
        for (int i = 0; i < array.length - 1; i++){
            for (int j = i+1; j < array.length; j++){
                String s1 = Integer.toString(array[i]);
                String s2 = Integer.toString(array[j]);

                boolean friendly1 = true;//Check if S2 contains all digits of S1
                for (int k = 0; k < s1.length(); k++){
                    boolean found = false;
                    for (int m = 0; m < s2.length(); m++){
                        if(s1.charAt(k) == s2.charAt(m)) {
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        friendly1 = false;
                        break;
                    }

                }

                boolean friendly2 = true;//Check if S1 contains all digits of S2
                for (int k = 0; k < s2.length(); k++){
                    boolean found = false;
                    for (int m = 0; m < s1.length(); m++){
                        if(s2.charAt(k) == s1.charAt(m)) {
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        friendly2 = false;
                        break;
                    }

                }

                if(friendly1 && friendly2)
                    count++;
                else
                    break;
            }
        }

        return count;
    }

}
