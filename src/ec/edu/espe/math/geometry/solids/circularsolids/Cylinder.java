/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.solids.circularsolids;


/**
 *
 * @author alexander
 */
public class Cylinder extends CircularSolid{

    public Cylinder(float height, float radius) {
        super(height,radius);
    }

    @Override
    public float CalculateArea() {
        return (float)((2*this.radius*this.height*Math.PI)+(2*Math.PI*Math.pow(this.radius,2)));
    }

    @Override
    public float CalculatePerimeter() {
        return 1;
    }

    @Override
    public float CalculateVolume() {
       return (float)(this.height*Math.PI*Math.pow(this.radius,2));
    }
    
}
