
package ec.edu.espe.math.geometry.circumference;

import ec.edu.espe.math.geometry.Shape;

public abstract class Circumference extends Shape{
    protected float radius;

    public Circumference(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Float.floatToIntBits(this.radius);
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
        final Circumference other = (Circumference) obj;
        if (Float.floatToIntBits(this.radius) != Float.floatToIntBits(other.radius)) {
            return false;
        }
        return true;
    }
    
}
