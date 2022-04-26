/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg.character;

/**
 *
 * @author erikv
 */
public class Player extends Character {

    public Player(String name, int health, int maxHealth, int energy, int maxEnergy, int attack, int[][] position) {
        super(name, health, maxHealth, energy, maxEnergy, attack, position);
    }

    public void move(int[][] newPos) {
        position = newPos;
    }
}
