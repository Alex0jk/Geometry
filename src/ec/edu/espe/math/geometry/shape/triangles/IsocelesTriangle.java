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
public class IsocelesTriangle extends Triangle{
    private float sideTwoThree;

    public IsocelesTriangle(float sideTwoThree, float sideBase, float sideHeight) {
        super(sideBase, sideHeight);
        this.sideTwoThree = sideTwoThree;
    }

    @Override
    public float CalculatePerimeter() {
        return this.sideBase+this.sideTwoThree*2;
    }
    
}
