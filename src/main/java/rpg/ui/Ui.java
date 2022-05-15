/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg.ui;

import rpg.GameManager;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import rpg.InputHandler;

public class Ui extends JFrame {

    public JTextArea messageText;
    public InputHandler inputHander = new InputHandler();
    public MainMenu mainMenu = new MainMenu();
    public boolean menuOn;
    public boolean mapOn;
    public boolean battleOn;
    public GameMap game;
    public battleScreen battle;

    /**
     * constructor
     *
     */
    public Ui() {
        menuOn = true;
        mapOn = false;
        battleOn = false;
        this.addKeyListener(inputHander);
        this.setFocusable(true);
        init();

    }

    /**
     * Makes ui and starts with mainMenu
     */
    private void init() {
        this.setSize(1215, 835);
        setResizable(false);
        this.add(mainMenu);
        this.setVisible(true);
    }

    /**
     * Starts game and shows a map
     *
     * @param map map to be drawn
     */
    public void startGame(GameMap map) {
        mapOn = true;
        battleOn = false;
        this.remove(mainMenu);
        this.game = map;
        this.add(game);
        this.revalidate();
        this.repaint();
    }

    /**
     * Starts battle and shows battlescreen
     */
    public void startBattle() {
        mapOn = false;
        battleOn = true;
        this.battle = new battleScreen();
        this.remove(game);
        this.add(battle);
        this.revalidate();
        this.repaint();
    }

}
