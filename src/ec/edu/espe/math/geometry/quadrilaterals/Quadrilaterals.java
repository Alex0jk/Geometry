/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.quadrilaterals;

import ec.edu.espe.math.geometry.Shape;

/**
 *
 * @author alexander
 */
public abstract class Quadrilaterals  extends Shape{
    protected float side;//also the base of some shapes

    public Quadrilaterals(float side) {
        this.side = side;
    }

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }
    
}
