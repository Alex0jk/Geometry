/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.triangles;

/**
 *
 * @author alexander
 */
public class ObtuseAngleTriangle extends Triangle{
    private float sideTwo,sideThree;

    public ObtuseAngleTriangle(float sideTwo, float sideThree, float sideBase, float sideHeight) {
        super(sideBase, sideHeight);
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }
    @Override
    public float CalculatePerimeter() {
        return sideBase+sideTwo+sideThree;
    }
    
}
