/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg.map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.net.URISyntaxException;

/**
 *
 * @author erikv
 */
public class Mmap {

    public Tile[][] tileMap = new Tile[30][20];
    public String mapPath;

    /**
     * Constructor
     *
     * @param url path to .txt file that makes tilemap
     * @throws java.io.IOException
     * @throws java.net.URISyntaxException
     */
    public Mmap(String url) throws IOException, URISyntaxException {
        this.mapPath = url;
    }

    /**
     * makes a new tilemap from txt file.
     *
     * @return returns tilemap
     * @throws java.io.IOException
     * @throws java.net.URISyntaxException
     */
    public Tile[][] makeMap() throws IOException, URISyntaxException {
        int columnIndex = 0;
        String line = " ";
        String[] temp;
        InputStream in = this.getClass().getClassLoader()
                .getResourceAsStream(mapPath);
        try ( BufferedReader fileReader = new BufferedReader(new InputStreamReader(in))) {
            while ((line = fileReader.readLine()) != null) {
                for (int i = 0; i < 30; i++) {
                    tileMap[i][columnIndex] = charToTile(line.charAt(i));
                }
                columnIndex++;
            }
        }
        return tileMap;
    }

    /**
     * moves player to new position and updates ui
     *
     * @param character character to make tile
     * @return returns tile based on character that is given in parameters
     */
    Tile charToTile(char character) {
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
