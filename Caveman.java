/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jword
 */
public class Caveman {
    private final String name;
    private int x, y;
    private int health;
    
    public Caveman(String name, Cave cave) {
        this.name = name;
        this.x = (int)(Math.random() * cave.getWidth());
        this.y = (int)(Math.random() * cave.getHeight());
        this.health = (int)(Math.random() * 100);
    }
}
