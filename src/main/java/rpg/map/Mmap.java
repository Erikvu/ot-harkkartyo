/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg.map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;

import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.FileSystem;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.spi.FileSystemProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import rpg.character.Player;

/**
 *
 * @author erikv
 */
public class Mmap {

    public Tile[][] tileMap = new Tile[30][20];
    public String mapPath;

    public Mmap(String url) throws IOException, URISyntaxException {
        this.mapPath = url;
    }

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
