/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.circumference;

/**
 *
 * @author alexander
 */
public class Ellipse extends Circumference{
    private float otherRadius;

    public Ellipse(float otherRadius, float radius) {
        super(radius);
        this.otherRadius = otherRadius;
    }

    @Override
    public float CalculateArea() {
        return (float)(Math.PI*this.radius*this.otherRadius);
    }

    @Override
    public float CalculatePerimeter() {
        return (float)(2*Math.PI*Math.sqrt((Math.pow(this.radius, 2)+Math.pow(this.otherRadius,2))/2));
    }
    
}
