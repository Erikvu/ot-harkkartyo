/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package rpg.ui;

import java.io.IOException;
import java.net.URISyntaxException;
import javax.swing.JTextArea;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import rpg.GameManager;
import rpg.InputHandler;
import rpg.map.Mmap;

/**
 *
 * @author erikv
 */
public class UiTest {

    Ui ui;

    public UiTest() {
    }

    @Before
    public void setUp() {
        ui = new Ui();
    }

    @Test
    public void testStartGame() throws IOException, URISyntaxException {
        ui.startGame(new GameMap("resources/FirstMap.json"));
        assertEquals(true, ui.mapOn);
    }

    /**
     * Test of startBattle method, of class Ui.
     */
    @Test
    public void testStartBattle() throws IOException, URISyntaxException {
        ui.startGame(new GameMap("resources/FirstMap.json"));
        ui.startBattle();
        assertEquals(true, ui.battleOn);
    }

    @Test
    public void testEnemyHealt() throws IOException, URISyntaxException {
        ui.startGame(new GameMap("resources/FirstMap.json"));
        ui.startBattle();
        assertEquals("resources/healt10.png", ui.battle.changeEnemyHealth(10));
    }

    @Test
    public void testHeroHealt() throws IOException, URISyntaxException {
        ui.startGame(new GameMap("resources/FirstMap.json"));
        ui.startBattle();
        assertEquals("resources/healt00.png", ui.battle.changeHeroHealth(0));
    }
        @Test
    public void setBattleScreenArrowPoss() throws IOException, URISyntaxException {
        ui.startGame(new GameMap("resources/FirstMap.json"));
        ui.startBattle();
        ui.battle.setArrowPos(1);
        assertEquals(1, ui.battle.arrowPos);
    }
}
