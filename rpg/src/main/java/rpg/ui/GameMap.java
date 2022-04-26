/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg.ui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import rpg.map.Map;
import rpg.map.Tile;

/**
 *
 * @author erikv
 */
public class GameMap extends JPanel {

    private Map map = new Map();

    public GameMap() {
        setOpaque(true);
        setBackground(Color.BLACK);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawGame(g);
        g.dispose();
    }

    public void drawGame(Graphics g) {
        //  for(Tile tile:map.tileMap){
        //     
        //  } 
    }

    public void loadMapLayout() {

    }
}
