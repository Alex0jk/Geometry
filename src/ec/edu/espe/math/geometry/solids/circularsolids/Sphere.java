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
public class Sphere extends CircularSolid{

    public Sphere(float radius) {
        super(radius*2,radius);
    }

    @Override
    public float CalculateArea() {
        return (float)(4*Math.PI*Math.pow(this.radius,2));
    }

    @Override
    public float CalculatePerimeter() {
        return 1;
    }

    @Override
    public float CalculateVolume() {
        return (float)((4/3)*Math.PI*Math.pow(radius, 3));
    }
    
}
