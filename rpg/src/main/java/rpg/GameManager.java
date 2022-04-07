/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg;

import rpg.ui.MainMenu;
import rpg.ui.Ui;

/**
 *
 * @author erikv
 */
public class GameManager implements Runnable {
       Thread gameLoop;
       
       
       public GameManager(){
           
       }
       
       public void startThread(){
           gameLoop = new Thread(this);
           gameLoop.start();
       }

    @Override
    public void run() {
        graphics();
        while(gameLoop !=null){
    // update();
     
    }
        
    }
    
    public void update(){
        System.out.println("Rutto");
    }
    public void graphics(){
        Ui ui = new Ui(this);
      //  ui.add(new MainMenu());
        ui.setVisible(true);
    }
}
