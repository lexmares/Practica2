package problema1;

public class p1 {
    static int cantDigitos(int n){
        int c = 0;
        while(n != 0){
            if(n % 2 == 0){
                c += 1;
            }
            n/= 10;
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println(cantDigitos(121212121));
    }



}
