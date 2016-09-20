/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.geometry.solids.cubicsolids;

/**
 *
 * @author alexander
 */
public class Cube extends CubicSolid{

    public Cube(float side) {
        super(side);
    }

    @Override
    public float CalculateArea() {
        return (float)(6*Math.pow(side,2));
    }

    @Override
    public float CalculatePerimeter() {
        return 1;
    }

    @Override
    public float CalculateVolume() {
        return (float)(Math.pow(side, 3));
    }
    
}
