/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg.map;

/**
 *
 * @author erikv
 */
public class PathWay extends Tile {

    public boolean passable = true;
    public boolean hasPlayer = false;

    public PathWay() {

    }

    @Override
    public boolean isPassable() {
        return this.passable;
    }
}
