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

/**
 *
 * @author erikv
 */
public class GameManagerTest {
    
    public GameManagerTest() {
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
     * Test of startThread method, of class GameManager.
     */
    @Test
    public void testStartThread() {
        System.out.println("startThread");
        GameManager instance = new GameManager();
        instance.startThread();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class GameManager.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        GameManager instance = new GameManager();
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class GameManager.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        GameManager instance = new GameManager();
        instance.update();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menuMove method, of class GameManager.
     */
    @Test
    public void testMenuMove() {
        System.out.println("menuMove");
        GameManager instance = new GameManager();
        instance.menuMove();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mapMove method, of class GameManager.
     */
    @Test
    public void testMapMove() throws Exception {
        System.out.println("mapMove");
        GameManager instance = new GameManager();
        instance.mapMove();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of battleMove method, of class GameManager.
     */
    @Test
    public void testBattleMove() throws Exception {
        System.out.println("battleMove");
        GameManager instance = new GameManager();
        instance.battleMove();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of battleEnemyAction method, of class GameManager.
     */
    @Test
    public void testBattleEnemyAction() throws Exception {
        System.out.println("battleEnemyAction");
        GameManager instance = new GameManager();
        instance.battleEnemyAction();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of graphics method, of class GameManager.
     */
    @Test
    public void testGraphics() {
        System.out.println("graphics");
        GameManager instance = new GameManager();
        instance.graphics();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of playerCanMove method, of class GameManager.
     */
    @Test
    public void testPlayerCanMove() {
        System.out.println("playerCanMove");
        int posX = 0;
        int posY = 0;
        GameManager instance = new GameManager();
        boolean expResult = false;
        boolean result = instance.playerCanMove(posX, posY);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
