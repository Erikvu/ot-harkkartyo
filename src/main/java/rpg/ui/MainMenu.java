/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg.ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import rpg.GameManager;

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

    public MainMenu() {
        arrowPos = 0;
        try {
            newGame = ImageIO.read((getClass().getClassLoader().getResource("resources/newGame.png")));
            continueButton = ImageIO.read((getClass().getClassLoader().getResource("resources/Continue.png")));
            quit = ImageIO.read((getClass().getClassLoader().getResource("resources/Quit.png")));
            arrow1 = ImageIO.read((getClass().getClassLoader().getResource("resources/ArrowLeft.png")));
            arrow = ImageIO.read((getClass().getClassLoader().getResource("resources/ArrowRight.png")));
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

    public void drawMainMenu(Graphics g) {
        g.drawImage(continueButton, 500, 300, this);
        g.drawImage(newGame, 500, 400, this);
        g.drawImage(quit, 500, 500, this);
        drawArrows(g);
    }

    private void drawArrows(Graphics g) {
        g.drawImage(arrow, 450, arrowLocation[arrowPos], this);
        g.drawImage(arrow1, 700, arrowLocation[arrowPos], this);
    }

    public void setArrowPos(int pos) {
        if (pos >= 0 && pos < 3) {
            arrowPos = pos;
        }
    }
}
