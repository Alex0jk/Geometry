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
public class Frustum extends CircularSolid{
    private float smallRadius;

    public Frustum(float height, float otherRadius, float radius) {
        super(height,radius);
        smallRadius=otherRadius;
    }
    @Override
    public float CalculateArea() {
       return 1;
    }

    @Override
    public float CalculatePerimeter() {
        return 1;
    }
    @Override
    public float CalculateVolume() {
        return (float)((Math.PI/3)*this.height*(Math.pow(this.radius,2)+Math.pow(this.smallRadius,2)+this.radius*this.smallRadius));
    }
     
    
}
