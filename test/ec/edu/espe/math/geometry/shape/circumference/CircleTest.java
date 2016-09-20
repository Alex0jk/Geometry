/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.shape.circumference;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alexander
 */
public class CircleTest {
    
    public CircleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of CalculateArea method, of class Circle.
     */
    @Test
    public void testCalculateArea() {
        System.out.println("CalculateArea");
        Circle instance = new Circle(1);
        float expResult = (float)Math.PI;
        float result = instance.CalculateArea();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of CalculatePerimeter method, of class Circle.
     */
    @Test
    public void testCalculatePerimeter() {
        System.out.println("CalculatePerimeter");
        Circle instance = new Circle(1);
        float expResult = (float)Math.PI*2;
        float result = instance.CalculatePerimeter();
        assertEquals(expResult, result, 0.0);
    }
    
}
