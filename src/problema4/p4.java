package problema4;

public class p4 {
    static int cantF(float[] a, float x){
        int c = 0;
        for(float n : a){
            if (n == x) c++;
        }
        return c;
    }

    public static void main(String[] args) {
        float[] array = new float[]{10, 12, 1212, 10, 10, 10, 10};
        System.out.println(cantF(array,10));
    }
}
