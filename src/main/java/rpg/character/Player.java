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

    public Player(String name, int health, int maxHealth, int energy, int maxEnergy, int attack, int posX, int posY) {
        super(name, health, maxHealth, energy, maxEnergy, attack, posX, posY);
    }

    public void move(int posX, int posY) {
        this.posY += posY;
        this.posX += posX;
    }
    public void setPlayerPos(int posX, int posY){
        this.posY = posY;
        this.posX = posX;
    }
    @Override
        public int takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            alive = false;
        }
       return health;
    }
}
