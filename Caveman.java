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

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }
    
    public void drink(Potion p) {
        health += p.getStrength();
        System.out.println("drank potion");
    }
    
    public void detonate(Bomb b) {
        health -= b.getStrength();
        System.out.println("detonated bomb");
        if (this.health <= 0) {
            System.out.println("Goodbye cruel world.");
            //exit(0) indicates successful, exit(1) unsuccesful
            System.exit(0);
        }
    }
}
