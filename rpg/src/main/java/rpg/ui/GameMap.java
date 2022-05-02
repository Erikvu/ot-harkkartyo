/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg.ui;

import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import javax.swing.JPanel;
import rpg.map.Map;
import rpg.map.PathWay;
import rpg.map.Tile;

/**
 *
 * @author erikv
 */
public class GameMap extends JPanel {

    private Map map;

    public GameMap(URL url) throws IOException, URISyntaxException {
        setOpaque(true);
        setBackground(Color.BLACK);
        map = new Map(url);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawGame(g);
        g.dispose();
    }

    public void drawGame(Graphics g) {
        for(int i = 0; i<20; i++){
           for(int k = 0; k<30; k++){
            
        } 
        }
    }

    public void loadMapLayout() {

    }
}
