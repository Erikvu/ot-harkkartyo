/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg.map;

/**
 *
 * @author erikv
 */
public class Wall extends Tile {

    public boolean passable = false;

    public Wall() {

    }

    @Override
    public boolean isPassable() {
        return this.passable;
    }
}
