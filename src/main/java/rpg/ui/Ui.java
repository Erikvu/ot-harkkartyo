/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg.ui;

import java.awt.Color;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import rpg.GameManager;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import rpg.InputHandler;

public class Ui extends JFrame {

    public GameManager gameManager;
    public JTextArea messageText;
    public InputHandler inputHander = new InputHandler();
    public MainMenu mainMenu = new MainMenu();
    public boolean menuOn;
    public boolean mapOn;
    public boolean battleOn;
    public GameMap game;
    public battleScreen battle;

    public Ui(GameManager gameManager) {
        menuOn = true;
        mapOn = false;
        battleOn = false;
        this.gameManager = gameManager;
        this.addKeyListener(inputHander);
        this.setFocusable(true);
        init();

    }

    private void init() {
        this.setSize(1215, 835);
        setResizable(false);
        this.add(mainMenu);
        this.setVisible(true);
    }

    public void startGame(GameMap map) {
        mapOn = true;
        this.remove(mainMenu);
        this.game = map;
        this.add(game);
        this.revalidate();
        this.repaint();
    }

    public void startBattle() {
        mapOn = false;
        this.battle = new battleScreen();
        this.remove(game);
        this.add(battle);
        this.revalidate();
        this.repaint();
    }

}
