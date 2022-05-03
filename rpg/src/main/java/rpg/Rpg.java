/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package rpg;

import java.io.IOException;
import java.net.URISyntaxException;
import rpg.map.Map;
import rpg.ui.MainMenu;
import rpg.ui.Ui;

/**
 *
 * @author erikv
 */
public class Rpg {

    public static void main(String[] args) {
        GameManager gameManager = new GameManager();
        gameManager.startThread();
    }
}
