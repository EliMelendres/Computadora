package com.gm.mundopc;

//Clase Orden
public class Orden {

    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;

    //Constructor publico 
    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS]; //Inicializa el valor del array
    }

    //Metodo agregarComputadora
    public void agregarComputadora(Computadora computadora) {
        //Recibe una computadora y la agrega al array
        if (this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
            this.computadoras[this.contadorComputadoras++] = computadora;
        } else {
            System.out.println("Se ha superado la cantidad maxima de computadoras: " + Orden.MAX_COMPUTADORAS);
        }
    }

    //Metodo mostrarOrden
    public void mostrarOrden() {

        System.out.println("Orden idOrden: " + this.idOrden);
        System.out.println("computadoras de la orden: ");

        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println("producto: " + this.computadoras[i]);
        }

        System.out.println("Total de computadoras: " + this.contadorComputadoras);
    }

}
