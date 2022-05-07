/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg.ui;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import rpg.map.EnemyTile;
import rpg.map.PathWay;
import rpg.map.Wall;

/**
 *
 * @author erikv
 */
public class battleScreen extends JPanel {

    private BufferedImage battleScreen;
    private BufferedImage healtBar;
    
    public battleScreen(){
          loadItems();
    }

    private void loadItems() {
        try {
            battleScreen = ImageIO.read((getClass().getClassLoader().getResource("resources/battleScreen.png")));
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }
  @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawGame(g);
        g.dispose();
    }

    public void drawGame(Graphics g) {
        g.drawImage(battleScreen, 0, 0, this);
    }
}
