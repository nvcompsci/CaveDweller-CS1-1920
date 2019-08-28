/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jword
 */
public class Cave {
    private Caveman cman;
    private Bomb bomb;
    private Potion potion;
    private int width, height;
    private final int MAX_WIDTH = 50, MAX_HEIGHT = 50;
    
    public Cave(String username) {
        this.width = (int) (Math.random() * MAX_WIDTH);
        this.height = (int) (Math.random() * MAX_HEIGHT);
        cman = new Caveman(username, this);
        bomb = new Bomb(this);
        potion = new Potion(this);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    
    public void checkCollisions() {
        
    }

    public void processPrompt(String prompt) {
        if (prompt.equals("move right")) {
            cman.move(1,0);
        }
        else if (prompt.equals("move left")) {
            cman.move(-1,0);
        }
        else if (prompt.equals("move forward")) {
            cman.move(0,1);
        }
        else if (prompt.equals("move back")) {
            cman.move(0,-1);
        }                
    }
    
}
