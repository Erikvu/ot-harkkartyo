/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg.character;

import java.util.Random;

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
    protected int attack;
    public boolean alive;
    public int[][] position;
    
    
     public Character(String name, int health, int maxHealth, int energy, int maxEnergy, int attack, int[][] position)
    {
        this.name = name;
        this.health = health;
        this.maxHealth = maxHealth;
        this.energy = energy;
        this.maxEnergy = maxEnergy;
        this.attack = attack;
        this.alive = true;
        this.position = position;
    }
     

     public int attack(){
         Random rand = new Random();
         return rand.nextInt(attack+1);
     }
     
     public void takeDamage(int damage){
         health -= damage;
         if(health >=0){
         alive = false;
     }
}
     public void heal(){
         if(energy>2){
             energy-=2;
             health += 5;
            if (health >= maxHealth){
                health = maxHealth;
         }
     }
     }
     
     public int getHealth(){
         return health;
     }
}
