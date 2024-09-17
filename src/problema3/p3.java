package problema3;

public class p3 {
    static boolean esCapicua(int num){

        int n = num;
        int i = 0;
        int r = 0;

        while(n != 0){
            r = n % 10;
            i = i * 10 + r;
            n = n/10;
        }
        if(i == num) return true;
        else return false;
    }


    public static void main(String[] args) {
        System.out.println(esCapicua(990099));
    }

}
