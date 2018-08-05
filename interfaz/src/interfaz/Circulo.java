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
public class Circulo implements Figura{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    
    

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    

    @Override
    public double calcularArea() {
        return (3.1415*radio*radio); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularperimetro() {
        return(2*3.1415*radio); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
