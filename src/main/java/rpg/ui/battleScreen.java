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
    private BufferedImage heroHealtBar;
    private BufferedImage enemyHealtBar;
        private BufferedImage arrow1;
        private BufferedImage action;
    private BufferedImage arrow;
    public int[] arrowLocation = new int[]{585, 685};
    public int arrowPos;
    public int enemyHealt = 100;
    
    public battleScreen(){
          loadItems();
    }

    private void loadItems() {
        try {
            battleScreen = ImageIO.read((getClass().getClassLoader().getResource("resources/battleScreen.png")));
            arrow1 = ImageIO.read((getClass().getClassLoader().getResource("resources/ArrowLeft.png")));
            arrow = ImageIO.read((getClass().getClassLoader().getResource("resources/ArrowRight.png")));
            heroHealtBar = ImageIO.read((getClass().getClassLoader().getResource("resources/healt100.png")));
            enemyHealtBar = ImageIO.read((getClass().getClassLoader().getResource("resources/healt100.png")));
            action = ImageIO.read((getClass().getClassLoader().getResource("resources/placeholder.png")));
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }
  @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawGame(g);
        drawArrows(g);
        drawHealthBar(g);
        g.dispose();
    }

    public void drawGame(Graphics g) {
        g.drawImage(battleScreen, 0, 0, this);
        g.drawImage(action, 500, 150, this);
    }
        private void drawArrows(Graphics g) {
        g.drawImage(arrow, 450, arrowLocation[arrowPos], this);
        g.drawImage(arrow1, 700, arrowLocation[arrowPos], this);
    }
        private void drawHealthBar(Graphics g) {
        g.drawImage(heroHealtBar, 170, 150, this);
        g.drawImage(enemyHealtBar, 980, 150, this);
    }
    public void setArrowPos(int pos) {
        if (pos >= 0 && pos < 2) {
            arrowPos = pos;
        }
    }
    
    public void changeHeroHealth(int newHealth) throws IOException{
        switch (newHealth) {
            case 100:
                heroHealtBar = ImageIO.read((getClass().getClassLoader().getResource("resources/healt100.png")));
                break;
            case 90:
                heroHealtBar = ImageIO.read((getClass().getClassLoader().getResource("resources/healt90.png")));
                break;
                 case 80:
                     heroHealtBar = ImageIO.read((getClass().getClassLoader().getResource("resources/healt80.png")));
                break;
                 case 70:
                     heroHealtBar = ImageIO.read((getClass().getClassLoader().getResource("resources/healt70.png")));
                break;
                 case 60:
                     heroHealtBar = ImageIO.read((getClass().getClassLoader().getResource("resources/healt60.png")));
                break;
                 case 50:
                     heroHealtBar = ImageIO.read((getClass().getClassLoader().getResource("resources/healt50.png")));
                break;
                 case 40:
                     heroHealtBar = ImageIO.read((getClass().getClassLoader().getResource("resources/healt40.png")));
                break;
                 case 30:
                     heroHealtBar = ImageIO.read((getClass().getClassLoader().getResource("resources/healt30.png")));
                break;
                 case 20:
                     heroHealtBar = ImageIO.read((getClass().getClassLoader().getResource("resources/healt20.png")));
                break;
                 case 10:
                     heroHealtBar = ImageIO.read((getClass().getClassLoader().getResource("resources/healt10.png")));
                break;
                 case 0:
                     heroHealtBar = ImageIO.read((getClass().getClassLoader().getResource("resources/healt00.png")));
                break;
            default:
                break;
        }
    }
        public void changeEnemyHealth(int newHealth) throws IOException{
        switch (newHealth) {
            case 100:
                enemyHealtBar = ImageIO.read((getClass().getClassLoader().getResource("resources/healt100.png")));
                break;
            case 90:
                enemyHealtBar = ImageIO.read((getClass().getClassLoader().getResource("resources/healt90.png")));
                break;
                 case 80:
                     enemyHealtBar = ImageIO.read((getClass().getClassLoader().getResource("resources/healt80.png")));
                break;
                 case 70:
                     enemyHealtBar = ImageIO.read((getClass().getClassLoader().getResource("resources/healt70.png")));
                break;
                 case 60:
                     enemyHealtBar = ImageIO.read((getClass().getClassLoader().getResource("resources/healt60.png")));
                break;
                 case 50:
                     enemyHealtBar = ImageIO.read((getClass().getClassLoader().getResource("resources/healt50.png")));
                break;
                 case 40:
                     enemyHealtBar = ImageIO.read((getClass().getClassLoader().getResource("resources/healt40.png")));
                break;
                 case 30:
                     enemyHealtBar = ImageIO.read((getClass().getClassLoader().getResource("resources/healt30.png")));
                break;
                 case 20:
                     enemyHealtBar = ImageIO.read((getClass().getClassLoader().getResource("resources/healt20.png")));
                break;
                 case 10:
                     enemyHealtBar = ImageIO.read((getClass().getClassLoader().getResource("resources/healt10.png")));
                break;
                 case 0:
                     enemyHealtBar = ImageIO.read((getClass().getClassLoader().getResource("resources/healt00.png")));
                break;
            default:
                break;
        }
    }
    public void showEnemyAction(int enemyAction) throws IOException{
        if(enemyAction ==1){
            action = ImageIO.read((getClass().getClassLoader().getResource("resources/attack.png")));
        }
        else{
                action = ImageIO.read((getClass().getClassLoader().getResource("resources/heal.png")));
                }
    }
}
