/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.shape.quadrilaterals;

/**
 *
 * @author alexander
 */
public class Trapezoid extends Quadrilateral{
    private float minSide,sideA,height;

    public Trapezoid(float minSide, float height, float side) {
        super(side);
        this.minSide = minSide;
        this.height = height;
        sideA=(float)Math.sqrt(Math.pow(height,2)+Math.pow(side-minSide, 2));
    }

    @Override
    public float CalculateArea() {
        return (this.side+this.minSide)*this.height/2;
    }

    @Override
    public float CalculatePerimeter() {
        return this.minSide+this.sideA+this.height+this.side;
    }
}
