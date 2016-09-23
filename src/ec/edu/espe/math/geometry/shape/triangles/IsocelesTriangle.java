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

    public IsocelesTriangle(float sideTwoThree, float sideBase) {
        super(sideBase,(float)(Math.sqrt(Math.pow(sideTwoThree,2)-Math.pow(sideBase/2,2))));
        this.sideTwoThree = sideTwoThree;
    }

    @Override
    public float CalculatePerimeter() {
        return this.sideBase+this.sideTwoThree*2;
    }
    
}
