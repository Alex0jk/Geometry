/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.solids.circularsolids;

import ec.edu.espe.math.geometry.solids.solids.SolidInterface;
import ec.edu.espe.math.geometry.shape.circumference.Circumference;

/**
 *
 * @author alexander
 */
public abstract class CircularSolid extends Circumference implements SolidInterface {
    protected float height;

    public CircularSolid(float height, float radius) {
        super(radius);
        this.height = height;
    }
    
}
