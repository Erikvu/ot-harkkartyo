/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg.battle;

import rpg.character.Character;
import rpg.character.Player;

/**
 *
 * @author erikv
 */
public class PlayerTurn {

    private Character enemy;
    private Player player;

    public PlayerTurn(Player playerData, Character enemyData) {
        this.player = playerData;
        this.enemy = enemyData;
    }

    public void attack(int attack) {
        enemy.takeDamage(attack);
    }

    public void heal() {
        player.heal();
    }
}
