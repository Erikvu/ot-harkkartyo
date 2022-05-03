/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg;

import rpg.character.Player;
import rpg.map.Map;
import rpg.ui.MainMenu;
import rpg.ui.Ui;

/**
 *
 * @author erikv
 */
public class GameManager implements Runnable {

    Thread gameLoop;
    private long currentTime;
    private double gameTime;
    private double timeInterval = 1000000000 / 10.0;
    private long lastLoopTime = System.nanoTime();
    private Ui ui;
    private Player player = new Player("Asd", 5, 5, 5, 5, 5, 40, 40);
    // private Map map = new Map();

    public GameManager() {
        ui = new Ui(this);

    }

    public void startThread() {
        gameLoop = new Thread(this);
        gameLoop.start();
    }

    @Override
    public void run() {
        graphics();
        while (gameLoop != null) {
            currentTime = System.nanoTime();
            gameTime += (currentTime - lastLoopTime) / timeInterval;
            lastLoopTime = currentTime;
            while (gameTime >= 1) {
                update();
                gameTime--;
            }

        }

    }

    public void update() {
        if (ui.menuOn) {
            menuMove();
        } else if (ui.mapOn) {
            mapMove();
        }
    }

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
                ui.menuOn = false;
                ui.startGame("resources/FirstMap.json");
            }
            if (arrowIndex == 1) {
                ui.menuOn = false;
                ui.startGame("resources/FirstMap.json");
            }
            if (arrowIndex == 2) {
                System.exit(0);
            }
        }
        ui.mainMenu.updateUI();
    }

    public void mapMove() {
        if (ui.inputHander.down) {
            player.move(0, 40);
            ui.game.updatePlayerPosition(player.posY, player.posX);
        }
        if (ui.inputHander.up) {
            player.move(0, -40);
            ui.game.updatePlayerPosition(player.posY, player.posX);
        }
        if (ui.inputHander.left) {
            player.move(-40, 0);
            ui.game.updatePlayerPosition(player.posY, player.posX);
        }
        if (ui.inputHander.right) {
            player.move(40, 0);
            ui.game.updatePlayerPosition(player.posY, player.posX);
        }
        if (ui.inputHander.space) {
        }
        ui.game.updateUI();
    }

    public void graphics() {
    }
}
