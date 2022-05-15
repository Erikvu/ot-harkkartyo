/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg.ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author erikv
 */
public class MainMenu extends JPanel {

    private BufferedImage newGame;
    private BufferedImage continueButton;
    private BufferedImage quit;
    private BufferedImage arrow1;
    private BufferedImage arrow;
    public int[] arrowLocation = new int[]{305, 405, 505};
    public int arrowPos;

    /**
     * Constructor that loads images to generate menuscreen.
     */
    public MainMenu() {
        arrowPos = 0;
        try {
            newGame = ImageIO.read((this.getClass().getClassLoader().getResourceAsStream("resources/newGame.png")));
            continueButton = ImageIO.read((this.getClass().getClassLoader().getResourceAsStream("resources/Continue.png")));
            quit = ImageIO.read((this.getClass().getClassLoader().getResourceAsStream("resources/Quit.png")));
            arrow1 = ImageIO.read((this.getClass().getClassLoader().getResourceAsStream("resources/ArrowLeft.png")));
            arrow = ImageIO.read((this.getClass().getClassLoader().getResourceAsStream("resources/ArrowRight.png")));
        } catch (IOException ex) {
            System.out.println(ex);
        }
        setOpaque(true);
        setBackground(Color.BLACK);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawMainMenu(g);
        g.dispose();
    }

    /**
     * Drawns menu.
     */
    public void drawMainMenu(Graphics g) {
        g.drawImage(continueButton, 500, 300, this);
        g.drawImage(newGame, 500, 400, this);
        g.drawImage(quit, 500, 500, this);
        drawArrows(g);
    }

    /**
     * Drawns selection arrows.
     */
    private void drawArrows(Graphics g) {
        g.drawImage(arrow, 450, arrowLocation[arrowPos], this);
        g.drawImage(arrow1, 700, arrowLocation[arrowPos], this);
    }

    /**
     * updates arrowposition.
     *
     * @param pos new arrow position
     */
    public void setArrowPos(int pos) {
        if (pos >= 0 && pos < 3) {
            arrowPos = pos;
        }
    }
}
