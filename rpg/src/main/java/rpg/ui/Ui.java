/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg.ui;

import java.awt.Color;
import javax.swing.ImageIcon;
import rpg.GameManager;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;



public class Ui extends JFrame {
    public GameManager gameManager;
    public JTextArea messageText;
    
    public Ui(GameManager gameManager){
        this.gameManager = gameManager;
        
        init();
        
    }

    private void init() {
        this.setSize(1200,800);
        this.getContentPane().setBackground(Color.black);
        
    }
}
