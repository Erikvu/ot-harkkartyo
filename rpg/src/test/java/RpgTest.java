/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import rpg.character.Player;

/**
 *
 * @author erikv
 */
public class RpgTest {

    Player player = new Player("Rip", 10, 10, 10, 10, 10, 40, 40);

    public RpgTest() {
    }

    @Test
    public void damageTakenProperly() {
        player.takeDamage(5);
        assertEquals(5, player.health);
    }

    @Test
    public void healedProperly() {
        player.takeDamage(7);
        player.heal();
        assertEquals(8, player.health);
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
