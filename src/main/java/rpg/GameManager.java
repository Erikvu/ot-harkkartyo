/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import rpg.character.Enemy;
import rpg.character.Player;
import rpg.ui.GameMap;
import rpg.ui.Ui;

/**
 * @author erikv
 */
public class GameManager implements Runnable {

    Thread gameLoop;
    private long currentTime;
    private double gameTime;
    private final double timeInterval = 1000000000 / 10.0;
    private long lastLoopTime = System.nanoTime();
    Ui ui;
    Player player = new Player("Asd", 100, 100, 5, 5, 20, 40, 40);
    private Enemy battleEnemy = new Enemy();
    String firstMap = "resources/FirstMap.txt";
    String secondMap = "resources/SecondMap.txt";
    GameMap gameMap;
    boolean enemyTurn = false;
    boolean stopUpdate = false;

    /**
     * Constructor.
     */
    public GameManager() {
        ui = new Ui();

    }

    /**
     * starts gameloop thread.
     */
    public void startThread() {
        gameLoop = new Thread(this);
        gameLoop.start();
    }

    /**
     * basic gameloop calls update in spesific time intervalls.
     */
    @Override
    public void run() {
        graphics();
        while (gameLoop != null) {
            currentTime = System.nanoTime();
            gameTime += (currentTime - lastLoopTime) / timeInterval;
            lastLoopTime = currentTime;
            while (gameTime >= 1) {
                try {
                    update();
                } catch (IOException | URISyntaxException ex) {
                    Logger.getLogger(GameManager.class.getName()).log(Level.SEVERE, null, ex);
                }
                gameTime--;
            }

        }

    }

    /**
     * Part of gameloop, decides what to do with userinput depending on what
     * kind of screen is open.
     *
     * @throws java.io.IOException
     * @throws java.net.URISyntaxException
     */
    public void update() throws IOException, URISyntaxException {
        if (!player.alive) {
            ui.battle.gameOver();
            ui.battle.updateUI();
            return;
        }
        if (ui.menuOn) {
            menuMove();
        } else if (ui.mapOn) {
            mapMove();
        } else if (ui.battleOn) {
            if (!battleEnemy.alive) {
                ui.startGame(gameMap);
            } else {
                if (!enemyTurn) {
                    battleMove();
                } else {
                    battleEnemyAction();
                }
            }
        }
    }

    /**
     * When menu is open sends update information to ui.
     */
    public void menuMove() {
        int arrowIndex = ui.mainMenu.arrowPos;
        if (ui.inputHander.down) {
            ui.mainMenu.setArrowPos(arrowIndex + 1);
        }
        if (ui.inputHander.up) {
            ui.mainMenu.setArrowPos(arrowIndex - 1);
        }
        if (ui.inputHander.space) {
            if (arrowIndex == 0) {
                try {
                    ui.menuOn = false;
                    gameMap = new GameMap(firstMap);
                    ui.startGame(gameMap);
                } catch (IOException | URISyntaxException ex) {
                }
            }
            if (arrowIndex == 1) {
                try {
                    ui.menuOn = false;
                    gameMap = new GameMap(firstMap);
                    ui.startGame(gameMap);
                } catch (IOException | URISyntaxException ex) {
                }
            }
            if (arrowIndex == 2) {
                System.exit(0);
            }
        }
        ui.mainMenu.updateUI();
    }

    /**
     * When map is open sends update information to ui.
     *
     * @throws java.io.IOException
     * @throws java.net.URISyntaxException
     */
    public void mapMove() throws IOException, URISyntaxException {
        if (ui.inputHander.down) {
            if (playerCanMove(player.posY + 40, player.posX)) {
                if (isDoor(player.posY + 40, player.posX)) {
                    playerMoveToDoor();
                }
                playerMove(0, 40);
            }
            if (hasEnemy(player.posY + 40, player.posX)) {
                playerMoveToEnemy(player.posX / 40, (player.posY + 40) / 40);

            }
        }
        if (ui.inputHander.up) {
            if (playerCanMove(player.posY - 40, player.posX)) {
                if (isDoor(player.posY - 40, player.posX)) {
                    playerMoveToDoor();
                }
                playerMove(0, -40);
            }
            if (hasEnemy(player.posY - 40, player.posX)) {
                playerMoveToEnemy(player.posX / 40, (player.posY - 40) / 40);
            }
        }
        if (ui.inputHander.left) {
            if (playerCanMove(player.posY, player.posX - 40)) {
                if (isDoor(player.posY, player.posX - 40)) {
                    playerMoveToDoor();
                }
                playerMove(-40, 0);
            }
            if (hasEnemy(player.posY, player.posX - 40)) {
                playerMoveToEnemy((player.posX - 40) / 40, player.posY / 40);
            }
        }
        if (ui.inputHander.right) {
            if (playerCanMove(player.posY, player.posX + 40)) {
                if (isDoor(player.posY, player.posX + 40)) {
                    playerMoveToDoor();
                }

                playerMove(40, 0);
            }
            if (hasEnemy(player.posY, player.posX + 40)) {
                playerMoveToEnemy((player.posX + 40) / 40, player.posY / 40);
            }
        }
        ui.game.updateUI();
    }

    /**
     * When battlescreen is open sends update information to ui.
     *
     * @throws java.io.IOException
     */
    public void battleMove() throws IOException {
        int arrowIndex = ui.battle.arrowPos;
        if (ui.inputHander.down) {
            ui.battle.setArrowPos(arrowIndex + 1);
        }
        if (ui.inputHander.up) {
            ui.battle.setArrowPos(arrowIndex - 1);
        }
        if (ui.inputHander.space) {
            if (arrowIndex == 0) {
                ui.battle.changeEnemyHealth(battleEnemy.takeDamage(player.attack));
                enemyTurn = true;
            }
            if (arrowIndex == 1) {
                enemyTurn = true;
                ui.battle.changeHeroHealth(player.heal());
            }
        }

        ui.battle.updateUI();
    }

    /**
     * In battle when there is enemy's turn this fuction decides at random what
     * enemy will do and send update information to ui.
     *
     * @throws java.io.IOException
     */
    public void battleEnemyAction() throws IOException {
        int rand = (int) (Math.random() * 20);
        if (rand > 15) {
            ui.battle.changeEnemyHealth(battleEnemy.heal());
            ui.battle.showEnemyAction(0);
        } else {
            ui.battle.changeHeroHealth(player.takeDamage(10));
            ui.battle.showEnemyAction(1);
        }
        enemyTurn = false;
        ui.battle.updateUI();
    }

    public void graphics() {
    }

    /**
     * checks if player can move to new position.
     *
     * @param posX new player posion in x axle
     * @param posY new player posion in y axle
     * @return returns true if player can move in desired posioton
     */
    public boolean playerCanMove(int posX, int posY) {
        return gameMap.passableTileInPoss(posX, posY);
    }

    /**
     * checks if the position contains enemy
     *
     * @param posX posion in x axle
     * @param posY posion in y axle
     * @return returns true if there is an enemy in position
     */
    private boolean hasEnemy(int posX, int posY) {
        return gameMap.enemyTile(posX, posY);
    }

    /**
     * checks if the position contains door
     *
     * @param posX posion in x axle
     * @param posY posion in y axle
     * @return returns true if there is an door in position
     */
    private boolean isDoor(int posX, int posY) {
        return gameMap.isDoor(posX, posY);
    }

    /**
     * moves player to new position and updates ui
     *
     * @param posX posion in x axle
     * @param posY posion in y axle
     */
    private void playerMove(int x, int y) {
        player.move(x, y);
        ui.game.updatePlayerPosition(player.posY, player.posX);
    }

    /**
     * moves player to door and loads a new map
     */
    void playerMoveToDoor() throws IOException, URISyntaxException {
        gameMap = new GameMap(secondMap);
        player.setPlayerPos(0, 40);
        ui.startGame(gameMap);
    }

    /**
     * moves player to enemy and starts battle
     *
     * @param posX posion in x axle
     * @param posY posion in y axle
     */
    void playerMoveToEnemy(int x, int y) {
        ui.startBattle();
        ui.game.map.tileMap[x][y].enemyDefeated();
        battleEnemy = new Enemy();
    }
}
