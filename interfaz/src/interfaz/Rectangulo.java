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
public class Rectangulo implements Figura{
    
    private double baseRectangulo;
    
     private double alturaRectangulo;

    public Rectangulo(double baseRectangulo, double alturaRectangulo) {
        this.baseRectangulo = baseRectangulo;
        this.alturaRectangulo = alturaRectangulo;
    }

   

    public double getBaseRectangulo() {
        return baseRectangulo;
    }

    public void setBaseRectangulo(double baseRectangulo) {
        this.baseRectangulo = baseRectangulo;
    }

    public double getAlturaRectangulo() {
        return alturaRectangulo;
    }

    public void setAlturaRectangulo(double alturaRectangulo) {
        this.alturaRectangulo = alturaRectangulo;
    }
 @Override
    public double calcularArea() {
        return(baseRectangulo*alturaRectangulo); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public double calcularperimetro() {
        return(2*(baseRectangulo+alturaRectangulo));//To change body of generated methods, choose Tools | Templates.
    }
     
     
}
