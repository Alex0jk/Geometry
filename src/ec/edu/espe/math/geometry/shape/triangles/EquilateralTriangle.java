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
public class EquilateralTriangle extends Triangle{

    public EquilateralTriangle(float sideBase, float sideHeight) {
        super(sideBase, sideHeight);
    }
    
    @Override
    public float CalculatePerimeter() {
        return 3*this.sideBase;
    }
    
}
