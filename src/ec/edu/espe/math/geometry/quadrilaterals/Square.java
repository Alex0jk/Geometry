/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.quadrilaterals;

/**
 *
 * @author alexander
 */
public class Square extends Quadrilaterals{
    public Square(float side) {
        super(side);
    }

    @Override
    public float CalculateArea() {
       return this.side*4;
    }
    @Override
    public float CalculatePerimeter() {
       return this.side*this.side;
    }
    
}
