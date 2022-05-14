/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package rpg;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import rpg.map.Wall;

/**
 *
 * @author erikv
 */
public class RpgTest {
      GameManager gameManager;
    public RpgTest() {
    }
    
    @Before
    public void setUp() {
         gameManager = new GameManager();
        gameManager.startThread();
    }
    

    /**
     * Test of main method, of class Rpg.
     */
    @Test
    public void testMain() {
        assertNotNull(gameManager);
    }
    
}
