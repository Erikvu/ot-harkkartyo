/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg.ui;

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
    
    private BufferedImage image;
    
        public MainMenu() {
       try {                
          image = ImageIO.read((getClass().getClassLoader().getResource("resources/newGame.png")));
       } catch (IOException ex) {
           System.out.println(ex);
       }
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        drawMainMenu(g);
         g.drawImage(image, 0, 0, this);
    }

     public void drawMainMenu(Graphics g){
     }
}
