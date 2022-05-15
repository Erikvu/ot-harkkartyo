/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg.map;

/**
 *
 * @author erikv
 */
public class Tile {

    public boolean passable;
    public boolean hasEnemy;
    public boolean isDoor;

    public boolean isPassable() {
        return this.passable;
    }

    public boolean hasEnemy() {
        return this.hasEnemy;
    }

    public boolean isDoor() {
        return this.isDoor;
    }

    public void enemyDefeated() {
    }
}
