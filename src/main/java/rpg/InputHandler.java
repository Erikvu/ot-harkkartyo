
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author erikv
 */
public class InputHandler implements KeyListener {

    public boolean up, left, right, down, space;

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyPressed = e.getKeyCode();
        if (keyPressed == KeyEvent.VK_UP) {
            up = true;
        }
        if (keyPressed == KeyEvent.VK_DOWN) {
            down = true;
        }
        if (keyPressed == KeyEvent.VK_LEFT) {
            left = true;
        }
        if (keyPressed == KeyEvent.VK_RIGHT) {
            right = true;
        }
        if (keyPressed == KeyEvent.VK_SPACE) {
            space = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int keyPressed = e.getKeyCode();
        if (keyPressed == KeyEvent.VK_UP) {
            up = false;
        }
        if (keyPressed == KeyEvent.VK_DOWN) {
            down = false;
        }
        if (keyPressed == KeyEvent.VK_LEFT) {
            left = false;
        }
        if (keyPressed == KeyEvent.VK_RIGHT) {
            right = false;
        }
        if (keyPressed == KeyEvent.VK_SPACE) {
            space = false;
        }
    }

}
