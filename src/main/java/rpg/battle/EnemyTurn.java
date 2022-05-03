/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg.battle;

import rpg.character.Player;

/**
 *
 * @author erikv
 */
public class EnemyTurn {

    private rpg.character.Character enemy;
    private Player player;

    public EnemyTurn(Player playerData, rpg.character.Character enemyData) {
        this.player = playerData;
        this.enemy = enemyData;
    }

    public void action() {
        if (enemy.health > 5 && enemy.energy > 2) {
            enemy.heal();
        } else {
            player.takeDamage(enemy.attack());
        }
    }
}
