/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.shape.triangles;

/**
 *
 * @author alexander
 */
public class ObtuseAngleTriangle extends Triangle{
    private float sideTwo,sideThree;

    public ObtuseAngleTriangle(float sideTwo,float sideBase, float sideHeight) {
        super(sideBase, sideHeight);
        float n=(float)Math.sqrt(Math.pow(sideTwo,2)-Math.pow(sideHeight,2));
        float m=sideBase-n;
        this.sideTwo = sideTwo;
        this.sideThree = (float)Math.sqrt(Math.pow(sideHeight,2)+Math.pow(m,2));
    }
    @Override
    public float CalculatePerimeter() {
        return sideBase+sideTwo+sideThree;
    }
    
}
