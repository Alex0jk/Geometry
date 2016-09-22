/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.solids.circularsolids;

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
public class FrustumTest {
    
    public FrustumTest() {
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
     * Test of CalculateArea method, of class Frustum.
     */
    @Test
    public void testCalculateArea() {
        System.out.println("CalculateArea");
        Frustum instance = new Frustum(3, 2,4);
        float expResult = 1;
        float result = instance.CalculateArea();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of CalculatePerimeter method, of class Frustum.
     */
    @Test
    public void testCalculatePerimeter() {
        System.out.println("CalculatePerimeter");
        Frustum instance = new Frustum(3, 2,4);
        float expResult = 1;
        float result = instance.CalculatePerimeter();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of CalculateVolume method, of class Frustum.
     */
    @Test
    public void testCalculateVolume() {
        System.out.println("CalculateVolume");
        Frustum instance = new Frustum(3, 2,4);
        float expResult = (float)((Math.PI/3)*3*(Math.pow(4,2)+Math.pow(2,2)+4*2));
        float result = instance.CalculateVolume();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testCalculateNotEquals(){
        System.out.println("CalculatePerimeter");
        Frustum instance = new Frustum(3, 2,4);
        float expResult = 8;
        float result = instance.CalculatePerimeter();
        assertNotEquals(expResult, result, 0.0);
    }
    
}
