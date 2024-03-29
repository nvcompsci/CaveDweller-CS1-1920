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
    //declare
    private Bomb bomb, bomb2;
    private Potion potion;
    private Flashlight flashlight;
    private Door door;
    private int width, height;
    private final int MAX_WIDTH = 10, MAX_HEIGHT = 10;
    
    public Cave(String username) {
        this.width = (int) (Math.random() * MAX_WIDTH);
        this.height = (int) (Math.random() * MAX_HEIGHT);
        cman = new Caveman(username, this);
        //initialize
        boolean created = false;
        while (!created || checkOverlap()) {
            bomb = new Bomb(this);
            bomb2 = new Bomb(this);
            potion = new Potion(this);
            door = new Door(this);
            flashlight = new Flashlight(this);
            created = true;
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    
    public void checkCollisions() {
        if (cman.getX() == bomb.getX() && cman.getY() == bomb.getY()) {
            cman.detonate(bomb);
        }
        else if (cman.getX() == bomb2.getX() && cman.getY() == bomb2.getY()) {
            cman.detonate(bomb2);
        }
        else if (cman.getX() == flashlight.getX() && cman.getY() == flashlight.getY()) {
            showItems();
        }
        else if (cman.getX() == potion.getX() && cman.getY() == potion.getY()) {
            cman.drink(potion);
        }
        else if (cman.getX() == door.getX() && cman.getY() == door.getY()) {
            System.out.println("You escaped!");
            System.exit(0);
        }
    }
    
    public boolean checkOverlap() {
        if (cman.getX() == bomb.getX() && cman.getY() == bomb.getY()) {
            return true;
        }
        else if (cman.getX() == bomb2.getX() && cman.getY() == bomb2.getY()) {
            return true;
        }
        else if (cman.getX() == flashlight.getX() && cman.getY() == flashlight.getY()) {
            return true;
        }
        else if (cman.getX() == potion.getX() && cman.getY() == potion.getY()) {
            return true;
        }
        else if (cman.getX() == door.getX() && cman.getY() == door.getY()) {
            return true;
        }
        else {
            return false;
        }
    }
    
    private void showItems() {
        System.out.println(bomb.getX());
    }
    
    public void processPrompt(String prompt) {
        if (prompt.equals("move right")) {
            if (cman.getX() < width) {
                cman.move(1,0);
            }
        }
        else if (prompt.equals("move left")) {
            if (cman.getX() > 0) {
                cman.move(-1,0);
            }
        }
        else if (prompt.equals("move forward")) {
            if (cman.getY() < height) {
                cman.move(0,1);
            }
        }
        else if (prompt.equals("move back")) {
            if (cman.getY() > 0) {
                cman.move(0,-1);
            }
            /*if (cman.getY() <= 0) {
            
            }
            else {
             cman.move(0, -1)
            }
        */
        }
        checkCollisions();
    }
    
}
