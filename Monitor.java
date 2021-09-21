package com.gm.mundopc;

//Clase monitor
public class Monitor {

    private final int idMonitor;
    private String marca;
    private double tamano;
    private static int contadorMonitores;

    //Constructor privado vacio que inicializa el id
    private Monitor() {
        this.idMonitor = ++Monitor.contadorMonitores; 
    }

    //Constructor publico que recibe argumentos e inicializa valores
    public Monitor(String marca, double tamano) {
        this(); //Llamado al constructor privado-vacio.
        this.marca = marca;
        this.tamano = tamano;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tama\u00f1o=" + tamano + '}';
    }
    
    //Metodos get y set de los atributos
    public int getIdMonitor(){
        return this.idMonitor;
    }
    
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public double getTamano(){
        return this.tamano;
    }
    public void setTamano(double tamano){
        this.tamano = tamano;
    }
    
    public static int getContadorMonitores(){
        return Monitor.contadorMonitores;
    }

}
