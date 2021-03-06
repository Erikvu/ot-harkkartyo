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
import rpg.map.EnemyTile;
import rpg.map.Mmap;
import rpg.map.PathWay;
import rpg.map.Wall;

/**
 *
 * @author erikv
 */
public class GameMap extends JPanel {

    public Mmap map;
    private BufferedImage door;
    private BufferedImage wall;
    private BufferedImage pathWay;
    private BufferedImage player;
    private BufferedImage enemy;
    private int playerPosx;
    private int playerPosy;

    /**
     * Constructor.
     *
     * @param url gets path to txt file that makes the map
     * @throws java.io.IOException
     * @throws java.net.URISyntaxException
     */
    public GameMap(String url) throws IOException, URISyntaxException {
        loadItems();
        setOpaque(true);
        setBackground(Color.BLACK);
        map = new Mmap(url);
        map.makeMap();
        playerPosx = 40;
        playerPosy = 40;
    }

    /**
     * Loads images to generate new map.
     */
    public void loadItems() {
        try {
            door = ImageIO.read((this.getClass().getClassLoader().getResourceAsStream("resources/door.png")));
            wall = ImageIO.read((this.getClass().getClassLoader().getResourceAsStream("resources/wall.png")));
            pathWay = ImageIO.read((this.getClass().getClassLoader().getResourceAsStream("resources/floor.png")));
            player = ImageIO.read((this.getClass().getClassLoader().getResourceAsStream("resources/hero.png")));
            enemy = ImageIO.read((this.getClass().getClassLoader().getResourceAsStream("resources/enemy.png")));
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

    /**
     * Draws gamemap based on the tilemap.
     *
     * @param g Graphics parameter
     */
    public void drawGame(Graphics g) {
        int posX;
        int posY = 0;
        for (int i = 0; i < 20; i++) {
            posX = 0;
            for (int k = 0; k < 30; k++) {

                if (map.tileMap[k][i] instanceof EnemyTile) {
                    g.drawImage(pathWay, posX, posY, this);
                    if (map.tileMap[k][i].hasEnemy()) {
                        g.drawImage(enemy, posX, posY, this);
                    }
                } else if (map.tileMap[k][i] instanceof PathWay) {
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

    /**
     * Updates player position on map.
     *
     * @param posY position in y axle
     * @param posX position in x axle
     */
    public void updatePlayerPosition(int posY, int posX) {
        playerPosx = posX;
        playerPosy = posY;
    }

    /**
     * checks if the tile is passable.
     *
     * @param posY position in y axle
     * @param posX position in x axle
     * @return returns true if tile is passable
     */
    public boolean passableTileInPoss(int posX, int posY) {
        return map.tileMap[posY / 40][posX / 40].isPassable();
    }

    /**
     * checks if the tile has enemy.
     *
     * @param posY position in y axle
     * @param posX position in x axle
     * @return returns true if tile has enemy
     */
    public boolean enemyTile(int posX, int posY) {
        return map.tileMap[posY / 40][posX / 40].hasEnemy();
    }

    /**
     * checks if the tile is door.
     *
     * @param posY position in y axle
     * @param posX position in x axle
     * @return returns true if tile is door
     */
    public boolean isDoor(int posX, int posY) {
        return map.tileMap[posY / 40][posX / 40].isDoor();
    }
}
