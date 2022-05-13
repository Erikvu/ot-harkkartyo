/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package rpg.ui;

import java.awt.Graphics;
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
public class GameMapTest {
    
    public GameMapTest() {
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
     * Test of loadItems method, of class GameMap.
     */
    @Test
    public void testLoadItems() {
        System.out.println("loadItems");
        GameMap instance = null;
        instance.loadItems();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paintComponent method, of class GameMap.
     */
    @Test
    public void testPaintComponent() {
        System.out.println("paintComponent");
        Graphics g = null;
        GameMap instance = null;
        instance.paintComponent(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawGame method, of class GameMap.
     */
    @Test
    public void testDrawGame() {
        System.out.println("drawGame");
        Graphics g = null;
        GameMap instance = null;
        instance.drawGame(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePlayerPosition method, of class GameMap.
     */
    @Test
    public void testUpdatePlayerPosition() {
        System.out.println("updatePlayerPosition");
        int posY = 0;
        int posX = 0;
        GameMap instance = null;
        instance.updatePlayerPosition(posY, posX);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of passableTileInPoss method, of class GameMap.
     */
    @Test
    public void testPassableTileInPoss() {
        System.out.println("passableTileInPoss");
        int posX = 0;
        int posY = 0;
        GameMap instance = null;
        boolean expResult = false;
        boolean result = instance.passableTileInPoss(posX, posY);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enemyTile method, of class GameMap.
     */
    @Test
    public void testEnemyTile() {
        System.out.println("enemyTile");
        int posX = 0;
        int posY = 0;
        GameMap instance = null;
        boolean expResult = false;
        boolean result = instance.enemyTile(posX, posY);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isDoor method, of class GameMap.
     */
    @Test
    public void testIsDoor() {
        System.out.println("isDoor");
        int posX = 0;
        int posY = 0;
        GameMap instance = null;
        boolean expResult = false;
        boolean result = instance.isDoor(posX, posY);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
