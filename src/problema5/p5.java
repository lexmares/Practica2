package problema5;

public class p5 {

    public static void main(String args[]) {
        int[] array = new int[]{4,1,5,2,1,1,5,4,1,1,2,3,3,2,4,1,1,5,4,4,2,1,4,2,5,3,4,1,4,1,5,1,5,2,4,4,4,2,3};
        imprimir(ordenarColores(array));
    }
    static int[] ordenarColores(int[] colores){
        boolean[] verificarColores = new boolean[colores.length];
        int[] coloresOrdenados = new int[colores.length];
        //verde 1, rojo 2, amarillo 3, azul 4 y blanco 5
        int colorActual = 1;
        int y = 0;
        while(y < coloresOrdenados.length){
            int par = 0;
            do{
                for(int z = 0; z < colores.length; z++){

                    if(colorActual == colores[z] && verificarColores[z] == false){
                        coloresOrdenados[y] = colorActual;
                        verificarColores[z] = true;
                        y++;
                        break;
                    }
                }
                par++;
            }while(par < 2);
            colorActual++;
            if (colorActual > 5) colorActual = 1;
        }
        return coloresOrdenados;
    }
    static void imprimir(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

}
