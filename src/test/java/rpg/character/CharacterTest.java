/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package rpg.character;

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
public class CharacterTest {

    Player player;
    Enemy enemy;

    public CharacterTest() {
    }

    @Before
    public void setUp() {
        player = new Player("Asd", 50, 100, 5, 5, 20, 40, 40);
        enemy =new Enemy();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testTakeDamage() {
        assertEquals(40, player.takeDamage(10));
    }
        @Test
    public void testEnemyTakeDamage() {
        assertEquals(90, enemy.takeDamage(10));
    }

    @Test
    public void testHeal() {
        assertEquals(70, player.heal());
    }
        @Test
    public void testPlayerDie() {
        player.takeDamage(199);
        assertEquals(false, player.alive);
    }
        public void testPlayerAlive() {
        player.takeDamage(49);
        assertEquals(true, player.alive);
    }
    
        @Test
    public void noOverHeal() {
        assertEquals(100, enemy.heal());
    }

    @Test
    public void testXPos() {
        assertEquals(40, player.xPos());
    }

    @Test
    public void testYPos() {
        assertEquals(40, player.xPos());
    }
    
        @Test
    public void testPlayerMove() {
        player.move(5, 5);
        assertEquals(45, player.xPos());
    }
            @Test
    public void testSetLocation() {
        player.setPlayerPos(5, 5);
        assertEquals(5, player.yPos());
    }

}
