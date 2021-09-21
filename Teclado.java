
package com.gm.mundopc;

//Clase Teclado que desciende de DispositivoEntrada
public class Teclado extends DispositivoEntrada {
    private final int idTeclado;
    private static int contadorTeclados;
    
    //Constructor publico que recibe 2 argumentos
    public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }
    //Metodo toString
    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado + '}'+ " "+ super.toString();
    }
    
}
