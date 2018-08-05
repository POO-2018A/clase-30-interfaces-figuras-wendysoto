/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author ESFOT
 */
public class Cuadrado  implements Figura{
     private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

   

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return(lado*lado); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularperimetro() {
       return(4*lado); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
