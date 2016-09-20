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
    private float minSide,sideA,sideC,height;

    public Trapezoid(float minSide, float height, float side) {
        super(side);
        this.minSide = minSide;
        this.height = height;
    }

    @Override
    public float CalculateArea() {
        return (this.side+this.minSide)*this.height/2;
    }

    @Override
    public float CalculatePerimeter() {
        return this.minSide+this.sideA+this.sideC+this.side;
    }
}
