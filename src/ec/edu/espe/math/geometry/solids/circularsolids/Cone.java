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
public class Cone extends CircularSolid{
    private float gen;

    public Cone(float height, float radius) {
        super(height,radius);
        gen=(float)(Math.sqrt(Math.pow(this.radius,2)+Math.pow(this.radius,2)));
    }

    @Override
    public float CalculateArea() {
       return (float)(this.radius*Math.PI*gen+Math.PI*Math.pow(this.radius,2));
    }

    @Override
    public float CalculatePerimeter() {
        return 1;
    }

    @Override
    public float CalculateVolume() {
        return (float)((1/3)*Math.PI*Math.pow(this.radius,2)*this.height);
    }
    
}
