/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.shape.triangles;

import ec.edu.espe.math.geometry.shape.Shape;

/**
 *
 * @author alexander
 */
public abstract class Triangle extends Shape {
    protected float sideBase,sideHeight;

    public Triangle(float sideBase, float sideHeight) {
        this.sideBase = sideBase;
        this.sideHeight = sideHeight;
    }

    public float getSideBase() {
        return sideBase;
    }

    public void setSideBase(float sideBase) {
        this.sideBase = sideBase;
    }

    public float getSideHeight() {
        return sideHeight;
    }

    public void setSideHeight(float sideHeight) {
        this.sideHeight = sideHeight;
    }
    
     @Override
    public float CalculateArea() {
        return this.sideHeight*this.sideBase/2;
    }
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Float.floatToIntBits(this.sideBase);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Triangle other = (Triangle) obj;
        if (Float.floatToIntBits(this.sideBase) != Float.floatToIntBits(other.sideBase)) {
            return false;
        }
        return true;
    }
    
    
}
