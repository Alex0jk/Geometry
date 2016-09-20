/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.geometry.solids.cubicsolids;

import ec.edu.espe.geometry.solids.SolidInterface;
import ec.edu.espe.math.geometry.shape.quadrilaterals.Quadrilateral;


/**
 *
 * @author alexander
 */
public abstract class CubicSolid extends Quadrilateral implements SolidInterface {
    
    public CubicSolid(float side) {
        super(side);
    }
    
}
