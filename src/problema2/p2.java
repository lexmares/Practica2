package problema2;

public class p2 {
    static boolean esPalindromoP(String palabra){
        char[] x = palabra.toCharArray();
        String palabraReverse = "";
        boolean espalindromo = false;
        for(int i = x.length - 1; i>=0; i--){
            palabraReverse += x[i];
        }
        if(palabraReverse.equalsIgnoreCase(palabra)) return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(esPalindromoP("salas"));
    }

}
