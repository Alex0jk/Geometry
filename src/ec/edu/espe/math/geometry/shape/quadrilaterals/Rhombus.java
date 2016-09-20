
package ec.edu.espe.math.geometry.shape.quadrilaterals;
import java.math.*;

public class Rhombus extends Quadrilateral{
    private float bigDiagonal,smallDiagonal;

    public Rhombus(float bigDiagonal, float smallDiagonal) {
        super((float)Math.sqrt(Math.pow(bigDiagonal/2, 2)+Math.pow(smallDiagonal/2,2)));
        this.bigDiagonal = bigDiagonal;
        this.smallDiagonal = smallDiagonal;
        
    }

    @Override
    public float CalculateArea() {
        return this.bigDiagonal*this.smallDiagonal/2;
    }

    @Override
    public float CalculatePerimeter() {
        return this.side*4; 
    }
    
}
