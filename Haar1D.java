/**
 * Created by NgocAnDo on 4/1/17.
 */
public class Haar1D {
    int[] transform(int[] data, int l){
        return transform(data, l, 1);
    }
    int[] transform(int[] data, int l, int count){
        if(l == 0)
            return data;
        int[] d = new int[data.length];
        int idx = 0;

        for (int i = 0; i < data.length/count; i += 2) {
            d[idx] = data[i] + data[i + 1];
            idx++;
        }

        for (int i = 0; i < data.length/count; i += 2) {
            d[idx] = data[i] - data[i + 1];
            idx++;
        }

        for (int i = data.length/count; i < data.length; i++) {
            d[idx] = data[i];
            idx++;
        }

        count *= 2;
        return transform(d, l - 1, count);
    }
}
