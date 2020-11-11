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
public class Persona {
    
    private String Nombre;
    private String Apellido;
    private Fecha fNacimiento;
    
    /**
     * Costructor vacio
     */
    public Persona() {
        
    }
    /**
     * 
     * @param Nombre Recibe el nombre de la persona
     * @param Apellido Recibe los apellidos de la pesona
     * @param fNacimiento recibe la fecha de nacimiento de la pesona
     */

    public Persona(String Nombre, String Apellido, Fecha fNacimiento) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.fNacimiento = fNacimiento;
    }
    
    /**
     * 
     * @param Nombre Recibe el nombre de la persona
     * @param Apellido Recibe los apellidos de la pesona
     */
    public Persona(String Nombre, String Apellido) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.fNacimiento = new Fecha(3,5,2000);
    }
    
    /**
     * 
     * @return Retorna un dato de tipo String que contiene el nombre de la persona
     */
    public String getNombre() {
        return Nombre;
    }
    
    /**
     * 
     * @param Nombre Recibe un dato String que representa el nombre  
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    /**
     * 
     * @return Retorna un dato tipo String que representa los apellidos de la persona
     */
    public String getApellido() {
        return Apellido;
    }
    
    /**
     * 
     * @param Apellido Recibe un dato String que representa los apellidos  
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    
    /**
     * 
     * @return fnacimiento es de tipo Fecha 
     */
    public Fecha getfNacimiento() {
        return fNacimiento;
    }
    
    /**
     * 
     * @param fNacimiento Recibe un dato de tipo Fecha  
     */
    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
    
    /**
     * 
     * @return Retorna un dato String con los atributos indicados 
     */
    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", fNacimiento=" + fNacimiento + '}';
    }
    
    
}
