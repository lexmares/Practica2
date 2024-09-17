package problema6;

public class Image {
    private int renglones;
    private int columnas;
    private int[] pixeles;

    public Image(){
        renglones = 10;
        columnas = 5;
        pixeles = new int[]{
                0xFFFFFF, 0x000000, 0xFF0000, 0x00FF00, 0x0000FF, // Blanco, negro, rojo, verde, azul
                0xFFFF00, 0xFF00FF, 0x00FFFF, 0xC0C0C0, 0x808080, // Amarillo, magenta, cian, gris claro, gris oscuro
                0x800000, 0x808000, 0x008000, 0x800080, 0x008080, // Marrón oscuro, verde oliva, verde, púrpura, verde azulado
                0xFFA500, 0xA52A2A, 0x8B4513, 0x2E8B57, 0x4682B4, // Naranja, marrón, marrón claro, verde marino, azul acero
                0xD2691E, 0xCD5C5C, 0xF4A460, 0xDA70D6, 0xB0E0E6, // Chocolate, rojo indio, arena, orquídea, azul polvoriento
                0xADFF2F, 0xFF1493, 0xFFD700, 0xE6E6FA, 0x20B2AA, // Verde lima, rosa intenso, oro, lavanda, azul aguamarina
                0xFFFFFF, 0x000000, 0xFF0000, 0x00FF00, 0x0000FF, // Blanco, negro, rojo, verde, azul (repetidos para pruebas)
                0xFFFF00, 0xFF00FF, 0x00FFFF, 0xC0C0C0, 0x808080, // Amarillo, magenta, cian, gris claro, gris oscuro (repetidos)
                0x800000, 0x808000, 0x008000, 0x800080, 0x008080, // Marrón oscuro, verde oliva, verde, púrpura, verde azulado (repetidos)
                0xFFA500, 0xA52A2A, 0x8B4513, 0x2E8B57, 0x4682B4  // Naranja, marrón, marrón claro, verde marino, azul acero (repetidos)
        };
    }

    public int[] getPixeles() {
        return pixeles;
    }
}
