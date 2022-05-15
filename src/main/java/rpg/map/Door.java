/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg.map;

/**
 *
 * @author erikv
 */
public class Door extends Tile {

    public boolean isDoor = true;
    public boolean hasPlayer = false;
    public boolean isPassable = true;

    public Door() {

    }

    @Override
    public boolean isDoor() {
        return this.isDoor;
    }

    @Override
    public boolean isPassable() {
        return this.isPassable;
    }
}
