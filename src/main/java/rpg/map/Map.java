/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg.map;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import rpg.character.Player;

/**
 *
 * @author erikv
 */
public class Map {

    private int height;
    private int width;
    private Player player;
    private ArrayList<Character> characters;
    public Tile[][] tileMap = new Tile[30][20];
    public URL mapPath;

    public Map(URL url) throws IOException, URISyntaxException {
        this.mapPath = url;
    }

    public Tile[][] makeMap() throws IOException, URISyntaxException {
        int columnIndex = 0;
        String line = " ";
        String[] temp;
        try ( BufferedReader fileReader = new BufferedReader(new FileReader(Paths.get(mapPath.toURI()).toFile()))) {
            while ((line = fileReader.readLine()) != null) {
                for (int i = 0; i < 30; i++) {
                    tileMap[i][columnIndex] = charToTile(line.charAt(i));
                }
                columnIndex++;
            }
        }
        return tileMap;
    }

    private Tile charToTile(char character) {
        Tile tile;
        switch (character) {
            case 'd':
                tile = new Door();
                break;
            case 'w':
                tile = new PathWay();
                break;
             case 'e':
                 EnemyTile enemyTile = new EnemyTile();
                 enemyTile.hasEnemy = true;
                tile = enemyTile;
                
                break;
            default:
                tile = new Wall();
                break;
        }
        return tile;
    }
    
}
