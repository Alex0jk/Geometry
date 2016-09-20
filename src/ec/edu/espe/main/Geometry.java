/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.main;

import ec.edu.espe.util.GeometricConstants;
import ec.edu.espe.util.PrinterUtil;
import ec.edu.espe.math.geometry.Shape;
import ec.edu.espe.math.geometry.circumference.Circle;
import ec.edu.espe.math.geometry.circumference.Ellipse;
import ec.edu.espe.math.geometry.quadrilaterals.Parallelogram;
import ec.edu.espe.math.geometry.quadrilaterals.Rectangle;
import ec.edu.espe.math.geometry.quadrilaterals.Rhombus;
import ec.edu.espe.math.geometry.quadrilaterals.Square;
import ec.edu.espe.math.geometry.quadrilaterals.Trapezoid;
import ec.edu.espe.math.geometry.triangles.EquilateralTriangle;
import ec.edu.espe.math.geometry.triangles.IsocelesTriangle;
import ec.edu.espe.math.geometry.triangles.ObtuseAngleTriangle;
import ec.edu.espe.math.geometry.triangles.RightAngleTriangle;

/**
 *
 * @author alexander
 */
public class Geometry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape[] shapes=new Shape[12];
        shapes[0]=new Rectangle(3, 4);
        shapes[1]=new Square(3);
        shapes[2]=new Trapezoid(3,4,5);
        shapes[3]=new Rhombus(4,5);
        shapes[4]=new Parallelogram(3, 5, 6);
        shapes[5]=new Circle(7);
        shapes[6]=new Ellipse(3, 5);
        shapes[7]=new EquilateralTriangle(4, 2);
        shapes[8]=new IsocelesTriangle(3, 4, 5);
        shapes[9]=new ObtuseAngleTriangle(5, 6, 7, 3);
        shapes[10]=new IsocelesTriangle(4, 5, 2);
        shapes[11]=new RightAngleTriangle(4, 3);
        for(int i=0;i<12;i++){
            PrinterUtil.printShape(shapes[i].getClass().getSimpleName(), GeometricConstants.PERIMETER, shapes[i].CalculatePerimeter());
            PrinterUtil.printShape(shapes[i].getClass().getSimpleName(), GeometricConstants.AREA, shapes[i].CalculateArea());
        }
    }
    
}
