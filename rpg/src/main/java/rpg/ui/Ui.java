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
        this.setSize(1200, 800);
        setResizable(false);
        this.add(mainMenu);
        this.setVisible(true);
    }

    public void startGame() {
        this.remove(mainMenu);
        try {
            this.add(new GameMap(getClass().getClassLoader().getResource("resources/FirstMap.json")));
        } catch (IOException ex) {
        } catch (URISyntaxException ex) {
        }
        this.revalidate();
        this.repaint();
    }

}
