package problema6;
import problema6.Image;
public class Main {
    public static void main(String[] args) {
        Image imagen = new Image();

        imprimir(coloresUnicos(imagen));
    }

    static int[] coloresUnicos(Image imagen){
        int[] arrayPixeles = imagen.getPixeles();
        int[] coloresUnicos = new int[arrayPixeles.length];
        boolean seRepite = false;
        int j = 0, c = 0;

        rellenarArray(coloresUnicos);

       for(int i = 0; i < arrayPixeles.length; i++){
          seRepite = false;
          j = 0;
          while(seRepite == false && j < c){
              if (arrayPixeles[i] == coloresUnicos[j]) {
                  seRepite = true;
              }
              j++;
          }
          if(seRepite == false){
              coloresUnicos[c] = arrayPixeles[i];
              c++;
          }
          
       }
        return arrayLimpio(coloresUnicos, c);
    }


    static void imprimir(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }

    static void rellenarArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }
    }

    static int[] arrayLimpio(int [] array, int c){
        int[] arrayLimpioRgb = new int[c];
        for (int i = 0; i < c; i++) {
            if(array[i] != -1){
                arrayLimpioRgb[i] = array[i];
            }
        }
        return arrayLimpioRgb;
    }


}