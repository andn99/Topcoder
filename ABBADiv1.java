/**
 * Created by tienphamthuy on 3/1/17.
 */
public class ABBADiv1 {
    public String canObtain(String initial, String target){
        if(initial == null || initial.isEmpty() || target == null || target.isEmpty() || initial.length() >= target.length())
            return "Impossible";
        String initS = initial;
        while (initS.length() < target.length() ){
            boolean canMove = false;
            String tmp = initS + "A";
            if(target.substring(0,tmp.length()).equals(tmp)){
                canMove = true;
                initS = tmp;
            }else{
                tmp = initS + "B";
                tmp = new StringBuffer(tmp).reverse().toString();
                String cmp = target.substring(0, tmp.length());
                if(cmp.equals(tmp))
                    canMove = true;
            }
            if(!canMove){
                return "Impossible";
            }

            initS = tmp;
        }

        if(initS.equals(target))
            return "Possible";
        else
            return "Impossible";
    }
}
