/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package rpg;

import java.io.IOException;
import java.net.URISyntaxException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import rpg.character.Enemy;
import rpg.character.Player;
import rpg.map.Map;
import rpg.ui.GameMap;
import rpg.ui.Ui;

/**
 *
 * @author erikv
 */
public class GameManagerTest implements Runnable {

    Thread gameLoop;
    GameManager gameManager;

    public GameManagerTest() {
    }

    @Before
    public void setUp() throws IOException, URISyntaxException {
        gameManager = new GameManager();
    }

    /**
     * Test of startThread method, of class GameManager.
     */
    @Test
    public void testStartThread() {
        gameLoop = new Thread(this);
        gameLoop.start();
        assertNotNull(gameLoop);
    }

    @Test
    public void testGameOver() throws IOException, URISyntaxException {
        gameManager.ui.startGame(new GameMap(getClass().getClassLoader().getResource("resources/FirstMap.json")));
        gameManager.ui.startBattle();
        gameManager.player.takeDamage(9999);
        gameManager.update();
        assertEquals(1, gameManager.ui.battle.enemyHealtBar.getHeight());
    }

    @Test
    public void testPlayerMoveToDoor() throws IOException, URISyntaxException {
        gameManager.playerMoveToDoor();
        assertEquals(0, gameManager.player.posX);
    }

    @Test
    public void testMoveToEnemy() throws IOException, URISyntaxException {
        gameManager.ui.startGame(new GameMap(getClass().getClassLoader().getResource("resources/FirstMap.json")));
        gameManager.ui.startBattle();
        gameManager.playerMoveToEnemy(6, 7);
        assertEquals(false, gameManager.ui.game.map.tileMap[6][7].hasEnemy);
    }

    @Test
    public void testEnemyTurn() throws IOException, URISyntaxException {
        gameManager.enemyTurn = true;
        gameManager.ui.startGame(new GameMap(getClass().getClassLoader().getResource("resources/FirstMap.json")));
        gameManager.ui.startBattle();
        gameManager.update();
        assertEquals(false, gameManager.enemyTurn);
    }

    @Override
    public void run() {

    }

}
