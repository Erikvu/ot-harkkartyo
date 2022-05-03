/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg.ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import rpg.map.Map;
import rpg.map.PathWay;
import rpg.map.Tile;
import rpg.map.Wall;

/**
 *
 * @author erikv
 */
public class GameMap extends JPanel {

    private Map map;
    private BufferedImage door;
    private BufferedImage wall;
    private BufferedImage pathWay;
    private BufferedImage player;
    private int playerPosx;
    private int playerPosy;

    public GameMap(URL url) throws IOException, URISyntaxException {
        loadItems();
        setOpaque(true);
        setBackground(Color.BLACK);
        map = new Map(url);
        map.makeMap();
        playerPosx = 40;
        playerPosy = 40;
    }

    public void loadItems() {
        try {
            door = ImageIO.read((getClass().getClassLoader().getResource("resources/door.png")));
            wall = ImageIO.read((getClass().getClassLoader().getResource("resources/wall.png")));
            pathWay = ImageIO.read((getClass().getClassLoader().getResource("resources/floor.png")));
            player = ImageIO.read((getClass().getClassLoader().getResource("resources/hero.png")));
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
        int posX;
        int posY = 0;
        for (int i = 0; i < 20; i++) {
            posX = 0;
            for (int k = 0; k < 30; k++) {

                if (map.tileMap[k][i] instanceof PathWay) {
                    g.drawImage(pathWay, posX, posY, this);
                } else if (map.tileMap[k][i] instanceof Wall) {
                    g.drawImage(wall, posX, posY, this);
                } else {
                    g.drawImage(door, posX, posY, this);
                }
                posX += 40;
            }
            posY += 40;
        }
        g.drawImage(player, playerPosx, playerPosy, this);
    }

    public void updatePlayerPosition(int posY, int posX) {
        playerPosx = posX;
        playerPosy = posY;
    }
}
