
package mundopc;
import com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        
        Orden orden1 = new Orden();
        Computadora computadora1 = new Computadora("HP",new Monitor("marca", 13),new Teclado("bluetooth","marca"),new Raton("bluetooth","marca"));
        Computadora computadora2 = new Computadora("HP",new Monitor("Gamer", 14),new Teclado("bluetooth","razer"),new Raton("bluetooth","razer"));
        orden1.agregarComputadora(computadora1);
        orden1.agregarComputadora(computadora2);
        orden1.mostrarOrden();
        
        
        
    }
}
