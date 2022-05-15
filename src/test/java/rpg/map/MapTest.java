/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package rpg.map;

import java.io.IOException;
import java.net.URISyntaxException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author erikv
 */
public class MapTest {
    Mmap map;
    public MapTest() {
    }
    
    @Before
    public void setUp() throws IOException, URISyntaxException {
       map = new Mmap("resources/FirstMap.json");
    }
    
    /**
     * Test of makeMap method, of class Map.
     */
    @Test
    public void returnDoortTile() throws Exception {
        
        assertEquals(map.charToTile('d') instanceof Door, true);
    }
        @Test
    public void returnEnemytTile() throws Exception {
        
        assertEquals(map.charToTile('e') instanceof EnemyTile, true);
    }
        @Test
    public void returnWallTile() throws Exception {
        
        assertEquals(map.charToTile('x') instanceof Wall, true);
    }
            @Test
    public void returnPathWayTile() throws Exception {
        
        assertEquals(map.charToTile('w') instanceof PathWay, true);
    }
            @Test
        public void makeTileMap() throws Exception {
        map.makeMap();
        assertEquals(map.tileMap[0][0] instanceof Wall, true);
    }
}
