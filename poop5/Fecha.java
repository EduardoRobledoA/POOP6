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
class Fecha {
    private int dia;
    private int mes;
    private int ano;
    
    /**
     * Constructor vacio
     */
    public Fecha() {
    }
    
    /**
     * 
     * @param dia Recibe un dato tipo int que representa el dia de nacimiento
     * @param mes Recibe un dato tipo int que representa el mes de nacimiento
     * @param año Recibe un dato tipo int que representa el año de nacimiento
     */
    public Fecha(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    /**
     * 
     * @return Retorna un dato de tipo int que representa el dia de nacimiento
     */
    public int getDia() {
        return dia;
    }
    
    /**
     * 
     * @param dia Recibe un dato de tipo int que representa el dia de nacimiento
     */
    public void setDia(int dia) {
        this.dia = dia;
    }
    
    /**
     * 
     * @return Retorna un dato de tipo int que representa el mes de nacimiento 
     */
    public int getMes() {
        return mes;
    }
    
    /**
     * 
     * @param mes Recibe un dato de tipo int que representa el mes de nacimiento 
     */
    public void setMes(int mes) {
        this.mes = mes;
    }
    
    /**
     * 
     * @return Retorna un dato de tipo int que representa el año de nacimiento 
     */
    public int getAno() {
        return ano;
    }
    
    /**
     * 
     * @param año Recibe un dato de tipo int que representa el año de nacimiento
     */
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    /**
     * 
     * @return Retorna un dato de tipo String 
     */
    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", ano=" + ano + '}';
    }
    
    
}
