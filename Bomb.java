/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jword
 */
public class Bomb {
    
    private int x, y;
    private final int strength;

    Bomb(Cave cave) {
        this.x = (int)(Math.random() * cave.getWidth());
        this.y = (int)(Math.random() * cave.getHeight());
        this.strength = (int)(Math.random() * 100);
    }
    
}
