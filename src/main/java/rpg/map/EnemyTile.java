/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg.map;

/**
 *
 * @author erikv
 */
public class EnemyTile extends PathWay {

    public boolean passable = false;
    public boolean hasPlayer = false;

    public EnemyTile() {

    }

    @Override
    public boolean isPassable() {
        return this.passable;
    }

    public void enemyDefeated() {
        passable = true;
    }

}
