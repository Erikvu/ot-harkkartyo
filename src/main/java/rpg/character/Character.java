/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg.character;

/**
 *
 * @author erikv
 */
public class Character {

    protected String name;
    public int health;
    protected int maxHealth;
    public int energy;
    protected int maxEnergy;
    public int attack;
    public boolean alive;
    public int posX;
    public int posY;

    public Character(String name, int health, int maxHealth, int energy, int maxEnergy, int attack, int posX, int posY) {
        this.name = name;
        this.health = health;
        this.maxHealth = maxHealth;
        this.energy = energy;
        this.maxEnergy = maxEnergy;
        this.attack = attack;
        this.alive = true;
        this.posX = posX;
        this.posY = posY;
    }

    public int takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            alive = false;
        }
        return health;
    }

    public int heal() {
        health += 20;
        if (health >= maxHealth) {
            health = maxHealth;
        }
        return health;
    }

    public int xPos() {
        return posX;
    }

    public int yPos() {
        return posY;
    }
}
