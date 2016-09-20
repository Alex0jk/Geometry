/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.main;

import ec.edu.espe.util.GeometricConstants;
import ec.edu.espe.util.PrinterUtil;
import ec.edu.espe.math.geometry.shape.Shape;
import ec.edu.espe.math.geometry.shape.circumference.Circle;
import ec.edu.espe.math.geometry.shape.circumference.Ellipse;
import ec.edu.espe.math.geometry.shape.quadrilaterals.Parallelogram;
import ec.edu.espe.math.geometry.shape.quadrilaterals.Rectangle;
import ec.edu.espe.math.geometry.shape.quadrilaterals.Rhombus;
import ec.edu.espe.math.geometry.shape.quadrilaterals.Square;
import ec.edu.espe.math.geometry.shape.quadrilaterals.Trapezoid;
import ec.edu.espe.math.geometry.shape.triangles.EquilateralTriangle;
import ec.edu.espe.math.geometry.shape.triangles.IsocelesTriangle;
import ec.edu.espe.math.geometry.shape.triangles.ObtuseAngleTriangle;
import ec.edu.espe.math.geometry.shape.triangles.RightAngleTriangle;
import ec.edu.espe.math.geometry.solids.circularsolids.Cone;
import ec.edu.espe.math.geometry.solids.circularsolids.Cylinder;
import ec.edu.espe.math.geometry.solids.circularsolids.Frustum;
import ec.edu.espe.math.geometry.solids.circularsolids.Sphere;
import ec.edu.espe.math.geometry.solids.cubicsolids.Cube;
import ec.edu.espe.math.geometry.solids.solids.SolidInterface;

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
        SolidInterface[] solids=new SolidInterface[5];
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
        solids[0]=new Sphere(4);
        solids[1]=new Cone(5, 2);
        solids[2]=new Cylinder(7, 1);
        solids[3]=new Frustum(4, 5, 7);
        solids[4]=new Cube(5);
        for(int i=0;i<12;i++){
            PrinterUtil.printShape(shapes[i].getClass().getSimpleName(), GeometricConstants.PERIMETER, shapes[i].CalculatePerimeter());
            PrinterUtil.printShape(shapes[i].getClass().getSimpleName(), GeometricConstants.AREA, shapes[i].CalculateArea());
        }
        for(int i=0;i<5;i++){
            PrinterUtil.printShape(solids[i].getClass().getSimpleName(),GeometricConstants.AREA , solids[i].CalculateArea());
            PrinterUtil.printShape(solids[i].getClass().getSimpleName(),GeometricConstants.VOLUME , solids[i].CalculateVolume());
        }
    }
    
}
