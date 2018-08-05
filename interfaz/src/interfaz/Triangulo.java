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
public class Triangulo implements Figura{
    private double baseTriangulo;
    private double lado2;
    private double lado3;
    private double alturaTriangulo;

    public Triangulo(double baseTriangulo, double lado2, double lado3, double alturaTriangulo) {
        this.baseTriangulo = baseTriangulo;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.alturaTriangulo = alturaTriangulo;
    }

        
    public double getBaseTriangulo() {
        return baseTriangulo;
    }

    public void setBaseTriangulo(double baseTriangulo) {
        this.baseTriangulo = baseTriangulo;
    }

    public double getAlturaTriangulo() {
        return alturaTriangulo;
    }

    public void setAlturaTriangulo(double alturaTriangulo) {
        this.alturaTriangulo = alturaTriangulo;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
       return((baseTriangulo*alturaTriangulo)/2) ; //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public double calcularperimetro() {
        return(baseTriangulo+lado2+lado3); //To change body of generated methods, choose Tools | Templates.
    }

    

    
    
    
    
    
}
