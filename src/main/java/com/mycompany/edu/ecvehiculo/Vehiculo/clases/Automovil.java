
package com.mycompany.edu.ecvehiculo.Vehiculo.clases;

public class Automovil {
    //ATRIBUTOS
    private String marca; 
    private int modelo;
    private double motor;
    private int numeroPuertas;
    private int cantidadAsientos; 
    private double velocidadMaxima; 
    private double velocidadActual;
    private Color color;
    private TipoCombustible tipoCombustible;
    private TipoAutomovil tipoAutomovil; 
    //CONSTRUCTOR
    public Automovil(String marca, int modelo, double motor, int numeroPuertas, int cantidadAsientos, double velocidadMaxima, double velocidadActual, Color color, TipoCombustible tipoCombustible, TipoAutomovil tipoAutomovil) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = velocidadActual;
        this.color = color;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
    }
    
    
    //MÉTODOS
    //GETTT AND SETT
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public TipoAutomovil getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(TipoAutomovil tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }
    //METODOS: 
    public double acelerar (){
        int acelerar = 20; 
        return acelerar+this.velocidadActual;
    }
    public double desacelerar (){
        int desacelerar = 50;
        return  this.acelerar()- desacelerar;
    }    
    public double frenar (){
        double frenar = this.acelerar();
        return 0;
    }
    public double tiempoLlegada (double distancia){
        return distancia/this.velocidadActual; 
    }
    public void imprimirAutomovil (){
        System.out.println("Automovil:"+ getMarca());
        System.out.println("Modelo: "+ getModelo());
        System.out.println("Motor: "+ getMotor());
        System.out.println("Numero de puertas: "+ getNumeroPuertas());
        System.out.println("Numero de asientos: "+ getCantidadAsientos());
        System.out.println("Alcanze de velocidad (velocidad maxima): "+ getVelocidadMaxima());
        System.out.println("Velocidad Actual: "+ getVelocidadActual());
        System.out.println("Color: "+getColor());
        System.out.println("Tipo de Autmovil: "+ getTipoAutomovil());
        System.out.println("Tipo de combustible: "+getTipoCombustible());
        
    }
}
