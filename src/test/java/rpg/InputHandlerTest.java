/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package rpg;

import java.awt.event.KeyEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author erikv
 */
public class InputHandlerTest {
    
    public InputHandlerTest() {
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
     * Test of keyTyped method, of class InputHandler.
     */
    @Test
    public void testKeyTyped() {
        System.out.println("keyTyped");
        KeyEvent e = null;
        InputHandler instance = new InputHandler();
        instance.keyTyped(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of keyPressed method, of class InputHandler.
     */
    @Test
    public void testKeyPressed() {
        System.out.println("keyPressed");
        KeyEvent e = null;
        InputHandler instance = new InputHandler();
        instance.keyPressed(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of keyReleased method, of class InputHandler.
     */
    @Test
    public void testKeyReleased() {
        System.out.println("keyReleased");
        KeyEvent e = null;
        InputHandler instance = new InputHandler();
        instance.keyReleased(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
