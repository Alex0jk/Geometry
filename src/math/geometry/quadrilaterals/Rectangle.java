/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.geometry.quadrilaterals;

/**
 *
 * @author alexander
 */
public class Rectangle extends Quadrilaterals{
    private float height;

    public Rectangle(float side,float height) {
        super(side);
        this.height=height;
    }

    @Override
    public float CalculateArea() {
        return this.side*2+this.height*2;
    }

    @Override
    public float CalculatePerimeter() {
        return this.side*this.height;
    }
    
}
