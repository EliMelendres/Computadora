package com.gm.mundopc;

//Clase Computadora
public class Computadora {

    private final int idComputadora;
    private static int contadorComputadoras;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;

    //Constructor privado
    private Computadora() {
        this.idComputadora = ++Computadora.contadorComputadoras;
    }

    //Constructor publico que recibe 4 argumentos
    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
        this(); //Llamado al constructor privado
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Computadora{" + "idComputadora=" + idComputadora + ", nombre=" + nombre + ", monitor=" + monitor + ", teclado=" + teclado + ", raton=" + raton + '}';
    }

    //Metodos get y set de los atributos
    public int getIdComputadora() {
        return this.idComputadora;
    }

    public static int getContadorComputadora() {
        return Computadora.contadorComputadoras;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

}
