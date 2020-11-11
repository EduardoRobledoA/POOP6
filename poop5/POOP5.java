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
public class POOP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(6.0);
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        
        System.out.println("Perimetro c1 = "+c1.perimetro());
        System.out.println("Area del c1 = "+c1.area());
        
        System.out.println("Perimetro c2 = "+c2.perimetro());
        System.out.println("Area del c2 = "+c2.area());
        
        // como el radio es privado no se puede hacer esto: c1.radio = 9;
        
        //Para asignar un valor al radio privado se utliza una clase dentro de la clase:
        c1.setRadio(9.0);
        System.out.println("Perimetro c1 = "+c1.perimetro());
        System.out.println("Area del c1 = "+c1.area());
        
        Persona amigo = new Persona();
        Fecha fnacimiento = new Fecha(3,4,2002);
        amigo.setNombre("Edgar");
        amigo.setApellido("Romero Martinez");
        amigo.setfNacimiento(fnacimiento);
        
        System.out.println("Info de mi Amigo "+amigo.toString());
        System.out.println("Amigo"+amigo);
        
        Persona amigo2 = new Persona("Raul","Ayala Barbosa",new Fecha(20,4,1993));
        System.out.println("Info amigo 2 "+amigo2);
        
        Persona amigo3 = new Persona("Diego","Pedraza Peralta");
        System.out.println("Info amigo 3 "+amigo3);
    }
    
}
