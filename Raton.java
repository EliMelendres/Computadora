
package com.gm.mundopc;

//Clase Raton que desciende de DipositivoEntrada
public class Raton extends DispositivoEntrada {
    
    private final int idRaton;
    private static int contadorRatones;
    
    //Constructor publico que recibe 2 argumentos
    public Raton(String tipoEntrada, String marca){
        super(tipoEntrada, marca); //Llamando al constructor de la clase padre
        this.idRaton = ++Raton.contadorRatones; 
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + '}'+ " "+super.toString();
    }
    
}
