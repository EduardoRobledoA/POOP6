/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop5;

/**
 *
 * @author Peralta Rojas Daniel,Robledo Aguirre Eduardo
 */
public class Circulo {
    static double PI = Math.PI;
    private double radio;
    public Circulo(){
        
    } 
    
    /**
     * 
     * @param radio Constructor que recibe un dato de tipo double que representa el radio
     */
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    /**
     * 
     * @return Retorna un dato de tipo double que representa el radio 
     */
    public double getRadio() {
        return radio;
    }
    
    /**
     * 
     * @param radio Recibe un dato de tipo double
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    /**
     * 
     * @return Retorna un dato de tipo String 
     */
    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    
    /**
     * 
     * @return Retorna un dato de tipo double que representa el perimetro del circulo
     */
    public double perimetro(){
        return 2 * PI * radio;
    }
    
    /**
     * 
     * @return Retorna un dato de tipo double que representa el area del circulo 
     */
    public double area(){
        return PI * radio * radio; 
    }
}


